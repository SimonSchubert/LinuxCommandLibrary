# TLDR

Create a **cgroup** with specific controller

```cgcreate -g cpu:mygroup```

Create cgroup with **multiple controllers**

```cgcreate -g cpu,memory:mygroup```

Create cgroup with all **mounted controllers**

```cgcreate -g *:mygroup```

Set **tasks file** ownership

```cgcreate -t user:group -g cpu:mygroup```

Set **control files** ownership

```cgcreate -a user:group -g cpu:mygroup```

Set **directory permissions**

```cgcreate -d 755 -g cpu:mygroup```

# SYNOPSIS

**cgcreate** [**-h**] [**-t** _tuid_:_tgid_] [**-a** _agid_:_auid_] [**-f** _mode_] [**-d** _mode_] **-g** _controllers_:_path_ [**-g** ...]

# DESCRIPTION

**cgcreate** creates new cgroups (control groups) used to limit, measure, and control resources used by processes. Cgroup controllers include memory, cpu, cpuset, blkio, net_cls, and others.

# PARAMETERS

**-g CONTROLLERS:PATH**
> Specify controllers and path for the cgroup (required). Controllers can be comma-separated or "*" for all mounted controllers

**-t TUID:TGID**
> Set ownership of the tasks file (determines who can add processes)

**-a AUID:AGID**
> Set ownership of control files (determines who can modify parameters)

**-d, --dperm=MODE**
> Set directory permissions in octal notation (e.g., 755)

**-f, --fperm=MODE**
> Set parameter file permissions in octal notation

**-s, --tperm=MODE**
> Set tasks file permissions in octal notation

**-h, --help**
> Display help information

# CAVEATS

Cgroups v1 and v2 have different hierarchies and features. On cgroups v2 systems, the syntax and available controllers may differ. Created cgroups persist until deleted with cgdelete or system reboot.

# HISTORY

**cgcreate** is part of **libcgroup**, providing user-space tools for managing Linux control groups which were introduced in kernel 2.6.24.

# SEE ALSO

[cgdelete](/man/cgdelete)(1), [cgexec](/man/cgexec)(1), [cgset](/man/cgset)(1), [cgroups](/man/cgroups)(7)
