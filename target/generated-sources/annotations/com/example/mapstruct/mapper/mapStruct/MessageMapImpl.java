package com.example.mapstruct.mapper.mapStruct;

import com.example.mapstruct.pojo.Message;
import com.example.mapstruct.pojo.dto.MessageDTO;
import java.util.Date;
import java.util.UUID;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-03T15:31:08+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_381 (Oracle Corporation)"
)
@Component
public class MessageMapImpl implements MessageMap {

    @Override
    public MessageDTO toDTO(Message message) {
        if ( message == null ) {
            return null;
        }

        MessageDTO messageDTO = new MessageDTO();

        if ( message.getTime() != null ) {
            messageDTO.setTime( message.getTime() );
        }
        else {
            messageDTO.setTime( new Date() );
        }
        messageDTO.setId( message.getId() );
        messageDTO.setValue( message.getValue() );

        messageDTO.setUuid( UUID.randomUUID().toString() );

        return messageDTO;
    }
}
