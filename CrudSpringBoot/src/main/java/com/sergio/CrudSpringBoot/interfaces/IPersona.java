package com.sergio.CrudSpringBoot.interfaces;

import com.sergio.CrudSpringBoot.modelo.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {
}
