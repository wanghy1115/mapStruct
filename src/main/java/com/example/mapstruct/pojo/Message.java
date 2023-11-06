package com.example.mapstruct.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Message
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Data
public class Message {
    private String id;
    private String value;
    private Date time;
}
