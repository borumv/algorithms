package Sortinghappiness;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, 2));
        userList.add(new User(1, 4));
        userList.add(new User(7, 9));
        userList.add(new User(8, 10));
        userList.add(new User(5, 15));
        List<Integer> visitedBossList = new ArrayList<>();
        visitedBossList.add(3);
        visitedBossList.add(6);
        visitedBossList.add(11);
        Boss boss = new Boss(visitedBossList);
        System.out.println(countMaxOnlie(userList, boss));
        System.out.println(timeWithVisitors(userList, boss));
    }

    private static int timeWithVisitors(List<User> userList, Boss boss){
        int[][] events = getEvents(userList, boss);
        sortingArray(events, 0, events.length - 1);
        int online = 0, timeWithVisitors = 0;
        for (int i = 0; i < events.length; i++) {
            if(online > 0)
                timeWithVisitors += events[i][0] - events[i - 1][0];
            if(events[i][1] == -1)
                online -= 1;
            else
                online += 1;
        }
        return timeWithVisitors;
    }

    private static int countMaxOnlie(List<User> userList, Boss boss) {
        int[][] events = getEvents(userList, boss);
        sortingArray(events, 0, events.length - 1);
        int online = 0;
        int maxOnline = 0;
        List<Integer> bossans = new ArrayList<>();
        for (int[] event : events) {
            if(event[1] == 1)
                online += 1;
            else if (event[1] == -1) {
                online -= 1;
            }else {
                bossans.add(online);
            }

            maxOnline = Math.max(online, maxOnline);
        }
        System.out.println("Inter the boss");
        bossans.forEach(System.out::println);
        return maxOnline;
    }

    private static int[][] getEvents(List<User> userList, Boss boss) {
        int[][] events = new int[userList.size() * 2 + boss.getVisites().size()] [2];
        for (int i = 0; i < userList.size(); i ++) {
            events[i][0] = userList.get(i).getIn();
            events[i][1] = 1;
        }
        for (int i = userList.size(); i < userList.size() * 2; i++) {
            events[i][0] = userList.get(i - userList.size()).getOut();
            events[i][1] = -1;
        }
        for (int i = userList.size() * 2; i < events.length; i++) {
            events[i][0] = boss.getVisites().get(i - userList.size() * 2);
            events[i][1] = 0;
        }
        return events;
    }

    private static void sortingArray(int[][] massive, int low, int high ) {
        if(massive.length == 0){
            return;
        }
        if(low >= high){
            return;
        }
        int middle = low + (high - low) / 2;
        int opora = massive[middle][0];
        int i = low, j = high;
        while (i <= j){
            while (massive[i][0] < opora){
                i++;
            }
            while (massive[j][0] > opora){
                j--;
            }
            if(i <= j){
                int left = massive[i][0];
                int typeLeft = massive[i][1];
                massive[i][0] = massive[j][0];
                massive[i][1] = massive[j][1];

                massive[j][0] = left;
                massive[j][1] = typeLeft;

                i++;
                j--;
            }
        }
        if(low < j){
            sortingArray(massive, low, j);
        }
        if(high > i){
            sortingArray(massive, i, high);
        }

    }
}
class User{
    int in;

    public int getIn() {
        return in;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    int out;

    public User(int in, int out) {
        this.in = in;
        this.out = out;
    }
}
class Boss{
    List<Integer> visites;

    public List<Integer> getVisites() {
        return visites;
    }

    public Boss(List<Integer> visites) {
        this.visites = visites;
    }
}
enum EVENTS{
    IN,
    OUT
}

