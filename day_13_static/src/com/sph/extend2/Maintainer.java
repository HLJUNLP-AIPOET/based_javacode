package com.sph.extend2;

public class Maintainer extends AdminStaff{
    private String maintainer;

    public Maintainer() {
    }

    public Maintainer(String name, int id, double salary, String staff, String maintainer) {
        super(name, id, salary, staff);
        this.maintainer = maintainer;
    }

    public String getMaintainer() {
        return maintainer;
    }

    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    @Override
    public String toString() {
        return "Maintainer{" +
                "maintainer='" + maintainer + '\'' + super.toString() +
                '}';
    }
}
