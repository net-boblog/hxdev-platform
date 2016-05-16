package cn.hxdev.platform.filter;

import javax.annotation.Resource;
import javax.servlet.*;
import javax.transaction.UserTransaction;
import java.io.IOException;

/**
 * Created by myhtls on 16/5/3.
 */
public class HxdevConnectionFilter implements Filter {

    @Resource
    private UserTransaction utx;


    @Override
    public  void destroy(){}

    @Override
    public void init(FilterConfig arg0) throws ServletException{}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try{

            utx.begin();
            filterChain.doFilter(servletRequest,servletResponse);
            utx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
