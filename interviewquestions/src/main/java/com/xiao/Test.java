package com.xiao;

public class Test {

    public static void main(String[] args) {
        System.out.println(fun(56));
    }

    public static char fun(int score){
        return score>=80?'A':
                    score<79 && score>=60 ? 'B':
                            'C';
    }

}
