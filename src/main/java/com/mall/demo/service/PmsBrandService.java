package com.mall.demo.service;

import com.mall.demo.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author: create by hongxin.xu
 * @date: 2022/8/15
 **/
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id,PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum,int pageSize);

    PmsBrand getBrand(Long id);
}
