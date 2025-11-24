package com.sph.extend2;

public class Buyer extends AdminStaff{
    private String buyer;

    public Buyer() {
    }

    public Buyer(String name, int id, double salary, String staff, String buyer) {
        super(name, id, salary, staff);
        this.buyer = buyer;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "buyer='" + buyer + '\'' + super.toString() +
                '}';
    }
}
