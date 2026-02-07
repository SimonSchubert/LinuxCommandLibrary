# TAGLINE

Manage virtual servers and networking on Amazon EC2.

# TLDR

**Launch a new EC2 instance**

```aws ec2 run-instances --image-id [ami-0c55b159cbfafe1f0] --instance-type [t2.micro] --key-name [my-key]```

**List all instances** with their state

```aws ec2 describe-instances --query "Reservations[*].Instances[*].[InstanceId,State.Name,InstanceType]" --output table```

**Stop a running instance**

```aws ec2 stop-instances --instance-ids [i-1234567890abcdef0]```

**Start a stopped instance**

```aws ec2 start-instances --instance-ids [i-1234567890abcdef0]```

**Terminate an instance** permanently

```aws ec2 terminate-instances --instance-ids [i-1234567890abcdef0]```

**Create a security group** and add an SSH rule

```aws ec2 create-security-group --group-name [my-sg] --description "[My security group]" && aws ec2 authorize-security-group-ingress --group-name [my-sg] --protocol tcp --port 22 --cidr 0.0.0.0/0```

**Create a key pair** and save it

```aws ec2 create-key-pair --key-name [my-key] --query "KeyMaterial" --output text > [my-key.pem]```

# SYNOPSIS

**aws ec2** _command_ [_options_]

# DESCRIPTION

**aws ec2** is the AWS CLI interface for Amazon Elastic Compute Cloud (EC2), providing programmatic access to scalable compute capacity. EC2 enables launching virtual servers, configuring networking and security, and managing storage.

EC2 commands cover instance lifecycle management, Amazon Machine Images (AMIs), Elastic Block Store (EBS) volumes, VPC networking, security groups, and key pairs. The service supports on-demand, reserved, and spot pricing models.

# COMMANDS

**run-instances**
> Launch new EC2 instances

**describe-instances**
> List and describe instances

**start-instances**
> Start stopped instances

**stop-instances**
> Stop running instances

**terminate-instances**
> Permanently delete instances

**create-image**
> Create an AMI from an instance

**create-security-group**
> Create a security group

**authorize-security-group-ingress**
> Add inbound rules to security group

**create-key-pair**
> Generate a new key pair

**create-vpc**
> Create a Virtual Private Cloud

**create-volume**
> Create an EBS volume

**attach-volume**
> Attach volume to an instance

# CAVEATS

Instances continue incurring charges until terminated (not just stopped) for EBS-backed instances. Security group rules are stateful but NACLs are not. Instance metadata service (IMDS) v1 is insecure; use IMDSv2. Spot instances can be terminated with 2 minutes notice.

# HISTORY

Amazon EC2 launched in **August 2006** as one of AWS's first services, revolutionizing cloud computing. VPC became mandatory in **2013**. The service has continuously expanded instance types, from the original m1.small to hundreds of specialized types for compute, memory, GPU, and storage optimization.

# SEE ALSO

[aws](/man/aws)(1), [aws-autoscaling](/man/aws-autoscaling)(1), [aws-elb](/man/aws-elb)(1), [aws-vpc](/man/aws-vpc)(1)
