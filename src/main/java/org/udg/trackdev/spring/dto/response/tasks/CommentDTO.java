package org.udg.trackdev.spring.dto.response.tasks;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.udg.trackdev.spring.dto.response.users.UserDTO;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private String content;

    private String date;

    private UserDTO author;

}
