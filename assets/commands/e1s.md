# TAGLINE

AWS ECS terminal dashboard (like k9s for ECS)

# TLDR

**Launch** the ECS dashboard

```e1s```

**Connect** to specific AWS profile

```e1s --profile [profile_name]```

**View** specific cluster on startup

```e1s --cluster [cluster_name]```

**Connect** to specific region

```e1s --region [us-west-2]```

# SYNOPSIS

**e1s** [_options_]

# PARAMETERS

**--profile** _NAME_
> AWS profile to use

**--region** _REGION_
> AWS region (default: from config)

**--cluster** _NAME_
> ECS cluster to view

**--service** _NAME_
> ECS service to view

**--readonly**
> Start in read-only mode

**-c, --config** _FILE_
> Configuration file path

**--debug**
> Enable debug logging

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**e1s** is a terminal user interface for Amazon ECS (Elastic Container Service), inspired by k9s for Kubernetes. It provides a real-time dashboard for monitoring ECS clusters, services, tasks, and containers.

The tool allows users to view resource status, view logs, execute commands in containers, and manage deployments without leaving the terminal. It integrates with AWS credentials and supports multiple profiles and regions.

# KEYBINDINGS

**:**
> Command mode

**/**
> Filter resources

**↑/↓**
> Navigate resources

**Enter**
> View resource details

**l**
> View logs

**s**
> Shell into container

**d**
> Describe resource

**r**
> Restart service/task

**ctrl-d**
> Delete resource

**q**
> Quit

**?**
> Show help

# CAVEATS

Requires AWS credentials with appropriate ECS permissions. Some operations require additional IAM permissions. Log streaming may incur AWS CloudWatch costs. Network connectivity to AWS required.

# HISTORY

**e1s** was created as the ECS equivalent of k9s, bringing the powerful terminal-based management experience to AWS ECS users. It fills the gap for users managing containerized applications on ECS.

# SEE ALSO

[aws](/man/aws)(1), [ecs-cli](/man/ecs-cli)(1), [k9s](/man/k9s)(1), [docker](/man/docker)(1)