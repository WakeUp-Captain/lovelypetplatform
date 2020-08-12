package com.ctgu.lovelypetplatform.common;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderinfoDetail {
    private Integer orderid;
    private String buyer;
    private String buyerNickname;
    private String buyerHeadIcon;

    private String seller;
    private String sellerNickname;
    private String sellerHeadIcon;

    private Integer goodNum;
    private String goodsCategory;
    private String goodsPic;
    private String goodsDescription;

    private String date;
    private Integer state;
}
