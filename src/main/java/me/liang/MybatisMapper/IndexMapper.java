package me.liang.MybatisMapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

public interface IndexMapper extends BaseMapper<Map> {

    List<Map> selectVisitsList();

    List<Map> selectMyfwlList();

    List<Map> selectMrfwlList();

    List<Map> insertIntoFwl();
}
