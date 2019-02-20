package com.spx0315;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet  extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=utf-8");

        // 例如：http://localhost:8080/demo1/xxx?method=login
        String methodName = req.getParameter("method");// 它是一个方法名称

        // 当没用指定要调用的方法时，那么默认请求的是execute()方法。
        if(methodName == null || methodName.isEmpty()) {
            methodName = "execute";
        }
        Class c = this.getClass();
        try {
            // 通过方法名称获取方法的反射对象
            Method m = c.getMethod(methodName, HttpServletRequest.class,
                    HttpServletResponse.class);

            String result = (String) m.invoke(this, req, res);

            if(result != null && !result.isEmpty()) {
                req.getRequestDispatcher(result).forward(req, res);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
