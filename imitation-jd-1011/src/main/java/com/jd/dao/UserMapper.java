package com.jd.dao;

import com.jd.SuperMapper;
import com.jd.pojo.user;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description
 * @author: Specime
 * @date:2020/4/7
 */
@Mapper
public interface UserMapper extends SuperMapper<user> {

}
