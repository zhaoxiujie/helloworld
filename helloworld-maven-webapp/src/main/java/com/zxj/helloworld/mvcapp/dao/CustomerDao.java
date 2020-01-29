package com.zxj.helloworld.mvcapp.dao;

import com.zxj.helloworld.mvcapp.domain.CustomerBO;

import java.util.List;

public interface CustomerDao {

    /**
     * 新增一条customer信息
     * @param customer
     * @return
     */
    boolean addCustomer(CustomerBO customer);

    /**
     * 更新一条customer的信息
     * @param customer
     * @return
     */
    boolean updateCustomerInfo(CustomerBO customer);

    /**
     * 获取所有的customer
     * @return
     */
    List<CustomerBO> getAllCustomsers();

    /**
     * 查询符合条件的customer列表
     * @param customer
     * @return
     */
    List<CustomerBO> getCustomersByParam(CustomerBO customer);

    /**
     * 根据Id，获取customer的详细信息
     * @param id
     * @return
     */
    CustomerBO getCustomerInfoById(Integer id);

    /**
     * 根据Id删除一条记录
     * @param id
     * @return
     */
    boolean deleteCustomerById(Integer id);

    /**
     * 获取和入参有相同Name的记录数
     * @param name
     * @return
     */
    int getCustomerNumByName(String name);
}
