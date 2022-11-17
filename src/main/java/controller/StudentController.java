//package controller;
//
//import Student.student;
//import config.ResultMsg;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import service.IStudentService;
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@RestController
//@RequestMapping("C:\\Users\\admin\\IdeaProjects\\Springbootframe\\src\\main\\java\\Student\\student.java")
//public class StudentController {
//    @Autowired
//    private IStudentService studentService;
//    @Autowired
//    private ResultMsg res;
//    @GetMapping("/{id}")
//    public student get(@PathVariable String id){
//   try {
//       return (student) res.getData(studentService.get(id));
//   }catch (Exception e){
//       System.out.println(e);
//   }
//
//
//        return null;
//    }
//}
