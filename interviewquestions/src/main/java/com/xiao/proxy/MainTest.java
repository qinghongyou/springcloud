package com.xiao.proxy;

public class MainTest {

    public static void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setId(10L);
        customer.setName("adam");
        customer.setAge(3);

        new ReflectTester().copy(customer);
    }

}
