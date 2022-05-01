package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Michael", "Klein", "michaelklein1997@gmail.com", 5128797927L);
        Address billingAddress = new Address("12345 BigOak Dr.", "", "Austin", "Texas", 12345);
        Address shippingAddress = billingAddress;

        customer.setBillingAddress(billingAddress);
        customer.setShippingAddress(shippingAddress);

    }

    @Test
    public void shouldCreateANewCustomer() {
        assertEquals("Michael Klein", customer.getFirstName() + " " + customer.getLastName());
        assertEquals("michaelklein1997@gmail.com", customer.getEmail());
        assertEquals(5128797927L, customer.getPhoneNumber());
        assertEquals(false, customer.isRewardsMember());

        assertEquals("12345 BigOak Dr.", customer.getBillingAddress().getStreet1());
        assertEquals("", customer.getBillingAddress().getStreet2());
        assertEquals("Austin", customer.getBillingAddress().getCity());
        assertEquals("Texas", customer.getBillingAddress().getState());
        assertEquals(12345, customer.getBillingAddress().getZipcode());

        assertEquals("12345 BigOak Dr.", customer.getShippingAddress().getStreet1());
        assertEquals("", customer.getShippingAddress().getStreet2());
        assertEquals("Austin", customer.getShippingAddress().getCity());
        assertEquals("Texas", customer.getShippingAddress().getState());
        assertEquals(12345, customer.getShippingAddress().getZipcode());
    }

}