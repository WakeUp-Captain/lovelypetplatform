package com.ctgu.lovelypetplatform.entity;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String telenum;
    private String password;
    private String nickname;
    private String headicon;
    private String sex;
    private String birthday;
    private String balance;
    private String address;
}
