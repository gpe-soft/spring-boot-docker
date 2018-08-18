package nl.gpesoft.sbd.domain;

import nl.gpesoft.sbd.domain.Transaction;

public interface TransactionEnricher {

    public void enrichTransaction(Transaction transaction);

}