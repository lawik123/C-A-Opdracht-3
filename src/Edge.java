/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Edge {
    private String color;
    private int to;
    private int from;

    /**
     *
     * @param color color of the edege
     * @param to destination node of the edge
     * @param from departure node of the edge
     */
    public Edge(String color, int to, int from) {
        this.color = color;
        this.to = to;
        this.from = from;
    }

    //getters

    public String getColor() {
        return color;
    }

    public int getTo() {
        return to;
    }

    public int getFrom() {
        return from;
    }
}
