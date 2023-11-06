package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Chair;
import com.example.mapstruct.pojo.Table;
import com.example.mapstruct.pojo.dto.TableAndChairDTO;
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
public interface TableAndChairMap {
    TableAndChairMap INSTANCE = Mappers.getMapper(TableAndChairMap.class);

    @Mapping(source = "table.type", target = "tableType")
    @Mapping(source = "table.size", target = "tableSize")
    @Mapping(source = "chair.color", target = "chairColor")
    @Mapping(source = "chair.legNum", target = "chairLegNum")
    TableAndChairDTO toDTO(Table table, Chair chair);
}
