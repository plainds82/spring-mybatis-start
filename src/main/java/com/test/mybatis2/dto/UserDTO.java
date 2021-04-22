package com.test.mybatis2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {
    private Long id;
    private String title;
    private String description;
    private LocalDateTime created;
    private String author;
    private String profile;
}
