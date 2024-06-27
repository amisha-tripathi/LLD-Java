package LowLevelDesignPractice.LoggingSystem;


public class Main {
  public static void main(String args[]) {
    LogProcessor obj=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
    obj.logMessage(1, "which log is this? ");
    obj.logMessage(2, "which log is this? ");
    obj.logMessage(3, "which log is this? ");
  }
}
