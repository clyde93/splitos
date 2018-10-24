package top.clyde.splitos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.clyde.splitos.mapper.AdminsMapper;
import top.clyde.splitos.pojo.Admins;

import java.util.List;

@Service
public class AdminsService {
    @Autowired
    private AdminsMapper adminsMapper;

    public List<Admins> findAll(){
        return  adminsMapper.findAll();
    }

    public Admins findOne(){
        return  adminsMapper.findOne();
    }
}
