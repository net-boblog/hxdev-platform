package cn.hxdev.core.exception;

public class BusinessException extends StackException {

    public BusinessException() {
    }

    public BusinessException(String message, Object... parameters) {
        super(message, parameters);
    }

    public BusinessException(String message) {
        super(message);
    }

    /**
     * throws a BusinessException if getExceptions() is not empty
     *
     * @throws BusinessException
     */
    @Override
    public void check() throws BusinessException {
        if (this.isNotEmpty()) {
            throw this;
        }
    }
}
