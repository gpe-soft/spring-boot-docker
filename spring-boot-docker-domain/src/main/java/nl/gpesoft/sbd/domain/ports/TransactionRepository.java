package nl.gpesoft.sbd.domain.ports;

import nl.gpesoft.sbd.domain.Transaction;

public interface TransactionRepository {

    public void save(Transaction transaction);
}