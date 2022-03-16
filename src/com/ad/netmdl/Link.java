package com.ad.netmdl;

import java.util.*;

public class Link {

    /*
    This class has a unique name and lists of nodes, port entities, port numbers and
    circuits.
     */

    private String linkName;
    private List<Node> nodes = new ArrayList<>();
    private List<PortEntity> portEntities = new ArrayList<>();
    private List<Integer> portNbrs = new ArrayList<>();
    private List<Circuit> circuits = new ArrayList<>();

    public Link(String name, Node node1, PortEntity portEntity1, Integer port1, Node node2, PortEntity portEntity2, Integer port2){
        this.setLinkName(name);
        this.addToNodes(node1);
        this.addToPortEntities(portEntity1);
        node1.addToLinks(this);
        this.addToPortNbrs(port1);
        this.addToNodes(node2);
        this.addToPortEntities(portEntity2);
        node2.addToLinks(this);
        this.addToPortNbrs(port2);
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addToNodes(Node node) {
        this.nodes.add(node);
    }

    public List<PortEntity> getPortEntities() {
        return portEntities;
    }

    public void addToPortEntities(PortEntity portEntity) {
        this.portEntities.add(portEntity);
    }

    public List<Integer> getPortNbrs() {
        return portNbrs;
    }

    public void addToPortNbrs(Integer portNbr) {
        this.portNbrs.add(portNbr);
    }

    public List<Circuit> getCircuits() {
        return circuits;
    }

    public void addToCircuits(Circuit circuit) {
        this.circuits.add(circuit);
    }

    @Override
    public String toString() {
        return "\nLink{" +
                "linkName='" + linkName + '\'' +
                ", source node=" + nodes.get(0).getNodeName() +
                ", source portEntity=" + portEntities.get(0).getPortEntityName() +
                ", source portNbr=" + portNbrs.get(0) +
                ", sink node=" + nodes.get(1).getNodeName() +
                ", sink portEntity=" + portEntities.get(1).getPortEntityName() +
                ", sink portNbr=" + portNbrs.get(1) +
                '}';
    }
}
