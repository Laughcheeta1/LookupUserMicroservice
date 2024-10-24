package com.Lookup.UserMicroservice.User.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.Date;

@Getter
public class UserRegisterRequestDTO {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("number")
    private String number;

    @JsonProperty("date_of_birth")
    private Date dateOfBirth;

    @JsonProperty("location")
    private String location;
}
