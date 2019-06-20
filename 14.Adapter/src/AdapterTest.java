public class AdapterTest {
    public static void test() {
        System.out.println("适配器模式");

        Player player = new Forwards("巴蒂尔");
        player.attack();

        Player ym = new Translator("姚明");
        ym.attack();
        ym.defense();
    }
}
