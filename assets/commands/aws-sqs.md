# TAGLINE

Manage Simple Queue Service queues and messages.

# TLDR

**Create a new queue**

```aws sqs create-queue --queue-name [queue-name]```

**List all queues**

```aws sqs list-queues```

**Get the URL** of a queue

```aws sqs get-queue-url --queue-name [queue-name]```

**Send a message** to a queue

```aws sqs send-message --queue-url [queue-url] --message-body "[message content]"```

**Receive messages** from a queue

```aws sqs receive-message --queue-url [queue-url]```

**Delete a message** after processing

```aws sqs delete-message --queue-url [queue-url] --receipt-handle [handle]```

**Purge all messages** from a queue

```aws sqs purge-queue --queue-url [queue-url]```

**Delete a queue**

```aws sqs delete-queue --queue-url [queue-url]```

# SYNOPSIS

**aws sqs** _subcommand_ [_options_]

# DESCRIPTION

**aws sqs** is the AWS CLI interface for Amazon Simple Queue Service (SQS), a fully managed message queuing service for decoupling and scaling distributed systems and serverless applications.

SQS offers two queue types: Standard queues with maximum throughput and at-least-once delivery, and FIFO queues with exactly-once processing and ordered delivery. Messages can be retained for up to 14 days.

# SUBCOMMANDS

**Queue Management**
> create-queue, delete-queue, list-queues, get-queue-url, get-queue-attributes, set-queue-attributes, purge-queue

**Messaging**
> send-message, send-message-batch, receive-message, delete-message, delete-message-batch, change-message-visibility, change-message-visibility-batch

**Permissions**
> add-permission, remove-permission

**Tagging**
> tag-queue, untag-queue, list-queue-tags

**Dead-letter Queues**
> list-dead-letter-source-queues, start-message-move-task, cancel-message-move-task, list-message-move-tasks

# CAVEATS

Messages must be explicitly deleted after processing; SQS does not auto-delete consumed messages. The visibility timeout makes messages temporarily invisible to other consumers while processing. Standard queues may deliver duplicate messages; use FIFO queues for exactly-once processing. Maximum message size is 256KB; use S3 for larger payloads.

# HISTORY

Amazon SQS launched in **July 2006** as one of AWS's first services, predating S3. It was redesigned in **2014** with significant improvements to throughput and latency. FIFO queues were added in **2016** to support ordered message processing.

# SEE ALSO

[aws](/man/aws)(1), [aws-sns](/man/aws-sns)(1), [aws-lambda](/man/aws-lambda)(1)
