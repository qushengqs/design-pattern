public class PrototypeDeepTest {
    public static void test() {
        try {
            System.out.println("原型模式--深拷贝");
            ResumeDeep resumeDeep = new ResumeDeep("大鸟");
            resumeDeep.setPersonInfo("男", "29");
            resumeDeep.setWorkExperience("1998-2000", "XX公司");

            ResumeDeep resumeDeepB = (ResumeDeep) resumeDeep.clone();
            resumeDeepB.setWorkExperience("1998-2006", "YY企业");

            ResumeDeep resumeDeepC = (ResumeDeep) resumeDeep.clone();
            resumeDeepC.setPersonInfo("男", "24");
            resumeDeepC.setWorkExperience("1998-2003", "ZZ企业");

            resumeDeep.display();
            resumeDeepB.display();
            ;
            resumeDeepC.display();
        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }
    }
}
