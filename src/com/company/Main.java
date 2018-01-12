package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*  App Functionality:
    -ask for the user's name
    -allow user to enter name
    -after name has been entered, app will ask for current age
    -allow user to enter current age.
    -after age, app will ask for current year
    -allow user to enter current year
    -the application will output
    --their name
    --how old the user will be next year,
    --in 5 years
    --and in 10 years
    --with the associated years of those ages.

	 */

        Scanner mrRoboto = new Scanner(System.in);
        System.out.println("Hello! please enter your name:");
        String userName = mrRoboto.nextLine();
        System.out.println("Hello " + userName + " nice to meet you!");
        System.out.println("");
        String [] userInfo = {
                "What is your current age?",
                "What is the current year?",
        };

        List<String> userData = new ArrayList<>();

        for (int i = 0; i < userInfo.length; i++) {
            System.out.println(userInfo[i]);
            String userEntry = mrRoboto.nextLine();
            userData.add(userEntry);
        }

        String userAgeS = userData.get(0);
        int userAgeI = Integer.parseInt(userAgeS);
        String currYearS = userData.get(1);
        int currYearI = Integer.parseInt(currYearS);

        System.out.println(userName + ", you are currently " + userAgeI + " years old and it is " + currYearI + ".");

        int agePlus1 = userAgeI + 1;
        int agePlus5 = userAgeI + 5;
        int agePlus10 = userAgeI + 10;

        int yearPlus1 = currYearI + 1;
        int yearPlus5 = currYearI + 5;
        int yearPlus10 = currYearI + 10;

        System.out.println("In " + yearPlus1 + ", you will be " + agePlus1 + " years old.");
        System.out.println("In " + yearPlus5 + ", you will be " + agePlus5 + " years old.");
        System.out.println("In " + yearPlus10 + ", you will be " + agePlus10 + " years old.");
        System.out.println("");
        System.out.println("Have a nice day!");

    }
}
