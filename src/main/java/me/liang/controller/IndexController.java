package me.liang.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import me.liang.service.IndexService;
import me.zhengjie.annotation.AnonymousAccess;
import me.liang.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author Liang
 * @version V1.0
 * @Title: IndexController
 * @Package el-admin
 * @Description: 首页展示信息查询控制器
 * @date 2021/10/12 21:28
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/IndexController")
@Api(tags = "查询：首页展示信息查询控制器")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @AnonymousAccess
    @ApiOperation("接口访问量查询")
    @RequestMapping("/selectVisitsList")
    public R selectVisitsList() {
        List<Map> visits = indexService.selectVisitsList();
        return new R<>(visits);
    }

    @AnonymousAccess
    @ApiOperation("接口月访问量图表查询")
    @RequestMapping("/selectMyfwlList")
    public R selectMyfwlList() {
        List<Map> visits = indexService.selectMyfwlList();
        return new R<>(visits);
    }
    @AnonymousAccess
    @ApiOperation("接口日访问量图表查询")
    @RequestMapping("/selectMrfwlList")
    public R selectMrfwlList() {
        List<Map> visits = indexService.selectMrfwlList();
        return new R<>(visits);
    }
}
