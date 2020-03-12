package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

//通用Mapper需要加入泛型
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
