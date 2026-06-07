package kr.ac.hansung.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalModelAdvice {

    @Value("${app.student.number}")
    private String studentNumber;

    @Value("${app.student.name}")
    private String studentName;

    @ModelAttribute("studentNumber")
    public String studentNumber() {
        return studentNumber;
    }

    @ModelAttribute("studentName")
    public String studentName() {
        return studentName;
    }
}
