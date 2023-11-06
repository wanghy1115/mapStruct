package com.example.mapstruct.pojo.dto;

import com.example.mapstruct.enums.PayEnum;
import com.example.mapstruct.enums.view.PayView;
import lombok.Data;

/**
 * @ClassName: PayDTO
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Data
public class PayDTO {
    private PayView type;
    private Integer value;
}
