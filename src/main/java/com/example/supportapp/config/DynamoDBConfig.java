package com.example.supportapp.config;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableDynamoDBRepositories(basePackages = "com.example.supportapp.repository")
public class DynamoDBConfig {
    public static final String SERVICE_ENDPOINT = "https://dynamodb.eu-west-1.amazonaws.com";
    public static final String REGION = "eu-west-1";

    @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(
                        new AwsClientBuilder.EndpointConfiguration(SERVICE_ENDPOINT, REGION)
                )
                .withCredentials(new DefaultAWSCredentialsProviderChain())
                .build();
    }
}