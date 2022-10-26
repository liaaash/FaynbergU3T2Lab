public class SelectionMadness {

    public SelectionMadness() { }

    public boolean flipCoin() {
        int num = (int) (Math.random() * 2) + 1;
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

    public int largest(int num1, int num2, int num3) {
        int big = num1;
        if (num2 > big) {
            big = num2;
        }
        if (num3 > big) {
            big = num3;
        }
        return big;
    }

    public boolean rightTriangle(int side1, int side2, int side3) {
        int a=0;
        int b=0;
        int c=0;
        if (side1 == largest(side1, side2, side3)) {
            a = side2;
            b = side3;
            c = side1;
        } else if (side2 == largest(side1, side2, side3)) {
            a = side1;
            b = side3;
            c = side2;
        } else if (side3 == largest(side1, side2, side3)) {
            a = side1;
            b = side2;
            c = side3;
        }
        if (( (int) Math.pow(a, 2) + (int) Math.pow(b, 2)) == (int) Math.pow(c, 2)) {
            return true;
        } else {
            return false;
        }
    }

}
