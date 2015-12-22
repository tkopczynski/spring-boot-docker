package pl.net.kopczynski;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple web controller
 *
 * Created by Tomasz Kopczynski on 22.12.15.
 */
@RestController
public class WebController {

    @RequestMapping("/")
    public String home() {
        return "Hello world from Docker!";
    }
}
