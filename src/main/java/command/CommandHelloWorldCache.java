package command;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;
import com.netflix.hystrix.HystrixThreadPoolKey;

public class CommandHelloWorldCache extends HystrixCommand<String> {

	private final String name;
	private HelloWorld world = new HelloWorld();

	protected CommandHelloWorldCache(String name) {
		// super(HystrixCommandGroupKey.Factory.asKey(CommandHelloWorld.class.getName()));

		super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("HelloWroldGroup"))
				.andCommandKey(HystrixCommandKey.Factory.asKey(HelloWorld.class.getName()))
				.andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("HelloWorldPool")));

		this.name = name;
	}

	@Override
	protected String run() throws Exception {
		return this.world.printMe(name);
	}

	@Override
	protected String getFallback() {
		return "Hello Failure " + name + "!";
	}

	@Override
	protected String getCacheKey() {
		return name;
	}
}
