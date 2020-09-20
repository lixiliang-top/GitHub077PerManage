package cn.kgc.ssm.test;

import cn.kgc.ssm.pojo.Pet;
import cn.kgc.ssm.service.PetService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-09-20 11:41
 */
public class Text01 {

    @Test
    public void text01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
        PetService petService =(PetService) context.getBean("petService");
        List<Pet> aa = petService.pList("狗");
        for (Pet pet : aa) {
            System.out.println(pet.toString());
        }
    }

}
