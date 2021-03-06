package io.quarkus.security.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@UserDefinition
@Table(name = "test_user")
@Entity
public class BCryptUserEntity {
    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "username")
    @Username
    public String name;

    @Column(name = "password")
    @Password
    public String pass;

    @Roles
    public String role;
}
