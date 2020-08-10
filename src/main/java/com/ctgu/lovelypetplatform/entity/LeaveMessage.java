package com.ctgu.lovelypetplatform.entity;


import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LeaveMessage {
    private Integer messageid;
    private Integer goodNum;
    private String telenum;
    private String date;
    private String message;}