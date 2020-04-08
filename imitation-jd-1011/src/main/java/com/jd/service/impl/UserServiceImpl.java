package com.jd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jd.dao.UserMapper;
import com.jd.pojo.user;
import com.jd.service.UserService;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description
 * @author: Specime
 * @date:2020/4/7
 */

@Service
@AutoConfigureAfter({UserMapper.class})
public class UserServiceImpl extends ServiceImpl<UserMapper, user> implements UserService {

}
