package com.bellfam.website.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Eugene Petrov
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String nickname;
}
