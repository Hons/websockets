package hons.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@Configuration
@EnableWebMvc
@EnableWebSocket
@ComponentScan("hons")
public class ApplicationSetup {

}
