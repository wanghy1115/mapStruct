package com.example.mapstruct.pojo.dto;

import lombok.Data;

/**
 * @ClassName: TableAndChairDTO
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/2
 */
@Data
public class TableAndChairDTO {
    private String tableType;
    private Integer tableSize;

    private String chairColor;
    private Integer chairLegNum;
}
