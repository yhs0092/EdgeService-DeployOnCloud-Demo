package microservice.demo.training21days.edge;

import java.util.ArrayList;

import org.apache.servicecomb.foundation.common.net.IpPort;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;
import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.apache.servicecomb.serviceregistry.config.ServiceRegistryConfig;

public class AppMain {
  public static void main(String[] args) throws Exception {
//    extraServiceRegistry3();

    Log4jUtils.init();
    BeanUtils.init();
  }

  private static void extraServiceRegistry2() {
    ServiceRegistryConfig serviceRegistryConfig = ServiceRegistryConfig.buildFromConfiguration();
    ArrayList<IpPort> ipPorts = new ArrayList<>();
    ipPorts.add(new IpPort("127.0.0.1", 30200));
    serviceRegistryConfig.setIpPort(ipPorts);
    serviceRegistryConfig.setRegistryName("extra2");
    serviceRegistryConfig.setSsl(true);
    serviceRegistryConfig.setSslConfigTag("sc2.consumer");
    RegistryUtils.addExtraServiceRegistryConfig(serviceRegistryConfig);
  }

  private static void extraServiceRegistry3() {
    ServiceRegistryConfig serviceRegistryConfig = ServiceRegistryConfig.buildFromConfiguration();
    ArrayList<IpPort> ipPorts = new ArrayList<>();
    ipPorts.add(new IpPort("127.0.0.1", 30300));
    serviceRegistryConfig.setIpPort(ipPorts);
    serviceRegistryConfig.setRegistryName("extra3");
    RegistryUtils.addExtraServiceRegistryConfig(serviceRegistryConfig);
  }
}
