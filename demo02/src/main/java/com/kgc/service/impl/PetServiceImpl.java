package com.kgc.service.impl;

import com.kgc.mapper.PetMapper;
import com.kgc.pojo.Pet;
import com.kgc.pojo.PetExample;
import com.kgc.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PetServiceImpl implements PetService {
    @Resource
    PetMapper petMapper;

    @Override
    public List<Pet> selectByBreed(String breed) {
        //List<Pet> pets = null;
        PetExample example = new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
        if (breed != null && breed.isEmpty() == false) {
            criteria.andBreedEqualTo(breed);
        }
        List<Pet> pets = petMapper.selectByExample(example);
        return pets;
    }
    @Override
    public List<Pet> select() {
        return petMapper.selectByExample(null);
    }

    @Override
    public void insert(Pet pet) {
        petMapper.insert(pet);
    }
}
