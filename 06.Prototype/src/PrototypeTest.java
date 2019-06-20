public class PrototypeTest {
    public static void test() {
        try {
            System.out.println("原型模式");
            Resume resume = new Resume("大鸟");
            resume.setPersonalInfo("男", "29");
            resume.setWorkExperience("1998-2000", "XX公司");

            Resume resumeB = (Resume) resume.clone();
            resumeB.setWorkExperience("1998-2006", "YY企业");

            Resume resumeC = (Resume) resume.clone();
            resumeC.setPersonalInfo("男", "24");

            resume.display();
            resumeB.display();
            resumeC.display();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }
}
