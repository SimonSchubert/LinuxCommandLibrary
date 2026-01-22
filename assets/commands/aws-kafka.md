# TLDR

**Create a new MSK cluster**

```aws kafka create-cluster --cluster-name [my-cluster] --kafka-version [3.5.1] --number-of-broker-nodes 3 --broker-node-group-info file://[broker-config.json]```

**List all MSK clusters**

```aws kafka list-clusters```

**Describe a cluster** and get its details

```aws kafka describe-cluster --cluster-arn [arn:aws:kafka:region:account:cluster/name/id]```

**Get bootstrap broker endpoints** for client connections

```aws kafka get-bootstrap-brokers --cluster-arn [arn:aws:kafka:region:account:cluster/name/id]```

**Update the number of brokers**

```aws kafka update-broker-count --cluster-arn [arn:aws:kafka:region:account:cluster/name/id] --current-version [K1234] --target-number-of-broker-nodes 6```

**List compatible Kafka versions** for upgrade

```aws kafka get-compatible-kafka-versions --cluster-arn [arn:aws:kafka:region:account:cluster/name/id]```

**Delete a cluster**

```aws kafka delete-cluster --cluster-arn [arn:aws:kafka:region:account:cluster/name/id]```

# SYNOPSIS

**aws kafka** _command_ [_options_]

# DESCRIPTION

**aws kafka** is the AWS CLI interface for Amazon Managed Streaming for Apache Kafka (MSK), a fully managed service for running Apache Kafka. MSK handles cluster provisioning, configuration, patching, and monitoring while maintaining compatibility with open-source Kafka.

MSK supports both provisioned and serverless deployment modes, SASL/SCRAM and IAM authentication, encryption at rest and in transit, and integration with AWS services like Lambda, Kinesis Data Firehose, and Glue.

# COMMANDS

**create-cluster**
> Create a new MSK cluster

**delete-cluster**
> Delete an MSK cluster

**describe-cluster**
> Get cluster configuration and status

**list-clusters**
> List all clusters in the account

**get-bootstrap-brokers**
> Get broker endpoints for client connections

**update-broker-count**
> Scale the number of brokers

**update-broker-storage**
> Increase broker storage capacity

**update-cluster-kafka-version**
> Upgrade Kafka version

**create-configuration**
> Create a custom broker configuration

**reboot-broker**
> Restart a specific broker

# CAVEATS

Broker count can only be increased, not decreased. Storage can only be increased. Kafka version upgrades are one-way and cannot be rolled back. Cluster creation takes 15-20 minutes. MSK Serverless has different quotas than provisioned clusters.

# HISTORY

Amazon MSK launched in **December 2018** as a managed Kafka service. MSK Connect for managed connectors was added in **2021**, and MSK Serverless launched in **2022** for automatic scaling without capacity planning. Tiered storage for cost optimization came in **2023**.

# SEE ALSO

[aws](/man/aws)(1), [aws-kinesis](/man/aws-kinesis)(1), [kafka-topics](/man/kafka-topics)(1)
