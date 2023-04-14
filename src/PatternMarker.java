public class PatternMarker {
    public static void main(String[] args) {
        PatternMarker stripes = new PatternMarker();
    }

    public PatternMarker() {
        System.out.println("Hi pattern maker");
//        pattern1();
        pattern6();
    }

    public void pattern1() {
        for (int x = 0; x < 6; x++) {
//            for (int y = 0; y < 5; y++) {
            System.out.println(x * 5);
            //}
        }
    }

    public void pattern2() {
        for (int x = 0; x < 6; x++) {
            System.out.println(2 + x * 5);
        }
    }

    public void pattern3() {
        for (int x = 21; x >0; x=x-4) {
            System.out.print(x +"\t");
        }
    }
    public void pattern4() {
        for (int w = 0; w<4; w++) {
            System.out.println();
            for (int c = 1; c <5; c++) {
            System.out.print(c + "\t");
        }

}
}
    public void pattern5() {
        for (int w = 1; w<5; w++) {
            for (int c = 1; c<=w; c++) {
                System.out.print(" ");
            }
                System.out.println(w);
            }

        }
    public void pattern6() {
        for (int w = 1; w<6; w++) {
            for (int c = 1; c<=w; c++) {
                System.out.print("");
            }
            System.out.println(w);
        }

    }
    }