package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Cat;
import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.dto.CatDTO;
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
public class CatMapImpl implements CatMap {

    private final MiseMap miseMap = Mappers.getMapper( MiseMap.class );

    @Override
    public CatDTO toDto(Cat animal) {
        if ( animal == null ) {
            return null;
        }

        CatDTO catDTO = new CatDTO();

        catDTO.setCatchNum( animal.getCatchMiceNum() );
        catDTO.setName( animal.getName() );
        catDTO.setMove( animal.getMove() );
        catDTO.setAge( animal.getAge() );
        catDTO.setBelong( animal.getBelong() );
        catDTO.setMises( miseListToMiseDTOList( animal.getMises() ) );

        return catDTO;
    }

    protected List<MiseDTO> miseListToMiseDTOList(List<Mise> list) {
        if ( list == null ) {
            return null;
        }

        List<MiseDTO> list1 = new ArrayList<MiseDTO>( list.size() );
        for ( Mise mise : list ) {
            list1.add( miseMap.toDTO( mise ) );
        }

        return list1;
    }
}
