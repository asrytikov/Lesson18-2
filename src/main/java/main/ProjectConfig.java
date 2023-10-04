package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Dog dog1(){
        Dog dog = new Dog();
        dog.setName("Tuzik");
        return dog;
    }

    //@Primary
    @Bean
    public Dog dog2(){
        Dog dog = new Dog();
        dog.setName("Trezor");
        return dog;
    }

    @Bean
    //public People people(Dog dog2){
    public People people(@Qualifier("dog2") Dog dog){
        People people = new People();
        people.setName("Alex");
        people.setDog(dog);
        return people;
    }

}
