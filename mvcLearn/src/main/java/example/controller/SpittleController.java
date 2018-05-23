package example.controller;

import example.pojo.Spitter;
import example.repo.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;


/**
 * Created by chengjiapeng on 2018/5/11.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") long spittleId, Model model) {
        model.addAttribute("spittle","123");
        return "spittles";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String postRegister(@Valid Spitter spitter,  Errors errors) throws IOException {
        if(errors.hasErrors()) {
            return "registerForm";
        }
       return "redirect:/spittles/spitter/"+spitter.getUsername();

    }

    @RequestMapping(value = "/spitter/{username}", method = RequestMethod.GET)
    public String profile(@PathVariable String username, Model model) {
        Spitter spitter = new Spitter(username, username, username, username);
        model.addAttribute("spitter", spitter);
        return "profile";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        if(file.isEmpty()) {
            return "文件为空";
        }else {
            file.transferTo(new File("d:/myfile/"+file.getOriginalFilename()));
            return "上传成功";
        }
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    @ResponseBody
    public String errorTest() {
        int i=1/0;
        return "错误";

    }

    //测试如何在重定向中保存数据
    @RequestMapping(value = "/testRedirect", method = RequestMethod.GET)
    public String testRedirect(RedirectAttributes model) {
        String username="zhangsan";
        Spitter spitter = new Spitter(username, username, username, username);
        model.addFlashAttribute("spitter", spitter);
        return "redirect:./checkRedirect";
    }

    @RequestMapping("/checkRedirect")
    public String check(Model model) {
        if(!model.containsAttribute("spitter")) {
            System.out.println("不存在");
        }
        return "profile";
    }

}
