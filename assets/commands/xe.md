# TAGLINE

Simple xargs and apply replacement

# TLDR

**Run command for each line of stdin**

```cat [list.txt] | xe [command]```

**Use {} as placeholder for the argument**

```cat [list.txt] | xe [command] {}```

**Parallel execution with N jobs**

```cat [urls.txt] | xe -j [4] curl {}```

**Pass arguments directly after --**

```xe -a -- mv {} {}.bak -- [file1] [file2]```

**Null-separated input (for filenames with spaces)**

```find . -print0 | xe -0 echo {}```

**Pass up to N arguments per command**

```xe -N [10] rm -- [*.txt]```

**Dry-run: print commands without executing**

```cat list.txt | xe -n [command] {}```

# SYNOPSIS

**xe** [_-0FLnqvR_] [_-I replace-arg_] [_-N maxargs_] [_-j maxjobs_] [_-f argfile_] [_-s shellscript_] [_-a_] [_command_ [_args...]]

# DESCRIPTION

**xe** is a tool for constructing command lines from file listings or arguments, combining the best features of **xargs**(1) and **apply**(1). By default it runs the given command once per input line, substituting **{}** with the argument, making common use cases simpler than **xargs**.

Unlike xargs, xe has sane defaults: it is equivalent to `xargs -d'\n' -I{} -n1 -r`. Arguments can be read from stdin (default), from a file with **-f**, or directly from the command line after **-a**.

**xe** supports parallel execution with **-j**, make-style percent rule matching with **-p**, and can invoke a shell script per argument with **-s**.

# PARAMETERS

**-0**
> Input arguments are separated by NUL bytes instead of newlines. Useful with `find -print0`.

**-a**
> Take arguments from the command line (after the command, separated by **--**) instead of stdin.

**-A** _argsep_
> Use a custom argument separator instead of **--** (implies **-a**).

**-f** _argfile_
> Read arguments from _argfile_ instead of stdin.

**-F**
> Fatal: stop and exit when a command execution fails.

**-I** _replace-arg_
> Set the replacement string (default: **{}**).

**-j** _maxjobs_
> Run up to _maxjobs_ processes concurrently.

**-L**
> Line-buffered output so lines from concurrent jobs do not interleave.

**-N** _maxargs_
> Pass up to _maxargs_ arguments to each command invocation (default: **1**).

**-n**
> Dry-run: print the commands that would be executed without running them.

**-p**
> Make-style percent rule matching for pattern-dispatched commands.

**-q**
> Quiet: redirect stdout/stderr of commands to /dev/null.

**-R**
> Return exit status 122 when no arguments are supplied (instead of 0).

**-s** _shellscript_
> Execute _shellscript_ via the shell; arguments are available as $1, $2, etc.

**-v**
> Verbose: print commands to stderr before running them.

# CAVEATS

**xe** is distinct from the XenServer **xe** CLI and from xargs despite similar goals. If xargs compatibility is required, flags and behavior may differ (for example xe uses **{}** as placeholder by default and always runs one command per argument unless **-N** is given).

# HISTORY

**xe** was written by **Leah Neukirchen** as a modernized replacement for **xargs**(1) and **apply**(1) with saner defaults and a cleaner interface. It is distributed as a small, portable C program.

# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [find](/man/find)(1)
