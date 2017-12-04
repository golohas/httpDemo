package com.controller;

import com.junit.Request;
import com.junit.RequestHandler;
import com.junit.Response;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import static org.junit.Assert.*;

public class DefaultControllerTest {

    private DefaultController controller;

    private class SampleRequest implements Request {
     public String getName(){
         return "Test";
     }
    }
    private class SampleHandler implements RequestHandler {
        public Response process(Request request) throws Exception{
            return new SampleResponse();
        }
    }
    private class SampleResponse implements Response {

    }

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();

    }

//    @Test
//    public void testMethod() {
//        throw new RuntimeException("implement me");
//    }

    @Test
    public void testAddHandler() {
        Request request = new SampleRequest();
        RequestHandler handler = new SampleHandler();
        controller.addHandler(request, handler);

        RequestHandler handler2 = controller.getHandler(request);
        System.out.println(handler);
        System.out.println(handler2);
        assertSame("Handler we set in controller should be the same handler we get", handler2, handler);
    }
}