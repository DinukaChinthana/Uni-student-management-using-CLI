import java.util.*;
public class StudentManagementSystem {
    public static String[] sId = new String[0];
    public static String[] sName = new String[0];
    public static int[] sMarksRPF = new int[0];
    public static int[] sMarksDBS = new int[0];

    public static int introMenu(){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");

        for (int i = 0; i < 30; i++) {
            System.out.print(" ");
        }
        System.out.print("WELCOME TO GDSE MARKS MANAGEMENT SYSTEM");

        for (int i = 0; i < 30; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();

        String[] menuOptions = {"Add New Student", "Add New Student With Marks", "Add Marks", "Update Student Details", "Update Marks", "Delete Student", "Print Student Details", "Print Student Rank", "Best in Programming Fundamentals", "Best in Database Management", "Quit the program"};
        System.out.println();
        for (int i = 0; i < menuOptions.length; i+=2) {
            if(i < 10){
                if(menuOptions[i].length() == 9){
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 28; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if(menuOptions[i].length() == 12){
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 25; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if (menuOptions[i].length() == 14){
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 23; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);

                }
                else if (menuOptions[i].length() == 15){
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 22; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);

                }
                else if (menuOptions[i].length() == 18) {
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 19; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if (menuOptions[i].length() == 21) {
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 16; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if (menuOptions[i].length() == 22) {
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 17; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if (menuOptions[i].length() == 26) {
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 11; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else if (menuOptions[i].length() == 27) {
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 10; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }
                else{
                    System.out.print("["+(i+1)+"]"+menuOptions[i]);
                    for (int j = 0; j < 5; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("["+(i+2)+"]"+menuOptions[i+1]);
                }

            }
            else{
                System.out.println("["+(i+1)+"] "+menuOptions[i]);
            }
            System.out.println();
        }
        System.out.print("Enter an option to continue: ");
        int userInput = input.nextInt();
        return userInput;
    }
    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            // handle any exceptions here
        }
    }
    public static void addNewStudentDashboard(){
        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 42; i++) {
            System.out.print(" ");
        }
        System.out.print("ADD NEW STUDENT");
        for (int i = 0; i < 42; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();

        for (int i = 0; i < 101; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    public static void addNewStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studId = input.nextLine();
        boolean isDuplicate = isDuplicate(sId, studId);
        while(isDuplicate){
            System.out.println("The Student ID already exist");
            System.out.print("Enter Student ID: ");
            studId = input.nextLine();
            isDuplicate = isDuplicate(sId, studId);
        }
        System.out.print("Enter Student Name : ");
        String studName = input.nextLine();
        if(!isDuplicate){
            String[] tempSid = new String[sId.length+1];
            String[] temSName = new String[sName.length +1];
            for (int i = 0; i < sId.length; i++) {
                tempSid[i] = sId[i];
                temSName[i] = sName[i];
            }
            tempSid[tempSid.length-1]= studId;
            temSName[temSName.length-1] = studName;
            sId = tempSid;
            sName = temSName;
        }
    }
    public static boolean isDuplicate(String[] ar, String value) {
        for (int i = 0; i < ar.length; i++) {
            if (value.equals(ar[i])) {
                return true;
            }
        }
        return false;
    }
    public static void addNewStudentWithMarks(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 35; i++) {
            System.out.print(" ");
        }
        System.out.print("ADD NEW STUDENT WITH MARKS");
        for (int i = 0; i < 37; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        addNewStudent();
        Scanner input = new Scanner(System.in);
        System.out.print("Programming Fundamentals Marks: ");
        int rfpMarks = input.nextInt();
        while (rfpMarks < 0 || rfpMarks > 100){
            System.out.println("Invalid marks, please enter correct marks.");
            System.out.print("Programming Fundamentals Marks: ");
            rfpMarks = input.nextInt();
        }
        System.out.print("Database Management System Marks : ");
        int dbsMarks = input.nextInt();
        while (dbsMarks < 0 || dbsMarks > 100){
            System.out.println("Invalid marks, please enter correct marks.");
            System.out.print("Database Management System Marks : ");
            dbsMarks = input.nextInt();
        }
        if(sMarksRPF.length == 0 && sMarksDBS.length == 0){
            int[] tempRpf = new int[sId.length];
            int[] tempDbs = new int[sId.length];
            tempRpf[sId.length-1] = rfpMarks;
            tempDbs[sId.length-1] = dbsMarks;
            sMarksRPF = tempRpf;
            sMarksDBS = tempDbs;

        }
        else {
            int[] temRpf = new int[sMarksRPF.length+1];
            int[] temDbs = new int[sMarksDBS.length+1];
            for (int i = 0; i < sMarksRPF.length; i++) {
                temRpf[i] = sMarksRPF[i];
                temDbs[i] = sMarksDBS[i];
            }
            temRpf[temRpf.length-1] = rfpMarks;
            temDbs[temDbs.length-1] = dbsMarks;
            sMarksRPF = temRpf;
            sMarksDBS = temDbs;
        }
    }

    public static int  giveIndex(String uInput) {
        Scanner input = new Scanner(System.in);
        String userInput = uInput;
        String iteration = "y";
        while (iteration.equals("y")) {
            for (int i = 0; i < sId.length; i++) {
                if (userInput.equals(sId[i])) {
                    return i;
                }
            }
            System.out.print("Invalid Student ID. Do you want to search again? (Y/n) : ");
            iteration = input.nextLine().toLowerCase();
            if (iteration.equals("n")) {
                break;
            }
            System.out.print("Enter student ID : ");
            userInput = input.nextLine();
        }
        return -1;
    }

    public static void addStudentMarks(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 45; i++) {
            System.out.print(" ");
        }
        System.out.print("ADD MARKS");
        for (int i = 0; i < 44; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID : ");
        String uInput = input.nextLine();
        int sIdIndex = giveIndex(uInput);
        System.out.print("Student Name : "+sName[sIdIndex]+'\n');

        int[] tempRPFMarks = new int[sId.length];
        for (int i = 0; i < sMarksRPF.length; i++) {
            tempRPFMarks[i] = sMarksRPF[i];
        }
        sMarksRPF = tempRPFMarks;
        int[] tempDBSMarks = new int[sId.length];
        for (int i = 0; i < sMarksDBS.length; i++) {
            tempDBSMarks[i] = sMarksDBS[i];
        }
        sMarksDBS = tempDBSMarks;
        if (sMarksRPF[sIdIndex] == 0 && sMarksDBS[sIdIndex] == 0){
            System.out.print("Programming Fundamentals Marks: ");
            int rpfMarks = input.nextInt();
            while (rpfMarks < 0 || rpfMarks > 100){
                System.out.println("Invalid marks, please enter correct marks.");
                System.out.print("Programming Fundamentals Marks: ");
                rpfMarks = input.nextInt();
            }
            sMarksRPF[sIdIndex] = rpfMarks;
            System.out.print("Database Management System Marks : ");
            int dbsMarks = input.nextInt();
            while (dbsMarks <0 || dbsMarks > 100) {
                System.out.println("Invalid marks, please enter correct marks.");
                System.out.print("Database Management System Marks : ");
                dbsMarks = input.nextInt();
            }
            sMarksDBS[sIdIndex] = dbsMarks;
            System.out.print("Marks have been added. ");
        }
        else {
            System.out.println("This student's marks have been already added");
            System.out.println("If you wan to update the marks, please use [4] Update Marks option ..");
        }
    }
    public static void updateStudentDetails(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 39; i++) {
            System.out.print(" ");
        }
        System.out.print("UPDATE STUDENT DETAILS");
        for (int i = 0; i < 37; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        String uInput = input.nextLine();
        int sIdIndex = giveIndex(uInput);
        System.out.println("Student Name : "+sName[sIdIndex]);
        System.out.print("Enter the new student name : ");
        String name = input.nextLine();
        sName[sIdIndex] = name;
        System.out.println("Student details has been updated successfully.");
    }
    public static void updateStudentMarks(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 43; i++) {
            System.out.print(" ");
        }
        System.out.print("UPDATE MARKS");
        for (int i = 0; i < 43; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        String uInput = input.nextLine();
        int sIdIndex = giveIndex(uInput);
        System.out.println("Student Name : "+sName[sIdIndex]+'\n');
        if (sMarksRPF[sIdIndex] != 0 && sMarksDBS[sIdIndex] != 0){
            System.out.println("Programming Fundamentals Marks : "+ sMarksRPF[sIdIndex]);
            System.out.println("Database Management System Marks : "+sMarksDBS[sIdIndex]);
            System.out.print("Enter new Programming Fundamentals Marks : ");
            int rpfMarks = input.nextInt();
            System.out.print("Enter new Database Management System Marks : ");
            int dbsMarks = input.nextInt();
            sMarksRPF[sIdIndex] = rpfMarks;
            sMarksDBS[sIdIndex] = dbsMarks;
            System.out.println("Marks have been updated successfully.");
        }
        else {
            System.out.println("This student's marks yet to be added");
        }
    }

    public static void deleteStudent(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 42; i++) {
            System.out.print(" ");
        }
        System.out.print("DELETE STUDENT");
        for (int i = 0; i < 42; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        String uInput = input.nextLine();
        int sIdIndex = giveIndex(uInput);
        String[] tempSId = new String[sId.length-1];
        String[] tempSName = new String[sName.length-1];
        int[] tempSMarksRPF = new int[sMarksRPF.length-1];
        int[] tempSMarksDBS = new int[sMarksDBS.length-1];
        for (int i = sIdIndex; i < sId.length - 1; i++) {
            sId[i] = sId[i+1];
            sName[i] = sName[i+1];
            sMarksRPF[i] = sMarksRPF[i+1];
            sMarksDBS[i] = sMarksDBS[i+1];
        }

        for (int i = 0; i < tempSId.length; i++) {
            tempSId[i] = sId[i];
            tempSName[i] = sName[i];
            tempSMarksRPF[i] = sMarksRPF[i];
            tempSMarksDBS[i] = sMarksDBS[i];
        }

        sId=tempSId;
        sName=tempSName;
        sMarksRPF=tempSMarksRPF;
        sMarksDBS=tempSMarksDBS;
        System.out.println("Student has been deleted successfully.");
    }

    public static void printStudentDetails(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 39; i++) {
            System.out.print(" ");
        }
        System.out.print("PRINT STUDENT DETAILS");
        for (int i = 0; i < 38; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID : ");
        String uInput = input.nextLine();
        int sIdIndex = giveIndex(uInput);
        System.out.println("Student Name : "+sName[sIdIndex]);
        if (sMarksRPF[sIdIndex] != 0 && sMarksDBS[sIdIndex] != 0){
            System.out.print("+");
            for (int i = 0; i < 35; i++) {
                System.out.print("-");
            }
            System.out.print("+");
            for (int i = 0; i < 13; i++) {
                System.out.print("-");
            }
            System.out.print("+"+'\n');
            System.out.print("|");
            System.out.print("Programming Fundamentals Marks     |");
            System.out.print("           "+sMarksRPF[sIdIndex]+"|"+'\n');

            System.out.print("|");
            System.out.print("Databases Management System Marks  |");
            System.out.print("           "+sMarksDBS[sIdIndex]+"|"+'\n');

            if((sMarksRPF[sIdIndex]+sMarksDBS[sIdIndex]) > 100){
                System.out.print("|");
                System.out.print("Total Marks                        |");
                System.out.print("          "+(sMarksRPF[sIdIndex]+sMarksDBS[sIdIndex])+"|"+'\n');
            }
            else{
                System.out.print("|");
                System.out.print("Total Marks                        |");
                System.out.print("           "+(sMarksRPF[sIdIndex]+sMarksDBS[sIdIndex])+"|"+'\n');
            }
            double avg = (sMarksRPF[sIdIndex]+sMarksDBS[sIdIndex])/2;
            System.out.print("|");
            System.out.print("Avg. Marks                         |");
            System.out.print("         "+avg+"|"+'\n');

            System.out.print("|Rank                               |");
            if(avg >= 75){
                System.out.print("    1 (First)");
            }
            else if(avg >= 55){
                System.out.print("   2 (Second)");
            }
            else{
                System.out.print("    3 (Third)");
            }
            System.out.print("|"+'\n');
            System.out.print("+");
            for (int i = 0; i < 35; i++) {
                System.out.print("-");
            }
            System.out.print("+");
            for (int i = 0; i < 13; i++) {
                System.out.print("-");
            }
            System.out.print("+"+'\n');
        }
        else {
            System.out.println("Marks yet to be added");
        }
    }
    public static void printStudentsRanks(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 40; i++) {
            System.out.print(" ");
        }
        System.out.print("PRINT STUDENTS RANK");
        for (int i = 0; i < 39; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 5; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
        System.out.print("|Rank  ");
        System.out.print("|ID   |");
        System.out.print("Name                |");
        System.out.print("Total Marks     |");
        System.out.print("Avg.Marks      |"+'\n');
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 5; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
        int[] totalMarks = new int[sId.length];
        double[] AVGMarks = new double[sId.length];
        for (int i = 0; i < sId.length; i++) {
            totalMarks[i] = sMarksRPF[i]+sMarksDBS[i];
            AVGMarks[i] = (sMarksRPF[i]+sMarksDBS[i])/2;
        }

        String[] tempSId = new String[sId.length];
        String[] tempName = new String[sId.length];
        for (int i = 0; i < sId.length; i++) {
            tempSId[i] = sId[i];
            tempName[i] = sName[i];
        }

        for (int i = 0; i < sId.length-1; i++) {
            for (int j = 0; j < (sId.length-i-1); j++) {
                if (totalMarks[j] < totalMarks[j+1]){
                    int temp = totalMarks[j];
                    double tempAVG = AVGMarks[j];
                    String temSId = tempSId[j];
                    String temSName = tempName[j];

                    totalMarks[j] = totalMarks[j+1];
                    AVGMarks[j] = AVGMarks[j+1];
                    tempSId[j] = tempSId[j+1];
                    tempName[j] = tempName[j+1];

                    totalMarks[j+1] = temp;
                    AVGMarks[j+1] = tempAVG;
                    tempSId[j+1] = temSId;
                    tempName[j+1] = temSName;
                }
            }
        }

        for (int i = 0; i < tempSId.length; i++) {
            if (i < 10) {
                if (tempName[i].length() == 5){
                    System.out.println("|"+(i+1)+"     "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
                }
                else if (tempName[i].length() == 6) {
                    System.out.println("|"+(i+1)+"     "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
                }
                else if (tempName[i].length() == 7) {
                    System.out.println("|"+(i+1)+"     "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
                }
                else {
                    System.out.println("|"+(i+1)+"     "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
                }
            }
            else if (i >= 10 && i< 100) {
                System.out.println("|"+(i+1)+"    "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
            }
            else{
                System.out.println("|"+(i+1)+"   "+"|"+tempSId[i]+" |"+tempName[i]+'\t'+'\t'+"  "+"|"+totalMarks[i]+'\t'+'\t'+"   "+"|"+AVGMarks[i]+'\t'+"   "+"|");
            }
        }
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 5; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
    }

    public static void bestInProgramming(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 33; i++) {
            System.out.print(" ");
        }
        System.out.print("BEST IN PROGRAMMING FUNDAMENTALS");
        for (int i = 0; i < 33; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
        System.out.print("|ID    |");
        System.out.print("Name                |");
        System.out.print("RPF Marks       |");
        System.out.print("DBMS Marks     |"+'\n');
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');

        String[] tempSId = new String[sId.length];
        String[] tempName = new String[sId.length];
        int[] tempRPFMarks = new int[sId.length];
        int[] tempDBSMarks = new int[sId.length];
        for (int i = 0; i < sId.length; i++) {
            tempSId[i] = sId[i];
            tempName[i] = sName[i];
            tempRPFMarks[i] = sMarksRPF[i];
            tempDBSMarks[i] = sMarksDBS[i];
        }
        for (int i = 0; i < sId.length-1; i++) {
            for (int j = 0; j < (sId.length-i-1); j++) {
                if (tempRPFMarks[j] < tempRPFMarks[j+1]){
                    int temp = tempRPFMarks[j];
                    int tempDBS = tempDBSMarks[j];
                    String temSId = tempSId[j];
                    String temSName = tempName[j];

                    tempRPFMarks[j] = tempRPFMarks[j+1];
                    tempDBSMarks[j] = tempDBSMarks[j+1];
                    tempSId[j] = tempSId[j+1];
                    tempName[j] = tempName[j+1];

                    tempRPFMarks[j+1] = temp;
                    tempDBSMarks[j+1] = tempDBS;
                    tempSId[j+1] = temSId;
                    tempName[j+1] = temSName;
                }
            }
        }

        for (int i = 0; i < sId.length; i++) {

            System.out.println("|"+tempSId[i]+"  |"+tempName[i]+'\t'+'\t'+"    "+"|"+tempRPFMarks[i]+'\t'+'\t'+"     "+"|"+tempDBSMarks[i]+'\t'+"     "+"|");
        }
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');

    }

    public static void bestInDatabases(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("|");
        for (int i = 0; i < 32; i++) {
            System.out.print(" ");
        }
        System.out.print("BEST IN DATABASE MANAGEMENT SYSTEM");
        for (int i = 0; i < 32; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
        System.out.print("|ID    |");
        System.out.print("Name                |");
        System.out.print("RPF Marks       |");
        System.out.print("DBMS Marks     |"+'\n');
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
        String[] tempSId = new String[sId.length];
        String[] tempName = new String[sId.length];
        int[] tempRPFMarks = new int[sId.length];
        int[] tempDBSMarks = new int[sId.length];
        for (int i = 0; i < sId.length; i++) {
            tempSId[i] = sId[i];
            tempName[i] = sName[i];
            tempRPFMarks[i] = sMarksRPF[i];
            tempDBSMarks[i] = sMarksDBS[i];
        }
        for (int i = 0; i < sId.length-1; i++) {
            for (int j = 0; j < (sId.length-i-1); j++) {
                if (tempDBSMarks[j] < tempDBSMarks[j+1]){
                    int temp = tempDBSMarks[j];
                    int tempRPF = tempRPFMarks[j];
                    String temSId = tempSId[j];
                    String temSName = tempName[j];

                    tempRPFMarks[j] = tempRPFMarks[j+1];
                    tempDBSMarks[j] = tempDBSMarks[j+1];
                    tempSId[j] = tempSId[j+1];
                    tempName[j] = tempName[j+1];

                    tempRPFMarks[j+1] = tempRPF;
                    tempDBSMarks[j+1] = temp;
                    tempSId[j+1] = temSId;
                    tempName[j+1] = temSName;
                }
            }
        }
        for (int i = 0; i < sId.length; i++) {

            System.out.println("|"+tempSId[i]+"  |"+tempName[i]+'\t'+'\t'+"    "+"|"+tempDBSMarks[i]+'\t'+'\t'+"     "+"|"+tempRPFMarks[i]+'\t'+"     "+"|");
        }
        System.out.print("+");
        for (int i = 0; i < 6; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 16; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 15; i++) {
            System.out.print("-");
        }
        System.out.print("+"+'\n');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = introMenu();
        while(userInput != 11){
            if(userInput == 1){
                clearConsole();
                addNewStudentDashboard();
                addNewStudent();
                System.out.print("Student has been added successfully. ");
                System.out.print(" Do you want to add new student [Y/n]: ");
                String userInputStr = input.nextLine().toLowerCase();
                while(userInputStr.equals("y")){
                    clearConsole();
                    addNewStudentDashboard();
                    addNewStudent();
                    System.out.print("Student has been added successfully. ");
                    System.out.print(" Do you want to add new student [Y/n]: ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if(userInput == 2){
                clearConsole();
                addNewStudentWithMarks();
                System.out.print("Student has been added successfully. ");
                System.out.print(" Do you want to add new student [Y/n]: ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    addNewStudentWithMarks();
                    System.out.print("Student has been added successfully. ");
                    System.out.print(" Do you want to add new student [Y/n]: ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 3) {
                clearConsole();
                addStudentMarks();
                System.out.print(" Do you want to add new student [Y/n]: ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    addStudentMarks();
                    System.out.print(" Do you want to add new student [Y/n]: ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 4) {
                clearConsole();
                updateStudentDetails();
                System.out.print("Do you want to add new student [Y/n]: ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    updateStudentDetails();
                    System.out.print("Do you want to add new student [Y/n]: ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 5) {
                clearConsole();
                updateStudentMarks();
                System.out.print("Do you want to update the marks of another student (Y/n) ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    updateStudentMarks();
                    System.out.print("Do you want to update the marks of another student (Y/n) ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 6) {
                clearConsole();
                deleteStudent();
                System.out.print("Do you want to delete another student? (Y/n) ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    deleteStudent();
                    System.out.print("Do you want to delete another student? (Y/n) ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 7) {
                clearConsole();
                printStudentDetails();
                System.out.print("Do you want tn search another student details (Y/n) ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    clearConsole();
                    printStudentDetails();
                    System.out.print("Do you want tn search another student details (Y/n) ");
                    userInputStr = input.nextLine().toLowerCase();
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 8) {
                clearConsole();
                printStudentsRanks();
                System.out.print("Do you want to go back to main menu (Y/n): ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    break;
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 9) {
                clearConsole();
                bestInProgramming();
                System.out.print("Do you want to go back to main menu (Y/n): ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    break;
                }
                clearConsole();
                userInput = introMenu();
            }
            else if (userInput == 10) {
                clearConsole();
                bestInDatabases();
                System.out.print("Do you want to go back to main menu (Y/n): ");
                String userInputStr = input.nextLine().toLowerCase();
                while (userInputStr.equals("y")){
                    break;
                }
                clearConsole();
                userInput = introMenu();
            }
            else{
                clearConsole();
                userInput = introMenu();
            }
        }
    }
}