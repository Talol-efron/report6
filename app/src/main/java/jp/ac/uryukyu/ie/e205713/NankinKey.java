package jp.ac.uryukyu.ie.e205713;

import java.util.Scanner;

public class NankinKey extends Key {
    public NankinKey(String name) {
        super(name);
        // TODO Auto-generated constructor stub
    }

    //private String name;

    @Override
    public void object(){
        System.out.println("南京錠を使用した！");
        // 南京錠のパスワードは2057にする
        int password = 2057;
        System.out.println("キーボードから4桁の数字を入力してください");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("入力された文字は「" + num + "」です");

        do {
            if (num == password) {
                System.out.println("成功！");
                waitMoment(1000);
                System.out.println("おめでとう！君は謎の部屋から脱出することに成功した！！");
                waitMoment(1000);
                System.out.println("Game Clear!!");
                break;

            } else {
                System.out.println("暗証番号が異なります");
                waitMoment(1000);
                System.out.println("Game Over....");
                break;
            }
        } while (num != password);

        // scanをクローズしないとエラーが出る
        scan.close();
    }
}
   