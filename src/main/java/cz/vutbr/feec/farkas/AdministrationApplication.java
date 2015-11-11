package cz.vutbr.feec.farkas;

import com.mangofactory.swagger.plugin.EnableSwagger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by frant on 11/11/15.
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableSwagger
public class AdministrationApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdministrationApplication.class);
    }


}
