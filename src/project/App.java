package project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean log=false;
        System.out.println("欢迎使用教室资源管理系统");
        while (!log) {
            System.out.println("------登录系统-------");
            System.out.println("请选择功能：1.注册    2.登录");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入用户名和密码");
                    Login.register(sc.next(), sc.next());
                    System.out.println("登录系统重启中");
                    break;
                case 2:
                    System.out.println("请输入用户名和密码");
                    log=Login.login(sc.next(), sc.next());
                    if(log){
                        System.out.println("登录成功");
                    }
                    else{
                        System.out.println("登录失败，请重新登录或注册");
                    }
                    break;
                default:
                    System.out.println("指令非法,请重新输入");
            }
        }
        ArrayList<campus> allCampus=new ArrayList<>();
        boolean exit=false;
        while (!exit) {
            System.out.println("------管理系统------");
            System.out.println("请选择功能：1.校区管理  2.教室管理 3.查询 4.排行 5.教室预约 6.退出");

            switch (sc.nextInt()) {
                case 1:
                    boolean exit1=false;
                    while (!exit1) {
                        System.out.println("-----校区管理-----");
                        System.out.println("1.增加校区   2.删除校区   3.编辑校区   4.退出");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("请输入新建校区名和ID");
                                String name = sc.next();
                                int ID = sc.nextInt();
                                applyCampus(name, ID,allCampus);
                                break;
                            case 2:
                                System.out.println("请输入删除校区ID");
                                int id = sc.nextInt();
                                deleteCampus(id, allCampus);
                                break;
                            case 3:
                                System.out.println("请输入要修改的校区ID和修改后的名称");
                                int id2 = sc.nextInt();
                                String name1 = sc.next();
                                campusUpdate(id2, name1, allCampus);
                                break;
                            case 4:
                                exit1=true;
                        }
                    }
                    break;
                case 2:
                    boolean exit2=false;
                    while (!exit2) {
                    System.out.println("------教室管理-------");
                    System.out.println("1.增加教室    2.删除教室   3.编辑教室   4.退出");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("请输入“ 校区ID 教室名 教室ID 教室类型  教室座位数 ");
                            int campusID=sc.nextInt();
                            String roomName=sc.next();
                            int roomId=sc.nextInt();
                            String roomType=sc.next();
                            int sitNumber=sc.nextInt();
                            applyClass(allCampus, campusID, roomName, roomId, roomType, sitNumber);
                            break;
                        case 2:
                            System.out.println("请输入删除的教室ID");
                            int campusId=sc.nextInt();
                            deleteClass(campusId, allCampus);
                            break;
                        case 3:
                            System.out.println("请输入要修改的教室编号");
                            int roomId1=sc.nextInt();
                            System.out.println("请输入修改后的信息：\"  教室名  教室类型  教室座位数 \"");
                            String roomName1=sc.next();
                            String roomType1=sc.next();
                            int sitNumber1=sc.nextInt();
                            classUpdate(allCampus,roomName1,roomId1,roomType1,sitNumber1);
                            break;
                        case 4:
                            exit2=true;
                    }

                    }
                    break;
                case 3:
                    boolean exit3=false;
                    while (!exit3) {
                        System.out.println("-------查询系统------");
                        System.out.println("1.校区编号查询   2.校区名称查询   3教室编号查询   4教室名称查询  5教室类型查询  6教室课表查询 7.退出");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("请输入校区编号");
                                int campusID=sc.nextInt();
                                selectCampusId(campusID, allCampus);
                                break;
                            case 2:
                                System.out.println("请输入校区名称");
                                String roomName=sc.next();
                                selectCampusName(roomName, allCampus);
                                break;
                            case 3:
                                System.out.println("请输入教室编号");
                                int roomId=sc.nextInt();
                                selectClassId(roomId, allCampus);
                                break;
                            case 4:
                                System.out.println("请输入教室名称");
                                String roomName1=sc.next();
                                selectClassName(roomName1, allCampus);
                                break;
                            case 5:
                                System.out.println("请输入教室类型");
                                String roomType=sc.next();
                                selectClassType(roomType, allCampus);
                                break;
                            case 6:
                                System.out.println("请输入查询的教室id");
                                int Id=sc.nextInt();
                                selectClasses(allCampus,Id);
                                break;
                            case 7:
                                exit3=true;
                        }
                    }
                    break;
                case 4:
                    boolean exit4=false;
                    while (!exit4) {
                        System.out.println("-----排序系统-----");
                        System.out.println("1.教室座位排序  2.教室ID排序  3校区id排序  4.退出");
                        int choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                setSort(allCampus);
                                break;
                            case 2:
                                idSort(allCampus);
                                break;
                            case 3:
                                campusSort(allCampus);
                                break;
                            case 4:exit4=true;
                        }
                    }
                    break;
                case 5:
                    boolean exit5=false;
                    while (!exit5) {
                    System.out.println("-----教室预约系统-----");
                    System.out.println("1.预约教室 2.取消预约 3.退出");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("请输入想要预约的教室编号和星期(1-7)和节数(1-5)");
                            int classID=sc.nextInt();
                            int day=sc.nextInt();
                            int classes=sc.nextInt();
                            book(allCampus,classID,day,classes);
                            break;
                        case 2:
                            System.out.println("请输入想取消预约的教室编号和时间");
                            int classID2=sc.nextInt();
                            int day2=sc.nextInt();
                            int classes2=sc.nextInt();
                            rebook(allCampus,classID2,day2,classes2);
                            break;
                        case 3:
                            exit5=true;
                    }
                    }
                    break;
                case 6:exit=true;

            }
        }
    }
    public static void applyClass(ArrayList<campus> allCampus,int id,String roomName, int roomID, String roomType, int sitNumber){
        for (int i = 0; i < allCampus.size(); i++) {
            if (allCampus.get(i).getID()==id) {
                campus campus1=allCampus.get(i);
                for (int j = 0; j < campus1.getClassList().size(); j++) {
                    if(campus1.getClassList().get(j).getRoomID()==roomID){
                        System.out.println("教室编号重复，无法增加");
                        return;
                    }
                }
                allCampus.remove(i);
                campus1.applyClassList(new classRoom(roomName,roomID,roomType,sitNumber));
                allCampus.add(campus1);
                System.out.println("增加成功");
                return;
            }
        }
        System.out.println("无此校区，无法增加");
    }

    public static void applyCampus(String name,int id,ArrayList<campus> allCampus){
        for (project.campus campus : allCampus) {
            if (campus.getID()==id) {
                System.out.println("该校区已存在");
                return;
            }
        }
        allCampus.add(new campus(name,id));
        System.out.println("添加"+name+"校区成功");

    }

    public static void deleteCampus(int id,ArrayList<campus>allCampus){
        for (project.campus campus : allCampus) {
            if (campus.getID()==id) {
                allCampus.remove(campus);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("无此校区，删除失败");

    }

    public static void deleteClass(int ID ,ArrayList<campus>allCampus){
        for (campus campus : allCampus) {
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomID()==ID){
                    campus.getClassList().remove(i);
                    System.out.println("删除成功");
                    return;
                }
            }
        }
        System.out.println("未找到对应编号，删除失败");
    }

    public static void classUpdate(ArrayList<campus> allCampus,String roomName, int roomID, String roomType, int sitNumber){
        for (campus campus : allCampus) {
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomID()==roomID){
                    campus.getClassList().get(i).setRoomName(roomName);
                    campus.getClassList().get(i).setRoomType(roomType);
                    campus.getClassList().get(i).setSitNumber(sitNumber);
                    System.out.println("修改成功");
                    return;
                }
            }
        }
        System.out.println("未找到对应编号");
    }

    public static void campusUpdate(int id,String name,ArrayList<campus> allCampus){
        for (campus campus : allCampus) {
            if (campus.getID()==id) {
                campus.setName(name);
                System.out.println("修改成功");
                return;
            }
        }
        System.out.println("修改失败");
    }

    public static void selectCampusId(int id,ArrayList<campus> allCampus){
        for (campus campus : allCampus) {
            if (campus.getID()==id) {
                System.out.println(campus);
            }
        }
    }

    public static void selectCampusName(String name,ArrayList<campus> allCampus){
        allCampus.sort((Comparator.comparingInt(campus::getID)));
        for (campus campus : allCampus) {
            if (campus.getName().equals(name)) {
                System.out.println(campus);
            }
        }
    }

    public static void selectClassId(int id,ArrayList<campus> allCampus){

        for (campus campus : allCampus) {
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomID()==id){
                    classRoom classRoom=campus.getClassList().get(i);
                    System.out.println(campus.getID()+"  "+campus.getName()+"  "+classRoom.toString());
                }
            }
        }
    }

    public static void selectClassName(String name,ArrayList<campus> allCampus){
        for (campus campus : allCampus) {
            campus.getClassList().sort((Comparator.comparingInt(classRoom::getRoomID)));
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomName().equals(name)){
                    classRoom classRoom=campus.getClassList().get(i);
                    System.out.println(campus.getID()+"  "+campus.getName()+"  "+classRoom.toString());
                }
            }
        }

    }

    public static void selectClassType(String Type,ArrayList<campus> allCampus){
        for (campus campus : allCampus) {
            campus.getClassList().sort((Comparator.comparingInt(classRoom::getRoomID)));
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomType().equals(Type)){
                    classRoom classRoom=campus.getClassList().get(i);
                    System.out.println(campus.getID()+"  "+campus.getName()+"  "+classRoom.toString());
                }
            }
        }
    }

    public static void book(ArrayList<campus> allCampuses,int id,int day,int classes){
        if(day<=7&&day>=1&&classes>=1&&classes<=5){
            for (campus campus : allCampuses) {
                for (int i = 0; i <campus.getClassList().size() ; i++) {
                    if(campus.getClassList().get(i).getRoomID()==id){
                        classRoom classRoom=campus.getClassList().get(i);
                        if(classRoom.getUser()[day-1][classes-1]==0){
                            campus.getClassList().get(i).setUser(day-1,classes-1,1);
                            System.out.println("预约成功");
                        }
                        else {
                            System.out.println("该节课已被预约");
                        }
                        return;
                    }
                }
            }
            System.out.println("教室编号非法");
        }
        else System.out.println("输入非法");

    }

    public static void rebook(ArrayList<campus> allCampus,int id,int day,int classes){
        if(day<=7&&day>=1&&classes>=1&&classes<=5){
            for (campus campus : allCampus) {
                for (int i = 0; i <campus.getClassList().size() ; i++) {
                    if(campus.getClassList().get(i).getRoomID()==id){
                        classRoom classRoom=campus.getClassList().get(i);
                        if(classRoom.getUser()[day-1][classes-1]==1){
                            campus.getClassList().get(i).setUser(day-1,classes-1,0);
                            System.out.println("取消预约成功");
                        }
                        else {
                            System.out.println("该节课未被预约");
                        }
                    }
                }
            }
            System.out.println("教室编号非法");
        }
        else System.out.println("输入非法");
    }

    public static void selectClasses(ArrayList<campus> allCampus,int id){
        for (campus campus : allCampus) {
            for (int i = 0; i <campus.getClassList().size() ; i++) {
                if(campus.getClassList().get(i).getRoomID()==id){
                    classRoom classRoom=campus.getClassList().get(i);
                    for (int j = 0; j < 7; j++) {
                        for (int k = 0; k < 5; k++) {
                            System.out.print(classRoom.getUser()[j][k]+"\t");
                        }
                        System.out.println();
                    }
                    return;
                }
            }
        }
        System.out.println("教室ID非法");
    }

    public static void setSort(ArrayList<campus> allCampus){
        ArrayList<classRoom> classRoomList=new ArrayList<>();
        for (campus campus : allCampus) {
            classRoomList.addAll(campus.getClassList());
        }
        classRoomList.sort((Comparator.comparingInt(classRoom::getSitNumber)));
        for (project.classRoom classRoom : classRoomList) {
            System.out.println(classRoom.toString());
        }
    }

    public static void idSort(ArrayList<campus> allCampus){
        ArrayList<classRoom> classRoomList=new ArrayList<>();
        for (campus campus : allCampus) {
            classRoomList.addAll(campus.getClassList());
        }
        classRoomList.sort((Comparator.comparingInt(classRoom::getRoomID)));
        for (project.classRoom classRoom : classRoomList) {
            System.out.println(classRoom.toString());
        }
    }

    public static void campusSort(ArrayList<campus> allCampus){
        allCampus.sort(Comparator.comparingInt(campus::getID));
        for (campus campus : allCampus) {
            System.out.println(campus.toString());
        }
    }
}

