package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Pay;
import com.example.mapstruct.pojo.dto.PayDTO;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class PayPoMapImpl implements PayPoMap {

    private final PayMap payMap = Mappers.getMapper( PayMap.class );

    @Override
    public PayDTO toDto(Pay pay) {
        if ( pay == null ) {
            return null;
        }

        PayDTO payDTO = new PayDTO();

        payDTO.setType( payMap.payEunmToPayView( pay.getType() ) );
        if ( pay.getValue() != null ) {
            payDTO.setValue( pay.getValue().intValue() );
        }

        return payDTO;
    }
}
