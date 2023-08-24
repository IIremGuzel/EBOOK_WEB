package com.iremguzel.eBook.config;
import com.iremguzel.eBook.entity.Books;
import com.iremguzel.eBook.entity.BooksCategory;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};

        // Disable HTTP methods for Books: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(Books.class)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

        // Disable HTTP methods for BooksCategory: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(BooksCategory.class)
                .withItemExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metadata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

        // Allow CORS for all mappings
        cors.addMapping("/**")
               .allowedOrigins("http://localhost:4200") // Replace with your Angular app's URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);

        /*
        // Allow CORS for all mappings
        cors.addMapping("/**")
                .allowedOrigins("*") // Allow all origins
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true);
                */

    }
}

