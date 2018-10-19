package com.lee;

import com.lee.concert.CNConcert;
import com.lee.concert.ConcertConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConcertConfig.class);
        CNConcert cnConcert= (CNConcert) context.getBean("cNConcert");
        cnConcert.perform();
    }
}
