package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Animal;
import com.example.mapstruct.pojo.dto.AnimalDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: AnnimalMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Mapper(componentModel = "spring")
public interface AnimalMap {
    //(componentModel = "spring")表明托管给spring这样的话就不用自己创建instance了
//    AnimalMap INSTANCE = Mappers.getMapper(AnimalMap.class);
    AnimalDTO toDto( Animal animal);
    void updateModel(Animal animal, @MappingTarget AnimalDTO animalDTO);
}
