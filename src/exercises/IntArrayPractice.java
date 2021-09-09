package exercises;

public class IntArrayPractice {
    public static void main(String[] args) {
        int[] integerArr = {1, 1, 2, 3, 5, 8};

        for (int i : integerArr) {
            if (integerArr[i] % 2 != 0) {
                System.out.println(i);
            }
        }

    }
}