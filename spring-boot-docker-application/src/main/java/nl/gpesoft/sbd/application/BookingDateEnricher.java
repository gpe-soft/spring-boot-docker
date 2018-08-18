package nl.gpesoft.sbd.application;

import nl.gpesoft.sbd.domain.Transaction;

import java.time.ZonedDateTime;

public class BookingDateEnricher implements TransactionEnricher {

    @Override
    public void enrichTransaction(Transaction transaction) {
        transaction.setBookingDate(ZonedDateTime.now());
    }
}