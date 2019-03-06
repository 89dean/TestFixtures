package Question2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring {

    @Bean(name = "prototype")
    public Lion getService() {return new Lion();}

}
