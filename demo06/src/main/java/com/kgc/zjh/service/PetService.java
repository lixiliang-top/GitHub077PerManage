package com.kgc.zjh.service;

import com.kgc.zjh.pojo.Pet;

import java.util.List;

public interface PetService {

    public List<Pet> selectAll(String breed);

    public List<Pet> selectPet();

    public void insert(Pet pet);
}
