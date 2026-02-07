# TAGLINE

move running processes to a cgroup

# TLDR

Move a process to the **CPU cgroup** "student"

```cgclassify -g [cpu:student] [1234]```

Move a process based on **/etc/cgrules.conf**

```cgclassify [1234]```

Move to cgroup with **sticky** mode

```cgclassify --sticky -g [cpu:/student] [1234]```

# SYNOPSIS

**cgclassify** [_options_] _pid_...

# DESCRIPTION

**cgclassify** moves running processes to control groups (cgroups). This allows changing resource limits and accounting for already-running processes without restarting them.

When used without the -g option, processes are classified according to rules in **/etc/cgrules.conf**.

# PARAMETERS

**-g** _controllers:path_
> Move process to specified cgroup hierarchy

**--sticky**
> Prevent cgred daemon from reclassifying the process

**--cancel-sticky**
> Allow cgred to manage the process again

# CONFIGURATION

**/etc/cgrules.conf**
> Rules for automatic cgroup classification when -g is not specified.

**/etc/cgconfig.conf**
> Cgroup hierarchy and controller configuration.

# CAVEATS

Requires cgroups v1 tools (libcgroup). For cgroups v2, use different tools. Moving processes between cgroups may affect their resource access immediately.

# SEE ALSO

[cgcreate](/man/cgcreate)(1), [cgexec](/man/cgexec)(1), [cgroups](/man/cgroups)(7)
