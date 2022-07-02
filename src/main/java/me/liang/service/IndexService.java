package me.liang.service;


import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * @author Liang
 * @version V1.0
 * @Title: IndexService
 * @Package el-admin
 * @Description: 首页展示信息查询接口
 * @date 2021/10/12 21:30
 */
public interface IndexService extends IService<Map> {


    /**
     * @Title: selectVisitsList
     * @Description: 接口访问量查询接口
     * @date: 2021/10/27 10:38
     */
    List<Map> selectVisitsList();

    /**
     * @Title: selectMyfwlList
     * @Description: 每月访问量展示查询接口
     * @date: 2021/10/27 14:38
     */
    List<Map> selectMyfwlList();

    /**
     * @Title: selectMrfwlList
     * @Description: 每日访问量展示查询接口
     * @date: 2021/10/27 14:38
     */
    List<Map> selectMrfwlList();
    /**
     * @Title: insertIntoFwl
     * @Description: 调用访问量存储过程接口
     * @date: 2021/10/27 14:38
     */
    List<Map> insertIntoFwl();

}
