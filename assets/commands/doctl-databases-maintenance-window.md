# TLDR

**Get maintenance window**

```doctl databases maintenance-window get [cluster_id]```

**Update maintenance window**

```doctl databases maintenance-window update [cluster_id] --day [monday] --hour [02:00]```

# SYNOPSIS

**doctl** **databases** **maintenance-window** _command_ [_options_]

# SUBCOMMANDS

**get**
> Get maintenance window.

**update**
> Update maintenance window.

# PARAMETERS

**--day** _string_
> Day of week (monday through sunday).

**--hour** _string_
> Hour in UTC (00:00 through 23:00).

# DESCRIPTION

**doctl databases maintenance-window** manages the maintenance window for DigitalOcean managed database clusters. Maintenance includes updates and patches applied during this window.

# SEE ALSO

[doctl-databases](/man/doctl-databases)(1)

