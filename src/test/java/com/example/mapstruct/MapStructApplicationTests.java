package com.example.mapstruct;

import com.example.mapstruct.enums.PayEnum;
import com.example.mapstruct.mapper.mapStruct.*;
import com.example.mapstruct.pojo.*;
import com.example.mapstruct.pojo.dto.*;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class MapStructApplicationTests {
    @Autowired
    AnimalMap animalMap;
    @Autowired
    MessageMap messageMap;
    @Test
    void contextLoads() {
    }
    @Test
    void animalConvert(){
        Animal animal = new Animal();
        animal.setAge(12);
        animal.setMove("move");
        animal.setName("animal");
        animal.setBelong("animal");
        AnimalDTO dto = animalMap.toDto(animal);
        System.out.println(dto);
    }

    @Test
    void catConvert(){
        Cat animal = new Cat();
        animal.setAge(12);
        animal.setMove("move");
        animal.setName("animal");
        animal.setBelong("animal");
        animal.setCatchMiceNum(12);
        Mise m1 = new Mise("red",1,2);
        Mise m2 = new Mise("blue",1,2);
        animal.setMises(new ArrayList<>(Arrays.asList(m1,m2)));
        CatDTO dto = CatMap.INSTANCE.toDto(animal);
        System.out.println(dto);
        System.out.println(dto.getMises().get(0));
        System.out.println(dto.getMises().get(1));
    }

    @Test
    void tableAndChairConvert(){
        Table table = new Table();
        table.setSize(10);
        table.setType("办公桌");
        Chair chair = new Chair();
        chair.setColor("red");
        chair.setLegNum(4);
        TableAndChairDTO dto = TableAndChairMap.INSTANCE.toDTO(table, chair);
        System.out.println(dto);
    }

    @Test
    void miseListConvert(){
        Mise m1 = new Mise("red",1,2);
        Mise m2 = new Mise("blue",1,2);
        ArrayList<Mise> mises = new ArrayList<>(Arrays.asList(m1, m2));
        List<MiseDTO> map = MiseListMap.INSTANCE.map(mises);
        for (MiseDTO miseDTO : map){
            System.out.println(miseDTO);
        }
    }


    @Test
    void peopleConvert(){
        People people = new People();
        people.setBirth("2020-11-15");
        people.setName("why");
        PoepleDTO dto = PeopleMap.INSTANCE.toDTO(people);
        System.out.println(dto);
    }

    @Test
    void payConvert(){
        Pay pay = new Pay();
        pay.setType(PayEnum.WEIXIN);
        pay.setValue(10.00F);

        Pay pay1 = new Pay();
        pay1.setType(PayEnum.YIZHIFU);
        pay1.setValue(10.00F);
        PayDTO payDTO1 = PayPoMap.INSTANCE.toDto(pay);
        PayDTO payDTO2 = PayPoMap.INSTANCE.toDto(pay1);
        System.out.println(payDTO1);
        System.out.println(payDTO2);
    }

    @Test
    void miseMapAndSetConvert(){
        Mise m1 = new Mise("red",1,2);
        Mise m2 = new Mise("blue",1,2);
        Map<Integer, Mise> miseMap = new HashMap<>();
        miseMap.put(1, m1);
        miseMap.put(2, m2);
        Set<Mise> miseSet = new HashSet<>();
        miseSet.add(m1);
        miseSet.add(m2);
        Map<Integer, MiseDTO> integerMiseDTOMap = MiseMap.INSTANCE.mapConver(miseMap);
        Set<MiseDTO> miseDTOSet = MiseMap.INSTANCE.setConver(miseSet);
        for(Integer i : integerMiseDTOMap.keySet()){
            System.out.println(integerMiseDTOMap.get(i));
        }
        System.out.println(miseDTOSet);
    }
    @Test
    void messageMap(){
        Message message = new Message();
        message.setId("1");
        message.setValue("nihao");
        MessageDTO dto = messageMap.toDTO(message);
        System.out.println(dto);
        message.setTime(DateUtil.yesterday());
        dto = messageMap.toDTO(message);
        System.out.println(dto);
    }

}
