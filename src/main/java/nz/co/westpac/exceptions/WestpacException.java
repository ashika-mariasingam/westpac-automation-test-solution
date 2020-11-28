package nz.co.westpac.exceptions;

/**
 * Class for handling checked exceptions.
 * Author: Ashika Mariasingam
 */
public class WestpacException {

    private String errorCode;

    private String errorMessage;

    public WestpacException(String errorCode, String errorMessage) {
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
