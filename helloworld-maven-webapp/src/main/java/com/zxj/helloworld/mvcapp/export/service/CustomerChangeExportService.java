package com.zxj.helloworld.mvcapp.export.service;

import com.zxj.helloworld.mvcapp.export.param.CustomerChangeParam;
import com.zxj.helloworld.mvcapp.export.result.DeleteCustomerResult;
import com.zxj.helloworld.mvcapp.export.result.InsertCustomerResult;
import com.zxj.helloworld.mvcapp.export.result.Result;
import com.zxj.helloworld.mvcapp.export.result.UpdateCustomerResult;

/**
 *
 */
public interface CustomerChangeExportService {

    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<InsertCustomerResult> insertCustomer(CustomerChangeParam customerChangeParam);

    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<UpdateCustomerResult> updateCustomer(CustomerChangeParam customerChangeParam);

    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<DeleteCustomerResult> deleteCustomer(CustomerChangeParam customerChangeParam);



    //------------------  下面  ------------------
    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<Integer> addCustomerInfo(CustomerChangeParam customerChangeParam);

    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<Boolean> updateCustomerInfo(CustomerChangeParam customerChangeParam);

    /**
     *
     * @param customerChangeParam
     * @return
     */
    Result<Boolean> deleteCustomerInfo(CustomerChangeParam customerChangeParam);
}
