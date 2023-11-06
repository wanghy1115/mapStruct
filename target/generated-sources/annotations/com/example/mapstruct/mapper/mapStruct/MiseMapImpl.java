package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Mise;
import com.example.mapstruct.pojo.dto.MiseDTO;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
public class MiseMapImpl implements MiseMap {

    @Override
    public MiseDTO toDTO(Mise mise) {
        if ( mise == null ) {
            return null;
        }

        MiseDTO miseDTO = new MiseDTO();

        if ( mise.getColor() != null ) {
            miseDTO.setMiseColor( mise.getColor() );
        }
        else {
            miseDTO.setMiseColor( "notSet" );
        }
        miseDTO.setSex( mise.getSex() );

        return miseDTO;
    }

    @Override
    public Map<Integer, MiseDTO> mapConver(Map<Integer, Mise> miseMap) {
        if ( miseMap == null ) {
            return null;
        }

        Map<Integer, MiseDTO> map = new HashMap<Integer, MiseDTO>( Math.max( (int) ( miseMap.size() / .75f ) + 1, 16 ) );

        for ( java.util.Map.Entry<Integer, Mise> entry : miseMap.entrySet() ) {
            Integer key = entry.getKey();
            MiseDTO value = toDTO( entry.getValue() );
            map.put( key, value );
        }

        return map;
    }

    @Override
    public Set<MiseDTO> setConver(Set<Mise> miseMap) {
        if ( miseMap == null ) {
            return null;
        }

        Set<MiseDTO> set = new HashSet<MiseDTO>( Math.max( (int) ( miseMap.size() / .75f ) + 1, 16 ) );
        for ( Mise mise : miseMap ) {
            set.add( toDTO( mise ) );
        }

        return set;
    }
}
