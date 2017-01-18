import java.util.ArrayList;

/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Node {
    private int number;
    private String color;

    /**
     *Constructor for the Node class
     * @param number the unique id of the node
     * @param color the color of the node
     */
    public Node(int number, String color) {
        this.number = number;
        this.color = color;

    }

    //getters

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

}
