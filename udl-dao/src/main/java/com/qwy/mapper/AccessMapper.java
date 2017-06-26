package com.qwy.mapper;

import com.qwy.pojo.Access;
import com.qwy.pojo.AccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessMapper {
    int countByExample(AccessExample example);

    int deleteByExample(AccessExample example);

    int deleteByPrimaryKey(Integer root);

    int insert(Access record);

    int insertSelective(Access record);

    List<Access> selectByExample(AccessExample example);

    Access selectByPrimaryKey(Integer root);

    int updateByExampleSelective(@Param("record") Access record, @Param("example") AccessExample example);

    int updateByExample(@Param("record") Access record, @Param("example") AccessExample example);

    int updateByPrimaryKeySelective(Access record);

    int updateByPrimaryKey(Access record);
}