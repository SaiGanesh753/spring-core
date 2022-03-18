package com.msg.dependencyInjection.exampleDemo2;

public class Friend1 {

    private int friendId;
    private MathCheat mathCheat;

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void cheatingFriend() {
        mathCheat.cheatingMethod();
        System.out.println("friend 1 having id : "+friendId);
    }
}
