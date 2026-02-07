# TAGLINE

Manage MySQL and PostgreSQL-compatible relational database clusters

# TLDR

**Create an Aurora MySQL cluster**

```aws rds create-db-cluster --db-cluster-identifier [my-cluster] --engine aurora-mysql --master-username [admin] --master-user-password [password]```

**Create an Aurora PostgreSQL cluster**

```aws rds create-db-cluster --db-cluster-identifier [my-cluster] --engine aurora-postgresql --master-username [admin] --master-user-password [password]```

**Create a database instance** in the cluster

```aws rds create-db-instance --db-instance-identifier [my-instance] --db-cluster-identifier [my-cluster] --engine aurora-mysql --db-instance-class [db.r5.large]```

**List Aurora clusters**

```aws rds describe-db-clusters --query "DBClusters[?Engine=='aurora-mysql' || Engine=='aurora-postgresql']"```

**Create a cluster snapshot**

```aws rds create-db-cluster-snapshot --db-cluster-identifier [my-cluster] --db-cluster-snapshot-identifier [my-snapshot]```

**Delete an Aurora cluster**

```aws rds delete-db-cluster --db-cluster-identifier [my-cluster] --skip-final-snapshot```

# SYNOPSIS

**aws rds** _command_ [_options_]

# PARAMETERS

**create-db-cluster**
> Create a new Aurora DB cluster

**create-db-instance**
> Create a database instance in a cluster

**describe-db-clusters**
> List DB clusters and their details

**modify-db-cluster**
> Modify cluster configuration

**delete-db-cluster**
> Delete an Aurora cluster

**create-db-cluster-snapshot**
> Create a manual snapshot of a cluster

**restore-db-cluster-from-snapshot**
> Restore a cluster from a snapshot

**create-db-cluster-endpoint**
> Create a custom endpoint for read replicas

**failover-db-cluster**
> Force a failover to a replica

**--db-cluster-identifier** _name_
> Unique identifier for the cluster

**--engine** _type_
> Database engine: aurora-mysql, aurora-postgresql

**--engine-version** _version_
> Specific engine version

**--master-username** _name_
> Master user account name

**--master-user-password** _password_
> Master user password (or use --manage-master-user-password)

**--db-instance-class** _class_
> Instance type (db.r5.large, db.r6g.xlarge, etc.)

**--db-subnet-group-name** _name_
> Subnet group for the cluster

**--vpc-security-group-ids** _ids_
> Security groups for network access

**--engine-mode** _mode_
> provisioned or serverless

# DESCRIPTION

**aws rds** commands manage Amazon Aurora, a MySQL and PostgreSQL-compatible relational database built for the cloud. Aurora commands operate under the RDS service namespace rather than a separate Aurora namespace.

Aurora clusters consist of a primary writer instance and up to 15 read replicas. Create the cluster first with **create-db-cluster**, then add instances with **create-db-instance**. Aurora handles replication automatically across Availability Zones.

**Aurora Serverless** (engine-mode serverless) automatically scales capacity based on demand. **Aurora I/O-Optimized** (storage-type aurora-iopt1) provides predictable pricing for I/O-intensive workloads.

Use **--manage-master-user-password** to have AWS Secrets Manager automatically manage the master password instead of specifying it directly.

# CAVEATS

Creating a cluster does not automatically create instances; you must add them separately. Deleting a cluster without **--skip-final-snapshot** requires specifying a final snapshot identifier. VPC, subnet groups, and security groups must be configured before cluster creation.

# HISTORY

**Amazon Aurora** was announced at **AWS re:Invent 2014** and became generally available in **July 2015**. It was designed to provide MySQL compatibility with significantly improved performance and availability. Aurora PostgreSQL followed in **2017**, and Aurora Serverless launched in **2018** for variable workloads.

# SEE ALSO

[aws](/man/aws)(1), [aws-rds](/man/aws-rds)(1), [mysql](/man/mysql)(1), [psql](/man/psql)(1)
