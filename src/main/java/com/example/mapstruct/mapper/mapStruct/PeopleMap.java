package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.People;
import com.example.mapstruct.pojo.dto.MiseDTO;
import com.example.mapstruct.pojo.dto.PoepleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: TableAndChairMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Mapper
public interface PeopleMap {
    PeopleMap INSTANCE = Mappers.getMapper(PeopleMap.class);

    @Mapping(source = "birth", target = "birth", dateFormat = "yyyy-MM-ss")
    PoepleDTO toDTO(People people);
}
