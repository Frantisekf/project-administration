package cz.vutbr.feec.farkas.exceptions;

/**
 * Created by frant on 11/11/15.
 */
public class GeneralException extends RuntimeException {

    private int errorCode;

    private String errorMessage;

    public GeneralException(int errorCode, String errorMessage) {

        errorCode = this.errorCode;
        errorMessage = this.errorMessage;

    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
