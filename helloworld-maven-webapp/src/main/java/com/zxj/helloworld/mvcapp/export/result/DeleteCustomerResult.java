package com.zxj.helloworld.mvcapp.export.result;

import com.zxj.helloworld.mvcapp.export.vo.CustomerVO;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class DeleteCustomerResult {
    /**
     *
     */
    private List<CustomerVO> customerVOList;
}
