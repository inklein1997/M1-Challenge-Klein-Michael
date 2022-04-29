package com.company;

public class ConverterApplication {

    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("==============================================");

        String switchMonth = converterSwitch.convertMonth(2);
        String switchDay = converterSwitch.convertDay(2);

        System.out.println("Using the ConverterSwitch class, convertMonth(2) and convertDay(2) output...\n" + switchMonth + ", \n" + switchDay);

        System.out.println("==============================================");

        String ifMonth = converterSwitch.convertMonth(12);
        String ifDay = converterSwitch.convertDay(6);

        System.out.println("Using the ConverterSwitch class, ifMonth(12) and ifDay(6) output...\n" + ifMonth + ", \n" + ifDay);

        System.out.println("==============================================");

    }
}
