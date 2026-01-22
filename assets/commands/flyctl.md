# TLDR

**Launch new app**

```flyctl launch```

**Deploy application**

```flyctl deploy```

**List apps**

```flyctl apps list```

**View logs**

```flyctl logs```

**SSH into machine**

```flyctl ssh console```

# SYNOPSIS

**flyctl** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: launch, deploy, apps, logs, ssh, etc.

**launch**
> Create and deploy new app.

**deploy**
> Deploy current directory.

**apps** _SUBCMD_
> Manage applications.

**logs**
> View application logs.

**ssh** _SUBCMD_
> SSH access to machines.

**secrets** _SUBCMD_
> Manage secrets/environment.

**scale** _SUBCMD_
> Adjust resources.

**--help**
> Display help information.

# DESCRIPTION

**flyctl** (also available as fly) is the CLI for Fly.io, a platform for deploying applications globally on edge infrastructure. It manages applications, deployments, and platform resources.

The tool deploys Docker containers or builds from source, distributing them across Fly's global network. It handles secrets, volumes, scaling, and networking configuration.

flyctl enables full platform control from the command line, from initial launch to production management.

# CAVEATS

Requires Fly.io account. Usage incurs costs. Some features region-dependent.

# HISTORY

flyctl is the CLI for **Fly.io**, a platform launched in 2017 focusing on edge deployment. It positions applications close to users worldwide using lightweight VMs.

# SEE ALSO

[docker](/man/docker)(1), [heroku](/man/heroku)(1), [railway](/man/railway)(1)
