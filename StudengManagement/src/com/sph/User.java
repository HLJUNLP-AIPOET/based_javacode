package com.sph;

public class User {
    private String name;
    private String password;
    private String identifier;
    private String PhoneNumber;

    public User() {
    }

    public User(String name, String password, String identifier, String PhoneNumber) {
        this.name = name;
        this.password = password;
        this.identifier = identifier;
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置
     * @param identifier
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * 获取
     * @return PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * 设置
     * @param PhoneNumber
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", identifier = " + identifier + ", PhoneNumber = " + PhoneNumber + "}";
    }
}
