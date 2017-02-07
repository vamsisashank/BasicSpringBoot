package org.egentrainings;

import org.egentrainings.impl.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vkotagiri on 2/3/17.
 */

@RestController
@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
        System.out.println("Hello");
    }


    @RequestMapping("/")
    public String sayWelcome() {
        return "Welcome Vamsi";
    }

}
