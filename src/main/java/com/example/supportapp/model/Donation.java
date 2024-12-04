package com.example.supportapp.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Donation {
    private Double amount;
    private LocalDateTime dateCreated;
    private String addedBy; // Name of the person who added the donation
}