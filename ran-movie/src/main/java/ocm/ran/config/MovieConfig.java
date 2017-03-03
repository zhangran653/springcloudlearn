package ocm.ran.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MovieConfig {

    @Autowired
    IClientConfig config;

    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }

}
