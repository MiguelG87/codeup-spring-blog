package com.codeup.codeupspringblog.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Create a constructor that accepts all fields
@AllArgsConstructor
//Create an empty constructor
@NoArgsConstructor
//Create all getter methods for each field
@Getter
//Create all setter methods for each field
@Setter
public class Post {
    private String title;
    private String body;
}
