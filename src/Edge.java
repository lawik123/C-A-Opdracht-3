/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Edge {
    private String color;
    private int to;
    private int from;

    public Edge(String color, int to, int from) {
        this.color = color;
        this.to = to;
        this.from = from;
    }

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
