package matric;

import java.util.Arrays;

public class Matrix {
    private int row;
    private int col;
    private double[][] myMatrix;

    protected Matrix(int row, int col){
        this.row = row;
        this.col = col;
        myMatrix = new double[row][col];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public double getMatrix(int i, int j) {
        return myMatrix[i][j];
    }

    public void setMatrix(int i, int j, int value) {
        this.myMatrix[i][j] = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                stringBuilder.append(String.format("%f5.1\t", myMatrix[i][j]));
            }
            stringBuilder.append(String.format("\n"));

        }
        return stringBuilder.append(String.format("\n")).toString();
    }
}
