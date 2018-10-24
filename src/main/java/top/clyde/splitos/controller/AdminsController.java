package top.clyde.splitos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.clyde.splitos.pojo.Admins;
import top.clyde.splitos.service.AdminsService;

import java.util.List;

@RestController
@RequestMapping("/admin")
@SuppressWarnings("all")
public class AdminsController {
    @Autowired
    public AdminsService adminsService;

    @GetMapping("/all")
    @ResponseBody
    public List<Admins> getAll(){
        return  adminsService.findAll();
    }
    @GetMapping("/one")
    @ResponseBody
    public Admins getone(){
        return  adminsService.findOne();
    }

}
