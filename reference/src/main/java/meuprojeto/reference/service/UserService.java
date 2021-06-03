package meuprojeto.reference.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;
import meuprojeto.reference.datatype.UserBean;

@Component
public class UserService {

    private static List<UserBean> users = new ArrayList<>() {{
        add(new UserBean(UUID.randomUUID(), "Jota"));
       
    }};
    public List<UserBean> listAll(){
        return users;
    }
    
}
