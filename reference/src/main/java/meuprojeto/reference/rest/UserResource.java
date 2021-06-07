package meuprojeto.reference.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

@GetMapping(path = "/users/{id}")
public UserBean findBy(@PathVariable UUID id){
    return userService.findby(id);
}

@PostMapping(path = "/users")
public void save(@RequestBody UserBean user){
    userService.create(user);
}
@DeleteMapping(path = "/users/{id}")
public void deleteBy(@PathVariable UUID id){
    userService.delete(id);
}
}

