package Item.member;
public abstract class Profile { //档案类作为学生和老师的基类
    private String Name;    //姓名
    private double ID;  //学号或工号
    private Schedule schedule;  //课程表
    private String type;    //学生或老师，在子类中定义
    private String sex; //性别
    private String department; //学院或部门
    private String major; //专业

    public Profile(String name, double ID, Schedule schedule, String type, String sex, String department, String major) {
        Name = name;
        this.ID = ID;
        this.schedule = schedule;
        this.type = type;
        this.sex = sex;
        this.department = department;
        this.major = major;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
