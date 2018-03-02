package com.dbschenker.odm.interfaces.impl;

import com.dbschenker.odm.interfaces.Receivable;

public class GxdPhotoReceiveImpl implements Receivable {

    @Override
    public void receive() {
        System.out.println("GXD photo message receive.");
    }
}
