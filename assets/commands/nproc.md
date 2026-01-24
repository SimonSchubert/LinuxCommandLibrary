# TLDR

**Print number of processing units**

```nproc```

**Print all installed processors** (ignoring cgroups)

```nproc --all```

**Print number minus N**

```nproc --ignore [2]```

**Use in make for parallel jobs**

```make -j$(nproc)```

# SYNOPSIS

**nproc** [_--all_] [_--ignore=N_] [_options_]

# PARAMETERS

**--all**
> Print total number of installed processors, ignoring cgroup limits.

**--ignore=** _N_
> Exclude N processors from count.

**--help**
> Display help.

**--version**
> Display version.

# DESCRIPTION

**nproc** prints the number of processing units available to the current process. This is useful for parallelizing builds and other workloads.

By default, nproc respects cgroup limits, returning the number of CPUs available within containerized environments. This makes it container-aware - a container limited to 4 CPUs will see 4, not the host's full CPU count.

The **--all** option ignores cgroup limits and returns the total number of installed processors. This is useful when you need to know the actual hardware regardless of containerization.

Combined with **--ignore**, you can reserve CPUs for system tasks. For example, `nproc --ignore=1` leaves one core free.

Common usage is setting parallel build jobs: `make -j$(nproc)` compiles with one job per available processor. This maximizes build speed while respecting system limits.

# CAVEATS

Does not account for hyperthreading - two hyperthreads on one core count as two processors. May not reflect current CPU frequency or thermal throttling. SMT siblings are counted as separate processors. Results may vary in virtualized environments.

# HISTORY

**nproc** is part of **GNU coreutils**. It was added to provide a portable way to query CPU count, replacing platform-specific methods. The command became essential for build systems and parallel processing scripts, providing consistent behavior across systems.

# SEE ALSO

[lscpu](/man/lscpu)(1), [getconf](/man/getconf)(1), [parallel](/man/parallel)(1), [make](/man/make)(1)
