package fr.ccva.pepitlab.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = {"fr.ccva.pepitlab"})
@EnableWebMvc
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Bean
    public MessageSource getResourceBundleSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();

        source.setBasename("messages");

        return source;
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }

    @Override
    public void addInterceptors (InterceptorRegistry registry) {
        registry.addInterceptor(new UserInterceptor());
    }
}
