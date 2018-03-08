package template;

/**
 * Created by Blue on 2018/3/8.
 */
public class Test {
    public static void main(String[] args){
        BossWork bossWork = new BossWork();
        StaffWork staffWork = new StaffWork();
        bossWork.newDay();
        System.out.println("--------------------------------");
        staffWork.newDay();
    }
}
