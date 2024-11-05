package com.Lookup.UserMicroservice.User.DTO;

import com.Lookup.UserMicroservice.User.Entity.ClickHistory;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Builder
public class UserCompleteDTO {
    @JsonProperty("id")
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
