package util.enumerate;
import java.io.*;
public enum Cenum implements Serializable { //实现了Serializable接口，可以序列化
    PublicSelectiveCourse("公共课"),ProfessionalCompulsoryCourse("专业必修课"),ProfessionalElectiveCourse("专业选修课");
    private final String data_base_dir = "/data_base/cenum/";   //Cenum对象数据文件目录
    private String target_file; // Cenum具体文件名字
    private String type;

    private Cenum(String type){
        this.type = type;
    }
    public String getData_base_dir() {
        return data_base_dir;
    }
    public String getTarget_file() {
        return target_file;
    }
    public void setTarget_file(String target_file) {
        this.target_file = target_file;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
