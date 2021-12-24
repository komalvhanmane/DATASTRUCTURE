import java.util.Scanner;

public class Matrixoperation {
    Scanner sc=new Scanner(System.in);
    public int[][] createMemory(){
        System.out.println("Enter the row Number");
        int row=sc.nextInt();
        int Matrix[][]=new int[row][];
        for(int i=0;i<row;i++){
            System.out.println("Enter the col number of "+(i+1));
            Matrix[i]=new int[sc.nextInt()];
        }
        return Matrix;
    }
    public void accept(int Matrix[][]){
        System.out.println("Lets Accept the Elements ");
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }
    }
    public void display(int Matrix[][]){
        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[i].length;j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void addition(int Mat1[][],int Mat2[][],int Mat3[][]){
        for(int i=0;i<Mat1.length;i++){
            for(int j=0;j<Mat1[i].length;j++){
                Mat3[i][j]=Mat1[i][j]+Mat2[i][j];
            }
        }
    }
    public boolean validateMatrix(int Mat1[][],int Mat2[][]){
        if(Mat1.length==Mat2.length){
            for(int i=0;i<Mat1.length;i++){
                if(Mat1[i].length==Mat2[i].length){
                    boolean b=true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public void transpose(int Mat1[][],int Mat2[][]){
        for(int i=0;i<Mat1.length;i++){
            for(int j=0;j<Mat1.length;j++){
                Mat2[i][j]=Mat1[j][i];
            }
        }
    }
}
