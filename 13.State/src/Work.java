public class Work {
    private State state;
    private Integer hour;
    private Boolean finish;

    public Work() {
        state = new ForenoonState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Boolean getFinish() {
        return finish;
    }

    public void setFinish(Boolean finish) {
        this.finish = finish;
    }

    public void writeProgram() {
        this.state.writeProgram(this);
    }

}
