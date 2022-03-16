package com.ad.netmdl;

import java.util.*;

public class Network {

    /*
    This class has a unique name and lists of nodes, links and circuits.
     */

    private String networkName;
    private List<Node> nodeList = new ArrayList<>();
    private List<Link> linkList = new ArrayList<>();
    private List<Circuit> circuitList = new ArrayList<>();

    public Network(String name){
        this.setNetworkName(name);
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public List<Node> getNodeList() {
        return nodeList;
    }

    public void addToNodeList(Node node) {
        this.nodeList.add(node);
    }

    public List<Link> getLinkList() {
        return linkList;
    }

    public void addToLinkList(Link link) {
        this.linkList.add(link);
    }

    public List<Circuit> getCircuitList() {
        return circuitList;
    }

    public void addToCircuitList(Circuit circuit) {
        this.circuitList.add(circuit);
    }

    public String queryByName(String search) {
        if (networkName.equals(search)) {
            return this.toString();
        }
        for (Node node : this.getNodeList()) {
            if (node.getNodeName().equals(search)) {
                return node.toString();
            }
            if (node.getChassis().getPortEntityName().equals(search)) {
                return node.getChassis().toString();
            }
            for (Link link : node.getLinks()) {
                if(link.getLinkName().equals(search)){
                    return link.toString();
                }
                for (Circuit circuit : link.getCircuits()){
                    if (circuit.getCircuitName().equals(search)){
                        return circuit.toString();
                    }
                }
            }
            for (PortEntity portEntity : node.getPortEntityList()) {
                if (portEntity.getPortEntityName().equals(search)) {
                    return portEntity.toString();
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Network{" +
                "networkName='" + networkName + '\'' +
                "\n, nodeList=" + nodeList +
                "\n, linkList=" + linkList +
                "\n, circuitList=" + circuitList +
                '}';
    }
}
