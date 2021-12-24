public class Matrix {
    public static void main(String[] args) {
        Matrixoperation m=new Matrixoperation();
        int Mat1[][]=m.createMemory();
        int Mat2[][]=m.createMemory();
        if(m.validateMatrix(Mat1,Mat2)){
            int Mat3[][]=new int[Mat1.length][];
            for(int i=0;i<Mat1.length;i++){
                Mat3[i]=new int[Mat1[i].length];
            }
            System.out.println("Enter the Elements in matrix 1 :");
            m.accept(Mat1);
            System.out.println("Enter the Elements in Matrix 2 :");
            m.accept(Mat2);
            m.addition(Mat1,Mat2,Mat3);
            System.out.println("Matrix 1 :");
            m.display(Mat1);
            System.out.println("Matrix 2 :");
            m.display(Mat2);
            System.out.println("Matrix 3 Addition :");
            m.display(Mat3);
        }
        else{
            System.out.println("Addition not possible");
        }
        System.out.println("Now Lets see the Transpose");
    }
}
