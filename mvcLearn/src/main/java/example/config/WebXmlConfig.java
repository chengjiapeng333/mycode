package example.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//扩展了AbstractAnnotationConfigDispatcherServletInitializer的类会自动配置DispatcherServlet和Spring应用程序上下文
//Spring的应用程序上下文会位于应用程序的Servlet 上下文中
public class WebXmlConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

    /*
     <context-param>
         <param-name>contextConfigLocation</param-name>
         <param-value>/WEB-INF/applicationContext.xml</param-value>
     </context-param>
     <listener>
         <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
     </listener>
      */
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {ApplicationContextXmlConfig.class};
    }

    /*
    <servlet>
        <servlet-name>springMVC</servlet-name>
        <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
        <init-param>
            <!--配置dispatcher.xml作为mvc的配置文件-->
            <param-name>contextConfigLocation</param-name>
            <param-value>/WEB-INF/dispatcher-servlet.xml</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
        <async-supported>true</async-supported>
    </servlet>
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {DispatcherServletXmlConfig.class};

    }

    /*
    <servlet-mapping>
        <servlet-name>springMVC</servlet-name>
        <url-pattern>/</url-pattern>
    </servlet-mapping>
     */
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

}
