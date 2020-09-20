package com.kgc.zjh.service.Impl;

import com.kgc.zjh.mapper.PetMapper;
import com.kgc.zjh.pojo.Pet;
import com.kgc.zjh.pojo.PetExample;
import com.kgc.zjh.service.PetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("petservice")
public class PetServiceImpl implements PetService {

    @Resource
    PetMapper petMapper;


    @Override
    public List<Pet> selectAll(String breed) {
        PetExample example=new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
        if(breed!=null && breed.isEmpty()==false){
            criteria.andPetBreedLike("%"+breed +"%");
        }else{
            return petMapper.selectByExample(null);
        }
        return petMapper.selectByExample(example);
    }

    @Override
    public List<Pet> selectPet() {
        return petMapper.selectByExample(null);
    }

    @Override
    public void insert(Pet pet) {
        petMapper.insert(pet);
    }
}
