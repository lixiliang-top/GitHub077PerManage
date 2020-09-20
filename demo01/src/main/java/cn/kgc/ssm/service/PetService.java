package cn.kgc.ssm.service;

import cn.kgc.ssm.pojo.Pet;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-20 11:08
 */
public interface PetService {

    List<Pet> pList(String petbreed);

    List<Pet> ppList();

    void ins(Pet pet);
}
