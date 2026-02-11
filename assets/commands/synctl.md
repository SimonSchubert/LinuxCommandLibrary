# TAGLINE

Matrix Synapse homeserver control interface

# TLDR

**Start Synapse server**

```synctl start```

**Stop Synapse server**

```synctl stop```

**Restart Synapse server**

```synctl restart```

**Start with specific config file**

```synctl start [/path/to/homeserver.yaml]```

**Start a specific worker**

```synctl start -w [/path/to/worker.yaml]```

**Restart all workers and main process**

```synctl restart -a [/path/to/workers/]```

# SYNOPSIS

**synctl** {start|stop|restart} [_configfile_] [_options_]

# PARAMETERS

**start**
> Start Synapse server or worker.

**stop**
> Stop Synapse server or worker.

**restart**
> Restart Synapse server or worker.

_configfile_
> Path to configuration file (default: homeserver.yaml).

**-w**, **--worker** _file_
> Operate on a single worker using specified config file.

**-a**, **--all-processes** _dir_
> Operate on all workers in directory and main process.

# DESCRIPTION

**synctl** is the control interface for Matrix Synapse, the reference homeserver implementation for the Matrix communication protocol. It manages starting, stopping, and restarting the Synapse server and its worker processes.

For single-instance deployments, synctl operates on the main homeserver process. For scaled deployments using workers, the -a option manages all worker processes defined in a configuration directory.

Configuration files use YAML format and define server settings, database connections, federation parameters, and resource limits.

# ENVIRONMENT

**SYNAPSE_CACHE_FACTOR**
: Controls memory cache size. Default is 0.5. Decrease to reduce RAM usage or increase for better performance.

# CAVEATS

The configuration file must exist and be valid YAML. When using workers, each worker needs its own configuration file. Memory usage can be significant; tune SYNAPSE_CACHE_FACTOR accordingly. Requires Python 3 and dependencies installed.

# HISTORY

**Synapse** is developed by Element (formerly New Vector) as the reference implementation of the Matrix protocol. Matrix is an open standard for decentralized, real-time communication. Synapse was first released in 2014 and remains the most widely deployed Matrix homeserver.

# SEE ALSO

[register_new_matrix_user](/man/register_new_matrix_user)(1), [hash_password](/man/hash_password)(1), [systemctl](/man/systemctl)(1)
