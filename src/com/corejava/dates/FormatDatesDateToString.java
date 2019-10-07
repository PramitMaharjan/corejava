package com.corejava.dates;

import java.util.*;
import java.text.*;

public class FormatDatesDateToString {

   public static void main(String args[]) {
      Date dNow = new Date( );
      System.out.println("Current System Date: " + dNow);
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
      System.out.println("Formatter" + ft);
      System.out.println("Formatted Current System Date: " + ft.format(dNow));
   }
}