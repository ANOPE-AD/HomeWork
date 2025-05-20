# 教师学生系统文档

## 项目概述
实现两种不同身份的用户进行选课、查看课程信息、查看个人信息、修改个人信息、查看班级信息、修改班级信息、查看课程表、修改课程表等功能。

## 目录结构

### 根目录
- `app.java` - [主程序入口]
- `README.md` - 项目说明文件

### data_base/ 数据库目录
存储系统各类对象的序列化数据，如学生对象，教师对象目录结构

#### data_base/class_information/
[学生及教师班级对象的序列化仓库]

#### data_base/cenum_information/
[课程枚举类对象序列化仓库]

#### data_base/student_information/
[学生档案对象序列化仓库]

#### data_base/teacher_information/
[教师档案对象序列化仓库]

### Item/ 核心实体类
系统核心业务对象定义

#### Item/User.java
[用户基类功能描述]

#### Item/member/ 成员类
- `ClassRoom.java` - [班级实体功能描述]
- `Course.java` - [仅仅封装Cenum枚举类，相同的Course对象引用同一个枚举对象]
- `Profile.java` - [作为Student和Teacher的基类，包含展示课表，编辑课表。之后创建学生与老师档案统一声明为Profile]
- `Schedule.java` - [课程表类返回一个Profile类对象的课程表]
- `Student.java` - [学生实体具体实现学生Profile功能]
- `Teacher.java` - [教师实体具体实现教师Profile功能]

### util/ 工具类
系统工具和辅助功能

#### util/enumerate/
- `Cenum.java` - [自定义课程，可以将相同的课程信息只存储于一个枚举类中]

#### util/GUI/
- `MainWindow.java` - [主窗口GUI功能描述（还不确定要不要搞）]

#### util/Manager/ 管理器
- `Editor.java` - [编辑器基类功能]
- `Reader.java` - [读取器基类功能]
- `ClassRoomEditor.java` - [班级编辑器功能]
- `ClassRoomReader.java` - [班级读取器功能]
- `CourseEditor.java` - [课程编辑器功能]
- `ProfileEditor.java` - [资料编辑器功能]
- `ProfileReader.java` - [资料读取器功能]
- `ScheduleEditor.java` - [课表编辑器功能]
- `ScheduleReader.java` - [课表读取器功能]

