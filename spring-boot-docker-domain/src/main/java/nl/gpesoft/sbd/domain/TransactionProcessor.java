package nl.gpesoft.sbd.domain;

public class TransactionProcessor {

    private Transaction transaction;

    public TransactionProcessor(Transaction transaction) {
        this.transaction = transaction;
    }

    public void process() {
        enrichkBookingDate();
        enrichChannel();
    }

    private void enrichkBookingDate() {
        if (transaction.getBookingDate() == null) {
            new BookingDateEnricher().enrichTransaction(transaction);
        }
    }

    private void enrichChannel() {
        if (transaction.getChannel() == null) {
            new ChannelEnricher().enrichTransaction(transaction);
        }
    }
}