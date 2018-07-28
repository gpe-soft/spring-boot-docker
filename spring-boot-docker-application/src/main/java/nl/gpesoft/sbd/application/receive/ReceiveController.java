package nl.gpesoft.sbd.application.receive;

import nl.gpesoft.sbd.domain.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
public class ReceiveController {

    @RequestMapping(value="/greeting", method=GET)
    public Greeting receive(@RequestParam String name) {
        return new Greeting(name);
    }
}
