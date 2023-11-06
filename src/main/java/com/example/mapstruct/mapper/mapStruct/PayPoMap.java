package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Pay;
import com.example.mapstruct.pojo.dto.PayDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: PayPoMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Mapper(uses = {PayMap.class})
public interface PayPoMap {
    PayPoMap INSTANCE = Mappers.getMapper(PayPoMap.class);

    PayDTO toDto(Pay pay);
}
