# TLDR

**Open SSH connections to multiple hosts**

```cssh [host1] [host2] [host3]```

**Connect to hosts defined in a cluster tag**

```cssh [cluster_name]```

**Connect with specific username**

```cssh -l [username] [host1] [host2]```

**Connect to hosts from a file**

```cssh -f [hosts.txt]```

**Open connections with custom terminal**

```cssh -T [/usr/bin/xterm] [host1] [host2]```

**List configured clusters**

```cssh -L```

# SYNOPSIS

**cssh** [_options_] [_hosts_|_clusters_]

# PARAMETERS

**-l** _username_
> Username for SSH connections.

**-f** _file_
> Read hosts from file (one per line).

**-T** _terminal_
> Terminal application to use.

**-L**
> List configured clusters.

**-c** _config_
> Use alternate configuration file.

**-o** _options_
> Pass options to SSH.

**-t** _title_
> Set window title.

**-q**
> Quiet mode, suppress warnings.

**-d**
> Enable debug output.

# CONFIGURATION

Clusters defined in **~/.clusterssh/clusters**:
```
webservers web1 web2 web3
dbservers db1 db2
all webservers dbservers
```

# DESCRIPTION

**ClusterSSH** (cssh) opens multiple SSH terminal windows simultaneously, with a control window that broadcasts keystrokes to all connections. This enables running the same commands across multiple servers in parallel.

Each host gets its own xterm window, arranged on screen automatically. Typing in the control window sends input to all terminals simultaneously. Individual terminals can be selected for host-specific commands.

Clusters can be predefined in configuration files, grouping hosts by function (web servers, databases, etc.). Clusters can include other clusters, building hierarchies for complex environments.

# CAVEATS

Requires X11 display; cannot run in headless environments. Screen real estate limits practical simultaneous connections (typically 10-20 hosts). All hosts receive identical input; be careful with destructive commands. Network latency differences may cause commands to execute at slightly different times.

# HISTORY

ClusterSSH was written by **Duncan Ferguson** and first released in the early **2000s**. It addressed the common need to manage multiple similar servers before configuration management tools like Ansible became widespread. The tool remains popular for ad-hoc tasks and interactive troubleshooting where simultaneous access to multiple hosts is beneficial.

# SEE ALSO

[tmux](/man/tmux)(1), [pssh](/man/pssh)(1), [ansible](/man/ansible)(1), [ssh](/man/ssh)(1)
