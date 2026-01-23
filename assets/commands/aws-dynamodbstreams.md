# TLDR

**List all streams** associated with a DynamoDB table

```aws dynamodbstreams list-streams --table-name [table_name]```

**Describe a stream** to get details and shards

```aws dynamodbstreams describe-stream --stream-arn [arn:aws:dynamodb:region:account:table/name/stream/timestamp]```

**Get a shard iterator** to start reading records

```aws dynamodbstreams get-shard-iterator --stream-arn [stream_arn] --shard-id [shard_id] --shard-iterator-type [TRIM_HORIZON|LATEST|AT_SEQUENCE_NUMBER]```

**Read records** from a shard

```aws dynamodbstreams get-records --shard-iterator [iterator_string]```

**Get shard iterator at a specific sequence number**

```aws dynamodbstreams get-shard-iterator --stream-arn [stream_arn] --shard-id [shard_id] --shard-iterator-type AT_SEQUENCE_NUMBER --sequence-number [seq_num]```

# SYNOPSIS

**aws dynamodbstreams** _subcommand_ [_options_]

# DESCRIPTION

**aws dynamodbstreams** is a subcommand of the AWS CLI that reads change data capture records from DynamoDB Streams. When streams are enabled on a DynamoDB table, every modification (insert, update, delete) is captured as a stream record.

Streams organize records into shards, which are containers for sequenced records. To read stream data, you first obtain a shard iterator and then use it to retrieve records. Each shard iterator expires after 15 minutes of inactivity.

Stream records can include the old item image, new item image, or both, depending on the stream view type configured on the table. This enables use cases like replication, analytics, and triggering downstream workflows.

# PARAMETERS

**list-streams**
> List stream ARNs for a table or all tables.

**describe-stream**
> Get stream metadata including shard information.

**get-shard-iterator**
> Get an iterator for reading records from a shard.

**get-records**
> Read stream records using a shard iterator.

**--stream-arn** _arn_
> The Amazon Resource Name of the stream.

**--table-name** _name_
> Filter streams by table name.

**--shard-id** _id_
> The identifier of the shard to read.

**--shard-iterator** _string_
> Iterator returned by get-shard-iterator.

**--shard-iterator-type** _type_
> Where to start reading: TRIM_HORIZON (oldest), LATEST (newest), AT_SEQUENCE_NUMBER, or AFTER_SEQUENCE_NUMBER.

**--sequence-number** _number_
> Start at this sequence number (requires AT/AFTER_SEQUENCE_NUMBER type).

**--limit** _number_
> Maximum number of records to return.

# CAVEATS

Shard iterators expire after 15 minutes. Stream records are retained for only 24 hours. Shards can split under high throughput, requiring logic to handle child shards. The get-records call may return empty results even when data exists due to internal shard mechanics; keep polling until the shard is closed.

# HISTORY

DynamoDB Streams was announced at **AWS re:Invent 2014** and became generally available in **July 2015**. It was designed to enable real-time processing of DynamoDB changes, complementing the introduction of AWS Lambda triggers for DynamoDB. The feature supports cross-region replication through Global Tables.

# SEE ALSO

[aws](/man/aws)(1), [aws-dynamodb](/man/aws-dynamodb)(1), [aws-lambda](/man/aws-lambda)(1), [aws-kinesis](/man/aws-kinesis)(1)
