package com.ordersystem.app.dto;
import lombok.Data;

@Data
public class Searchreq{
    String column;
    String value;
    Operations operation;
    String joinTable;

    public enum Operations{
        EQUAL, LIKE, IN, GREATER_THAN, LESS_THAN, BETWEEN, JOIN, STARTS, ENDS;
    }

}