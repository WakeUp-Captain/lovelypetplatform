package com.ctgu.lovelypetplatform.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pets {
    private Integer goodNum;
    private String description;
    private Double price;
    private String summaryClassifyname;
    private String detailClassifyname;
    private String pic1;
    private String pic2;
    private String pic3;
    private Integer state;
    private String owner;
    private Integer star_count;
    private String pur_comment;
}
