package jp.ac.uryukyu.ie.e205713;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static ArrayList<Bag> baggages = new ArrayList<>(); // 所持品リスト

    // 所持品を追加する
    // baggagesがnullになる。このメソッドが問題か？
    public void addBaggage(Key thing) {
        Player.baggages.add(thing);

        System.out.println("現在のバックの中身は" + toString() + "である。");
    }

    /*public void showBaggage(){
        //null発生
        //System.out.println(baggages.get(0).name());

        //バイトコード発生     [jp.ac.uryukyu.ie.e205713.NankinKey@3cd1a2f1]
        //System.out.println(baggages.get(1));

        // バイトコード発生　　　[jp.ac.uryukyu.ie.e205713.Key@4d7e1886,jp.ac.uryukyu.ie.e205713.NankinKey@3cd1a2f1]
        //System.out.println(baggages);
    }*/
    


    /*public void select(ArrayList<Bag> baggages) {
        System.out.println("コマンド？");
        System.out.println(baggages);
        int index = 0;
        for (var bags: baggages) { // 選択可能なアクションを提示
            System.out.println(index + ":" + bags.name());
            index += 1;
        }

        // 標準入力から数値を入力するコード
        Scanner scanner = new Scanner(System.in);
        int command_number = scanner.nextInt(); //command_numberをなんとかして使う必要がある。
        System.out.println("入力された数字は" + command_number + "です");
    }*/
}
