package com.risker.manageshared.service;

import com.risker.allshared.model.ResultModel;
import com.risker.allshared.model.paging.PagingResultModel;
import com.risker.manageshared.model.User;

import java.util.List;

/**
 * Created by myz on 16/8/25.
 */
public interface IUserQueryService {

    public PagingResultModel<User> queryAll();
}
