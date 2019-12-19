package index;

// 2차원 배열(4x4) 생성 및 출력
// 가변배열(계단식) 생성 및 출력
public class TPC02 {

    // Two Dimentional array
    public static void printTwoDimention() {
        int[][] arr = new int[5][4];
        int element;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 4;
                element = arr[i][j];
                System.out.printf("%d\t", element);
            }
            System.out.println();
        }
    }

    // Variable length array
    public static void printVarArray() {
        String[][] arr = new String[4][];
        // Create variable array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new String[i + 1];
        }
        // Assign value and print elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = "*";
                System.out.printf("%s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTwoDimention();
        printVarArray();
    }

}
