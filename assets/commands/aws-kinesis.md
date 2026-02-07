# TAGLINE

Manage real-time data streaming with Kinesis Data Streams.

# TLDR

**Create a new data stream**

```aws kinesis create-stream --stream-name [my-stream] --shard-count 1```

**List all streams** in the account

```aws kinesis list-streams```

**Put a record** into a stream

```aws kinesis put-record --stream-name [my-stream] --partition-key [key1] --data "[message data]"```

**Get a shard iterator** for reading

```aws kinesis get-shard-iterator --stream-name [my-stream] --shard-id [shardId-000000000000] --shard-iterator-type TRIM_HORIZON```

**Get records** from a shard

```aws kinesis get-records --shard-iterator [shard-iterator-value]```

**Describe stream details**

```aws kinesis describe-stream --stream-name [my-stream]```

**Increase stream retention** to 7 days

```aws kinesis increase-stream-retention-period --stream-name [my-stream] --retention-period-hours 168```

**Delete a stream**

```aws kinesis delete-stream --stream-name [my-stream]```

# SYNOPSIS

**aws kinesis** _command_ [_options_]

# DESCRIPTION

**aws kinesis** is the AWS CLI interface for Amazon Kinesis Data Streams, a serverless service for real-time data streaming. Kinesis ingests and processes large amounts of data in real-time from sources like website clickstreams, IoT telemetry, and application logs.

Data streams consist of shards that provide throughput capacity. Each shard supports 1 MB/sec write and 2 MB/sec read. Kinesis retains data for 24 hours by default, extendable to 365 days for replay scenarios.

# COMMANDS

**create-stream**
> Create a new data stream

**delete-stream**
> Delete a stream

**describe-stream**
> Get stream configuration and status

**list-streams**
> List all streams

**put-record**
> Write a single record

**put-records**
> Write multiple records in a batch

**get-shard-iterator**
> Get iterator for reading from a shard

**get-records**
> Retrieve records using an iterator

**update-shard-count**
> Scale stream capacity

**start-stream-encryption**
> Enable server-side encryption

**register-stream-consumer**
> Register an enhanced fan-out consumer

# CAVEATS

Shard iterators expire after 5 minutes. Each shard has throughput limits; exceeding them causes throttling. Record size is limited to 1 MB. GetRecords returns up to 10 MB or 10,000 records per call. Enhanced fan-out consumers have additional costs but dedicated throughput.

# HISTORY

Amazon Kinesis launched in **November 2013** as a real-time data streaming service. Enhanced fan-out was added in **2018** for dedicated consumer throughput. On-demand capacity mode launched in **2021**, eliminating the need to manage shard counts manually.

# SEE ALSO

[aws](/man/aws)(1), [aws-firehose](/man/aws-firehose)(1), [aws-kafka](/man/aws-kafka)(1)
