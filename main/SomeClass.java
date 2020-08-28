package main;

import ca.DefaultValue;

public class SomeClass {

	@DefaultValue(100)
    private int xyz;

    public int getXyz() {
        return xyz;
    }

    public void setXyz(int xyz) {
        this.xyz = xyz;
    }
}
