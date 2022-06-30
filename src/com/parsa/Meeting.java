package com.parsa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class SortById implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {
        return o1.getId() - o2.getId();
    }
}
public class Meeting {
    private int id;
    private int start;
    private int end;
    private static LinkedList<Meeting> meetingsArrayList = new LinkedList<>();

    Meeting(int id,int start,int end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }


//    public static void print() {
//        for (int i=0;i<meetingsArrayList.size();i++) {
//            System.out.println(meetingsArrayList.get(i).id);
//        }
//    }

    public static void check(int duration) {
        LinkedList<Meeting> meetings = Meeting.getMeetingsArrayList();
        if (duration<meetings.get(0).start) {
            System.out.println("0 "+ duration);
            return;
        }
        for (int i=1;i< meetings.size();i++) {
            if (duration< (meetings.get(i).start-meetings.get(i-1).end)) {
                int start = meetings.get(i-1).end+1;
                int end = meetings.get(i-1).end+1+duration;
                System.out.println(start + " " + end);
                return;
            }
        }
    }

    public void addMeetingToList(Meeting meeting) {
        meetingsArrayList.add(meeting);
        Collections.sort(meetingsArrayList,new SortById());
    }

    public static LinkedList<Meeting> getMeetingsArrayList() {
        return meetingsArrayList;
    }

    public int getEnd() {
        return end;
    }

    public int getId() {
        return id;
    }

    public int getStart() {
        return start;
    }
}
