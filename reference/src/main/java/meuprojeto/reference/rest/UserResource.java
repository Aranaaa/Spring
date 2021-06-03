package meuprojeto.reference.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import meuprojeto.reference.datatype.UserBean;
import meuprojeto.reference.service.UserService;

@RestController
public class UserResource {
    @Autowired
    private UserService userService;
@GetMapping(path = "/users")
    public List<UserBean> listAll(){
        return userService.listAll();
    }

}

