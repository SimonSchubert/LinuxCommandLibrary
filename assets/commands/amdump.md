# TAGLINE

Run Amanda backups

# TLDR

**Run a full backup** using a configuration

```amdump [config_name]```

**Back up specific hosts** only

```amdump [config_name] [host1] [host2]```

**Back up a specific disk** on a host

```amdump [config_name] [hostname] [/path/to/disk]```

**Run backup to holding disk only** (no tape)

```amdump --no-taper [config_name]```

**Override a configuration option**

```amdump -o [runtapes=2] [config_name]```

**Use exact host/disk matching**

```amdump --exact-match [config_name] [hostname] [diskname]```

# SYNOPSIS

**amdump** [**--no-taper**] [**--exact-match**] [**-o** _configoption_...] _config_ [_host_ [_disk_]...]

# PARAMETERS

**--no-taper**
> Dump to holding disk only without writing to tape; enters degraded mode immediately

**--exact-match**
> Parse host and disk arguments as exact values rather than expressions

**-o** _name=value_
> Override a configuration option from amanda.conf

_config_
> Amanda configuration name defining the backup job

_host_
> Specific client hostname to back up

_disk_
> Specific disk or filesystem to back up on the specified host

# DESCRIPTION

**amdump** is the main command for running Amanda backups. It loads the specified configuration and backs up every disk listed in the disklist file, or a subset if specific hosts and disks are provided on the command line.

The command is typically executed via cron for scheduled nightly backups. It coordinates the entire backup process: contacting client hosts, transferring data to holding disk, and writing to tape or other storage media. Amanda's scheduling algorithm determines which filesystems receive full versus incremental backups based on the configured dump cycle.

If a file named **hold** exists in the configuration directory, amdump waits until it is removed before starting, checking every minute. This allows administrators to delay scheduled backups when the tape device is in use elsewhere.

When problems occur, amdump may enter "degraded mode" where backups continue to holding disk but tape writing is skipped. The **--no-taper** option forces this mode intentionally.

# CONFIGURATION

**/etc/amanda/<config>/amanda.conf**
> Amanda server configuration defining tape devices, holding disks, dump types, and scheduling parameters.

**/etc/amanda/<config>/disklist**
> List of client hosts and filesystems to back up.

# CAVEATS

Only one amdump or amflush can run at a time for a given configuration. If a previous run was interrupted, **amcleanup** must be executed before amdump will start. The process requires sufficient holding disk space for intermediate storage during backup operations.

# EXIT CODES

The exit code indicates backup status: **0** = success, **1** = error, **2** = a DLE gave strange message, **4** = a DLE failed, **8** = unknown status for a DLE. Codes are ORed together for multiple conditions.

# HISTORY

Amanda (Advanced Maryland Automatic Network Disk Archiver) was developed at the **University of Maryland** starting in **1991**. It pioneered the concept of holding disk as intermediate storage and intelligent scheduling across backup cycles. The project became a cornerstone of enterprise Unix backup strategies and continues development under open-source community governance.

# SEE ALSO

[amcheck](/man/amcheck)(8), [amrecover](/man/amrecover)(8), [amflush](/man/amflush)(8), [amcleanup](/man/amcleanup)(8), [amanda](/man/amanda)(8)
