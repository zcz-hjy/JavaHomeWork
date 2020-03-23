import service.BeanFactory;
import service.Computer;
import service.Cpu;
import service.Impl.Amd;
import service.Impl.Intel;

public class MyTest {
    public static void main(String[] args) {

        System.out.println(BeanFactory.getBean("WestDigital"));
    }
}
