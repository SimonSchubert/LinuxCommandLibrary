# TAGLINE

launches MPI parallel programs

# TLDR

**Run** a parallel MPI program with N processes

```mpiexec -n [4] [program]```

**Run across hosts** listed in a hostfile

```mpiexec -n [8] -f [hostfile] [program]```

**Run on a specific host**

```mpiexec -host [host1,host2] -n [4] [program]```

**Run different programs** in the same MPI job (MPMD)

```mpiexec -n [2] [prog_a] : -n [4] [prog_b]```

**Pass an environment variable** to the launched ranks

```mpiexec -genv [OMP_NUM_THREADS] [2] -n [4] [program]```

**Show what would be launched** without running

```mpiexec -info```

# SYNOPSIS

**mpiexec** [_global-options_] [_local-options_ _executable_ [_args_]] [**:** _local-options_ _executable_ [_args_]]...

# PARAMETERS

**-n** _num_, **-np** _num_
> Number of processes (ranks) to launch.

**-f** _hostfile_, **-machinefile** _hostfile_
> File listing nodes (and optional slot counts) to use.

**-host** _hostlist_
> Comma-separated list of hosts.

**-hosts** _hostlist_
> Same as **-host** (Open MPI).

**-ppn** _num_, **-perhost** _num_
> Processes per node.

**-wdir** _dir_
> Working directory for launched processes.

**-env** _var_ _value_
> Set an environment variable for this command segment.

**-genv** _var_ _value_
> Set an environment variable globally for all segments.

**-envlist** _list_
> Forward the named variables from the launching environment.

**-bind-to** _target_
> Bind processes (core, socket, numa, none).

**-map-by** _policy_
> Process placement policy (slot, node, socket, numa, ...).

**-x** _VAR_
> Open MPI: export environment variable to remote processes.

**-info**
> Print build/configuration information for the MPI runtime.

# DESCRIPTION

**mpiexec** is the standard MPI process launcher defined by the MPI-2 specification. It starts a parallel MPI job by spawning the requested number of processes (ranks) and arranging the communication infrastructure between them. The exact implementation depends on which MPI is installed: **MPICH** / Hydra, **Open MPI**, Intel MPI, and others all provide an **mpiexec** binary with overlapping but not identical option sets.

**mpiexec** also supports MPMD (Multiple Program, Multiple Data) jobs, in which several executables run together as one MPI world by separating their arguments with a colon (**:**).

On most implementations **mpirun** is a synonym (sometimes the canonical name) for **mpiexec**; the two are interchangeable for the common cases.

# CAVEATS

Flags differ subtly between MPI implementations (especially Hydra vs. Open MPI); a script that works against one launcher may need adjustment for another. The launcher must be able to reach every host (typically via SSH) and the MPI runtime libraries must match across the nodes. Mixing **mpiexec** binaries from different MPI installations in a single shell session leads to confusing failures.

# HISTORY

**mpiexec** was introduced in the **MPI-2** standard (1997) as a portable, recommended way to launch MPI programs, replacing implementation-specific launchers. Modern MPI distributions still ship both **mpiexec** and **mpirun**.

# SEE ALSO

[mpirun](/man/mpirun)(1), [mpicc](/man/mpicc)(1)

