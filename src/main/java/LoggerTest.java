import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
	public static void main(String[] args) {
		Logger.getGlobal().setLevel(Level.INFO);
		Logger.getGlobal().info("测试日志输出");
		
		
		Logger logger = Logger.getLogger("JUL");
		logger.setLevel(Level.INFO);
		logger.severe("JUL severe");
		logger.warning("JUL warning");
		logger.info("JUL info");
		logger.config("JUL config");
		logger.fine("JUL fine");
		logger.finer("JUL finer");
		logger.finest("JUL finest");
	}
}
