package nl.gpesoft.sbd.application;

import nl.gpesoft.sbd.domain.Channel;
import nl.gpesoft.sbd.domain.Transaction;


public class ChannelEnricher implements TransactionEnricher {

    @Override
    public void enrichTransaction(Transaction transaction) {
        transaction.setChannel(Channel.TAKEAWAY);
    }
}