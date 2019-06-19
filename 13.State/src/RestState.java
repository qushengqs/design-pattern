public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%d点下班回家", work.getHour()));
    }
}
