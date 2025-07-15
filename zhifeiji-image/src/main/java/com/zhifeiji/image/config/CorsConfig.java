package com.zhifeiji.image.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:*") // 支持任意 localhost 端口
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true) // 如果前端需要携带 cookie
                .maxAge(3600);
    }

    @Bean
    public CorsFilter corsFilter() {
        // 1. 创建 CORS 配置对象
        CorsConfiguration config = new CorsConfiguration();
        // 允许哪些域访问（* = 所有域，但配合 allowCredentials 必须指定具体域）
        config.addAllowedOriginPattern("http://localhost:*"); // 支持任意 localhost 端口
        // 是否允许携带 Cookie
        config.setAllowCredentials(true);
        // 允许的请求方法
        config.addAllowedMethod("*"); // GET, POST, PUT, DELETE, OPTIONS 等
        // 允许的请求头
        config.addAllowedHeader("*");
        // 允许暴露的响应头
        config.addExposedHeader("*");

        // 2. 配置 URL 映射
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);

        // 3. 返回 CorsFilter
        return new CorsFilter(source);
    }
}

