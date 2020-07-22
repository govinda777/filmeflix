package com.filmeFlix.Api.Payloads.Requests;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {

    @Size(min = 3, max = 20)
    private String username;

    @Size(max = 50)
    private String email;
    
    private Set<String> roles;

    @Size(min = 6, max = 40)
    private String password;
  
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRoles() {
      return this.roles;
    }
    
    public void setRole(Set<String> roles) {
      this.roles = roles;
    }
}
