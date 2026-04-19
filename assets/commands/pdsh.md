# TAGLINE

Parallel distributed shell — run commands on many hosts at once

# TLDR

**Run a command** on a list of hosts

```pdsh -w [host1,host2,host3] [command]```

**Use a host range** (compressed numeric ranges)

```pdsh -w [host[1-10]] [command]```

**Force the SSH** remote command module

```pdsh -R ssh -w [hosts] [command]```

**Read target hosts from a file**

```pdsh -w ^[hosts.txt] [command]```

**Limit the fanout** (concurrent connections)

```pdsh -f [16] -w [hosts] [command]```

**Pipe output through dshbak** to group results per host

```pdsh -w [hosts] [command] | dshbak -c```

# SYNOPSIS

**pdsh** [_options_] [_command_]

# PARAMETERS

**-w** _HOSTS_
> Target host list. Accepts comma-separated names, compressed ranges (host[1-10]), or `^file` to read from a file.

**-x** _HOSTS_
> Exclude these hosts from the target list.

**-R** _MODULE_
> Remote command module: `ssh`, `rsh`, `mrsh`, `exec`, `krb4`, etc. Default depends on build.

**-l** _USER_
> Remote username to log in as.

**-t** _SECONDS_
> Connect timeout per host. Default: 10.

**-u** _SECONDS_
> Per-host command timeout (kills slow commands).

**-f** _NUMBER_
> Maximum number of concurrent (fanout) connections. Default: 32.

**-N**
> Suppress the "hostname:" prefix on each line of output.

**-S**
> Return the largest remote exit status as the pdsh exit code.

**-g** _GROUP_
> Run on a host group defined in dshgroup or genders.

**-a**
> Target all hosts (requires a working host module like genders or machines).

**-q**
> Display the list of targeted hosts and exit without running.

# DESCRIPTION

**pdsh** is a high-performance, parallel remote shell utility. It launches the requested command on many hosts in parallel and merges their stdout/stderr back to the user, prefixed with each host's name.

It was developed at LLNL for cluster administration and supports multiple "remote command modules" (ssh, rsh, mrsh, etc.) selected at build time or via **-R**. Targets can be supplied as explicit lists, compressed numeric ranges, files, dshgroups, or via genders/SLURM modules.

The companion utilities **pdcp** (parallel copy), **rpdcp** (reverse parallel copy), and **dshbak** (group identical output across hosts) round out a small toolkit aimed at scripted cluster operations.

# CAVEATS

Requires the chosen remote shell (typically SSH with key-based auth) to work non-interactively on every target. Output from many hosts is interleaved — pipe through **dshbak** to group it. Quoting can be tricky because the shell on both ends interprets the command string.

# HISTORY

**pdsh** originated at **Lawrence Livermore National Laboratory** in the late 1990s as a successor to IBM's DSH for managing large Linux clusters. It is maintained on GitHub and remains widely used in HPC administration.

# SEE ALSO

[ssh](/man/ssh)(1), [pssh](/man/pssh)(1), [ansible](/man/ansible)(1), [rsync](/man/rsync)(1)

