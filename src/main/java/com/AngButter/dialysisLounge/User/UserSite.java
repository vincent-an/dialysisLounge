package com.AngButter.dialysisLounge.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class UserSite {
    @Getter
    @Setter
    @Entity
    public class SiteUser {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String username;

        private String password;

        @Column(unique = true)
        private String email;
    }
}
