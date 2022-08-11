package com.abokotb.baisicandroidlearn;

import java.util.ArrayList;

public class Item {
    public String itemName,logoDis,logoEnt;

    public Item(String itemName, String logoDis, String logoEnt) {
        this.itemName = itemName;
        this.logoDis = logoDis;
        this.logoEnt = logoEnt;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getLogoDis() {
        return logoDis;
    }

    public void setLogoDis(String logoDis) {
        this.logoDis = logoDis;
    }

    public String getLogoEnt() {
        return logoEnt;
    }

    public void setLogoEnt(String logoEnt) {
        this.logoEnt = logoEnt;
    }
}
