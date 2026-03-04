# TAGLINE

TUI for AWS resource management

# TLDR

**Launch** with default AWS credentials

```claws```

**Use** a specific AWS profile

```claws -p [myprofile]```

**Target** a specific region

```claws -r [us-west-2]```

**Start** directly in the EC2 view

```claws -s ec2```

**Multi-profile** and multi-region mode

```claws -p [dev],[prod] -r [us-east-1],[ap-northeast-1]```

**Safe browsing** with no destructive actions

```claws --read-only```

# SYNOPSIS

**claws** [_flags_]

# PARAMETERS

**-p**, **--profile** _name_
> Specify AWS profile(s); comma-separated or repeated for multiple.

**-r**, **--region** _name_
> Specify AWS region(s); comma-separated or repeated for multiple.

**-s**, **--service** _name_
> Start directly on a specific service/view (e.g., dashboard, ec2, rds/snapshots).

**--read-only**
> Disable all destructive actions.

# DESCRIPTION

**claws** is an interactive terminal UI for managing AWS resources, inspired by **k9s** (the Kubernetes cluster TUI). It supports approximately 70 AWS services and 175 resource types, including EC2, S3, Lambda, RDS, ECS, EKS, IAM, and CloudWatch. It uses vim-style keybindings for navigation.

Key capabilities include starting and stopping EC2 instances, cross-resource navigation (VPCs to subnets, functions to log groups), multi-profile and multi-region switching with parallel queries, fuzzy search and tag-based filtering, resource comparison with side-by-side diff, built-in AI assistant powered by AWS Bedrock, 6 color themes, and copy shortcuts for resource IDs and ARNs.

# KEY BINDINGS

```
j/k      Navigate up/down     Enter/d  View details
/        Fuzzy search         :        Command mode
a        Actions menu         A        AI Chat (Bedrock)
R        Select region(s)     P        Select profile(s)
Tab      Cycle resource type  m        Mark for comparison
y/Y      Copy ID / ARN        q        Quit
```

# CAVEATS

Requires valid AWS credentials configured via **~/.aws/credentials**, environment variables, or SSO. The AI Chat feature requires access to AWS Bedrock. The **--read-only** flag is recommended when browsing production environments to prevent accidental destructive actions.

# HISTORY

**claws** was first released in **December 2024** with rapid iteration through early 2025. Written in Go using the Bubbletea and Lipgloss TUI frameworks with the AWS SDK for Go v2. Licensed under Apache License 2.0.

# SEE ALSO

[aws](/man/aws)(1), [k9s](/man/k9s)(1), [lazydocker](/man/lazydocker)(1)
