package nl.gpesoft.sbd.application.adapter;

import nl.gpesoft.sbd.domain.Transaction;
import nl.gpesoft.sbd.domain.ports.TransactionRepository;

public class TransactionStorage implements TransactionRepository {

    @Override
    public void save(Transaction transaction) {
        System.out.println("transaction saved");
    }
}