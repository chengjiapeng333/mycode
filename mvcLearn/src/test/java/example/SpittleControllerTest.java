package example;

import example.controller.SpittleController;
import example.pojo.Spitter;
import example.pojo.Spittle;
import example.repo.SpittleRepository;
import example.repo.impl.SpittleRepositoryImpl;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by chengjiapeng on 2018/5/17.
 */
public class SpittleControllerTest {
    @Test
    public void testSpittle() throws Exception {
        SpittleRepository dao = new SpittleRepositoryImpl();
        SpittleController controller = new SpittleController(dao);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/12345"))
                .andExpect(view().name("spittles"))
                .andExpect(model().attributeExists("spittle"))
                .andExpect(model().attribute("spittle", "123"));
    }

    @Test
    public void registerFormTest() throws Exception {
        SpittleRepository dao = new SpittleRepositoryImpl();
        SpittleController controller = new SpittleController(dao);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spittles/register")).andExpect(view().name("registerForm"));
    }

    @Test
    public void registProcessTest() throws Exception {
        SpittleRepository dao = new SpittleRepositoryImpl();
        SpittleController controller = new SpittleController(dao);
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(post("/spittles/register")
                .param("firstName", "zhangsan")
                .param("lastName", "zhangsan")
                .param("username", "zhangsan")
                .param("password", "zhangsan")).andExpect(redirectedUrl("/spittles/spitter/zhangsan"));
    }
}
