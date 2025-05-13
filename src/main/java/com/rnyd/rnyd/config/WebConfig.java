package com.rnyd.rnyd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 🛠 Esto sirve los archivos PDF desde la carpeta local "public/uploads" en la ruta "/uploads/**"
        registry.addResourceHandler("/uploads/**")
                .addResourceLocations("file:public/uploads/");
    }
}
