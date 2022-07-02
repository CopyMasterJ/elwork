package me.liang.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author Liang
 * @version V1.0
 * @Title: MybatisPlusConfig
 * @Package el-admin
 * @Description: TODO(配置分页插件)
 * @date 2021/10/12 21:20
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
