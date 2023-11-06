package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.enums.PayEnum;
import com.example.mapstruct.enums.view.PayView;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class PayMapImpl implements PayMap {

    @Override
    public PayView payEunmToPayView(PayEnum payEnum) {
        if ( payEnum == null ) {
            return null;
        }

        PayView payView;

        switch ( payEnum ) {
            case ZHIFUBAO: payView = PayView.ZHI_FU_BAO;
            break;
            case WEIXIN: payView = PayView.WEI_XIN;
            break;
            case YINHANGKA: payView = PayView.YI_NHANG_KA;
            break;
            default: payView = PayView.OTHER;
        }

        return payView;
    }
}
