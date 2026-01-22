# TLDR

**Check** configuration validity

```amadmin [config_name] config```

**List** backup status

```amadmin [config_name] status```

Force a **new full backup**

```amadmin [config_name] force [hostname]```

**Delete** a specific backup

```amadmin [config_name] delete host [hostname]```

List **disks** in configuration

```amadmin [config_name] disklist```

# SYNOPSIS

**amadmin** _config_ _command_ [_args_]

# DESCRIPTION

**amadmin** is the administrative interface for Amanda (Advanced Maryland Automatic Network Disk Archiver), an open-source backup solution. It performs backup management tasks including checking configurations, forcing backups, and managing tape/disk labels.

The tool provides control over backup schedules, storage allocation, and retention policies defined in Amanda configurations.

# PARAMETERS

**config**
> Show and validate configuration

**status**
> Display current backup status

**disklist**
> List configured disks

**force** _host_
> Force a full backup on next run

**unforce** _host_
> Remove force flag

**delete host** _host_
> Delete host from tape database

**delete tape** _label_
> Delete tape/volume from database

**balance**
> Show backup level balance

# CAVEATS

Requires Amanda to be properly installed and configured. Some operations require appropriate permissions. Changes affect the next scheduled backup run.

# HISTORY

**Amanda** was developed at the University of Maryland starting in **1991**. It became one of the most widely used open-source backup solutions for Unix systems, with amadmin providing its administrative interface.

# SEE ALSO

[amcheck](/man/amcheck)(8), [amdump](/man/amdump)(8), [amrecover](/man/amrecover)(8)
