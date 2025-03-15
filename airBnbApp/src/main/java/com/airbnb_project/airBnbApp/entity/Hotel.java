package com.airbnb_project.airBnbApp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "hotel")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false , columnDefinition = "TEXT") //by default nullable true
    private String name;
    private String city;

    @Column(columnDefinition = "TEXT[]")
    private String[] photos;

    @Column(columnDefinition = "TEXT[]")
    private String[] amenities;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Embedded
    private HotelContactInfo contactInfo;

    @Column(nullable = false)
    private Boolean active;


}
/*
* PostgresSQL can store arrays but jpa cannot configure it accordingly
* hence we use @Column(columnDefinition = "TEXT[]")
* this text array holds the url of the images and not the images itself
*
* In Spring Boot with JPA (Hibernate), the annotations @CreationTimestamp and @UpdateTimestamp are used to automatically track the creation and
* last update times of an entity. These annotations eliminate the need to manually set timestamps when inserting or updating a record.


 *
* */