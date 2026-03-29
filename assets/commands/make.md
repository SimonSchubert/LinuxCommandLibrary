# TAGLINE

builds programs from source

# TLDR

**Build the default target**

```make```

**Build a specific target**

```make [target]```

**Run parallel jobs**

```make -j [4]```

**Use a specific makefile**

```make -f [Makefile.custom]```

**Dry run (print commands without executing)**

```make -n```

**Override a variable**

```make [VAR=value] [target]```

**Change to a directory before building**

```make -C [path/to/dir]```

**Force rebuild of all targets**

```make -B```

# SYNOPSIS

**make** [_options_] [_target_] [_VAR=value_ ...]

# PARAMETERS

_TARGET_
> Target to build. Defaults to the first target in the Makefile.

**-f** _FILE_
> Read _FILE_ as the makefile.

**-j** [_N_]
> Run up to _N_ jobs in parallel. Without _N_, no limit is imposed.

**-n**, **--dry-run**
> Print commands that would be executed without running them.

**-B**, **--always-make**
> Unconditionally rebuild all targets.

**-C** _DIR_
> Change to _DIR_ before reading makefiles or doing anything else.

**-k**, **--keep-going**
> Continue building other targets even after an error.

**-s**, **--silent**
> Do not print commands as they are executed.

**-p**
> Print the internal database of rules and variables, then proceed normally.

**-q**, **--question**
> Return exit status 0 if targets are up to date, nonzero otherwise; execute nothing.

**-r**, **--no-builtin-rules**
> Disable built-in implicit rules.

**-d**
> Print verbose debugging information about files and rules considered.

**-I** _DIR_
> Search _DIR_ for included makefiles.

**--help**
> Display help information.

# DESCRIPTION

**make** is a build automation tool that reads instructions from a Makefile to compile and link programs from source code. Each Makefile defines targets (the files to build), their dependencies (the source files they rely on), and the shell commands needed to produce them. When invoked, make constructs a dependency graph and executes only the commands whose targets are out of date.

The tool determines what needs rebuilding by comparing file modification timestamps — if a source file is newer than its corresponding target, that target is rebuilt along with anything that depends on it. This incremental approach avoids redundant recompilation and can dramatically speed up large builds. The `-j` flag enables parallel execution of independent targets across multiple CPU cores, further reducing build times.

Make's rule-based system also supports pattern rules, implicit rules, and variables, allowing concise Makefiles that scale from simple single-file projects to complex multi-directory software systems. Variables can be overridden on the command line (`make CC=clang`), and the special target `clean` is a conventional name for removing build artifacts.

# CAVEATS

Recipe lines in a Makefile must be indented with a real tab character, not spaces. Behavior may differ between GNU make, BSD make, and other implementations. Parallel builds (`-j`) can expose undeclared dependencies.

# HISTORY

make was created by **Stuart Feldman** at Bell Labs in **1976**, making it one of the oldest and most widely used build tools in software development.

# SEE ALSO

[cmake](/man/cmake)(1), [ninja](/man/ninja)(1), [autoconf](/man/autoconf)(1)

