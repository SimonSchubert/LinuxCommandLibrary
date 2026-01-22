# TLDR

**Create a MySQL database instance**

```aws rds create-db-instance --db-instance-identifier [my-db] --db-instance-class db.t3.micro --engine mysql --master-username admin --master-user-password [password] --allocated-storage 20```

**List all database instances**

```aws rds describe-db-instances```

**Describe a specific instance**

```aws rds describe-db-instances --db-instance-identifier [my-db]```

**Create a manual snapshot**

```aws rds create-db-snapshot --db-instance-identifier [my-db] --db-snapshot-identifier [my-snapshot]```

**Restore from a snapshot**

```aws rds restore-db-instance-from-db-snapshot --db-instance-identifier [new-db] --db-snapshot-identifier [my-snapshot]```

**Modify instance** (resize, change settings)

```aws rds modify-db-instance --db-instance-identifier [my-db] --db-instance-class db.t3.small --apply-immediately```

**Create a read replica**

```aws rds create-db-instance-read-replica --db-instance-identifier [my-replica] --source-db-instance-identifier [my-db]```

**Delete an instance** (skip final snapshot)

```aws rds delete-db-instance --db-instance-identifier [my-db] --skip-final-snapshot```

# SYNOPSIS

**aws rds** _command_ [_options_]

# DESCRIPTION

**aws rds** is the AWS CLI interface for Amazon Relational Database Service (RDS), a managed service for relational databases. RDS handles provisioning, patching, backups, and recovery for MySQL, PostgreSQL, MariaDB, Oracle, SQL Server, and Amazon Aurora.

RDS provides automated backups, point-in-time recovery, read replicas for scaling, Multi-AZ deployments for high availability, and encryption at rest. Aurora extends RDS with MySQL and PostgreSQL-compatible databases with enhanced performance.

# COMMANDS

**create-db-instance**
> Create a new database instance

**delete-db-instance**
> Terminate a database instance

**describe-db-instances**
> List and describe instances

**modify-db-instance**
> Change instance configuration

**reboot-db-instance**
> Restart a database instance

**start-db-instance**
> Start a stopped instance

**stop-db-instance**
> Stop a running instance

**create-db-snapshot**
> Create a manual backup

**restore-db-instance-from-db-snapshot**
> Restore from backup

**create-db-instance-read-replica**
> Create a read replica

**create-db-cluster**
> Create an Aurora cluster

**failover-db-cluster**
> Trigger Aurora failover

# CAVEATS

Instance modifications may cause brief downtime unless Multi-AZ is enabled. Storage can only be increased, not decreased. Some engine versions cannot be downgraded. Final snapshots are recommended before deletion but incur storage costs.

# HISTORY

Amazon RDS launched in **October 2009** with MySQL support. PostgreSQL was added in **2013**, Aurora in **2014**. Multi-AZ deployments, read replicas, and encryption options have expanded over time. Blue/Green deployments for zero-downtime upgrades launched in **2022**.

# SEE ALSO

[aws](/man/aws)(1), [aws-aurora](/man/aws-aurora)(1), [mysql](/man/mysql)(1), [psql](/man/psql)(1)
