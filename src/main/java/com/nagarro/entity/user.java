package com.nagarro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {

  @Id
  @Column(name="email")
  private String email;
  public user() {
}

@Column(name="name")
  private String name;
  @Column(name="age")
  private String age;

  public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
