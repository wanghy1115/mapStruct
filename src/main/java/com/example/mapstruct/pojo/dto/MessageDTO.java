package com.example.mapstruct.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: MessageDTO
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Data
public class MessageDTO {
    private String id;
    private String uuid;
    private String value;
    private Date time;
}
