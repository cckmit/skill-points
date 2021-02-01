package iilibxc.springbootexceptionvalid.exception;

import lombok.Data;


@Data
public class CustomException extends Exception{
      public CustomException(String msg){
        super(msg);
     }

}
