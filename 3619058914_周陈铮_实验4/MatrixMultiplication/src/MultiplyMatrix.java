import matric.Matrix;
import matric.MatrixGenerator;

import java.util.ArrayList;
import java.util.List;

public class MultiplyMatrix {

    private Matrix matrixA;
    private Matrix matrixB;
    private int row ;
    private int col ;
    private Matrix res;
    public MultiplyMatrix(Matrix matrixA, Matrix matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.row = matrixA.getRow();
        this.col = matrixB.getCol();
        this.res = MatrixGenerator.initalMatrix(row,col);
    }

    //串行
    public Result notThread(){
        long startTime = System.nanoTime();

        for(int i = 0; i < row; i++){
            countEachRow(i);
        }

        long endTime = System.nanoTime();
        return new Result(endTime - startTime, res);
    }

    //并行一
    public Result usedThread1(){

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < row; i = i + 2){
                countEachRow(i);
            }

        });

        Thread thread2 = new Thread(() -> {
            for(int i = 1; i < row; i = i + 2){
               countEachRow(i);
            }
        });

        long startTime = System.nanoTime();
        try {
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        return new Result(endTime - startTime, res);
    }

    //并行二
    public Result usedThread2(){
        List<Thread> list = new ArrayList<>();
        for(int i = 0; i < row; i++){
            int tempRow = i;
            list.add(new Thread(() ->  countEachRow(tempRow)));
        }
        long startTime = System.nanoTime();
        for(Thread thread: list){
            thread.start();
        }
        for(Thread thread: list){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.nanoTime();

        return new Result(endTime - startTime, res);
    }

    private void countEachRow(int i){
        for(int j = 0; j < col; j++){
            int temp = 0;
            for(int k = 0; k < matrixA.getCol(); k++){
                temp += matrixA.getMatrix(i, k) * matrixB.getMatrix(k, j);
            }
            res.setMatrix(i, j, temp);
        }
    }


}


