package learn.proxy.InvocationHandler;

import java.lang.reflect.Proxy;

import learn.proxy.UserService;
import learn.proxy.UserServiceImpl;

public class InvocationHandlerDemo {

	public static void main(String[] args) {
		UserServiceImpl serviceImpl = new UserServiceImpl();
		DemoProxy factory=new DemoProxy(serviceImpl);
		UserService proxy = (UserService) Proxy.newProxyInstance(serviceImpl.getClass().getClassLoader(),serviceImpl.getClass().getInterfaces(),factory);
		proxy.print();

	}

}
