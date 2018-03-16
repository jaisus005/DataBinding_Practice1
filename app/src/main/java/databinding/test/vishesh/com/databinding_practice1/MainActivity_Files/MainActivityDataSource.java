package databinding.test.vishesh.com.databinding_practice1.MainActivity_Files;

/**
 * Created by JaiSuS on 3/15/2018.
 */

public class MainActivityDataSource {

    private String emailTextView="EMAIL";
    private String passwordTextView="PASSWORD";
    private String emailHintEditText="Enter Email";
    private String passwordHintEditext="Enter Password";
    private String submitButtonText="Log In";
    private String moveToSecond="MOVE TO SECOND";

    public String getMoveToSecond() {
        return moveToSecond;
    }

    public void setMoveToSecond(String moveToSecond) {
        this.moveToSecond = moveToSecond;
    }

    public String getEmailTextView() {
        return emailTextView;
    }

    public void setEmailTextView(String emailTextView) {
        this.emailTextView = emailTextView;
    }

    public String getPasswordTextView() {
        return passwordTextView;
    }

    public void setPasswordTextView(String passwordTextView) {
        this.passwordTextView = passwordTextView;
    }

    public String getEmailHintEditText() {
        return emailHintEditText;
    }

    public void setEmailHintEditText(String emailHintEditText) {
        this.emailHintEditText = emailHintEditText;
    }

    public String getPasswordHintEditext() {
        return passwordHintEditext;
    }

    public void setPasswordHintEditext(String passwordHintEditext) {
        this.passwordHintEditext = passwordHintEditext;
    }

    public String getSubmitButtonText() {
        return submitButtonText;
    }

    public void setSubmitButtonText(String submitButtonText) {
        this.submitButtonText = submitButtonText;
    }
}
