public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间：%d点 加班哦，疲惫之极", work.getHour()));
            } else {
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
