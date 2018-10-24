package top.clyde.splitos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.clyde.splitos.mapper.AdminsMapper;
import top.clyde.splitos.pojo.Admins;

import java.util.List;

@RestController
@RequestMapping("/admin")
@SuppressWarnings("all")
public class AdminsController {
    @Autowired
    public AdminsMapper adminsMapper;

    @GetMapping("/all")
    @ResponseBody
    public List<Admins> getAll(){
        return  adminsMapper.findAll();
    }
    @GetMapping("/one")
    public Admins getone(){
        return  adminsMapper.findOne();
    }

}
