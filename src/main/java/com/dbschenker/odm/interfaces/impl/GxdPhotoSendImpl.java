package com.dbschenker.odm.interfaces.impl;

import com.dbschenker.odm.interfaces.Sendable;

public class GxdPhotoSendImpl implements Sendable {
    @Override
    public void send() {
        System.out.println("Send GXD Photo");
    }
}
