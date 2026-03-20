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
> AWS profile to use.

**--region** _REGION_
> AWS region (default: from config).

**--cluster** _NAME_
> Default ECS cluster to view.

**--service** _NAME_
> Default ECS service to view (requires --cluster).

**--read-only**
> Start in read-only mode.

**-c**, **--config-file** _FILE_
> Config file path (default: ~/.config/e1s/config.yml).

**-r**, **--refresh** _SECONDS_
> Auto-refresh interval in seconds (default: 30, -1 to disable).

**-s**, **--shell** _PATH_
> Shell for interactive exec (default: /bin/sh).

**-d**, **--debug**
> Enable debug logging.

**-l**, **--log-file** _FILE_
> Custom log file path.

**-j**, **--json**
> Output logs in JSON format.

**-v**, **--version**
> Display version and exit.

**-h**, **--help**
> Display help and exit.

# DESCRIPTION

**e1s** is a terminal user interface for Amazon ECS (Elastic Container Service), inspired by k9s for Kubernetes. It provides a real-time dashboard for monitoring ECS clusters, services, tasks, and containers.

The tool allows users to view resource status, view logs, execute commands in containers, and manage deployments without leaving the terminal. It integrates with AWS credentials and supports multiple profiles and regions.

# KEYBINDINGS

**h/j/k/l**
> Vim-style navigation (left/down/up/right)

**Enter**
> View resource details

**/**
> Filter resources

**ctrl-p**
> Switch AWS profile

**ctrl-d**
> Exit interactive exec session

**q**
> Quit

**?**
> Show all keybindings

# CAVEATS

Requires AWS credentials with appropriate ECS permissions. Some operations require additional IAM permissions. Log streaming may incur AWS CloudWatch costs. Network connectivity to AWS required.

# HISTORY

**e1s** was created as the ECS equivalent of k9s, bringing the powerful terminal-based management experience to AWS ECS users. It fills the gap for users managing containerized applications on ECS.

# SEE ALSO

[aws](/man/aws)(1), [k9s](/man/k9s)(1), [docker](/man/docker)(1)