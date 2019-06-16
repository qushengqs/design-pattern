public class Resume implements Cloneable {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {
        System.out.println(String.format("%s %s %s ", this.name, this.sex, this.age));
        System.out.println(String.format("工作经历：%s %s", this.timeArea, this.company));
    }

    public Object clone() throws CloneNotSupportedException{
        return (Resume) super.clone();
    }
}
