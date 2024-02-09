package LOCSearch.config;

import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Collections;

@Configuration

public class ApiDocConfig {
@Bean
    public OpenAPI usersMicroserviceAPI(){
   OpenAPI info = new OpenAPI();//.info(new Info().title("s").description("loc api").version("idk"));
    return info;
    }

}
