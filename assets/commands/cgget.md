# TAGLINE

read cgroup parameters

# TLDR

**Display all parameters for a cgroup**

```cgget -a [path/to/cgroup]```

**Display a specific parameter for a cgroup**

```cgget -r [cpu.shares] [path/to/cgroup]```

**Display multiple parameters**

```cgget -r [cpuset.cpus] -r [cpuset.mems] [path/to/cgroup]```

**Display parameters for a specific controller**

```cgget -g [cpu]:[path/to/cgroup]```

**Display values only without parameter names**

```cgget -v -r [memory.limit_in_bytes] [path/to/cgroup]```

**Display without group headers**

```cgget -n -g [cpu] /```

**Show current cgroups setup mode**

```cgget -m```

# SYNOPSIS

**cgget** [**-n**] [**-v**] [**-m**] [**-r** _name_] [**-g** _controller_] [**-a**] _path..._

**cgget** [**-n**] [**-v**] [**-m**] [**-r** _name_] **-g** _controller_**:**_path..._

# DESCRIPTION

**cgget** prints parameters of Linux control groups (cgroups). Cgroups are a kernel mechanism for organizing processes and managing resource allocation including CPU, memory, and I/O.

If no controller or variable is specified, values for all available parameters are displayed. The command supports both cgroup v1 (legacy) and v2 (unified) hierarchies.

# PARAMETERS

**-a, --all**
> Print variables for all controllers in the given cgroup

**-g** _controller_[**:**_path_]
> Specify controller and optionally path to display

**-r, --variable** _name_
> Display specific parameter (can be used multiple times)

**-n**
> Do not print group name headers

**-v, --values-only**
> Print only values without parameter names

**-m**
> Display current cgroups setup mode (legacy, unified, or hybrid)

# CAVEATS

The **CGROUP_LOGLEVEL** environment variable controls verbosity (DEBUG, INFO, WARNING, ERROR).

Requires appropriate permissions to read cgroup parameters. Some parameters may only be available with root access.

# SEE ALSO

[cgset](/man/cgset)(1), [cgcreate](/man/cgcreate)(1), [cgexec](/man/cgexec)(1), [cgroups](/man/cgroups)(7)
