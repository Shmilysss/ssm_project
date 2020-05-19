package person.wqying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import person.wqying.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: wanqiangying
 * Date: 2020/4/13 22:09
 * Content:
 */
@Controller
@RequestMapping("/student/")
public class StudentController {
    private  List<Student> students = new ArrayList<>();
    //请求映射，当用户发送下面请求时，将会调用list方法
    @RequestMapping(value = "list.do")
    public String list(Model model){
//        Student student = new Student();
//        student.setName("ali");
//        student.setPassword("123456");
        System.out.println("students=-=-=="+students.size());

        model.addAttribute("students",students);

//        转向listStudents.jsp
        return "listStudents";
    }

    @RequestMapping("toAdd.do")
    public String toAdd(Model model){
        String name = "zhangsan";
        model.addAttribute("name",name);
//        转向listStudents.jsp
        return "addStudents";
    }

    @RequestMapping("add.do")
    public String add(Student student){
        students.add(student);
        System.out.println(student.getName()+":"+student.getPassword());
        return "redirect:list.do";//重定向
    }
}
