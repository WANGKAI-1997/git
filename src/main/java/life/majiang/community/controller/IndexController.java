package life.majiang.community.controller;

import life.majiang.community.mapper.UserMapper;
import life.majiang.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 王凯
 * @version 1.0
 * @date 2019/12/13 21:33
 */
@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;
   @GetMapping("/")
    public String index(HttpServletRequest request){
       Cookie[] cookies = request.getCookies();
       for (Cookie cookie : cookies) {
           if(cookie.getName().equals("token")){
               String token = cookie.getValue();
               User user = userMapper.findbyToken(token);
               if(user!=null){
                   request.getSession().setAttribute("user",user);
               }
               break;
           }
       }
       return "index";
    }
}
