package meuprojeto.reference.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Component;
import meuprojeto.reference.datatype.UserBean;

@Component
public class UserService {

    private static Map<UUID, UserBean> users = new HashMap<>();
    static{
        UserBean u1 = new UserBean(UUID.randomUUID(), "Jota");
        UserBean u2 =new UserBean(UUID.randomUUID(), "Idelsohn");
        UserBean u3 =new UserBean(UUID.randomUUID(), "Tom");
        UserBean u4 =new UserBean(UUID.randomUUID(), "Jão");
        UserBean u5 =new UserBean(UUID.randomUUID(), "Menghs");
        users.put(u1.getId(), u1);
        users.put(u2.getId(), u2);
        users.put(u3.getId(), u3);
        users.put(u4.getId(), u4);
        users.put(u5.getId(), u5);
    };
    public List<UserBean> listAll(){
        return new ArrayList<>(users.values());
    }
    public UserBean findby(UUID id){
       return users.get(id);
    }
    public UserBean create(UserBean user){
        if(user.getId() == null){
            user.setId(UUID.randomUUID());
        }
        users.put(user.getId(), user);
        return user;
    }
    public void delete(UUID id) {
        users.remove(id);
    }
}
