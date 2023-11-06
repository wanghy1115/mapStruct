package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Chair;
import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.Table;
import com.example.mapstruct.pojo.dto.MiseDTO;
import com.example.mapstruct.pojo.dto.TableAndChairDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Map;
import java.util.Set;

/**
 * @ClassName: TableAndChairMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Mapper
public interface MiseMap {
    MiseMap INSTANCE = Mappers.getMapper(MiseMap.class);

    @Mapping(source = "mise.color", target = "miseColor", defaultValue = "notSet")
    MiseDTO toDTO(Mise mise);

    Map<Integer, MiseDTO> mapConver(Map<Integer, Mise> miseMap);
    Set<MiseDTO> setConver(Set<Mise> miseMap);
}
