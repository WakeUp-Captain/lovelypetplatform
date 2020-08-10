package com.ctgu.lovelypetplatform.common;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RetResult<T> {
   public int code;
   private String msg;
   private T data;
}