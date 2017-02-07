package org.egentrainings.controller;

import org.egentrainings.modal.Person;
import org.egentrainings.service.serviceimpl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vkotagiri on 2/6/17.
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<Person> findOnePerson(@PathVariable Integer id) {
        //logger.info(" Received a GET request to find ONE person ");
        Person response = personService.findOne(id);
        return (response == null)   ? new ResponseEntity<Person>(response, HttpStatus.NOT_FOUND)
                : new ResponseEntity<Person>(response, HttpStatus.OK);
    }

}
