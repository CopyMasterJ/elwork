package me.liang.serviceimpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.liang.service.IndexService;
import me.liang.MybatisMapper.IndexMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Liang
 * @version V1.0
 * @Title: IndexServiceImpl
 * @Package el-admin
 * @Description: 首页展示信息查询接口实现类
 * @date 2021/10/12 21:30
 */
@Service
public class IndexServiceImpl extends ServiceImpl<IndexMapper, Map> implements IndexService {

    @Autowired
    private IndexMapper indexMapper;

    /**
     * @Title: selectVisitsList
     * @Description: 接口访问量查询实现
     * * @param null:
     * * @return: List<Map>
     * @date: 2021/10/27 10:40
     */
    @Override
    public List<Map> selectVisitsList() {
        return indexMapper.selectVisitsList();
    }
    /**
     * @Title: selectMyfwlList
     * @Description: 每月访问量展示查询实现
     * * @return: List<Map>
     * @date: 2021/10/27 10:40
     */
    @Override
    public List<Map> selectMyfwlList() {
        return indexMapper.selectMyfwlList();
    }
    /**
     * @Title: selectMrfwlList
     * @Description: 每日访问量展示查询实现
     * * @return: List<Map>
     * @date: 2021/10/27 10:40
     */
    @Override
    public List<Map> selectMrfwlList() {
        return indexMapper.selectMrfwlList();
    }

    /**
     * @Title: selectMrfwlList
     * @Description: 调用访问量存储过程接口
     * * @return: List<Map>
     * @date: 2021/10/27 10:40
     */
    @Override
    public List<Map> insertIntoFwl() {
        return indexMapper.insertIntoFwl();
    }

}
