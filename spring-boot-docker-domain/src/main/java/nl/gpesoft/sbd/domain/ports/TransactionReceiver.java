package nl.gpesoft.sbd.domain.ports;

import nl.gpesoft.sbd.domain.Transaction;

public interface TransactionReceiver {

    public void receiveTransaction(Transaction transaction);

}