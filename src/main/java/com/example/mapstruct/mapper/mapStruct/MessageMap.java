package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Message;
import com.example.mapstruct.pojo.dto.MessageDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

/**
 * @ClassName: MessageMap
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
//imports方法导入下面需要的类
@Mapper(componentModel = "spring", imports = {UUID.class, Date.class})
public interface MessageMap {
    /**
     * expression设置java方法
     * defaultExpression设置默认方法，下面如果time==null则写入当前时间
     */
    @Mapping(target = "uuid", expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "time", defaultExpression = "java(new Date())")
    MessageDTO toDTO(Message message);
}
