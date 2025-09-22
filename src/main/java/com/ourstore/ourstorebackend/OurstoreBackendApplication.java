// package com.ourstore.ourstorebackend;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// public class OurstoreBackendApplication {

//     public static void main(String[] args) {
//         SpringApplication.run(OurstoreBackendApplication.class, args);
//     }

// }

package com.ourstore.ourstorebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class OurstoreBackendApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OurstoreBackendApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(OurstoreBackendApplication.class);
    }
}
