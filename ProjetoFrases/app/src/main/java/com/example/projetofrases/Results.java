package com.example.projetofrases;

import com.google.gson.annotations.SerializedName;

public class Results {


    @SerializedName("slip")
    private Slip slip;

    public Results(Slip slip) {
        this.slip = slip;
    }

    public String getAdvice() {
        return slip.getAdvice();
    }

}