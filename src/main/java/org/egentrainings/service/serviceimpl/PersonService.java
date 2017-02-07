package org.egentrainings.service.serviceimpl;

import org.egentrainings.modal.Person;
import org.egentrainings.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vkotagiri on 2/6/17.
 */
@Service
public class PersonService {

    @Autowired
    IPersonRepository personRepository;

    public Person findOne(Integer id) {
        //logger.info(" Finding person in database ");
        return personRepository.findOne(id);
    }
}
