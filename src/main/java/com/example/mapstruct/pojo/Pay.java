package com.example.mapstruct.pojo;

import com.example.mapstruct.enums.PayEnum;
import lombok.Data;

/**
 * @ClassName: Pay
 * @Description: todo
 * @Author: wanghuaiyu
 * @Date: 2023/11/3
 */
@Data
public class Pay {
    private PayEnum type;
    private Float value;
}
