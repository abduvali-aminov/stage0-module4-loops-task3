package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int s=0, n=0;
        for (int i=1; i<=lengthOfLastNumber; i++){
            n += 9 * (int)Math.pow(10, i-1);
            s += n;
        }
        System.out.println(s);
    }
}
