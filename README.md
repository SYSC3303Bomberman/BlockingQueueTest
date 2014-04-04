BlockingQueueTest
=================

This test is to ensure that LinkedBlockingQueue is synchronized and safe to use.

Both of the producers put the same number of objects on the queue. The consumer is set up to receive exactly that number of objects. The test is considered successful if:
a. the test completes.
b. the consumer received an equal number of items from both producers equal to the number of objects sent.
c. there are no objects remaining on the queue upon test completion.
