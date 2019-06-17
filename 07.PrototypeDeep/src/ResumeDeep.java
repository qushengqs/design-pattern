public class ResumeDeep implements Cloneable {

    private String name;
    private String age;
    private String sex;
    private WorkExperience workExperience;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ResumeDeep(String name) {
        this.name = name;
        this.workExperience = new WorkExperience();
    }

    private ResumeDeep(WorkExperience workExperience) throws CloneNotSupportedException {
        this.workExperience = (WorkExperience) workExperience.clone();
    }

    public void setPersonInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        this.workExperience.setWorkDate(workDate);
        this.workExperience.setCompany(company);
    }

    public void display() {
        System.out.println(String.format("%s %s %s", this.name, this.sex, this.age));
        System.out.println(String.format("工作经历：%s %s", this.workExperience.getWorkDate(), this.workExperience.getCompany()));
    }

    public Object clone() throws CloneNotSupportedException {
        ResumeDeep resumeDeep = new ResumeDeep(this.workExperience);
        resumeDeep.setName(this.name);
        resumeDeep.setAge(this.age);
        resumeDeep.setSex(this.sex);

        return resumeDeep;
    }
}
