# TAGLINE

manage deployment environments and protection rules

# TLDR

**List environments**

```gh environment list```

**View environment details**

```gh environment view [env_name]```

# SYNOPSIS

**gh** **environment** _command_ [_options_]

# SUBCOMMANDS

**list**
> List environments.

**view**
> View environment details.

# PARAMETERS

**-R**, **--repo** _owner/repo_
> Repository.

# DESCRIPTION

**gh environment** manages GitHub repository environments used in deployment workflows. Environments represent deployment targets like production, staging, or development with configurable protection rules and environment-specific secrets.

Protection rules can require manual approvals, enforce wait timers, or restrict deployments to specific branches. Environment secrets provide secure storage for credentials and configuration needed for deployments without exposing them in workflow files.

Managing environments through the CLI enables automation of deployment infrastructure setup and configuration.

# SEE ALSO

[gh](/man/gh)(1), [gh-secret](/man/gh-secret)(1)

