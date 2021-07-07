package kr.re.kitri.springwebflux.route;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
@EnableWebFlux
public class WebConfig implements WebFluxConfigurer {

    @Bean
    public RouterFunction<ServerResponse> routerFunctionPost() {
        return route()
                .GET("/posts", accept(APPLICATION_JSON), null)
                .POST("/posts", accept(APPLICATION_JSON), null)
                .GET("/posts/{postId}", accept(APPLICATION_JSON), null)
                .DELETE("/posts/{postId}", accept(APPLICATION_JSON), null)
                .GET("/posts", accept(APPLICATION_JSON), null)
                .GET("/posts", accept(APPLICATION_JSON), null)
                .build();
    }
}
