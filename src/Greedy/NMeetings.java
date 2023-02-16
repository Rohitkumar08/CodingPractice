package Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NMeetings {
    public static void main(String[] args) {
        NMeetings nMeetings = new NMeetings();
        System.out.println(nMeetings.getMeetingNumbers(new int[]{1, 3, 0, 5, 8, 5}, new int[]{2, 4, 5, 7, 9, 9}));
    }

    public List<Integer> getMeetingNumbers(int start[], int[] end){
        List<Meeting> meetingsList = new ArrayList<>();
        for(int i=0; i<start.length; i++){
            Meeting meeting = new Meeting(start[i], end[i], i+1);
            meetingsList.add(meeting);
        }
        return getMAxMeetings(meetingsList);
    }

    public List<Integer> getMAxMeetings(List<Meeting> meetings){
        List<Integer> result = new ArrayList<>();
        //sort based on meetings end time
        meetings.sort(Comparator.comparingInt(m -> m.end));
        int lastMeetingEndTime = meetings.get(0).end;
        result.add(meetings.get(0).pos);
        for(int i=1; i<meetings.size(); i++){
            //if next meetings start time is greater than last meetings end time then only consider and update lastmeetiung end time
            if(meetings.get(i).start > lastMeetingEndTime){
                result.add(meetings.get(i).pos);
                lastMeetingEndTime = meetings.get(i).end;
            }
        }
        return result;
    }
}


class Meeting {
    int start;
    int end;
    int pos;

    Meeting(int start, int end, int pos)
    {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}