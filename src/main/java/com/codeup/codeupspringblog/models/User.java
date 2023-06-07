package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, length = 25)
    private String username;
    @Column(nullable = false, length = 25)
    private String password;
    @Column(nullable = false, length = 25)
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    List<Post> posts;
}
