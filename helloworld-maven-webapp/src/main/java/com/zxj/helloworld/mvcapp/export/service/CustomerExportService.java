package com.zxj.helloworld.mvcapp.export.service;

import com.zxj.helloworld.mvcapp.export.param.CustomerParam;
import com.zxj.helloworld.mvcapp.export.result.GetCustomerResult;
import com.zxj.helloworld.mvcapp.export.result.Result;
import com.zxj.helloworld.mvcapp.export.vo.CustomerVO;

/**
 *
 */
public interface CustomerExportService {
    /**
     * 获取Customer列表
     * @param customerParam
     * @return
     */
    Result<GetCustomerResult> getCustomerList(CustomerParam customerParam);

    /**
     * 获取单个Customer的信息
     * @param customerParam
     * @return
     */
    Result<CustomerVO> getCustomerInfo(CustomerParam customerParam);

}
