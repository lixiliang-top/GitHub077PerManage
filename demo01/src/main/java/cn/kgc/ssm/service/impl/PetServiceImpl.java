package cn.kgc.ssm.service.impl;

import cn.kgc.ssm.mapper.PetMapper;
import cn.kgc.ssm.pojo.Pet;
import cn.kgc.ssm.pojo.PetExample;
import cn.kgc.ssm.service.PetService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-20 11:09
 */
@Transactional
@Service("petService")
public class PetServiceImpl implements PetService {

    @Resource
    PetMapper petMapper;

    @Override
    public List<Pet> pList(String petbreed) {
        PetExample example = new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
        if (petbreed.equals("请选择")){
            return petMapper.selectByExample(null);
        }else{
            criteria.andPetbreedEqualTo(petbreed);
        }
        return petMapper.selectByExample(example);
    }

    @Override
    public List<Pet> ppList() {
        PetExample example = new PetExample();
        PetExample.Criteria criteria = example.createCriteria();
        List<Pet> pets = petMapper.selectByExample(example);
        return pets;
    }

    @Override
    public void ins(Pet pet) {
        petMapper.insertSelective(pet);
    }
}
