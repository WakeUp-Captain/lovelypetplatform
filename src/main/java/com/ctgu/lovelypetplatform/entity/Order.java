package com.ctgu.lovelypetplatform.entity;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer orderid;
    private String buyer;
    private Integer goodNum;
    private String seller;
    private Integer state;
    private String date;
    private Pets pet;


}
