# TLDR

**Execute for each line**

```cat [list.txt] | xe [command] {}```

**Parallel execution**

```cat [urls.txt] | xe -j [4] curl {}```

**Replace string**

```xe -a [file1] [file2] -- mv {} {}.bak```

**With null separator**

```find . -print0 | xe -0 echo {}```

**Limit processes**

```xe -N [10] -a [*.txt] -- process {}```

# SYNOPSIS

**xe** [_-j jobs_] [_-a args_] [_-0_] [_options_] _command_

# PARAMETERS

**-j** _JOBS_
> Parallel jobs.

**-a** _ARGS_
> Arguments.

**-0**
> Null separator.

**-N** _NUM_
> Max processes.

**{}**
> Placeholder.

# DESCRIPTION

**xe** executes commands. It's like xargs.

Simple replacement. For xargs.

Parallel execution. Multiple jobs.

Clean syntax. Easier placeholders.

Stream processing. Pipe-friendly.

# CAVEATS

Different from xargs. Simpler feature set. Part of moreutils sometimes.

# HISTORY

**xe** was created as a simpler, more intuitive alternative to xargs for command execution.

# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [find](/man/find)(1)
