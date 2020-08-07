package com.ctgu.lovelypetplatform.entity;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private Integer goodNum;

    private String description;

    private String price;

    private String summaryClassifyname;

    private String detailClassifyname;

    private String pic1;

    private String pic2;

    private String pic3;

    private Integer state;

    private String owner;
    private Integer starCount;
    private String purComment;
}
