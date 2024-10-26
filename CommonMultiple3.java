package jp.learningdesign.javastudy;

public class CommonMultiple3 {
    public static void main(String[] args) {
        //2又は３の倍数
        int i = 1;
        while(i < 20){
            if (!((i % 2 == 0) && (i % 3 == 0))){
                System.out.println(i);
            }
            i++;
        }
    }
}
