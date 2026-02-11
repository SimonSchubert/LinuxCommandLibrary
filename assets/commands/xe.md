# TAGLINE

Simple command execution from stdin

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

**xe** is a simple command execution tool designed as a more intuitive alternative to xargs. It reads input line by line from stdin and executes a specified command for each line, using **{}** as a placeholder for the input value.

The tool supports parallel execution through the **-j** option, allowing multiple jobs to run concurrently for improved throughput. It can also accept arguments directly via **-a** instead of reading from stdin, and supports null-delimited input with **-0** for handling filenames with spaces or special characters.

Compared to xargs, xe provides a cleaner syntax with simpler placeholder substitution and more predictable behavior. It is designed to work naturally in shell pipelines, making it straightforward to process streams of data by applying commands to each input element.

# CAVEATS

Different from xargs. Simpler feature set. Part of moreutils sometimes.

# HISTORY

**xe** was created as a simpler, more intuitive alternative to xargs for command execution.

# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [find](/man/find)(1)
