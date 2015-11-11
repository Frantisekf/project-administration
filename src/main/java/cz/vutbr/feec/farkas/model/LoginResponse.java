package cz.vutbr.feec.farkas.model;

/**
 * Created by frant on 11/11/15.
 */
public class LoginResponse {


    private boolean success;

    public LoginResponse(boolean success) {

        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
