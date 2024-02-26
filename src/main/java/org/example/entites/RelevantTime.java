package org.example.entites;

import java.util.ArrayList;
import java.util.List;

public class RelevantTime {
    private TimesOfWeek time;
    private List<Students> students;
    private double rate;

    @Override
    public String toString() {
        return "RelevantTime{" +
                "time=" + time +
                ", students=" + students +
                ", rate=" + rate*100 +"%"+
                '}';
    }

    public RelevantTime(TimesOfWeek time, double rate) {
        this.time = time;
        this.rate=rate;
        students=new ArrayList<>();
    }

}
