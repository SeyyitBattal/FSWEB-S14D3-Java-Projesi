package com.workintech.PasificCarCompany;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean equals(Object obj) {
        return (((Ford)obj).getCylinders() == getCylinders() && ((Ford)obj).getName().equals(getName()));
    }

}
