package com.Lookup.UserMicroservice.User;

import com.Lookup.UserMicroservice.User.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, ObjectId> {
}
