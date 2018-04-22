package spring.pc.dao;


import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class webservice {
    public void testWebService(String name) {
        System.out.println("Test sucessfully, you input name is :" + name);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/webService/test", new webservice());
        System.out.println("webService pulish completed!");
    }
}
