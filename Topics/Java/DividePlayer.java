import java.util.Arrays;

class divide {
    public int work(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 != 0) {
            return -1;
        }
        int teamSkillsum = arr[0] + arr[n - 1];
        int totalSkill = 0;
        int totalteam = n / 2;
        for (int i = 0; i < totalteam; i++) {
            int pair = arr[i] + arr[n - i - 1];
            if (pair != teamSkillsum) {
                return -1;
            } else {
                int pairmulti = arr[i] * arr[n - 1 - i];
                totalSkill += pairmulti;
            }

        }
        return totalSkill;
    }
}

public class DividePlayer {

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5 };
        divide Divide = new divide();
        int result = Divide.work(arr);
        System.out.println(result);
    }
}