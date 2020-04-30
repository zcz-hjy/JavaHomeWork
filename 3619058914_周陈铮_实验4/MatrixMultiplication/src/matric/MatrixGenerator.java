package matric;

public class MatrixGenerator {
    public static Matrix initalMatrix(int row, int col){
        Matrix matrix1 = new Matrix(row, col);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
              int value =  (int)(Math.random()*10);
              matrix1.setMatrix(i, j, value);
            }
        }
        return matrix1;
    }
}
