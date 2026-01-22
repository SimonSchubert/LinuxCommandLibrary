# TLDR

Display information about **all CPUs**

```lscpu```

Display information in a **table format**

```lscpu -e```

Display only information about **online CPUs**

```lscpu -e -b```

Display only information about **offline CPUs**

```lscpu -e -c```

Display details about **CPU caches**

```lscpu -C```

Display information in **JSON format**

```lscpu -J```

# SYNOPSIS

**lscpu** [_-e_] [_-b_] [_-c_] [_-C_] [_-J_] [_-p_]

# DESCRIPTION

**lscpu** displays information about the CPU architecture gathered from /proc/cpuinfo and sysfs. It shows CPU model, cores, threads, caches, NUMA nodes, and CPU flags.

# PARAMETERS

**-e, --extended**
> Display information in extended (table) format

**-b, --online**
> Limit display to online CPUs (with -e)

**-c, --offline**
> Limit display to offline CPUs (with -e)

**-C, --caches**
> Display details about CPU caches

**-J, --json**
> Output in JSON format

**-p, --parse**
> Optimize output for parsing

**-x, --hex**
> Use hexadecimal masks for CPU sets

**-y, --physical**
> Print physical IDs instead of logical

**-s, --sysroot dir**
> Use specified directory as system root

# CAVEATS

Information varies by architecture and kernel version. Some fields may not be available on all systems.

# HISTORY

Part of **util-linux** package. Provides a convenient way to view CPU information that would otherwise require parsing /proc/cpuinfo.

# SEE ALSO

[cpuinfo](/man/cpuinfo)(5), [dmidecode](/man/dmidecode)(8), [nproc](/man/nproc)(1)
