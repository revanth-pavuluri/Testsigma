package com.exam.app.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Response {
    private Integer id;
    private String response;
}
