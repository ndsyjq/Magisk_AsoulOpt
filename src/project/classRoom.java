package project;

import java.util.Arrays;

public class classRoom {
    private String roomName;
    private int roomID;
    private String roomType;
    private int sitNumber;
    private int[][] user;
    public classRoom(String roomName, int roomID, String roomType, int sitNumber) {
        this.roomName = roomName;
        this.roomID = roomID;
        this.roomType = roomType;
        this.sitNumber = sitNumber;
        user = new int[7][5];
    }
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getSitNumber() {
        return sitNumber;
    }

    public void setSitNumber(int sitNumber) {
        this.sitNumber = sitNumber;
    }

    public int[][] getUser() {
        return user;
    }

    public void setUser(int day,int classes,int set) {
            user[day][classes]=set;
    }

    public String toString() {
        return "classRoom{roomName = " + roomName + ", roomID = " + roomID + ", roomType = " + roomType + ", sitNumber = " + sitNumber + "}";
    }
}
