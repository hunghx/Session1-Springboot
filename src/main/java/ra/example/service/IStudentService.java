package ra.example.service;

import ra.example.entity.Student;
import ra.example.request.StudentRequest;

import java.util.List;

public interface IStudentService {
    List<Student> findALl();
    List<Student> findALlByName(String keyword);
    StudentRequest findById(Integer id);
    void save(StudentRequest request);
    void  deleteById(Integer id);

}
