package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0, second=1;
        if (lastFibonacci == 1){
            System.out.println(0);
        }else if (lastFibonacci >= 2){
            System.out.println(0);
            System.out.println(1);
        }
        for (int i=2; i<lastFibonacci; i++){
            System.out.println(first+second);
            second += first;
            first = second - first;
        }
    }
}
