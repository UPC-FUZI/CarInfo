package com.junbo.platform.outer.controller;

import com.junbo.platform.outer.mapper.SellerCarInfoMapper;
import com.junbo.platform.outer.model.SellerCarInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @AUTHOR Zhong Xingfu
 * @DATE 2018/4/27 15:52
 * @Explain
 */
@RestController
@RequestMapping(value = "/saler/")
public class SalerCarController {

    @Autowired
    SellerCarInfoMapper sellerCarInfoMapper;

    @RequestMapping(value = "/submitCarInfo", method = RequestMethod.POST)
    public String getInfo(@RequestBody SellerCarInfo sellerCarInfo){
        sellerCarInfo.setWxUserId("2120");
        sellerCarInfo.setCreateTime(Date.valueOf(LocalDate.now()));
        sellerCarInfo.setIsContacted(false);
        sellerCarInfoMapper.insert(sellerCarInfo);
        return "ZXF";
    }
}
