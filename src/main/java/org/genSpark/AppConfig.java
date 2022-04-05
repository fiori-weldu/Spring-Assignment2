package org.genSpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Phone getPhone(){
        return new Phone();
    }
    @Bean
    public Address getAddress(){
        return new Address("Ewing", "EWing", "Us", "65478");
    }

    @Bean
    public Employee getEmployee(){
        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Fiori Wel");
        Address ad= getAddress();
        emp.setAdd(ad);
        Phone phone1 = getPhone();
        Phone phone2 = getPhone();
        Phone phone3 = getPhone();
        phone1.setMob("123");
        phone2.setMob("456");
        phone3.setMob("789");
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        emp.setPh(phoneArrayList);

        return emp;
    }


}
