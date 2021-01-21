package jp.ac.uryukyu.ie.e205713;

public class Key implements Tool, Bag {
    private String name;

    public Key(String name) {
        this.name = name;
        //インスタンス生成時に実行される
        //System.out.println(name);
    }

    String getName() {
        return name;
    }
    public void object(){
        System.out.println("鍵を使用した！！");
        waitMoment(1000);
        System.out.println("南京錠を開けるpasswordの");
        waitMoment(1000);
        System.out.println("ヒントは、、、");
        waitMoment(1000);
        System.out.println("2020年度知能情報　学生番号の上4桁だ。。。");
        waitMoment(1000);
    }

    // 少し待つ
    public void waitMoment(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void add(Bag baggages) {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "name = " + this.getName();
    }
}