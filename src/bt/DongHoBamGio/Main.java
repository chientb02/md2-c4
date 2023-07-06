package bt.DongHoBamGio;

public class Main {
    public static void main(String[] args) {
        long [] arr = new long[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (long) (Math.random()* 100000);
        }
        StopWatch stopWatch = new StopWatch();
        System.out.println("thời gian bắt đầu là:  "+stopWatch.start());
        selectionSort(arr);
        System.out.println("Thời gian kết thúc là:  "+stopWatch.stop());
        System.out.println("thời gian hoàn thành là:  " +stopWatch.getElapsedTime());
    }

    public static void selectionSort(long[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    long temp = arr[j];
                    arr[j] = arr[minIndex];
                    arr[minIndex] = temp;
                }
            }
        }
    }
}
