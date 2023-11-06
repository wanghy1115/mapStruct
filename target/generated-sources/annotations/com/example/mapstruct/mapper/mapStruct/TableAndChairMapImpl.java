package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Chair;
import com.example.mapstruct.pojo.Table;
import com.example.mapstruct.pojo.dto.TableAndChairDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class TableAndChairMapImpl implements TableAndChairMap {

    @Override
    public TableAndChairDTO toDTO(Table table, Chair chair) {
        if ( table == null && chair == null ) {
            return null;
        }

        TableAndChairDTO tableAndChairDTO = new TableAndChairDTO();

        if ( table != null ) {
            tableAndChairDTO.setTableType( table.getType() );
            tableAndChairDTO.setTableSize( table.getSize() );
        }
        if ( chair != null ) {
            tableAndChairDTO.setChairColor( chair.getColor() );
            tableAndChairDTO.setChairLegNum( chair.getLegNum() );
        }

        return tableAndChairDTO;
    }
}
