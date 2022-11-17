package service.impl;

import Student.student;
import mapper.studentmapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IStudentService;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private studentmapper studentDAO;

    @Override
    public student get(String id) {
        return studentDAO.selectById(id);
    }
}
