package LowLevelDesignPractice.LoggingSystem;

public class DebugLogProcessor extends LogProcessor{
  DebugLogProcessor(LogProcessor next) {
    super(next);
  }
  void logMessage(int logLevel, String message){
    if(logLevel==2){
      System.out.println(message+" "+"DEBUG");
    }else{
      next.logMessage(logLevel, message);
    }
  }
}
