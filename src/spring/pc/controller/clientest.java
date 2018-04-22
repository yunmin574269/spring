package spring.pc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.pc.inter.IHelloWorld;
import spring.pc.inter.IList;

import java.util.List;
import java.util.Properties;

public class clientest {
    public static void main(String agrs[]){
        Properties props = System.getProperties();
        props.setProperty("org.apache.cxf.stax.allowInsecureParser", "1");
        props.setProperty("UseSunHttpHandler", "true");
        ApplicationContext  ctx = new FileSystemXmlApplicationContext("web/WEB-INF/spring-client.xml");
        IHelloWorld client = (IHelloWorld) ctx.getBean("client");
        String result = client.sayHello("恽民", 28);
        System.out.println(result);

        IList l= (IList) ctx.getBean("list");
        List<String> re=l.selectlist("ssss");
        for(int x=0;x<re.size();x++){
            System.out.println(re.get(x));
        }
    }
}
