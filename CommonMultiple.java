package jp.learningdesign.javastudy;

import com.sun.source.tree.WhileLoopTree;

public class CommonMultiple {
    public static void main(String[] args) {
        int i = 1;
        while(i < 100){
            if ((i % 2 == 0) && (i % 3 == 0)){
                System.out.println(i);
            }
            i++;
        }
    }
}
