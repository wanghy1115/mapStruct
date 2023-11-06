package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.dto.MiseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @ClassName: MiseListMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Mapper(uses = {MiseMap.class})
public interface MiseListMap {
    MiseListMap INSTANCE = Mappers.getMapper(MiseListMap.class);
    List<MiseDTO> map(List<Mise> mises);
}
