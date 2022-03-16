package com.ad.netmdl;

public class Principal {

    /*
    In this class, some entities (three nodes, two links and one circuit) and one network were created.
    All these entities were attached to the network and the functionalities were tested.

    Important to notice that this application can evolve as below:
    - Check if the resources (ports, nodes and links) really exist
    - Verify if the resources are available or not
    - Define the speed of the ports, links and circuits
    - Create a tool that automates the creation of links and circuits (from a source port of a node to
    a sink port of another node)
    - Create more complex networks (rings, mesh, bilinear, ...)
    - Define status of links and/or circuits (down, maintenance, implemented, running, redundant, standby ...)
    - Manage users privileges (read-only, read-write, commissioner ...)
    - Create a command line interface in order to create new entities and attach these entities to some network
     */

    public static void main(String[] args) {
        Node node1 = new Node("Eins");
        PortEntity chassis1 = new PortEntity("mother1board", 1);
        PortEntity card11 = new PortEntity("card1one", 2);
        PortEntity card12 = new PortEntity("card1two", 3);
        PortEntity card13 = new PortEntity("card1three", 4);
        node1.setChassis(chassis1);
        node1.addToPortEntityList(card11);
        node1.addToPortEntityList(card12);
        node1.addToPortEntityList(card13);
//        System.out.println(node1.toString());
        Network net1 = new Network("Netzwerk");
        net1.addToNodeList(node1);
//        System.out.println(net1);
//        System.out.println(net1.queryByName("Eins"));
        Node node2 = new Node("Zwei");
        PortEntity chassis2 = new PortEntity("mother2board", 1);
        PortEntity card21 = new PortEntity("card2one", 1);
        PortEntity card22 = new PortEntity("card2two", 2);
        node2.setChassis(chassis2);
        node2.addToPortEntityList(card21);
        node2.addToPortEntityList(card22);
        net1.addToNodeList(node2);
        Link link1 = new Link("Service", node1, card11,1, node2, chassis2, 1);
        net1.addToLinkList(link1);
        Node node3 = new Node("Drei");
        PortEntity chassis3 = new PortEntity("mother3board", 2);
        PortEntity card31 = new PortEntity("card3one", 2);
        PortEntity card32 = new PortEntity("card3two", 1);
        node3.setChassis(chassis3);
        node3.addToPortEntityList(card31);
        node3.addToPortEntityList(card32);
        net1.addToNodeList(node3);
        Link link2 = new Link("EOW", node2, card22,2, node3, chassis3, 2);
        net1.addToLinkList(link2);
        Circuit circ1 = new Circuit("Channel");
        circ1.addToLinks(link1);
        circ1.addToLinks(link2);
        net1.addToCircuitList(circ1);
//        System.out.println(net1.toString());
        System.out.println(net1.queryByName("card2one"));

    }

}
