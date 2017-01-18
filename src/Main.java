import java.util.*;

/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Main {
    Graph graph = new Graph();
    State start = new State(graph.getNodes().get("1"),graph.getNodes().get("2"));
    Set bezocht = new HashSet();
    public static void main(String[] args){
        new Main().run();
    }

    private void run() {
        List<State> solution = dfs(start,bezocht);
        int counter = 0;
        if(solution!=null) {
            for (int i =0;i<solution.size();i++) {
                counter++;
                if(i<solution.size()-1) {
                    System.out.println("P1: " + solution.get(i).getNodePawn1().getNumber()
                            + " P2: " + solution.get(i).getNodePawn2().getNumber());
                }
                else{
                    if(solution.get(i).getNodePawn1().getNumber()==-1){
                        System.out.println("END STATE P1: " + solution.get(i).getNodePawn1().getNumber() +"(GOAL)"
                                + " P2: " + solution.get(i).getNodePawn2().getNumber());
                    }
                    else{
                        System.out.println("END STATE P1: " + solution.get(i).getNodePawn1().getNumber() + " P2: "
                                + solution.get(i).getNodePawn2().getNumber()+"(GOAL)");
                    }
                }
            }
            System.out.println("Total states: " + counter);
        }
        else{
            System.out.println("No solution");
        }
    }

    /**
     * Method that tries to find a path to the goal state
     * @param start the starting state
     * @param visited list of visited states
     * @return list with the solution consisting of all visited states that lead to the goal state, otherwise
     * an empty list
     */
    LinkedList<State> dfs(State start, Set<State> visited) {
        LinkedList<State> solution;
        visited.add(start);
        if (isGoalState(start)) { /* found */
            solution = new LinkedList<State>();
            solution.add(start);
            return solution;
        } else {
            List<State> neighbours = getNeighbours(start);
            Collections.shuffle(neighbours);
            for(State neighbour : neighbours){
                if (!isContains(visited,neighbour)) {
                    solution = dfs(neighbour,visited);
                    if (goalIsReached(solution)) {
                        solution.addFirst(start);
                        return solution;
                    }
                }
            }
        }
/* visited.remove(start); */
        return new LinkedList<State>(); /* no solution */

    }


    /**
     * Method that checks if the neighbour results in a previously encountered state
     * @param visited list of visited states
     * @param neighbour the neighbour that has to be checked
     * @return true if the neighbouring state results in an already encountered state, otherwise false
     */
    public boolean isContains(Set<State> visited, State neighbour){
        for(State t: visited){
            //check if State t is the same state as the neighbour state
            if((t.getNodePawn1().getNumber()==neighbour.getNodePawn1().getNumber()&&t.getNodePawn2().
                    getNumber()==neighbour.getNodePawn2().getNumber())){
                return true;
            }
        }
        return false;
    }

    /**
     * Method that checks if a State from a list contains the goal state
     * @param solution the list that has to be checked
     * @return true if the list contains the goal state, otherwise false
     */
    private boolean goalIsReached(LinkedList<State> solution) {
        for(State t: solution){
            if(isGoalState(t)){
                return true;
            }
        }
        return false;
    }

    /**
     * Method that gets valid states based on the current state
     * @param start the current state
     * @return List with the new states
     */
    private List<State> getNeighbours(State start) {
        List<State> states = new LinkedList<>();
        String color1 = start.getNodePawn1().getColor();
        String color2 = start.getNodePawn2().getColor();
        for(Edge e:graph.getEdges()) {
            //check if pawn 1 can pass through Edge e from the current state
            if(e.getColor().equals(color2)&&e.getFrom()==start.getNodePawn1().getNumber()){
                //add the new state to the states list
                states.add(new State(graph.getNodes().get(String.valueOf(e.getTo())),start.getNodePawn2()));
            }
            //check if pawn 2 can pass through Edge e from the current state
            if(e.getColor().equals(color1)&&e.getFrom()==start.getNodePawn2().getNumber()){
                //add the new state to the states list
                states.add(new State(start.getNodePawn1(),graph.getNodes().get(String.valueOf(e.getTo()))));
            }
        }
        return states;

    }

    /**
     *Method that checks if either one of the pawns is on the end goal at the given state
     * @param state the state that has to be checked
     * @return true if either one of the pawns is on the end goal, otherwise false
     */
    private boolean isGoalState(State state) {
        if(state.getNodePawn1().equals(graph.getNodes().get("-1"))||
                state.getNodePawn2().equals(graph.getNodes().get("-1"))){
            return true;
        }
        return false;
    }




}
