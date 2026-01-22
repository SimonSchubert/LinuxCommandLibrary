# TLDR

**Create a new Cloud9 EC2 environment** with a t2.micro instance

```aws cloud9 create-environment-ec2 --name [my-env] --instance-type t2.micro```

**List all Cloud9 environments** in the account

```aws cloud9 list-environments```

**Describe specific environments** by ID

```aws cloud9 describe-environments --environment-ids [env-id-1] [env-id-2]```

**Get the status** of an environment

```aws cloud9 describe-environment-status --environment-id [env-id]```

**Add a member** to an environment with read-write permissions

```aws cloud9 create-environment-membership --environment-id [env-id] --user-arn [arn:aws:iam::account:user/username] --permissions read-write```

**Delete an environment** and its associated EC2 instance

```aws cloud9 delete-environment --environment-id [env-id]```

# SYNOPSIS

**aws cloud9** _command_ [_options_]

# DESCRIPTION

**aws cloud9** is the AWS CLI interface for AWS Cloud9, a cloud-based integrated development environment (IDE) for writing, running, and debugging code. Cloud9 provides a browser-based editor, debugger, and terminal, and comes pre-configured with essential tools for popular programming languages.

Cloud9 environments run on EC2 instances and support collaborative development with real-time pair programming capabilities.

# COMMANDS

**create-environment-ec2**
> Create a new development environment with an EC2 instance

**delete-environment**
> Delete an environment and terminate its EC2 instance

**describe-environments**
> Get details about one or more environments

**describe-environment-status**
> Check the current status of an environment

**list-environments**
> List all environment IDs in the account

**create-environment-membership**
> Add a user to an environment

**update-environment-membership**
> Change a member's permissions

**delete-environment-membership**
> Remove a user from an environment

# CAVEATS

AWS Cloud9 is no longer available to new customers as of **2024**. Existing customers can continue using the service. Environments incur EC2 costs even when the IDE is not actively used unless auto-hibernation is configured.

# HISTORY

AWS Cloud9 was acquired by Amazon in **2016** after being founded as an independent company in **2010**. It was integrated into AWS as a managed service, providing browser-based IDE capabilities. In **2024**, AWS announced Cloud9 would no longer accept new customers.

# SEE ALSO

[aws](/man/aws)(1), [aws-ec2](/man/aws-ec2)(1), [aws-codecommit](/man/aws-codecommit)(1)
