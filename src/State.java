/**
 * Created by Lawik Ayoub on 17-Jan-17.
 */
public class State {
    Node nodePawn1;
    Node nodePawn2;

    /**
     *Constructor for the State class
     * @param nodePawn1 Position of the first player
     * @param nodePawn2 Position of the second player
     */
    public State(Node nodePawn1, Node nodePawn2) {
        this.nodePawn1 = nodePawn1;
        this.nodePawn2 = nodePawn2;
    }

    //getters

    public Node getNodePawn1() {
        return nodePawn1;
    }

    public Node getNodePawn2() {
        return nodePawn2;
    }
}
