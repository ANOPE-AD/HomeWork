package util.enumerate;
import java.io.*;
public enum Cenum {
    PublicSelectiveCourse("公共课"),ProfessionalCompulsoryCourse("专业必修课"),ProfessionalElectiveCourse("专业选修课");
    private String target_file;
    private String type;

    private Cenum(String type){
        this.type = type;
    }
}
