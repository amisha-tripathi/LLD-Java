package LowLevelDesignPractice.LoggingSystem;

public class ErrorLogProcessor extends LogProcessor{
  ErrorLogProcessor(LogProcessor next) {
    super(next);
  }
  void logMessage(int logLevel, String message){
    if(logLevel==3){
      System.out.println(message+" "+"ERROR");
    }else{
      next.logMessage(logLevel, message);
    }
  }
}
