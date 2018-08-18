package nl.gpesoft.sbd.domain;

import java.time.ZonedDateTime;

public class BookingDateEnricher implements TransactionEnricher {

    @Override
    public void enrichTransaction(Transaction transaction) {
        transaction.setBookingDate(ZonedDateTime.now());
    }
}