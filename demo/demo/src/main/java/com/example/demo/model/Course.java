package com.example.demo.model;

import java.time.LocalDate;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Course {
    private int id;
    private String lectureName;
    private String place;
    private LocalDate startDate;
}
