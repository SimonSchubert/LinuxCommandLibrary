# TLDR

**Run command on hosts**

```pdsh -w [host1,host2] [command]```

**Run on host range**

```pdsh -w [host[1-10]] [command]```

**Use SSH**

```pdsh -R ssh -w [hosts] [command]```

**Run with sudo**

```pdsh -w [hosts] sudo [command]```

**Copy files to hosts**

```pdcp -w [hosts] [local_file] [remote_path]```

# SYNOPSIS

**pdsh** [_options_] [_command_]

# PARAMETERS

**-w** _HOSTS_
> Target hosts.

**-R** _MODULE_
> Remote shell module.

**-l** _USER_
> Remote username.

**-t** _TIMEOUT_
> Connect timeout.

**-f** _FANOUT_
> Parallel connections.

# DESCRIPTION

**pdsh** runs commands in parallel. Parallel distributed shell.

The tool executes on multiple hosts. High performance cluster administration.

pdsh executes in parallel.

# CAVEATS

Requires remote access configured. Module dependent (ssh, rsh).

# HISTORY

pdsh was created for **parallel command execution** across cluster nodes.

# SEE ALSO

[ssh](/man/ssh)(1), [pssh](/man/pssh)(1), [ansible](/man/ansible)(1)

