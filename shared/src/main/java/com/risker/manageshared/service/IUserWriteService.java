package com.risker.manageshared.service;

import com.risker.manageshared.model.User;

/**
 * Created by myz on 16/8/25.
 */
public interface IUserWriteService {

    public Integer insert(User user);

    public Integer update(User user);
}
