package org.egentrainings.repository;

import org.egentrainings.modal.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vkotagiri on 2/6/17.
 */
public interface IPersonRepository extends JpaRepository<Person, Integer> {

}