# TAGLINE

Slurm REST API interface daemon

# TLDR

Start REST API on a **port**

```slurmrestd [host]:port```

Start on a **Unix socket**

```slurmrestd unix:/path/to/socket```

Change **group ID** before processing requests

```slurmrestd -g [group_id] [host]:port```

Specify **authentication plugins**

```slurmrestd -a [auth_plugins] [host]:port```

Read configuration from **file**

```slurmrestd -f [path/to/slurm.conf]```

Change **user ID** before processing

```slurmrestd -u [user_id] [host]:port```

**Generate** OpenAPI specification

```slurmrestd --generate-openapi-spec```

# SYNOPSIS

**slurmrestd** [_OPTIONS_]... <[_host_]:_port_|unix:/_path/to/socket_>...

# PARAMETERS

**-a** _plugin[,plugin]_
> Comma-delimited list of authentication plugins to load

**-d** _plugin[,plugin]_
> Data parser plugins for output formatting

**-s** _plugin[,plugin]_
> OpenAPI plugins determining available endpoints

**-f** _file_
> Read Slurm configuration from specified file

**-g** _group_id_
> Change group ID and drop supplemental groups

**-u** _user_id_
> Change user ID before processing requests

**-t** _count_
> Number of processing threads

**--max-connections** _count_
> Maximum concurrent connections (default: 124)

**--generate-openapi-spec**
> Output JSON OpenAPI schema and exit

**-v**
> Verbose mode (up to 6 levels)

**-V**
> Print version information

**-h**
> Display help

# DESCRIPTION

**slurmrestd** provides a REST API interface to Slurm workload manager. It operates in two modes: **Inetd Mode** for piped input via inetd, xinetd, or systemd socket activation, and **Listen Mode** for opening sockets on specified addresses.

The daemon supports authentication via local UNIX socket credentials or JWT tokens. Multiple listening endpoints can be specified, including TCP ports and Unix sockets. TLS encryption is supported by prefixing addresses with **https://**.

# CAVEATS

Requires proper Slurm configuration and authentication setup. JWT authentication requires proper key configuration. Running with elevated privileges then dropping to unprivileged user is recommended. API endpoints vary based on loaded plugins and Slurm version.

# HISTORY

**slurmrestd** was added to Slurm in version **20.02** (released **2020**) to provide modern REST API access for programmatic cluster interaction. It enables integration with web interfaces, monitoring systems, and automation tools. Maintained by **SchedMD** as part of the core Slurm distribution.

# SEE ALSO

[slurmctld](/man/slurmctld)(8), [sbatch](/man/sbatch)(1), [squeue](/man/squeue)(1), [sacct](/man/sacct)(1)
