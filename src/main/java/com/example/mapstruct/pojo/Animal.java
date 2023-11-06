package com.example.mapstruct.pojo;

import lombok.Data;

/**
 * @ClassName: annimal
 * @Description: 与对应的DTO字段名称完全相同
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Data
public class Animal {
    private String name;
    private String move;
    private Integer age;
    private String belong;
}
