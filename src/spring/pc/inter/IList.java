package spring.pc.inter;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface IList {

    public List<String> selectlist(String s);
}
