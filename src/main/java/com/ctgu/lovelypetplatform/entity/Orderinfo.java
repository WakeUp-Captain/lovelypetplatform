package com.ctgu.lovelypetplatform.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Orderinfo {
    private Integer orderid;
    private String buyer;
    private String date;
    private Integer goodNum;
    private String seller;
    private Integer state;
}
