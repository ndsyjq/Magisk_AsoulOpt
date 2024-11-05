package pra1;

public class TEST {
    public static void main(String[] args) {
        SqList list=new SqList(10);
        try {
            list.insert(0,new GOODS("wk",3,100));
            list.insert(1,new GOODS("cb",4,101));
            list.insert(2,new GOODS("nb",5,102));
            list.insert(3,new GOODS("sb",6,103));
            list.insert(4,new GOODS("gb",7,104));
            list.insert(4,new GOODS("gb",7,104));
            list.remove(0);
            list.insert(4,list.get(0));
            list.KuoLong(20);
            list.searcher("gb");
            list.redisplay();
            list.KuoLong(10);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
