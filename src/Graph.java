import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Graph {
    private HashMap<String,Node> nodes = new HashMap();
    private HashSet<Edge> edges = new HashSet<>();

    public Graph() {
        initGraph();
    }

    /**
     * Method which adds all the edges and nodes to the graph
     */
    private void initGraph(){
        Node node1 = new Node(1,"purple");
        Node node2 = new Node(2,"black");
        Node node3 = new Node(3,"green");
        Node node4 = new Node(4,"green");
        Node node5 = new Node(5,"green");
        Node node6 = new Node(6,"orange");
        Node node7 = new Node(7,"orange");
        Node node8 = new Node(8,"purple");
        Node node9 = new Node(9,"purple");
        Node node10 = new Node(10,"black");
        Node node11 = new Node(11,"orange");
        Node node12 = new Node(12,"purple");
        Node node13 = new Node(13,"orange");
        Node node14 = new Node(14,"green");
        Node node15 = new Node(15,"orange");
        Node node16 = new Node(16,"green");
        Node node17 = new Node(17,"green");
        Node node18 = new Node(18,"black");
        Node node19 = new Node(19,"orange");
        Node node20 = new Node(20,"green");
        Node node21 = new Node(21,"black");
        Node node22 = new Node(22,"black");
        Node node23 = new Node(-1,"blue");

        Edge edge1 = new Edge("purple",4,1);
        Edge edge2 = new Edge("purple",3,8);
        Edge edge3 = new Edge("purple",10,6);
        Edge edge4 = new Edge("purple",10,11);
        Edge edge5 = new Edge("purple",12,2);
        Edge edge6 = new Edge("purple",-1,15);
        Edge edge7 = new Edge("purple",12,17);


        Edge edge8 = new Edge("orange",1,3);
        Edge edge9 = new Edge("orange",4,3);
        Edge edge10 = new Edge("orange",9,18);
        Edge edge11 = new Edge("orange",20,18);
        Edge edge12 = new Edge("orange",20,14);
        Edge edge13 = new Edge("orange",21,20);
        Edge edge14 = new Edge("orange",22,21);
        Edge edge15 = new Edge("orange",17,22);
        Edge edge16 = new Edge("orange",9,5);

        Edge edge17 = new Edge("black",5,1);
        Edge edge18 = new Edge("black",13,4);
        Edge edge19 = new Edge("black",14,9);
        Edge edge20 = new Edge("black",19,20);
        Edge edge21 = new Edge("black",-1,21);
        Edge edge22 = new Edge("black",16,17);
        Edge edge23 = new Edge("black",11,17);

        Edge edge24 = new Edge("green",4,9);
        Edge edge25 = new Edge("green",9,6);
        Edge edge26 = new Edge("green",6,2);
        Edge edge27 = new Edge("green",2,7);
        Edge edge28 = new Edge("green",7,12);
        Edge edge29 = new Edge("green",12,11);
        Edge edge30 = new Edge("green",15,10);
        Edge edge31 = new Edge("green",15,16);
        Edge edge32 = new Edge("green",22,15);
        Edge edge33 = new Edge("green",-1,14);
        Edge edge34 = new Edge("green",18,19);
        Edge edge35 = new Edge("green",18,13);
        Edge edge36 = new Edge("green",8,13);

        nodes.put("1",node1);
        nodes.put("2",node2);
        nodes.put("3",node3);
        nodes.put("4",node4);
        nodes.put("5",node5);
        nodes.put("6",node6);
        nodes.put("7",node7);
        nodes.put("8",node8);
        nodes.put("9",node9);
        nodes.put("10",node10);
        nodes.put("11",node11);
        nodes.put("12",node12);
        nodes.put("13",node13);
        nodes.put("14",node14);
        nodes.put("15",node15);
        nodes.put("16",node16);
        nodes.put("17",node17);
        nodes.put("18",node18);
        nodes.put("19",node19);
        nodes.put("20",node20);
        nodes.put("21",node21);
        nodes.put("22",node22);
        nodes.put("-1",node23);

        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);
        edges.add(edge6);
        edges.add(edge7);
        edges.add(edge8);
        edges.add(edge9);
        edges.add(edge10);
        edges.add(edge11);
        edges.add(edge12);
        edges.add(edge13);
        edges.add(edge14);
        edges.add(edge15);
        edges.add(edge16);
        edges.add(edge17);
        edges.add(edge18);
        edges.add(edge19);
        edges.add(edge20);
        edges.add(edge21);
        edges.add(edge22);
        edges.add(edge23);
        edges.add(edge24);
        edges.add(edge25);
        edges.add(edge26);
        edges.add(edge27);
        edges.add(edge28);
        edges.add(edge29);
        edges.add(edge30);
        edges.add(edge31);
        edges.add(edge32);
        edges.add(edge33);
        edges.add(edge34);
        edges.add(edge35);
        edges.add(edge36);

    }


    //getters

    public HashMap<String, Node> getNodes() {
        return nodes;
    }

    public HashSet<Edge> getEdges() {
        return edges;
    }


}
