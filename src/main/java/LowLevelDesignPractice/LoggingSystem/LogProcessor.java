package LowLevelDesignPractice.LoggingSystem;

import org.springframework.beans.factory.annotation.Value;

public abstract class LogProcessor {
  public static int INFO=1;
  public static int DEBUG=2;
  public static int ERROR=3;

  LogProcessor next; //the next chain of responsibility will be given to whom that we are putting into this next

  LogProcessor(LogProcessor next){
    this.next=next;
  }

  void logMessage(int logLevel, String message){
    if(next!=null){
      next.logMessage(logLevel, message);
    }
  }

}
