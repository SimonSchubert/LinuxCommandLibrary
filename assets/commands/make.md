# TLDR

**Build default target**

```make```

**Build specific target**

```make [target]```

**Build with jobs**

```make -j [4]```

**Use specific makefile**

```make -f [Makefile.custom]```

**Dry run**

```make -n```

**Set variable**

```make [VAR=value]```

**Clean build**

```make clean```

# SYNOPSIS

**make** [_options_] [_target_]

# PARAMETERS

_TARGET_
> Target to build.

**-f** _FILE_
> Use specified makefile.

**-j** _N_
> Parallel jobs.

**-n**
> Dry run (don't execute).

**-B**
> Force rebuild all.

**-C** _DIR_
> Change directory first.

**--help**
> Display help information.

# DESCRIPTION

**make** builds programs from source. It reads Makefiles defining targets, dependencies, and build commands.

The tool only rebuilds what's necessary based on file timestamps. Essential for software development.

make automates building software.

# CAVEATS

Tab characters required. Different make implementations. Parallel builds may have issues.

# HISTORY

make was created by **Stuart Feldman** at Bell Labs in 1976, revolutionizing software building automation.

# SEE ALSO

[cmake](/man/cmake)(1), [ninja](/man/ninja)(1), [autoconf](/man/autoconf)(1)

