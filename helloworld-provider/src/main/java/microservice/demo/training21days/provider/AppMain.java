package microservice.demo.training21days.provider;

import java.util.ArrayList;

import org.apache.servicecomb.foundation.common.net.IpPort;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;
import org.apache.servicecomb.serviceregistry.RegistryUtils;
import org.apache.servicecomb.serviceregistry.config.ServiceRegistryConfig;

public class AppMain {
  public static void main(String[] args) throws Exception {
//    extraServiceRegistry();

    Log4jUtils.init(); // 初始化默认的日志组件
    BeanUtils.init();  // 加载Spring bean定义文件，正式开始启动流程
  }

  private static void extraServiceRegistry() {
    // 基于已有的配置文件配置生成一份默认的ServiceRegistryConfig配置，修改一点内容就能对接到另外一个sc集群，更方便一些
    ServiceRegistryConfig serviceRegistryConfig = ServiceRegistryConfig.buildFromConfiguration();
    ArrayList<IpPort> ipPorts = new ArrayList<>();
    ipPorts.add(new IpPort("127.0.0.1", 30300));
    serviceRegistryConfig.setIpPort(ipPorts);
    serviceRegistryConfig.setRegistryName("extra3");
    RegistryUtils.addExtraServiceRegistryConfig(serviceRegistryConfig);
  }
}
