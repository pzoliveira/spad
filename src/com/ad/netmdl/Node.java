package com.ad.netmdl;

import java.util.*;

public class Node {

    /*
    This class has a unique name, only one chassis (that can support multiple ports) and
    a list of cards (inserted in availables slots of the device; also multiple ports can
    be supported for each card).
    All the links associated are considered for each node.
     */

    private String nodeName;
    private PortEntity chassis;
    private List<PortEntity> portEntityList = new ArrayList<>();
    private List<Link> links = new ArrayList<>();

    public Node(String name){
        this.setNodeName(name);
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public PortEntity getChassis() {
        return chassis;
    }

    public void setChassis(PortEntity chassis) {
        this.chassis = chassis;
    }

    public List<PortEntity> getPortEntityList() {
        return portEntityList;
    }

    public void addToPortEntityList(PortEntity portEntity) {
        this.portEntityList.add(portEntity);

    }public List<Link> getLinks() {
        return links;
    }

    public void addToLinks(Link link) {
        this.links.add(link);
    }

    @Override
    public String toString() {
        return "\nNode{" +
                "nodeName='" + nodeName + '\'' +
                "\n, chassis=" + chassis +
                "\n, portEntityList=" + portEntityList +
                "\n, link list=" + links +
                '}';
    }

}
