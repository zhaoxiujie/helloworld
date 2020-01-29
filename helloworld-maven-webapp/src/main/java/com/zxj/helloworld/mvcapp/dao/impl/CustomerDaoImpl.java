package com.zxj.helloworld.mvcapp.dao.impl;

import com.zxj.helloworld.mvcapp.dao.CustomerDao;
import com.zxj.helloworld.mvcapp.domain.CustomerBO;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    /**
     * 新增一条customer信息
     *
     * @param customer
     * @return
     */
    @Override
    public boolean addCustomer(CustomerBO customer) {
        return false;
    }

    /**
     * 更新一条customer的信息
     *
     * @param customer
     * @return
     */
    @Override
    public boolean updateCustomerInfo(CustomerBO customer) {
        return false;
    }

    /**
     * 获取所有的customer
     *
     * @return
     */
    @Override
    public List<CustomerBO> getAllCustomsers() {
        return null;
    }

    /**
     * 查询符合条件的customer列表
     *
     * @param customer
     * @return
     */
    @Override
    public List<CustomerBO> getCustomersByParam(CustomerBO customer) {
        return null;
    }

    /**
     * 根据Id，获取customer的详细信息
     *
     * @param id
     * @return
     */
    @Override
    public CustomerBO getCustomerInfoById(Integer id) {
        return null;
    }

    /**
     * 根据Id删除一条记录
     *
     * @param id
     * @return
     */
    @Override
    public boolean deleteCustomerById(Integer id) {
        return false;
    }

    /**
     * 获取和入参有相同Name的记录数
     *
     * @param name
     * @return
     */
    @Override
    public int getCustomerNumByName(String name) {
        return 0;
    }
}
