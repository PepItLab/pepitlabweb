package fr.ccva.pepitlab.config;

import fr.ccva.pepitlab.model.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

import static org.hibernate.cfg.AvailableSettings.*;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = {
        @ComponentScan("fr.ccva.pepitlab.dao"),
        @ComponentScan("fr.ccva.pepitlab.service")
})
public class ApplicationConfiguration {

    @Autowired
    private Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        Properties properties = new Properties();

        //MySQL Connection properties
        properties.put(DRIVER, "com.mysql.cj.jdbc.Driver");
        properties.put(URL, "jdbc:mysql://localhost:3306/pepitlab?serverTimezone=UTC&useSSL=false");
        properties.put(USER,"root");
        properties.put(PASS, "toor");

        //Hibernate properties
        properties.put(SHOW_SQL, "true");
        properties.put(HBM2DDL_AUTO,"update");

        // Setting C3P0 properties
        properties.put(C3P0_MIN_SIZE, 5);
        properties.put(C3P0_MAX_SIZE, 20);
        properties.put(C3P0_ACQUIRE_INCREMENT, 1);
        properties.put(C3P0_TIMEOUT, 1800);
        properties.put(C3P0_MAX_STATEMENTS, 150);

        factoryBean.setPackagesToScan("fr.ccva.pepitlab.model");
        factoryBean.setHibernateProperties(properties);
        factoryBean.setAnnotatedClasses(New.class, User.class);

        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());

        return transactionManager;
    }

    public Properties hibernateProperties() {
        Properties properties = new Properties();

        properties.put(DIALECT,"org.hibernate.dialect.MySQLDialect");
        properties.put(SHOW_SQL, "true");
        properties.put(HBM2DDL_AUTO,"update");

        return properties;
    }
}
