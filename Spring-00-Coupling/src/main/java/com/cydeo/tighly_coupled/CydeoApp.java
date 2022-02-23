package com.cydeo.tighly_coupled;

public class CydeoApp {
    public static void main(String[] args) {

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTimeMentor, partTimeMentor); // MI
        mentor.manageAccount();

        // MI
    }
}
