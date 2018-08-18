package nl.gpesoft.sbd.domain;


public class ChannelEnricher implements TransactionEnricher {

    @Override
    public void enrichTransaction(Transaction transaction) {
        transaction.setChannel(Channel.TAKEAWAY);
    }
}