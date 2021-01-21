//import java.util.ArrayList;
import jp.ac.uryukyu.ie.e205713.*;

public class Main {
    //private static ArrayList<Bag> baggages;

    public static void main(String[] args) {
        var Taro = new Player("taro");

        var kagi = new Key("秘密の鍵");
        //kagi.object();
        Taro.addBaggage(kagi);

        var nankin = new NankinKey("南京錠");
        //nankin.object();
        //これはどこに保存されているのか？？
        Taro.addBaggage(nankin);

        // baggages の中身を表示したい
        //Taro.showBaggage();

        Taro.getName();

    }
}
