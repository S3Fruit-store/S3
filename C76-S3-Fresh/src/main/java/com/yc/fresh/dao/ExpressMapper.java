package com.yc.fresh.dao;

import com.yc.fresh.bean.Express;
import com.yc.fresh.bean.ExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExpressMapper {
    long countByExample(ExpressExample example);

    int deleteByExample(ExpressExample example);

    int deleteByPrimaryKey(Integer eid);

    int insert(Express record);

    int insertSelective(Express record);

    List<Express> selectByExample(ExpressExample example);

    Express selectByPrimaryKey(Integer eid);

    int updateByExampleSelective(@Param("record") Express record, @Param("example") ExpressExample example);

    int updateByExample(@Param("record") Express record, @Param("example") ExpressExample example);

    int updateByPrimaryKeySelective(Express record);

    int updateByPrimaryKey(Express record);
}