# TAGLINE

AWS SQS queue inspection CLI

# TLDR

**List queues**, optionally filtered by name prefix

```sqsc lq [queue-prefix]```

**List messages** in a queue with timestamps

```sqsc ls [queue-name] --timestamp```

**List** at most a number of messages

```sqsc ls [queue-name] --limit [10]```

**Copy** all messages to another queue

```sqsc cp [from-queue] [to-queue]```

**Move** all messages, e.g. redrive a dead letter queue

```sqsc mv [queue-dlq] [queue]```

**Describe** queue attributes

```sqsc describe [queue-name]```

**Pull** messages into the local SQLite database for querying

```sqsc pull [queue-name]```

**Query** pulled messages with SQL

```sqsc query "SELECT body FROM [queue-name] WHERE body LIKE '%[user]%'"```

# SYNOPSIS

**sqsc** _command_ [_options_] [_args_]

# PARAMETERS

**lq** [_prefix_]
> List queues, optionally only those whose name starts with _prefix_.

**ls** _queue-name_
> List messages in a queue.

**cp** _from-queue-name_ _to-queue-name_
> Copy all messages to another queue.

**mv** _from-queue-name_ _to-queue-name_
> Move all messages to another queue.

**describe** _queue-name_
> Show queue attributes.

**pull** _queue-name_
> Store the queue's messages in a local SQLite database.

**query** _sql_
> Run an SQL query against pulled messages; the queue name is used as the table name.

**list-table**
> List queues that have been pulled and can be queried.

**schema**
> Show the table schema used for pulled messages.

**--timeout** _SECONDS_
> Visibility timeout for received messages (default 30); used by **ls**, **cp**, **mv** and **pull**.

**--timestamp**
> Show message timestamps (**ls**).

**--limit** _N_
> Maximum number of messages to list (**ls**).

**--hide-headers**
> Omit column headers from **query** output, e.g. to pipe the body into jq.

# DESCRIPTION

**sqsc** is a command-line tool for inspecting and moving messages in Amazon Simple Queue Service (SQS) queues, addressed by queue name rather than URL. It is a Node.js tool installed with **npm install -g sqsc**.

Messages can be pulled into a local SQLite database and analyzed with SQL, including SQLite's **json_extract()** for JSON message bodies. Credentials come from the standard AWS SDK configuration; the region is read from **~/.aws/config** for the profile in **AWS_PROFILE** (default **default**).

# CAVEATS

**ls**, **cp**, **mv** and **pull** actually receive messages: each receive increases the message's receive count, so messages can land in a dead letter queue once **maxReceiveCount** is reached. sqsc resets the visibility timeout at the end of the command. FIFO queues and server-side encryption are not supported. The project has not been updated since 2020.

# HISTORY

**sqsc** was created by **yongfei25** in 2017 and is written in **TypeScript**, as a lighter alternative to the AWS CLI for browsing and moving SQS messages.

# SEE ALSO

[aws](/man/aws)(1), [sqlite3](/man/sqlite3)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/yongfei25/sqsc)```

<!-- verified: 2026-11-23 -->
