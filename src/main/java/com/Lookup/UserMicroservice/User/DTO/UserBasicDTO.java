package com.Lookup.UserMicroservice.User.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public class UserBasicDTO {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;
}
