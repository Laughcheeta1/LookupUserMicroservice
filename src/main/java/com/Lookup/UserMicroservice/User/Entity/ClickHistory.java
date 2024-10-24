package com.Lookup.UserMicroservice.User.Entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Field;

@Embeddable
@Data
@EqualsAndHashCode
public class ClickHistory {
    @Field("total_time_spent")
    private int totalTimeSpent;
    @Field("item")
    private String item;
    @Field("number_of_times_clicked")
    private int numberOfTimesClicked;
}
