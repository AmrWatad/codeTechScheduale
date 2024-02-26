package org.example.entites;

import java.util.Objects;

public class TimesOfWeek {
    private int day;
    private double hour;

    public TimesOfWeek(int day, double hour) {
        this.day = day;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "TimesOfWeek{" +
                "day=" + day +
                ", hour=" + hour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TimesOfWeek)) return false;
        TimesOfWeek that = (TimesOfWeek) o;
        return getDay() == that.getDay() && Double.compare(getHour(), that.getHour()) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getHour());
    }

    public double getHour() {
        return hour;
    }
}
