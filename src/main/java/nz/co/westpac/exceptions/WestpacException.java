package nz.co.westpac.exceptions;

/**
 * Class for handling exceptions.
 * Author: Ashika Mariasingam
 */
public class WestpacException extends Exception{

    private String errorCode;

    private String errorMessage;

    public WestpacException(final String errorCode, final String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
