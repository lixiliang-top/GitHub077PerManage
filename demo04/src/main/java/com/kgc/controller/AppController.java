package com.kgc.controller;

import com.kgc.pojo.Pet;
import com.kgc.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AppController {
    @Resource
    PetService petService;

    @RequestMapping("/")
    public String toIndex(@RequestParam(value = "breed", required = true, defaultValue = "") String breed, Model model) {
        List<Pet> pets = petService.selectByBreed(breed);
        model.addAttribute("pets", pets);
        return "index";
    }

    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/WeiYi")
    @ResponseBody
    public Map<String, Object> admin(String name) {
        Map<String, Object> map = new HashMap<>();
        List<Pet> pets = petService.select();
        for (int i = 1; i < pets.size(); i++) {
            if (pets.get(i).getName().equals(name) == false) {
                map.put("status", "true");
            } else {
                map.put("status", "false");
            }
        }
        return map;
    }

    @RequestMapping("insert")
    public String insertPet(/*String name, String breed, String sex, Date birthday, String ms*/Pet pet) {
        petService.insert(pet);
        return "redirect:/";
    }
}
