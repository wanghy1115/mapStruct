package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Animal;
import com.example.mapstruct.pojo.Cat;
import com.example.mapstruct.pojo.dto.AnimalDTO;
import com.example.mapstruct.pojo.dto.CatDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: AnnimalMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
//@Mapper(uses = {MiseMap.class})表明CatMap会用到MiseMap
@Mapper(uses = {MiseMap.class})
public interface CatMap {
    CatMap INSTANCE = Mappers.getMapper(CatMap.class);

    @Mapping(source = "animal.catchMiceNum", target = "catchNum")
    CatDTO toDto(Cat animal);
}
