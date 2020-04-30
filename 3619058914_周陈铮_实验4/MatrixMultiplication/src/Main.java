import matric.Matrix;
import matric.MatrixGenerator;

public class Main {
    public static void main(String[] args) {

        Matrix matrixA = MatrixGenerator.initalMatrix(2000,100);
        Matrix matrixB = MatrixGenerator.initalMatrix(100,2000);


        MultiplyMatrix multiplyMatrix = new MultiplyMatrix(matrixA, matrixB);

        Result result1 = multiplyMatrix.notThread();
        Result result2 = multiplyMatrix.usedThread1();
        Result result3 = multiplyMatrix.usedThread2();

        /*System.out.println(result1.matrix);
        System.out.println(result2.matrix);
        System.out.println(result3.matrix);
*/
        print("串行计算", result1);
        print("奇数行、偶数行计算的时候分别启动一个线程", result2);
        print("在每行计算的时候都启动一个线程", result3);
    }
    private static void print(String heading, Result res){
        System.out.println(heading);
        System.out.println("用时： " + res.time + "毫微秒");
        System.out.println();
    }
}
