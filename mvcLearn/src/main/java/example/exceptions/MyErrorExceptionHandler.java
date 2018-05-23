package example.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chengjiapeng on 2018/5/23.
 */
@ControllerAdvice
public class MyErrorExceptionHandler {
    public static final String MY_ERROR_VIEW="error";

    @ExceptionHandler(value=Exception.class)
    public Object errorrHandler(HttpServletRequest req, HttpServletResponse res, Exception e) {
        e.printStackTrace();
        ModelAndView mav = new ModelAndView();
        mav.addObject("url", req.getRequestURL());
        mav.addObject("exception", e);
        mav.setViewName(MY_ERROR_VIEW);
        return mav;
    }
}
