package school.mjc.stage0.loops.task3;

public class DigitsSum {
        public void printDigitsSum(int t){
        t = Math.abs(t);
        double l = Math.log10(t);
        int s = 0;
        for (int i = 0; i <= l; i++) {
            s += t % 10;
            t = t / 10;
        }
        System.out.println(s);
    }
}
