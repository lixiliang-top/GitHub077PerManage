package com.kgc.zjh.controller;

import com.kgc.zjh.mapper.PetMapper;
import com.kgc.zjh.pojo.Pet;
import com.kgc.zjh.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PetController {

    @Resource
    PetService petService;

    @RequestMapping("/doIndex")
    public String Index(Model model,String breed){
        List<Pet> pets = petService.selectAll(breed);
        model.addAttribute("petList",pets);
        return "index";
    }

    @RequestMapping("addPet")
    public String addPet1(){
        return "add";
    }

    @RequestMapping("/WeiYi")
    @ResponseBody
    public Map<String,Object> admin(String name){
        Map<String,Object> map=new HashMap<>();
        List<Pet> pets = petService.selectPet();
        for (int i = 1; i < pets.size(); i++) {
            System.out.println(pets.get(i).getPetName());
            if(pets.get(i).getPetName().equals(name)==false){
                map.put("status","true");
            }else{
                map.put("status","false");
            }
        }
        return map;
    }

    @RequestMapping("insertPet")
    public String insertPet(/*String name, String breed, String sex, Date birthday, String ms*/Pet pet){
        petService.insert(pet);
        return "redirect:/doIndex";
    }
}
