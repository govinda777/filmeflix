package com.filmeFlix.Domain.Entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class MovieInfo {
    @Id
    public String id;

    public String name;
    public Date launched;
    public Integer score;
}
