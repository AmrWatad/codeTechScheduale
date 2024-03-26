package org.institute.Entity.customEntity;

import lombok.Data;
import org.institute.Entity.classf;
import org.institute.Entity.courseDetails;
import org.institute.Entity.subjectName;

import java.util.List;

@Data
public class courseAndStudentNumber {
    private Long id;
    private String name;
    private String materials;
    private double cost;
    private boolean isMonthlyPay;
    private int studentNumber;

    public courseAndStudentNumber(Long id, String name, String materials, double cost, boolean isMonthlyPay, int studentNumber) {
        this.id = id;
        this.name = name;
        this.materials = materials;
        this.cost = cost;
        this.isMonthlyPay = isMonthlyPay;
        this.studentNumber = studentNumber;
    }
}
