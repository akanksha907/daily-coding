package com.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class DateTimeAPIDemo {
    public static void main(String[] args) {

        // 1. LocalDate
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1998, 5, 20);
        System.out.println("Today: " + today);
        System.out.println("BirthDate: " + birthDate);

        // 2. LocalTime
        LocalTime now = LocalTime.now();
        LocalTime meeting = LocalTime.of(10, 30);
        System.out.println("Current Time: " + now);
        System.out.println("Meeting Time: " + meeting);

        // 3. LocalDateTime
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime event = LocalDateTime.of(2025, 3, 15, 9, 45);
        System.out.println("Current DateTime: " + current);
        System.out.println("Event DateTime: " + event);

        // 4. DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        //5. Period (Date difference)
        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years");

        //6. Duration (Time difference)
        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(11, 30);
        Duration d = Duration.between(start, end);
        System.out.println("Duration: " + d.toHours() + " hours");
    }}