package player;

public class Player {
    String userName;
    String emailAddress;
    String reg_date;

    public Player() {
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.reg_date = reg_date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }
};
