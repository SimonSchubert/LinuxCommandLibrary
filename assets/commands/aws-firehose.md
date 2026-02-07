# TAGLINE

Manage Amazon Data Firehose delivery streams

# TLDR

**List all delivery streams**

```aws firehose list-delivery-streams```

**Describe a delivery stream**

```aws firehose describe-delivery-stream --delivery-stream-name [stream_name]```

**Create a delivery stream** to S3

```aws firehose create-delivery-stream --delivery-stream-name [stream_name] --s3-destination-configuration RoleARN=[role_arn],BucketARN=[bucket_arn]```

**Put a single record** to a delivery stream

```aws firehose put-record --delivery-stream-name [stream_name] --record Data=[base64_encoded_data]```

**Put multiple records** in a batch

```aws firehose put-record-batch --delivery-stream-name [stream_name] --records Data=[data1] Data=[data2]```

**Update delivery stream destination**

```aws firehose update-destination --delivery-stream-name [stream_name] --current-delivery-stream-version-id [version] --destination-id [dest_id] --s3-destination-update BucketARN=[new_bucket_arn]```

**Delete a delivery stream**

```aws firehose delete-delivery-stream --delivery-stream-name [stream_name]```

# SYNOPSIS

**aws firehose** _subcommand_ [_options_]

# DESCRIPTION

**aws firehose** is a subcommand of the AWS CLI that manages Amazon Data Firehose (formerly Kinesis Data Firehose), a service for loading streaming data into data stores and analytics services.

Firehose automatically batches, compresses, transforms, and encrypts data before delivering it to destinations like S3, Redshift, OpenSearch, Splunk, or HTTP endpoints. It handles scaling automatically without provisioning.

Data can be sent directly via put-record APIs or ingested from Kinesis Data Streams. Firehose buffers records based on size (1-128 MB) or time (60-900 seconds) before delivery.

# PARAMETERS

**list-delivery-streams**
> List all delivery streams in the account.

**describe-delivery-stream**
> Get detailed configuration of a stream.

**create-delivery-stream**
> Create a new delivery stream.

**delete-delivery-stream**
> Remove a delivery stream.

**put-record**
> Send a single data record.

**put-record-batch**
> Send multiple records in one request.

**update-destination**
> Modify destination configuration.

**start-delivery-stream-encryption**
> Enable server-side encryption.

**stop-delivery-stream-encryption**
> Disable encryption.

**--delivery-stream-name** _name_
> Name of the delivery stream.

**--record** _data_
> Single record with Data field (base64).

**--records** _records_
> Array of records for batch put.

**--s3-destination-configuration** _config_
> S3 destination settings.

**--redshift-destination-configuration** _config_
> Redshift destination settings.

**--extended-s3-destination-configuration** _config_
> S3 with data transformation settings.

# CAVEATS

Record data must be base64-encoded when using the CLI. Maximum record size is 1 MB. Batch put accepts up to 500 records or 4 MB per request. Delivery streams cannot be renamed; create a new one instead. Buffer intervals cause delivery latency. Failed records to Redshift are written to S3 as a backup.

# HISTORY

**Amazon Kinesis Firehose** launched in **October 2015** as the easiest way to load streaming data into AWS. It was renamed to **Amazon Data Firehose** in **February 2024** to reflect its broader scope beyond Kinesis integration. Over time, destinations expanded from S3 and Redshift to include OpenSearch, Splunk, and custom HTTP endpoints. Dynamic partitioning was added in **2021** to enable efficient data lake patterns.

# SEE ALSO

[aws](/man/aws)(1), [aws-kinesis](/man/aws-kinesis)(1), [aws-s3](/man/aws-s3)(1), [aws-redshift](/man/aws-redshift)(1)
