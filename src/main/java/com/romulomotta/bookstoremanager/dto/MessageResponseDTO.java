package com.romulomotta.bookstoremanager.dto;

import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;
}
