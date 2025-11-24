package com.sph.test;

public class Phone {
    private String phone;
    private int price;

    public Phone() {
    }

    public Phone(String phone, int price) {
        this.phone = phone;
        this.price = price;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Phone{phone = " + phone + ", price = " + price + "}";
    }
}
