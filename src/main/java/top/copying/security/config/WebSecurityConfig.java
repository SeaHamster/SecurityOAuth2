package top.copying.security.config;

import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

/**
 * 简单配置Security
 * 在配置{@ResourceServerConfigurerAdapter 资源服务器配置适配器}后此配置失效
 *
 * 将自动应用从{@link SpringFactoriesLoader}中查找{@link AbstractHttpConfigurer}的结果，以允许
 * 开发人员扩展默认值。
 * 为此，您必须创建一个扩展AbstractHttpConfigurer的类，然后在“ META-INF / spring.factories”的类路径中创建一个类似于以下内容的文件：
 */
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{

    }


}
