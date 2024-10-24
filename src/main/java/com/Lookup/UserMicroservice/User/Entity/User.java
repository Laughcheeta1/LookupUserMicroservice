package com.Lookup.UserMicroservice.User.Entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;
import java.util.List;

@Document(collection = "User")
@Data
@Builder
public class User {
    @Field("_id")
    private ObjectId id;
    @Field("name")
    private String name;
    @Field("email")
    private String email;
    @Field("number")
    private String number;
    @Field("date_of_birth")
    private Date dateOfBirth;
    @Field("location")
    private String location;
    @Field("click_history")
    private List<ClickHistory> clickHistory;
    @Field("check_store_history")
    private List<String> checkStoreHistory;
}
