package com.example.vlid.demo.vliddemo.exception;

import lombok.Data;

@Data
public class ParamException extends Exception{
      public ParamException(String msg){
        super(msg);
     }

}
