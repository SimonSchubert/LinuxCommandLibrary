# TLDR

**List all clusters**

```aws redshift describe-clusters```

**Describe a specific cluster**

```aws redshift describe-clusters --cluster-identifier [cluster_name]```

**Create a new cluster**

```aws redshift create-cluster --cluster-identifier [cluster_name] --node-type dc2.large --master-username [admin] --master-user-password [password] --number-of-nodes [2]```

**Create a single-node cluster**

```aws redshift create-cluster --cluster-identifier [cluster_name] --node-type dc2.large --master-username [admin] --master-user-password [password] --cluster-type single-node```

**Resize a cluster**

```aws redshift resize-cluster --cluster-identifier [cluster_name] --cluster-type multi-node --node-type ra3.xlplus --number-of-nodes [4]```

**Create a snapshot**

```aws redshift create-cluster-snapshot --cluster-identifier [cluster_name] --snapshot-identifier [snapshot_name]```

**Delete a cluster** (skip final snapshot)

```aws redshift delete-cluster --cluster-identifier [cluster_name] --skip-final-cluster-snapshot```

**Pause a cluster** to save costs

```aws redshift pause-cluster --cluster-identifier [cluster_name]```

# SYNOPSIS

**aws redshift** _subcommand_ [_options_]

# DESCRIPTION

**aws redshift** is a subcommand of the AWS CLI that manages Amazon Redshift, a fully managed petabyte-scale data warehouse service. Redshift uses columnar storage and parallel query execution for fast analytics on large datasets.

Clusters consist of leader and compute nodes. The leader node manages connections and query planning, while compute nodes store data and execute queries. Redshift supports SQL queries through standard PostgreSQL drivers.

Redshift Serverless provides a pay-per-use option without managing clusters. Data can be loaded from S3, DynamoDB, EMR, or streamed via Firehose.

# PARAMETERS

**describe-clusters**
> List clusters and their details.

**create-cluster**
> Launch a new cluster.

**delete-cluster**
> Terminate a cluster.

**modify-cluster**
> Change cluster settings.

**resize-cluster**
> Change node type or count.

**pause-cluster**
> Pause a cluster to stop billing.

**resume-cluster**
> Resume a paused cluster.

**reboot-cluster**
> Restart a cluster.

**create-cluster-snapshot**
> Create a manual snapshot.

**restore-from-cluster-snapshot**
> Create cluster from snapshot.

**describe-cluster-snapshots**
> List snapshots.

**--cluster-identifier** _name_
> Unique cluster name.

**--node-type** _type_
> Instance type (dc2.large, ra3.xlplus, etc.).

**--number-of-nodes** _count_
> Number of compute nodes.

**--cluster-type** _type_
> single-node or multi-node.

**--master-username** _name_
> Admin username.

**--master-user-password** _password_
> Admin password.

**--db-name** _name_
> Default database name.

# CAVEATS

Cluster creation takes several minutes. Classic resize creates a new cluster and migrates data; elastic resize is faster but has limitations. Paused clusters still incur storage costs. Multi-node clusters require minimum of 2 nodes. Master password must meet complexity requirements. Public access requires proper security group and VPC settings.

# HISTORY

**Amazon Redshift** launched in **February 2013** as AWS's first data warehouse service, named after the astronomical phenomenon. **Redshift Spectrum** was introduced in **2017** for querying data directly in S3. **RA3 nodes** with managed storage launched in **2019**, separating compute and storage. **Redshift Serverless** became generally available in **July 2022**. The service has added features like AQUA (Advanced Query Accelerator), ML integration, and data sharing.

# SEE ALSO

[aws](/man/aws)(1), [aws-redshift-data](/man/aws-redshift-data)(1), [psql](/man/psql)(1), [aws-s3](/man/aws-s3)(1)
