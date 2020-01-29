package com.zxj.helloworld.mvcapp.export.result;

import com.zxj.helloworld.mvcapp.export.vo.CustomerVO;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class InsertCustomerResult {
    /**
     *
     */
    private Integer customerId;

    /**
     *
     */
    private List<CustomerVO> customerVOList;
}
