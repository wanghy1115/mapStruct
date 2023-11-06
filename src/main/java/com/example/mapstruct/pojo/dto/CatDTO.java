package com.example.mapstruct.pojo.dto;

import com.example.mapstruct.pojo.Animal;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @ClassName: CatDTO
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Data
//toString包括父类字段
@ToString(callSuper = true)
public class CatDTO extends AnimalDTO {
    /**
     * 捕鼠数量
     */
    Integer catchNum;

    List<MiseDTO> mises;
}
