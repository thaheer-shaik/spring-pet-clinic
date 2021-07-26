package com.spring.springpetclinic.services;

import com.spring.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
