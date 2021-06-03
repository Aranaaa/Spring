package meuprojeto.reference.rest;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import meuprojeto.reference.datatype.MessageBean;

@RestController
public class HelloResource {
    
    //@RequestMapping(method = RequestMethod.GET, path = "/hello")
    @GetMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping (path = "/html")
    public String html(){
        return "<b>Hello World</b>: Feliz";
    }
    @GetMapping(path = "/mensagem")
    public MessageBean message(){
        MessageBean m = new MessageBean();
        m.setMessage("salve");
        return m ;
    }
}
