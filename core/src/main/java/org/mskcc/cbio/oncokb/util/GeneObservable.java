package org.mskcc.cbio.oncokb.util;

import java.util.Observable;

/**
 * Created by hongxinzhang on 4/3/16.
 */


public class GeneObservable extends Observable {
    private static GeneObservable instance = new GeneObservable();

    public void setChanged() {
        super.setChanged();
    }

    public void update(String gene) {
        setChanged();
        notifyObservers(gene);
    }

    public static GeneObservable getInstance() {
        return instance;
    }
}