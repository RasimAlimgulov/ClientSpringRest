package com.rasimalimgulov.spring.rest;

import com.rasimalimgulov.spring.rest.configuration.MyConfig;
import com.rasimalimgulov.spring.rest.entity.Dancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication =context.getBean("communication", Communication.class);
//        List<Dancer> dancers= communication.showAllDancers();
//        Dancer dancer=communication.getDancer(10);
//        System.out.println(dancer);
//        System.out.println(dancers);
//        Dancer dancer=new Dancer("Sveta","Sokolova",2004,"Elite");
//        communication.saveDancer(dancer);
//                Dancer dancer=new Dancer("Viktoria","Svetlichnaya",2004,"Elite");
//                dancer.setId(16);
//        communication.saveDancer(dancer);
//    Dancer dancer=new Dancer("adsad","adsdad",1987,"asdadasd");
//    communication.saveDancer(dancer);
//    communication.deleteDancer(17);

    }
}
