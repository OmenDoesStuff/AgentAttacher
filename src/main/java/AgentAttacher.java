import java.lang.management.ManagementFactory;

import com.sun.tools.attach.VirtualMachine;

import java.lang.*;

public class AgentAttacher {
     public static String pid;
     public static String path;
  
     public static void main(String[] args) throws Exception {
       if(args.length < 2) {
         System.out.println("Usage: java -jar AgentAttacher.jar <pid> <agentPath>"); 
         System.exit(0);    
       }
       
       pid = args[0];
       path = args[1];   
       
       VirtualMachine vm = VirtualMachine.attach(pid);
       vm.loadAgent(path, "");
       vm.detach();
     }

     
     public static void attachAgent(String jvmPid, String agentPath) throws Exception {
      
       pid = jvmPid;
       path = agentPath;
       
       VirtualMachine vm = VirtualMachine.attach(pid);
       vm.loadAgent(path, "");
       vm.detach();
     }
}
