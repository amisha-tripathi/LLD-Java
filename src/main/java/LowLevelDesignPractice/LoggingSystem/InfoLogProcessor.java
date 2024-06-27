package LowLevelDesignPractice.LoggingSystem;

public class InfoLogProcessor extends LogProcessor{
  InfoLogProcessor(LogProcessor next) {
    super(next);
  }

  void logMessage(int logLevel, String message){
    if(logLevel==1){
      System.out.println(message+" "+"INFO");
    }else{
      next.logMessage(logLevel, message);
    }
  }
}
