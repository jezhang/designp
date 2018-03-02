package com.dbschenker.odm.abstracts;

import com.dbschenker.odm.interfaces.Receivable;
import com.dbschenker.odm.interfaces.Sendable;

public abstract class AbstractOdmFile {
    Sendable sendBehavior;
    Receivable receiveBehavior;

    public AbstractOdmFile() {}

    public abstract void loadConfig();
    public abstract void makeXml();

    public void setSendBehavior(Sendable sendable) {
        sendBehavior = sendable;
    }

    public void setReceiveBehavior(Receivable receivable) {
        receiveBehavior = receivable;
    }

    public void performSend() {
        sendBehavior.send();
    }

    public void performRecive() {
        receiveBehavior.receive();
    }

}
