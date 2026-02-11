# TAGLINE

AWS SQS queue management CLI

# TLDR

**List queues**

```sqsc list```

**Send message**

```sqsc send [queue-url] "[message]"```

**Receive messages**

```sqsc receive [queue-url]```

**Delete message**

```sqsc delete [queue-url] [receipt-handle]```

**Purge queue**

```sqsc purge [queue-url]```

**Create queue**

```sqsc create [queue-name]```

# SYNOPSIS

**sqsc** _command_ [_options_] [_args_]

# PARAMETERS

**list**
> List queues.

**send**
> Send message.

**receive**
> Receive messages.

**delete**
> Delete message.

**purge**
> Clear queue.

**create**
> Create queue.

**--region** _REGION_
> AWS region.

# DESCRIPTION

**sqsc** is a command-line client for Amazon Simple Queue Service (SQS). It provides queue management operations including creating queues, sending and receiving messages, deleting processed messages, and purging queues.

The tool uses standard AWS credential configuration for authentication. It supports common SQS workflows such as sending messages to queue URLs, receiving batches of messages for processing, and deleting messages by receipt handle after successful processing.

# CAVEATS

AWS account needed. Credentials required. Region specific.

# HISTORY

**sqsc** is a command-line client for Amazon SQS (Simple Queue Service), providing queue management operations.

# SEE ALSO

[aws](/man/aws)(1), [sqs](/man/sqs)(1)
