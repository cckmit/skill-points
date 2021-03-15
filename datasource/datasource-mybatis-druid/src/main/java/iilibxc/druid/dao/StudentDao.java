package iilibxc.druid.dao;

import iilibxc.druid.bean.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentDao {

    /**
     * 查询所有的学生信息
     * @return
     */
    List<Student> selectStudentList();

    @Select("SELECT * FROM student")
    List<Student> selectStudentListByAnnotation();

}
