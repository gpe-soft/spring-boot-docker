package nl.gpesoft.sbd.application.adapter;

import nl.gpesoft.sbd.application.BookingDateEnricher;
import nl.gpesoft.sbd.application.TransactionEnricher;
import nl.gpesoft.sbd.application.TransactionProcessor;
import nl.gpesoft.sbd.domain.Transaction;
import nl.gpesoft.sbd.domain.ports.TransactionReceiver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class RestTransactionReceiver implements TransactionReceiver {

    private Transaction transaction;

    @RequestMapping(value = "/transaction", method = POST)
    public ResponseEntity<String> receiveAndProcessAndStoreTransaction(@RequestBody Transaction transaction) {
        // validate transaction
        if (!transaction.isValid()) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }
        receiveTransaction(transaction);
        processTransaction();
        storeTransaction();
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }

    public void receiveTransaction(Transaction transaction) {
        this.transaction = transaction;
        System.out.println("transaction received");
    }

    private void processTransaction() {
        TransactionProcessor transactionProcessor = new TransactionProcessor(transaction);
        transactionProcessor.process();
        System.out.println("transaction processed");
    }

    private void storeTransaction() {
        //TODO
        System.out.println("transaction stored");
    }
}