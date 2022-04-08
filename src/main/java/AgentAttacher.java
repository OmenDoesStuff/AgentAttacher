
public class AgentAttacher {
     String pid;
  
     public static void main(String[] args) {
       if(args.length < 1) {
         System.out.println("Usage: java -jar AgentAttacher.jar <pid>"); 
         System.exit(0);    
       }
     }
}
