package com.example.dependency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//Tell the spring framework on which objects to be added in the ioc container
@Component
public class Dep {

    @Autowired // field injection (not recommended)
    @Qualifier("laptop")
    private Computer computer;

    //setter injection

//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }


    public void hello(){
        System.out.println("hello");
        computer.compile();
    }
}
