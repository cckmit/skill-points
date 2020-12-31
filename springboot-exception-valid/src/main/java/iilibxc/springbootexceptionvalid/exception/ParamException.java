package iilibxc.springbootexceptionvalid.exception;

import lombok.Data;

@Data
public class ParamException extends Exception{
      public ParamException(String msg){
        super(msg);
     }

}
