package com.ctgu.lovelypetplatform.entity;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Star {
    private Integer starid;
    private Integer goodNum;
    private String telenum;
    private Pets pet;
}