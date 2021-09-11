package chapter4;

public class Q2 {

    public static void main(String[] args) {
        new Diamond(5);
        new Diamond(8);
        new Diamond(11);
    }

    static void print(String f) {
        System.out.println(f);
    }

    void test() {
        print("  *  ");
        print(" *** ");
        print("*****");
        print(" *** ");
        print("  *  ");
    }

}

class Diamond {

    public Diamond(int maxSize) {
        if (!isValid(maxSize)) {
            return;
        }

        make(maxSize);
    }

    private void make(int size) {
        int top = 1;
        while (top < size) {

            StringBuilder line = new StringBuilder();
            line.append("|");

            int aSide = (size - top) / 2;
            for (int i = 0; i < aSide; i++) {
                line.append(" ");
            }

            // 중간별 갯수.
            for (int i = 0; i < top; i++) {
                line.append("*");
            }

            for (int i = 0; i < aSide; i++) {
                line.append(" ");
            }
            line.append("|");
            System.out.println(line);
            top += 2;
        }

        StringBuilder middle = new StringBuilder();
        // 중간별 갯수.
        middle.append("|");
        for (int i = 0; i < size; i++) {
            middle.append("*");
        }
        middle.append("|");
        System.out.println(middle);


        top = top -2 ;
        while (top > 0) {
            StringBuilder line = new StringBuilder();
            line.append("|");

            int aSide = (size - top) / 2;
            for (int i = 0; i < aSide; i++) {
                line.append(" ");
            }

            // 중간별 갯수.
            for (int i = 0; i < top; i++) {
                line.append("*");
            }

            for (int i = 0; i < aSide; i++) {
                line.append(" ");
            }
            line.append("|");
            System.out.println(line);

            top -= 2;
        }
    }

    private boolean isValid(int maxSize) {
        if (maxSize < 3) {
            System.out.println("NAY");
            return false;
        }

        boolean isEvenNumber = (maxSize % 2) == 0;
        if (isEvenNumber) {
            System.out.println("You can only use oddNumber");
            return false;
        }

        return true;
    }
}