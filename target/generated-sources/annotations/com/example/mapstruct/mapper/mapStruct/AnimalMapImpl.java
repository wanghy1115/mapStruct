package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Animal;
import com.example.mapstruct.pojo.dto.AnimalDTO;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
@Component
public class AnimalMapImpl implements AnimalMap {

    @Override
    public AnimalDTO toDto(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalDTO animalDTO = new AnimalDTO();

        animalDTO.setName( animal.getName() );
        animalDTO.setMove( animal.getMove() );
        animalDTO.setAge( animal.getAge() );
        animalDTO.setBelong( animal.getBelong() );

        return animalDTO;
    }

    @Override
    public void updateModel(Animal animal, AnimalDTO animalDTO) {
        if ( animal == null ) {
            return;
        }

        animalDTO.setName( animal.getName() );
        animalDTO.setMove( animal.getMove() );
        animalDTO.setAge( animal.getAge() );
        animalDTO.setBelong( animal.getBelong() );
    }
}
