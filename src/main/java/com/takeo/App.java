package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.pojo.College;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
       
       Object obj=factory.getBean("col");
       
       College clg=(College)obj;
       
       clg.displayStudentInfo();
    }
}
