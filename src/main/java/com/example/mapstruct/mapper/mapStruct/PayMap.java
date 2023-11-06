package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.enums.PayEnum;
import com.example.mapstruct.enums.view.PayView;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName: PayMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Mapper
public interface PayMap {
    PayMap INSTANCE = Mappers.getMapper(PayMap.class);

    @ValueMappings({
            @ValueMapping(source = "ZHIFUBAO", target = "ZHI_FU_BAO"),
            @ValueMapping(source = "WEIXIN", target = "WEI_XIN"),
            @ValueMapping(source = "YINHANGKA", target = "YI_NHANG_KA"),
            @ValueMapping(source = MappingConstants.ANY_REMAINING, target = "OTHER")
    })
    PayView payEunmToPayView(PayEnum payEnum);
}
