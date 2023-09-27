package com.workintech.PasificCarCompany;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean equals(Object obj) {
        return (((Holden)obj).getCylinders() == getCylinders() && ((Holden)obj).getName().equals(getName()));
    }

}
