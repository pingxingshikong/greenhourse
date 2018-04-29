package com.i1314i.greenhourse.config;

/**
 * @author 平行时空
 * @created 2018-04-04 23:12
 **/

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;

@Configuration
@PropertySource(value="classpath:dao.properties",encoding = "UTF-8")

@MapperScan("com.i1314i.greenhourse.mapper")
public class MybatisConfig {
    private final static Logger logger= LoggerFactory.getLogger(MybatisConfig.class);
    @Value("${spring.datasource.driver}")
    private String driver;
    @Value("${spring.datasource.url}")
    private String url;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.datasource.minIdle}")
    private Integer minIdle;
    @Value("${spring.datasource.maxActive}")
    private Integer maxActive;

    //C3P0
    @Value("${c3p0.minPoolSize}")
    private Integer minPoolSize;
    @Value("${c3p0.maxPoolSize}")
    private Integer maxPoolSize;
    @Value("${c3p0.maxIdleTime}")
    private Integer maxIdleTime;
    @Value("${c3p0.initialPoolSize}")
    private Integer initialPoolSize;
    @Value("${c3p0.maxStatements}")
    private Integer maxStatements;

    @Bean
    public DataSource dataSource() throws PropertyVetoException {
        logger.info("初始化数据库...");

        //c3p0连接池
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        dataSource.setDriverClass(driver);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setMinPoolSize(minPoolSize);
        dataSource.setMaxPoolSize(maxPoolSize);
        dataSource.setMaxIdleTime(maxIdleTime);
        dataSource.setInitialPoolSize(initialPoolSize);
        dataSource.setMaxStatements(maxStatements);
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws PropertyVetoException, IOException {
        ResourcePatternResolver resourcePatternResolver=new PathMatchingResourcePatternResolver();
        SqlSessionFactoryBean sqlSessionFactoryBean =new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources("classpath:mapping/*.xml"));
        return sqlSessionFactoryBean;
    }

    //事务管理器
    @Bean(name="transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager() throws PropertyVetoException {
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    /*
    @Bean(name="transactionInterceptor")
    public TransactionInterceptor interceptor(){
        TransactionInterceptor interceptor=new TransactionInterceptor();

        interceptor.setTransactionManager(dataSourceTransactionManager());

        Properties attributes=new Properties();
        attributes.setProperty("save*","REQUIRED");
        attributes.setProperty("add*","REQUIRED");
        attributes.setProperty("create*","REQUIRED");
        attributes.setProperty("delete*","REQUIRED");
        attributes.setProperty("update*","REQUIRED");
        attributes.setProperty("find*","SUPPORTS,readOnly");
        attributes.setProperty("select*","SUPPORTS,readOnly");
        attributes.setProperty("get*","SUPPORTS,readOnly");
        interceptor.setTransactionAttributes(attributes);
        return interceptor;
    }*/
}
