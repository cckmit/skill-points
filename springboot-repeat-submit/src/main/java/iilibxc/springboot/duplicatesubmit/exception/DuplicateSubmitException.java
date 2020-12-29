package iilibxc.springboot.duplicatesubmit.exception;

/**
 * 自定义异常
 */
public class DuplicateSubmitException extends Exception {

    public DuplicateSubmitException(String msg){
        super(msg);
    }
}
