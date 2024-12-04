package com.example.supportapp.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;

import java.util.List;

@Data
@DynamoDBTable(tableName = "Person")
public class Person {

    @Id
    @DynamoDBHashKey(attributeName = "user_id")
    private String id;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "supportNeeded")
    private String supportNeeded;

    @DynamoDBAttribute(attributeName = "donations")
    private List<Donation> donations;

    @DynamoDBAttribute(attributeName = "isInEgypt")
    private Boolean isInEgypt;

    @Transient
    private String createdAt; // Optional, for frontend use
}
