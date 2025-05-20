package Item.member;

import util.enumerate.Cenum;

import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class Course {

    private final String id;   //课程id
    private Cenum type;  //课程类型
    private String name;    //课程名称
    private Integer capacity;    //课程容量
    private Date beginTime; //课程开始时间
    private Date endTime;   //课程结束时间

    public Course(Cenum type, String name, Integer capacity, Date beginTime, Date endTime) {
        this.id = createId();
        this.type = type;
        this.name = name;
        this.capacity = capacity;
        this.beginTime = beginTime;
        this.endTime = endTime;
    }

    public Cenum getType() {
        return type;
    }

    public void setType(Cenum type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 基于UUID和随机字符生成唯一课程id
     * @return
     */
    private String createId(){
        String fullUuid = UUID.randomUUID().toString();
//        System.out.println(fullUuid);
        String[] parts = fullUuid.split("-");
        return parts[1] + getRandomLowerLetter() + parts[2];
    }

    /**
     * 生成随机小写字母
     * @return
     */
    private char getRandomLowerLetter(){
        Random r = new Random();
        int bound = 26;
        return (char) (97 + r.nextInt(bound));
    }
}
