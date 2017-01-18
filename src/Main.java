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
        for(State t: solution){
            counter++;
            System.out.println("P1: "+ t.getNodePawn1().getNumber()+" P2: "+t.getNodePawn2().getNumber());
        }
        System.out.println("counter: "+counter);

    }

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

    public boolean isContains(Set<State> visited, State neighbour){
        for(State t: visited){
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
     * Method that gets the valid neighbouring nodes of pawn 1 and pawn 2
     * @param start the current state
     * @return List with new states
     */
    private List<State> getNeighbours(State start) {
        List<State> states = new LinkedList<>();
        String color1 = start.getNodePawn1().getColor();
        String color2 = start.getNodePawn2().getColor();
        for(Edge e:graph.getEdges()) {
            if(e.getColor().equals(color2)&&e.getFrom()==start.getNodePawn1().getNumber()){
                states.add(new State(graph.getNodes().get(String.valueOf(e.getTo())),start.getNodePawn2()));
            }
            if(e.getColor().equals(color1)&&e.getFrom()==start.getNodePawn2().getNumber()){
                states.add(new State(start.getNodePawn1(),graph.getNodes().get(String.valueOf(e.getTo()))));
            }
        }
        return states;

    }

    /**
     *
     * @param state
     * @return
     */
    private boolean isGoalState(State state) {
        if(state.getNodePawn1().equals(graph.getNodes().get("-1"))|| state.getNodePawn2().equals(graph.getNodes().get("-1"))){
            return true;
        }
        return false;
    }




}
