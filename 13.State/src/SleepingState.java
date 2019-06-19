public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(String.format("当前时间：%d点不行了，睡着了", work.getHour()));
    }
}
