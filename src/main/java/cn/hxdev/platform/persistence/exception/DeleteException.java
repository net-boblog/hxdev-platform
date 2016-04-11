package cn.hxdev.platform.persistence.exception;

/**
 * Created by myhtls on 16/4/11.
 */
public class DeleteException extends Exception {

    public DeleteException() {
    }

    public DeleteException(Throwable cause) {
        super(cause);
    }

    public DeleteException(String message) {
        super(message);
    }
}
