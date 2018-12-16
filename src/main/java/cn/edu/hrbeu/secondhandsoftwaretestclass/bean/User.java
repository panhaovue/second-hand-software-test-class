package cn.edu.hrbeu.secondhandsoftwaretestclass.bean;

public class User {
    private String userName;
    private Integer userId;
    private Integer userStudentId;
    private String userPassword;
    private String userPhoneNumber;
    private Integer userPower;


    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserStudentId() {
        return userStudentId;
    }

    public void setUserStudentId(Integer userStudentId) {
        this.userStudentId = userStudentId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getUserPower() {
        return userPower;
    }

    public void setUserPower(Integer userPower) {
        this.userPower = userPower;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
