import java.lang.management.ManagementFactory;

import com.sun.tools.attach.VirtualMachine;

public class AgentAttacher {
     String pid;
     String path;
  
     public static void main(String[] args) {
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
}
