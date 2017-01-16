import java.util.HashSet;

/**
 * Created by Lawik Ayoub on 20-Dec-16.
 */
public class Graph {
    private HashSet<Node> nodes = new HashSet<>();
    private HashSet<Edge> edges = new HashSet<>();

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
        Edge edge7 = new Edge("purple",-12,17);


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


    }

}
