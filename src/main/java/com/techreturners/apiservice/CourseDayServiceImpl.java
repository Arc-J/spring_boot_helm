package com.techreturners.apiservice;

import org.springframework.stereotype.Service;

@Service
public class CourseDayServiceImpl implements CourseDayService {

    @Override
    public CourseDay getDay(int day) {

        String description = "You know its only five days? Plus one scheduled rest day.";
        
        switch(day) {
            case 1: {
                description = "DevOps - History and Background";
                break;
            }
            case 2: {
                description = "Provisioning";
                break;
            }
            case 3: {
                description = "Operating";
                break;
            }
            case 4: {
                description = "CI/CD";
                break;
            }
            case 5: {
                description = "Operability";
                break;
            }
            case 6: {
                description = "Saturday, have a day off!";
                break;
            }
        }
        return new CourseDay(description);
    }

}