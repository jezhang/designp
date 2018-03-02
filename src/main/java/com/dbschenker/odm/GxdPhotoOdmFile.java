package com.dbschenker.odm;

import com.dbschenker.odm.abstracts.AbstractOdmFile;
import com.dbschenker.odm.interfaces.impl.GxdPhotoReceiveImpl;
import com.dbschenker.odm.interfaces.impl.GxdPhotoSendImpl;

public class GxdPhotoOdmFile extends AbstractOdmFile {

    public GxdPhotoOdmFile() {
        sendBehavior = new GxdPhotoSendImpl();
        receiveBehavior = new GxdPhotoReceiveImpl();
    }


    @Override
    public void loadConfig() {

    }

    @Override
    public void makeXml() {

    }
}
