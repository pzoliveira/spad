package com.ad.netmdl;

import java.util.*;

public class Circuit {

    /*
    This class has a unique name and a list of links.
     */

    private String circuitName;
    private List<Link> links = new ArrayList<>();

    public Circuit(String name){
        this.setCircuitName(name);
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void addToLinks(Link link) {
        this.links.add(link);
        link.addToCircuits(this);
    }

    @Override
    public String toString() {
        return "\nCircuit{" +
                "circuitName='" + circuitName + '\'' +
                "\n, links=" + links +
                '}';
    }
}
