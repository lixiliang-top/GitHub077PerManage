package com.kgc.service;

import com.kgc.pojo.Pet;

import java.util.List;

public interface PetService {
    List<Pet> selectByBreed(String breed);

     List<Pet> select();

     void insert(Pet pet);
}
