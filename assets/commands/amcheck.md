# TLDR

**Run all checks** (client and server) for a configuration

```amcheck [config_name]```

**Run server-side checks** only (local and tape)

```amcheck -s [config_name]```

**Run client host checks** only

```amcheck -c [config_name]```

**Run local tests** on the server (permissions, etc.)

```amcheck -l [config_name]```

**Run tape tests** on the server

```amcheck -t [config_name]```

**Check specific clients** only

```amcheck -c [config_name] [client1] [client2]```

**Override a configuration option**

```amcheck -o [tapetype=EXABYTE] [config_name]```

# SYNOPSIS

**amcheck** [**-am**] [**-w**] [**-sclt**] [**-M** _address_] [**--client-verbose**] [**-o** _configoption_] _config_ [_host_ [_disk_]...]

# PARAMETERS

**-s**
> Run server-side checks (equivalent to -lt)

**-c**
> Run client host checks; optionally specify specific clients

**-l**
> Run local tests on the server host (permissions, configuration)

**-t**
> Run tape tests on the server host (verify correct tape is mounted)

**-m**
> Send results via email to the address specified in amanda.conf

**-M** _address_
> Send results to the specified email address

**-w**
> Enable a more thorough tape check that overwrites the tape label

**-a**
> Skip client checks if they fail

**--client-verbose**
> Print verbose client output

**-o** _name=value_
> Override a configuration option from amanda.conf

_config_
> Amanda configuration name to check

_host_
> Specific client hostname to check

_disk_
> Specific disk expression to check

# DESCRIPTION

**amcheck** performs self-checks on both the Amanda backup server and client hosts before a backup run. It helps identify potential issues that could cause backup failures, such as incorrect tape mounting, permission problems, or unreachable clients.

On the server side, amcheck verifies that the correct tape is mounted for the next scheduled backup and checks local configuration and permissions. On client hosts, it confirms that the Amanda client daemon is running and that the backup server has proper permissions to access the filesystems scheduled for backup.

The tool is typically run before scheduled backups or manually by administrators to verify the backup infrastructure is ready. Results can be displayed on standard output or sent via email using the **-m** option. The default behavior runs both client and server checks (**-cs**).

Client checks have a configurable timeout (default 30 seconds) controlled by the **ctimeout** setting in amanda.conf.

# CAVEATS

The **-w** option performs a destructive tape check that overwrites the tape label; use with caution. Client checks require network connectivity and running amandad service on clients. Server checks require appropriate permissions to access tape devices and configuration files.

# HISTORY

Amanda (Advanced Maryland Automatic Network Disk Archiver) was developed at the **University of Maryland** starting in **1991** by James da Silva. It became one of the most widely used open-source backup solutions for Unix systems. The project has been maintained by the Amanda community and **Zmanda** (later acquired by Carbonite) and continues to be actively developed.

# SEE ALSO

[amdump](/man/amdump)(8), [amrecover](/man/amrecover)(8), [amanda](/man/amanda)(8), [amlabel](/man/amlabel)(8), [amreport](/man/amreport)(8)
