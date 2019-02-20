package com.spx0315.utils;

import com.spx0315.model.User;
import com.spx0315.service.UserService;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

public class UserServlet extends BaseServlet {
    /**
     *  退出聊天室
     * @throws IOException
     */
    public String exit(HttpServletRequest request,HttpServletResponse response) throws IOException{
        // 获得session对象
        HttpSession session = request.getSession();
        // 将session销毁.
        session.invalidate();
        // 页面转向.
        response.sendRedirect(request.getContextPath()+"/login.jsp");
        return null;
    }

    /**
     * 实现登录
     */
    public String login(HttpServletRequest req,HttpServletResponse resp){
        // 接收数据
        Map map = req.getParameterMap();
        User user = new User();
        // 封装数据
        try {
            BeanUtils.populate(user, map);
            // 调用Service层处理数据
            UserService us = new UserService();
            User existUser = us.login(user);
            if (existUser == null) {
                // 用户登录失败
                req.setAttribute("message", "用户名或密码错误!");
                return "/hompage.jsp";
            } else {
                req.getSession().invalidate();
                Map<User, HttpSession> userMap;
                userMap = (Map<User, HttpSession>) getServletContext().getAttribute("userMap");
                if(userMap.containsKey(existUser)){
                    HttpSession session = userMap.get(existUser);
                    session.invalidate();
                }
                req.getSession().setAttribute("existUser", existUser);
                ServletContext application = getServletContext();

                String sourceMessage = "";

                if (null != application.getAttribute("message")) {
                    sourceMessage = application.getAttribute("message")
                            .toString();
                }

                sourceMessage += "系统公告：<font color='gray'>"
                        + existUser.getUsername() + "走进了聊天室！</font><br>";
                application.setAttribute("message", sourceMessage);

                resp.sendRedirect(req.getContextPath() + "/main.jsp");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
