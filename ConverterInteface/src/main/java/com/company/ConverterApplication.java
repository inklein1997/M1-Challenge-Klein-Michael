package com.company;

public class ConverterApplication {

    public static void main(String[] args) {
        ConverterIf converterIf = new ConverterIf();
        ConverterSwitch converterSwitch = new ConverterSwitch();

        System.out.println("==============================================");

        String switchMonth = converterSwitch.convertMonth(2);
        String switchDay = converterSwitch.convertDay(2);

        System.out.println("Using the ConverterSwitch class, convertMonth(2) and convertDay(2) outputs to...\n" + switchMonth + ", \n" + switchDay);

        System.out.println("==============================================");

        String ifMonth = converterIf.convertMonth(12);
        String ifDay = converterIf.convertDay(6);

        System.out.println("Using the ConverterIf class, convertMonth(12) and convertDay(6) outputs to...\n" + ifMonth + ", \n" + ifDay);

        System.out.println("==============================================");

    }
}
