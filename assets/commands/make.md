# TAGLINE

builds programs from source

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

**make** is a build automation tool that reads instructions from a Makefile to compile and link programs from source code. Each Makefile defines targets (the files to build), their dependencies (the source files they rely on), and the shell commands needed to produce them. When invoked, make constructs a dependency graph and executes only the commands whose targets are out of date.

The tool determines what needs rebuilding by comparing file modification timestamps -- if a source file is newer than its corresponding target, that target is rebuilt along with anything that depends on it. This incremental approach avoids redundant recompilation and can dramatically speed up large builds. The `-j` flag enables parallel execution of independent targets across multiple CPU cores, further reducing build times.

Make's rule-based system also supports pattern rules, implicit rules, and variables, allowing concise Makefiles that scale from simple single-file projects to complex multi-directory software systems.

# CAVEATS

Tab characters required. Different make implementations. Parallel builds may have issues.

# HISTORY

make was created by **Stuart Feldman** at Bell Labs in 1976, revolutionizing software building automation.

# SEE ALSO

[cmake](/man/cmake)(1), [ninja](/man/ninja)(1), [autoconf](/man/autoconf)(1)

