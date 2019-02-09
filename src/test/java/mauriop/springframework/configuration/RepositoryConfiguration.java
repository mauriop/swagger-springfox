package mauriop.springframework.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"mauriop.springframework.domain"})
@EnableJpaRepositories(basePackages = {"mauriop.springframework.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
