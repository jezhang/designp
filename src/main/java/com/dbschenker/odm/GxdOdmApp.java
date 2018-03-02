package com.dbschenker.odm;

import com.dbschenker.odm.abstracts.AbstractOdmFile;

public class GxdOdmApp {
    public static void main(String[] args) {
        AbstractOdmFile gxdPhotoOdmFile = new GxdPhotoOdmFile();
        gxdPhotoOdmFile.performSend();
        gxdPhotoOdmFile.performRecive();
    }
}
