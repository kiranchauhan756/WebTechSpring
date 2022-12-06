package ApiProgram.SpringApiProgramspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("depreciation")
@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{
	 @Override
	  public void addCorsMappings(CorsRegistry registry) {
	    registry.addMapping("/**").allowedOrigins("*");
	  }
}
