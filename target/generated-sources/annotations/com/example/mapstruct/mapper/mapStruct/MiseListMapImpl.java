package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.dto.MiseDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class MiseListMapImpl implements MiseListMap {

    private final MiseMap miseMap = Mappers.getMapper( MiseMap.class );

    @Override
    public List<MiseDTO> map(List<Mise> mises) {
        if ( mises == null ) {
            return null;
        }

        List<MiseDTO> list = new ArrayList<MiseDTO>( mises.size() );
        for ( Mise mise : mises ) {
            list.add( miseMap.toDTO( mise ) );
        }

        return list;
    }
}
