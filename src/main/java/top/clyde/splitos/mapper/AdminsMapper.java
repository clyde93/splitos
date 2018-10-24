package top.clyde.splitos.mapper;

import top.clyde.splitos.pojo.Admins;

import java.util.List;


public interface AdminsMapper {
    List<Admins> findAll();
    Admins findOne();
}
