package com.parsa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        q1:
//        int n = scanner.nextInt();
//        for (int i=0;i<n;i++) {
//            int id = scanner.nextInt();
//            int start = scanner.nextInt();
//            int end = scanner.nextInt();
//            createMeeting(id,start,end);
//        }
//        int inp_id = scanner.nextInt();
//        int inp_duration = scanner.nextInt();
//        Meeting.check(inp_duration);
    }

    public static void createMeeting(int id,int start,int end) {
        Meeting meeting = new Meeting(id,start,end);
        meeting.addMeetingToList(meeting);
    }
}
