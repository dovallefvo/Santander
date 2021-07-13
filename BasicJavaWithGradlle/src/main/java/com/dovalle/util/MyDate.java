package com.dovalle.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class MyDate {
    private Date dateDefault = null;
    private Instant dateInstant = null;
    private Calendar dateCalendar = null;
    private LocalDate localDate = null;
    private LocalDateTime localDateTime = null;
    private LocalTime localTime = null;

    public MyDate (){
        dateDefault = new Date();
        dateInstant = new Date().toInstant();
        dateCalendar = Calendar.getInstance();
        localDate = LocalDate.now();
        localTime = LocalTime.now();
        localDateTime = LocalDateTime.now();
    }

    public Date getDateDefault() {
        return dateDefault;
    }

    public void setDateDefault(Date date) {
        this.dateDefault = date;
    }

    public Instant getDateInstant() {
        return dateInstant;
    }

    public void setDateInstant(Instant date) {
        this.dateInstant = date;
    }

    public Calendar getDateCalendar() {
        return dateCalendar;
    }

    public void setDateCalendar(Calendar date) {
        this.dateCalendar = date;
    }

    public String showDetails(){
        String details = String.format("\nDate default object %s \nDate instant object:%s", this.getDateDefault(), this.getDateInstant());
        details = details.concat(String.format("\nCalendar date objetc:\n%tc \n%tF \n%tD \n%tr \n%tT", dateCalendar, dateCalendar, dateCalendar, dateCalendar, dateCalendar));
        return details;
    }

    public String formatter(){
        var formatter = DateFormat.getInstance();
        var simpleFormmater = new SimpleDateFormat("yyyy-MM-dd HH:MM");
        StringBuilder formatedDate = new StringBuilder();
        formatedDate.append("\nDate format object: ")
                .append(formatter.format(this.getDateDefault()))
                .append("\nSimple Date format: ")
                .append(simpleFormmater.format(this.getDateDefault()));
        return  formatedDate.toString();
    }

    public String showDateJava8 (){
        StringBuilder dates = new StringBuilder();
        dates.append("New Date class from Java 8:\n")
            .append(String.format("Local date: \n%s \nDate -1 month: \n%s", localDate, localDate.minusMonths(1)))
            .append(String.format("\nLocal Time: \n%s \nLocal time +45 minutes: \n%s", localTime, localTime.plusMinutes(45)))
            .append(String.format("\nLocal Date Time: \n%s \nLocal date time +1 year +2weeks +50seconds \n%s", localDateTime, localDateTime.plusYears(1).plusWeeks(2).plusSeconds(50)));
        return dates.toString();
    }
}
