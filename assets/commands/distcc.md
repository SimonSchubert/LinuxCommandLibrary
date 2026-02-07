# TAGLINE

distributed C/C++ compilation across network hosts

# TLDR

**Compile with distcc**

```distcc [gcc] -c [file.c] -o [file.o]```

**Set hosts for distribution**

```export DISTCC_HOSTS="[host1] [host2] [localhost]"```

**Run make with distcc**

```make -j [8] CC="distcc gcc"```

**Monitor compilation**

```distccmon-text [1]```

**Show host status**

```distcc --show-hosts```

# SYNOPSIS

**distcc** [_compiler_] [_args_]

# DESCRIPTION

**distcc** distributes C/C++ compilation across multiple machines on a network. It sends preprocessing output to remote hosts for compilation, speeding up large builds by parallelizing across available CPUs.

The tool acts as a compiler wrapper, deciding whether to compile locally or remotely based on host availability and load. It's transparent to build systems that support CC variable override.

# PARAMETERS

**--show-hosts**
> Display configured hosts.

**--show-principal**
> Show Kerberos principal.

**-j** _n_
> Maximum jobs (in make).

**--randomize**
> Randomize host order.

**--help**
> Display help information.

# ENVIRONMENT

**DISTCC_HOSTS**: Space-separated list of hosts
**DISTCC_DIR**: Override state directory
**DISTCC_LOG**: Log file path
**DISTCC_VERBOSE**: Enable verbose logging

# HOST SPECIFICATION

**hostname**: Simple hostname
**hostname:port**: With custom port
**hostname/limit**: Limit jobs to host
**@hostname**: SSH mode
**--localslots=N**: Local job slots

# CONFIGURATION

**~/.distcc/hosts**
> List of distcc hosts to use for distributed compilation.

**/etc/distcc/hosts**
> System-wide distcc host configuration.

**~/.distcc/state**
> State directory for distcc logs and temporary files.

# CAVEATS

Requires same compiler version on all hosts. Network latency adds overhead for small files. Preprocessing always done locally. Headers must be available locally.

# HISTORY

**distcc** was created by **Martin Pool** in **2002** at Linuxcare. It addressed the need to speed up Linux kernel and large project builds. The tool became widely used in open source development and was later maintained by the community.

# SEE ALSO

[distccd](/man/distccd)(1), [ccache](/man/ccache)(1), [make](/man/make)(1), [gcc](/man/gcc)(1)
