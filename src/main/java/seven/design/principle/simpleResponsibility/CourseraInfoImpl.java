package seven.design.principle.simpleResponsibility;

public class CourseraInfoImpl implements ICourseInfo {


    public String getCousreName() {
        return null;
    }

    public byte[] getCourseVideo() {
        return new byte[0];
    }

    /**
     * 这里承担了多项职责，既修改name，又修改address
     *
     * @param name
     * @param address
     */
    private void modifyCourseInfo(String name, String address) {
        name = "xq";
        address = "cs";
    }


    private void modifyCourseName(String name) {
        name = "xq";
    }

    private void modifyCourseAddrss(String address) {
        address = "sz";
    }

}
