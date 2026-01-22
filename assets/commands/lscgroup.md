# TLDR

**List all cgroups**

```lscgroup```

**List specific controller**

```lscgroup [cpu]```

**List specific cgroup**

```lscgroup [cpu:/mygroup]```

**Show all controllers**

```lscgroup -a```

**List cgroup hierarchy**

```lscgroup [memory]```

# SYNOPSIS

**lscgroup** [_options_] [_controller_]

# PARAMETERS

_CONTROLLER_
> Cgroup controller name.

**-a**
> Show all controllers.

**-g** _GROUP_
> Show specific group.

**--help**
> Display help information.

# DESCRIPTION

**lscgroup** lists cgroups in the system. Cgroups control resource allocation for processes.

The tool shows the cgroup hierarchy for controllers like cpu, memory, and blkio.

lscgroup lists control groups.

# CAVEATS

Cgroups v1 tool. May differ for cgroups v2. Part of libcgroup-tools.

# HISTORY

lscgroup is part of **libcgroup** tools for managing Linux control groups for resource management.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgexec](/man/cgexec)(1), [cgset](/man/cgset)(1)

