package spring.pc.inter;

import javax.jws.WebService;

@WebService
public interface IHelloWorld {
    public String sayHello(String text,int cout);
}
