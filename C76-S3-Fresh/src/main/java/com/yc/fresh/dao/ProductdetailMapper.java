package com.yc.fresh.dao;

import com.yc.fresh.bean.Productdetail;
import com.yc.fresh.bean.ProductdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductdetailMapper {
    long countByExample(ProductdetailExample example);

    int deleteByExample(ProductdetailExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Productdetail record);

    int insertSelective(Productdetail record);

    List<Productdetail> selectByExample(ProductdetailExample example);

    Productdetail selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);

    int updateByExample(@Param("record") Productdetail record, @Param("example") ProductdetailExample example);

    int updateByPrimaryKeySelective(Productdetail record);

    int updateByPrimaryKey(Productdetail record);
}