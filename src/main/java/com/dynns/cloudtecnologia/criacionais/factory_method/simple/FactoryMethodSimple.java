package com.dynns.cloudtecnologia.criacionais.factory_method.simple;

import com.dynns.cloudtecnologia.criacionais.factory_method.simple.factory.IphoneSimpleFactory;
import com.dynns.cloudtecnologia.criacionais.factory_method.simple.model.IPhone;

/*
Definição (GOF) FactoryMethod:
Um padrão que define uma interface/classe abstrata para criar um objeto,
mas permite às classes decidirem qual Objeto instanciar.
O FactoryMethod permite a uma classe deferir a instanciação para subclasses.

-> Problemas:
-Como posso escrever um código onde as classes instanciadas possam variar dentro
de uma mesma interface?
-Como deixar o meu código desacoplado das classes concretas?

-> Solução:
-Extrair a lógica de criação dos objetos para um factory method.
-Invocar o factory method para receber uma instância qualquer que implemente
uma determinada interface.
 */
public class FactoryMethodSimple {
    public static void main(String[] args) {
        System.out.println("### Ordering an iphoneXStandard");
        IPhone iphoneXStandard = IphoneSimpleFactory.orderIPhone("X", "standard");
        System.out.println(iphoneXStandard);

        System.out.println("### Ordering an iphoneXHighEnd");
        IPhone iphoneXHighEnd = IphoneSimpleFactory.orderIPhone("X", "highEnd");
        System.out.println(iphoneXHighEnd);

        System.out.println("\n\n### Ordering an iphone11HighEnd");
        IPhone iphone11HighEnd = IphoneSimpleFactory.orderIPhone("11", "highEnd");
        System.out.println(iphone11HighEnd);

        System.out.println("\n\n### Ordering an iphone11Standard");
        IPhone iphone11Standard = IphoneSimpleFactory.orderIPhone("11", "standard");
        System.out.println(iphone11Standard);
    }
}
