package nl.gpesoft.sbd.application;

import nl.gpesoft.sbd.domain.Transaction;

public interface TransactionEnricher {

    public void enrichTransaction(Transaction transaction);

}