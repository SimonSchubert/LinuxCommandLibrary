# TLDR

**Get** general help

```aws help```

**Service** help

```aws s3 help```

**Command** help

```aws s3 cp help```

**Subcommand** help

```aws ec2 describe-instances help```

# SYNOPSIS

**aws** [_service_] [_command_] **help**

# DESCRIPTION

**aws help** displays comprehensive documentation for AWS CLI commands. It shows syntax, parameters, examples, and related commands using a pager interface.

Help is available at every level: general CLI help, service-specific help, and individual command help.

# FEATURES

Documentation includes:
- Command syntax and structure
- Parameter descriptions and types
- Usage examples
- Available subcommands
- Output format details
- Related commands

# NAVIGATION

Within help pager:
- **Space** - Page down
- **b** - Page up
- **/** - Search
- **q** - Quit

# WORKFLOW

```bash
# General help
aws help

# S3 service help
aws s3 help

# Specific command help
aws s3 cp help

# EC2 describe-instances help
aws ec2 describe-instances help
```

# CAVEATS

Opens in pager by default (use --no-cli-pager to disable). Requires internet connection for complete documentation in some cases. Help text can be very long for complex commands.

# HISTORY

The **help** command has been part of the AWS CLI since its initial release in **2013**, providing inline documentation for all services and commands.

# SEE ALSO

[aws](/man/aws)(1), [man](/man/man)(1), [less](/man/less)(1)
