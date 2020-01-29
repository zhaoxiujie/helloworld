package com.zxj.helloworld.mvcapp.service;

import com.zxj.helloworld.mvcapp.base.exception.EngineRuntimeException;
import com.zxj.helloworld.mvcapp.dao.CustomerDao;
import com.zxj.helloworld.mvcapp.dao.impl.CustomerDaoImpl;
import com.zxj.helloworld.mvcapp.domain.CustomerBO;
import com.zxj.helloworld.mvcapp.export.param.CustomerParam;
import com.zxj.helloworld.mvcapp.export.result.GetCustomerResult;
import com.zxj.helloworld.mvcapp.export.result.Result;
import com.zxj.helloworld.mvcapp.export.service.CustomerExportService;
import com.zxj.helloworld.mvcapp.export.vo.CustomerVO;

public class CustomerExportServiceImpl implements CustomerExportService {
    /**
     * 获取Customer列表
     *
     * @param customerParam
     * @return
     */
    @Override
    public Result<GetCustomerResult> getCustomerList(CustomerParam customerParam) {
        return null;
    }

    /**
     * 获取单个Customer的信息
     *
     * @param customerParam
     * @return
     */
    @Override
    public Result<CustomerVO> getCustomerInfo(CustomerParam customerParam) {
        Result<CustomerVO> result=new Result<>();

        CustomerDao customerDao=new CustomerDaoImpl();

        try {
            //
            CustomerBO customerBO=customerDao.getCustomerInfoById(customerParam.getCustomerId());
            //BO 转 VO (实际应该DO转BO，BO再转VO)
            CustomerVO customerVO = convertToCustomerVO(customerBO);
            result.setResultInfo(customerVO);
            result.setResultCode("0000");
        }catch (EngineRuntimeException e){
            //异常日志Log
            result.setResultCode("0001");
        }catch (Exception ex){
            result.setResultCode("0002");
        }
        return result;
    }

    /**
     *
     * @param customerBO
     * @return
     */
    private CustomerVO convertToCustomerVO(CustomerBO customerBO){
        CustomerVO customerVO=new CustomerVO();
        customerVO.setId(customerBO.getId());
        customerVO.setName(customerBO.getName());

        return customerVO;
    }
}
