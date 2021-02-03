package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到猜数字游戏，数字范围为1-100！");
        int data = (int)(Math.random()*100)+1;
        System.out.println("请输入你猜测的数字：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        while (num != data){
            if(data>num){
                System.out.println("猜小了哦。请重新输入：");
                num = sc.nextInt();
            }else {
                System.out.println("猜大了哦。请重新输入：");
                num = sc.nextInt();
            }
            count++;
        }
        System.out.println("恭喜你，猜对了！！！正确答案是："+data+"。共猜了"+count+"次");
        display();
    }

    public static void display(){
        System.out.println("This is a new display method.");
    }

}
