package com.ad.netmdl;

public class PortEntity {

    /*
    This class has a unique name and the number of ports supported.
    */

    private String portEntityName;
    private int nbrOfPorts;

    public PortEntity(String name, int nbr){
        this.setPortEntityName(name);
        this.setNbrOfPorts(nbr);
    }

    public String getPortEntityName() {
        return portEntityName;
    }

    public void setPortEntityName(String portEntityName) {
        this.portEntityName = portEntityName;
    }

    public int getNbrOfPorts() {
        return nbrOfPorts;
    }

    public void setNbrOfPorts(int nbrOfPorts) {
        this.nbrOfPorts = nbrOfPorts;
    }

    @Override
    public String toString() {
        return "PortEntity{" +
                "portEntityName='" + portEntityName + '\'' +
                ", nbrOfPorts=" + nbrOfPorts +
                '}';
    }
}
