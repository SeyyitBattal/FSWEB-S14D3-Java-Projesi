package com.workintech.PasificCarCompany;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean equals(Object obj) {
        return (((Mitsubishi) obj).getCylinders() == getCylinders() && ((Mitsubishi) obj).getName().equals(getName()));
    }


}
