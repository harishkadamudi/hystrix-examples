Hystrix is a latency and fault tolerance library designed to isolate points of access to remote systems, services and 3rd party libraries, stop cascading failure and enable resilience in complex distributed systems where failure is inevitable.

What does it do?

1) Latency and Fault Tolerance

Stop cascading failures. Fallbacks and graceful degradation. Fail fast and rapid recovery.

Thread and semaphore isolation with circuit breakers.

2) Realtime Operations

Realtime monitoring and configuration changes. Watch service and property changes take effect immediately as they spread across a fleet.

Be alerted, make decisions, affect change and see results in seconds.

3) Concurrency

Parallel execution. Concurrency aware request caching. Automated batching through request collapsing.

Examples are pretty straight forward. Examples are provided with the Main class you can easily run and understand.

Test class [TestCommandHelloWorld](https://github.com/harishkadamudi/hystrix-examples/blob/master/src/main/java/command/TestCommandHelloWorld.java) explores Synchronous, Asynchronous & Reactive Execution.

Request Collapsing

Request collapsing enables multiple requests to be batched into a single HystrixCommand instance execution.

A collapser can use the batch size and the elapsed time since the creation of the batch as triggers for executing a batch.

Test Class [TestBatchCommand] (https://github.com/harishkadamudi/hystrix-examples/blob/master/src/main/java/command/collapser/TestBatchCommand.java) demonstrate Batch collapsing.
