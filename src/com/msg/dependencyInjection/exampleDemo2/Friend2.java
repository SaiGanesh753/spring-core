package com.msg.dependencyInjection.exampleDemo2;

public class Friend2 {

    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheatingFriend() {
        mathCheat.cheatingMethod();;
    }
}
