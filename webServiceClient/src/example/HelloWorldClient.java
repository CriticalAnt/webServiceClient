package example;

import com.test.client.HelloWorldServiceLocator;
import com.test.client.HelloWorld_PortType;


public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HelloWorldServiceLocator locator = new HelloWorldServiceLocator();
          HelloWorld_PortType service = locator.getHelloWorld();

          String res = service.sayHelloWorldFrom("adfsadfasdf");
          System.out.println(res);
      } catch (javax.xml.rpc.ServiceException ex) {
          ex.printStackTrace();
      } catch (java.rmi.RemoteException ex) {
          ex.printStackTrace();
      }  
  }
}
