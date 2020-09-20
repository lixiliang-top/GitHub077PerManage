package cn.kgc.ssm.controller;

import cn.kgc.ssm.pojo.Pet;
import cn.kgc.ssm.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 李锡良
 * @create 2020-09-20 11:15
 */
@Controller
public class PetController {

    @Resource
    PetService petService;

    @RequestMapping("/")
    public String toIndex(){
        return "/jsp/index";
    }

    @RequestMapping("/doIndex")
    @ResponseBody
    public Map<String,Object> doIndex(String petbreed){
        Map<String,Object> map = new HashMap<>();
        List<Pet> pets = petService.pList(petbreed);
        map.put("data",pets);
        return map;
    }

    @RequestMapping("/toIndex2")
    public String toIndex2(){
        return "/jsp/index2";
    }

    @RequestMapping("/doIndex2")
    public String doIndex2(Pet pet, Model model){
        pet.setPetname(pet.getPetname());
        pet.setPetbreed(pet.getPetbreed());
        pet.setPetsex(pet.getPetsex());
        pet.setBirthday(pet.getBirthday());
        pet.setDescription(pet.getDescription());
        petService.ins(pet);
        return "redirect:/";
    }

}
