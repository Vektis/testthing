package com.company;

/**
 * Created by vr834 on 11/10/16.
 */
public class Code {
    private String myCode;
    public String newCode;
    public Code(String c){
        myCode = c;
    }
    public String getCode(){
        return myCode;
    }
    public void hide(int p1,int p2){

        int pos2 = p2 - 1;
        char [] ar = myCode.toCharArray();
        char [] aX = {'X','X','X','X','X','X','X','X','X','X'};
        System.arraycopy(aX,0,ar,p1,pos2 - p1);
        newCode = String.valueOf(ar);

    }
    public void Recover(){
        newCode = myCode;
    }
}
