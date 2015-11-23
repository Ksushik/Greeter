/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stoxa.testforardas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author ksu
 */
public class DayPartSelector {
    
final Logger logger = LoggerFactory.getLogger(DayPartSelector.class);

Calendar c;
int currentHourOfDay;
DayPartSelector(){
 c = new GregorianCalendar();   
}



public String getKeyMessage () {
    currentHourOfDay = c.get(Calendar.HOUR_OF_DAY); 
    logger.info("The current Hour Of Day is: " + currentHourOfDay);
    if (currentHourOfDay>6&&currentHourOfDay<=9) {
        return "MorningMessage";
    }
    if (currentHourOfDay>9&&currentHourOfDay<=19) {
        return "DayMessage";
    }
    if (currentHourOfDay>19&&currentHourOfDay<=23) {
        return "EveningMessage";
    }
    else {
        return "NightMessage";
    }
}

}