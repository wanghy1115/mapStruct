package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.People;
import com.example.mapstruct.pojo.dto.PoepleDTO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class PeopleMapImpl implements PeopleMap {

    @Override
    public PoepleDTO toDTO(People people) {
        if ( people == null ) {
            return null;
        }

        PoepleDTO poepleDTO = new PoepleDTO();

        try {
            if ( people.getBirth() != null ) {
                poepleDTO.setBirth( new SimpleDateFormat( "yyyy-MM-ss" ).parse( people.getBirth() ) );
            }
        }
        catch ( ParseException e ) {
            throw new RuntimeException( e );
        }
        poepleDTO.setName( people.getName() );

        return poepleDTO;
    }
}
