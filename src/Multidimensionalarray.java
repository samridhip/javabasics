public class Multidimensionalarray {
    public static void main(String[] args) {
        int[] marks = {45,60,70,60,79,90};
        int[] grade = new int[6];
        for(int i = 0;i<marks.length;i++){
            grade[i] = marks[i];
        }

        for(int i=0;i<grade.length;i++){
            System.out.println(grade[i]);
        }

    }



}
