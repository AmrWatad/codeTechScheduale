package org.example;

import org.example.entites.Guest;
import org.example.entites.RelevantTime;
import org.example.entites.Teacher;
import org.example.entites.TimesOfWeek;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
@SpringBootApplication

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ///// mjadlyy

    }
    public  static void maiiin(){
        Teacher teacher = new Teacher("Amr");
        Guest guest1=new Guest("g1",052l);
        Guest guest2=new Guest("g2",053l);
        Guest guest3=new Guest("g3",054l);
        Guest guest4=new Guest("g4",055l);
        Guest guest5=new Guest("g5",056l);
        List<Guest> students=new ArrayList<>(Arrays.asList(guest1,guest2,guest3,guest4,guest5));
        initTimes(teacher,guest1,guest2,guest3,guest4,guest5);
        List<RelevantTime>  timesOfWeeks= checkRelevantTimes(teacher,students);
        timesOfWeeks.forEach(System.out::println);
        testing(students);
    }
    public static void testing(List<Guest> students){

        for (int i = 0; i < students.size(); i++) {
            students.get(i).getAvailableDates();
        }



    }
    private static List<RelevantTime>  checkRelevantTimes(Teacher teacher, List<Guest> students) {
        List<TimesOfWeek> times=new ArrayList<>();
        Map <TimesOfWeek,Integer> dates=new HashMap<>();
         List<RelevantTime> dates1=new ArrayList();
        students.forEach(std->std.getAvailableDates().forEach(date->{
            dates.compute(date, (key, value) -> (value == null) ? 1 : value + 1);
        }));
        AtomicInteger max= new AtomicInteger();
        dates.forEach((k,v)->{
                    max.set(Math.max(max.get(), v));
                }
              );
        dates.forEach((k, v) -> {
                    if(v==max.get()){
                        dates1.add(new RelevantTime(k, ((double)v)/students.size()));
                        times.add(k);
                    }
                }
        );



        return dates1;
    }

    private static void initTimes(Teacher teacher, Guest guest1, Guest guest2, Guest guest3, Guest guest4, Guest guest5) {
        teacher.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 15),
                        new TimesOfWeek(1, 15.30),
                        new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 17.30),
                        new TimesOfWeek(2, 15.30),
                        new TimesOfWeek(2, 19),
                        new TimesOfWeek(3, 17.30),
                        new TimesOfWeek(4, 19),
                        new TimesOfWeek(5, 19)
                )
        );
        guest1.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 15),
                        new TimesOfWeek(1, 18.30),
                       // new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 17.30),
                        new TimesOfWeek(2, 15.30),
                        new TimesOfWeek(2, 19),
                        new TimesOfWeek(3, 18.30),
                     //   new TimesOfWeek(4, 19),
                        new TimesOfWeek(5, 20)
                )
        );
        guest2.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 14),
                        new TimesOfWeek(1, 15.30),
                        new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 16.30),
                        new TimesOfWeek(2, 19.30),
                        new TimesOfWeek(2, 19),
                        new TimesOfWeek(3, 17.30),
                        new TimesOfWeek(4, 19),
                        new TimesOfWeek(6, 19)
                )
        );
        guest3.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 21),
                        new TimesOfWeek(1, 15.30),
                        new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 11.30),
                        new TimesOfWeek(2, 15.30),
                        new TimesOfWeek(2, 19),
                        new TimesOfWeek(3, 17.30),
                        new TimesOfWeek(4, 19),
                        new TimesOfWeek(5, 15)
                )
        );
        guest4.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 15),
                        new TimesOfWeek(1, 15.30),
                        new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 11.30),
                        new TimesOfWeek(3, 15.30),
                        new TimesOfWeek(3, 19),
                        new TimesOfWeek(3, 17.30),
                        new TimesOfWeek(4, 19),
                        new TimesOfWeek(7, 19)
                )
        );
        guest5.setAvailableDates(Arrays.asList(
                        new TimesOfWeek(1, 16),
                        new TimesOfWeek(1, 12.30),
                        new TimesOfWeek(1, 16.30),
                        new TimesOfWeek(2, 20.30),
                        new TimesOfWeek(2, 15.00),
                        new TimesOfWeek(3, 19),
                        new TimesOfWeek(3, 17.30),
                        new TimesOfWeek(4, 19),
                        new TimesOfWeek(4, 20)
                )
        );
    }
}

