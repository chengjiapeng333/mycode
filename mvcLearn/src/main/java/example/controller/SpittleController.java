package example.controller;

import example.pojo.Spitter;
import example.pojo.Spittle;
import example.repo.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import java.util.Date;

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
    public String postRegister(Spitter spitter) {
        return "redirect:/spittles/spitter/"+spitter.getUsername();
    }

    @RequestMapping(value = "/spitter/{username}", method = RequestMethod.GET)
    public String profile(@PathVariable String username, Model model) {
        System.out.println("444444444444444");
        Spitter spitter = new Spitter(username, username, username, username);
        model.addAttribute("spitter", spitter);
        return "profile";
    }
}
