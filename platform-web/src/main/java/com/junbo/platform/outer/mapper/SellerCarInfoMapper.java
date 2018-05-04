package com.junbo.platform.outer.mapper;

import com.junbo.platform.outer.model.SellerCarInfo;
import com.junbo.platform.outer.model.SellerCarInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SellerCarInfoMapper {
    long countByExample(SellerCarInfoExample example);

    int deleteByExample(SellerCarInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellerCarInfo record);

    int insertSelective(SellerCarInfo record);

    List<SellerCarInfo> selectByExample(SellerCarInfoExample example);

    SellerCarInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellerCarInfo record, @Param("example") SellerCarInfoExample example);

    int updateByExample(@Param("record") SellerCarInfo record, @Param("example") SellerCarInfoExample example);

    int updateByPrimaryKeySelective(SellerCarInfo record);

    int updateByPrimaryKey(SellerCarInfo record);
}