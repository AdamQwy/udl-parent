package com.qwy.mapper;

import com.qwy.pojo.GrantInfo;
import com.qwy.pojo.GrantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrantInfoMapper {
    int countByExample(GrantInfoExample example);

    int deleteByExample(GrantInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrantInfo record);

    int insertSelective(GrantInfo record);

    List<GrantInfo> selectByExample(GrantInfoExample example);

    GrantInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrantInfo record, @Param("example") GrantInfoExample example);

    int updateByExample(@Param("record") GrantInfo record, @Param("example") GrantInfoExample example);

    int updateByPrimaryKeySelective(GrantInfo record);

    int updateByPrimaryKey(GrantInfo record);
}