package com.fortytwotalents;

import java.util.function.Supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * Learn how to use StepVerifier to test Mono and Flux.
 *
 * @see <a href="http://projectreactor.io/docs/test/release/api/reactor/test/StepVerifier.html">StepVerifier Javadoc</a>
 */

public class Part03StepVerifier {

    /**
     * TODO 1
     * <p>
     * Use the {@link StepVerifier} to check that the flux parameter emits subscription event and completes successfully
     */
    public void expectSubscriptionAndThenComplete(Flux<String> flux) {
        fail();
    }

    /**
     * TODO 2
     * <p>
     * Use the {@link StepVerifier} to check that the flux parameter emits "foo" and "bar" items and completes successfully
     */
    public void expectItemsAndThenComplete(Flux<String> flux) {
        fail();
    }

    /**
     * TODO 3
     * <p>
     * Use the {@link StepVerifier} to check that the flux parameter emits "foo" and "bar" items and then an error with "error" message
     */
    public void expectItemsAndThenError(Flux<String> flux) {
        fail();
    }

    /**
     * TODO 4
     * <p>
     * Use the {@link StepVerifier} to check that the customers parameter emits a Customer with name "John" and then
     * a Customer with name "Jane" and then completes successfully
     */
    public void expectItemsWithAndThenComplete(Flux<Customer> customers) {
        fail();
    }

    /**
     * TODO 5
     * <p>
     * Use the {@link StepVerifier} to check that the numbers parameter emits 10 items and completes successfully.
     * Notice how long the test takes.
     */
    public void expect5Items(Flux<Long> numbers) {
        fail();
    }

    /**
     * TODO 6
     * <p>
     * Use the {@link StepVerifier} to check that 3600 items are emitted at intervals of 1 second.
     * Verify it quicker than 3600 seconds.
     *
     * Note that here we need to provide a Supplier, since if we provide a Flux then it would be already created with a real
     * Scheduler and StepVerifier can not set up a virtual time Scheduler.
     *
     * Look into {@link StepVerifier#withVirtualTime(Supplier)}
     */
    public void expect3600Items(Supplier<Flux<Long>> supplier) {
        fail();

    }

    @Data
    @AllArgsConstructor
    static class Customer {

        String name;
    }

    private void fail() {
        throw new AssertionError("not implemented");
    }
}

