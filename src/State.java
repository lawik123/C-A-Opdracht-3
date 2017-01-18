/**
 * Created by Lawik Ayoub on 17-Jan-17.
 */
public class State {
    Node nodePawn1;
    Node nodePawn2;

    /**
     *
     * @param nodePion1 Position of the first player
     * @param nodePion2 Position of the second player
     */
    public State(Node nodePion1, Node nodePion2) {
        this.nodePawn1 = nodePion1;
        this.nodePawn2 = nodePion2;
    }

    //getters

    public Node getNodePawn1() {
        return nodePawn1;
    }

    public Node getNodePawn2() {
        return nodePawn2;
    }
}
