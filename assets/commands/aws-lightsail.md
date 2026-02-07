# TAGLINE

Manage simplified virtual servers, databases, and storage.

# TLDR

**Create a new instance** (virtual private server)

```aws lightsail create-instances --instance-names [my-instance] --availability-zone [us-east-1a] --blueprint-id [amazon_linux_2] --bundle-id [nano_2_0]```

**List all instances**

```aws lightsail get-instances```

**Get instance state** and public IP

```aws lightsail get-instance --instance-name [my-instance]```

**Stop an instance**

```aws lightsail stop-instance --instance-name [my-instance]```

**Create a snapshot** of an instance

```aws lightsail create-instance-snapshot --instance-name [my-instance] --instance-snapshot-name [my-snapshot]```

**Allocate a static IP** and attach to instance

```aws lightsail allocate-static-ip --static-ip-name [my-ip] && aws lightsail attach-static-ip --static-ip-name [my-ip] --instance-name [my-instance]```

**Create a managed database**

```aws lightsail create-relational-database --relational-database-name [my-db] --availability-zone [us-east-1a] --relational-database-blueprint-id [mysql_8_0] --relational-database-bundle-id [micro_2_0] --master-database-name [mydb] --master-username [admin]```

# SYNOPSIS

**aws lightsail** _command_ [_options_]

# DESCRIPTION

**aws lightsail** is the AWS CLI interface for Amazon Lightsail, a simplified cloud platform for developers who need virtual servers, storage, databases, and networking with predictable pricing. Lightsail provides pre-configured blueprints for common applications.

Lightsail offers instances, containers, managed databases, object storage, load balancers, CDN distributions, and DNS management. It's designed for simpler workloads that don't require the full flexibility of EC2 and other AWS services.

# COMMANDS

**create-instances**
> Launch a new virtual private server

**get-instances**
> List all instances

**get-instance**
> Get details of a specific instance

**start-instance**
> Start a stopped instance

**stop-instance**
> Stop a running instance

**reboot-instance**
> Restart an instance

**create-instance-snapshot**
> Create a backup snapshot

**allocate-static-ip**
> Reserve a static IP address

**create-relational-database**
> Create a managed database

**create-bucket**
> Create object storage bucket

**create-load-balancer**
> Create a load balancer

# CAVEATS

Lightsail instances cannot be converted to EC2 instances directly. Resource limits are more restrictive than standard AWS services. VPC peering with other AWS services requires additional setup. Snapshots are stored in the same region only.

# HISTORY

Amazon Lightsail launched in **November 2016** as a simplified entry point to AWS. Container services were added in **2020**. The service has expanded to include managed databases, object storage, CDN distributions, and domain management while maintaining its simple pricing model.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1)
