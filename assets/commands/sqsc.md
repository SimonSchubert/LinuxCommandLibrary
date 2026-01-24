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

**sqsc** manages AWS SQS. It's a CLI for queues.

Simple queue operations. Send and receive.

Message management. Delete after processing.

Queue administration. Create and purge.

AWS credentials required. Standard configuration.

# CAVEATS

AWS account needed. Credentials required. Region specific.

# HISTORY

**sqsc** is a command-line client for Amazon SQS (Simple Queue Service), providing queue management operations.

# SEE ALSO

[aws](/man/aws)(1), [sqs](/man/sqs)(1)
