package ra.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.example.entity.Student;
import ra.example.service.IStudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiController {
    private final IStudentService studentService;
    @GetMapping("/helo")
    public List<Student> hello(){
        return studentService.findALl(); // chuỗi
    }
}
