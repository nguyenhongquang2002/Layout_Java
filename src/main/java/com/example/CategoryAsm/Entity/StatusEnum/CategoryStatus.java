package com.example.CategoryAsm.Entity.StatusEnum;

import com.example.CategoryAsm.Entity.base.BaseEntity;

public enum CategoryStatus {
    ACTIVE(1),
    DEACTIVE(0),
    DELETED(-1),
    UNDEFINE(2);

    private int value;

    CategoryStatus(int value){this.value = value;}

    public int getValue() {
        return value;
    }

    public static CategoryStatus of (int value){
        for (CategoryStatus categoryStatus : CategoryStatus.values()){
            if(categoryStatus.getValue() == value){
                return categoryStatus;
            }
        }
        return CategoryStatus.UNDEFINE;
    }
}
