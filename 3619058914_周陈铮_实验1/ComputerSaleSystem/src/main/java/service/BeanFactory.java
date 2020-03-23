package service;

import service.Impl.Seagate;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties pro;
    private static Map<String, Object> beans;

    static {
        try {
            pro = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("BeanFactory.properties");
            pro.load(in);
            Enumeration keys = pro.keys();
            beans = new HashMap<String, Object>();
            while(keys.hasMoreElements()){
                String key = keys.nextElement().toString();
                String beanPath = pro.getProperty(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key, value);
            }
        }catch(Exception e){
            throw new ExceptionInInitializerError("初始化失败");
        }
    }

    public static Object getBean(String key){
        return beans.get(key);
    }

}
