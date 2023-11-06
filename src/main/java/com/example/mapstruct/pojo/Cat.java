package com.example.mapstruct.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @ClassName: annimal
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Data
//toString包括父类字段
@ToString(callSuper = true)
public class Cat extends Animal{
    /**
     * 捕鼠数量
     */
    private Integer catchMiceNum;

    private List<Mise> mises;
}
