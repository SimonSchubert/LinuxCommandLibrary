# TLDR

**Run command with arguments from stdin**

```echo [file1 file2] | xargs rm```

**Use custom delimiter**

```echo "[a:b:c]" | xargs -d ":" echo```

**Run with placeholder**

```find . -name "*.txt" | xargs -I {} cp {} [/backup/]```

**Run in parallel**

```find . -name "*.jpg" | xargs -P [4] -I {} convert {} {}.png```

**Handle filenames with spaces**

```find . -name "*.txt" -print0 | xargs -0 rm```

**Limit arguments per command**

```echo {1..100} | xargs -n [10] echo```

**Prompt before execution**

```find . -name "*.tmp" | xargs -p rm```

**Run even with empty input**

```echo "" | xargs -r echo "not empty"```

# SYNOPSIS

**xargs** [_-I replace_] [_-n max-args_] [_-P max-procs_] [_-0_] [_-d delim_] [_command_]

# PARAMETERS

**-I** _REPLACE_
> Replace string in command.

**-n** _NUM_, **--max-args** _NUM_
> Maximum arguments per command.

**-P** _NUM_, **--max-procs** _NUM_
> Parallel processes.

**-0**, **--null**
> Input items are null-terminated.

**-d** _DELIM_, **--delimiter** _DELIM_
> Input delimiter character.

**-p**, **--interactive**
> Prompt before each execution.

**-t**, **--verbose**
> Print commands before execution.

**-r**, **--no-run-if-empty**
> Don't run if input is empty.

**-L** _NUM_, **--max-lines** _NUM_
> Use NUM lines per command.

**-s** _NUM_, **--max-chars** _NUM_
> Maximum command line length.

**-a** _FILE_, **--arg-file** _FILE_
> Read arguments from file.

**-x**, **--exit**
> Exit if command line too long.

**--show-limits**
> Show system limits.

# DESCRIPTION

**xargs** builds and executes commands from standard input. It converts input into arguments for a command, handling batching, parallelization, and argument limits.

By default, xargs appends all input as arguments to a single command invocation. The -n option limits arguments per invocation, running the command multiple times.

The -I flag enables argument placement anywhere in the command. {} (or any placeholder) is replaced with each input item. This runs the command once per input item.

Parallel execution (-P) runs multiple commands simultaneously. Combined with -n or -I, this processes items concurrently, utilizing multiple CPU cores.

Null-delimited input (-0) handles filenames with spaces, newlines, or special characters safely. Use with find -print0 or similar tools.

Without -r, xargs runs the command even with empty input. The -r flag prevents this, useful when empty input would cause errors.

# CAVEATS

Special characters in filenames cause issues without -0. Shell features (pipes, redirects) need wrapper scripts. Argument limit depends on system. Error handling across parallel jobs is limited. Order not preserved with -P.

# HISTORY

**xargs** originated in **PWB/UNIX** in the **1970s**. It addressed the limitation of shell command line length - programs couldn't accept unlimited arguments. The tool became essential for chaining Unix commands, enabling "do something to many files" patterns that define Unix philosophy.

# SEE ALSO

[find](/man/find)(1), [parallel](/man/parallel)(1), [apply](/man/apply)(1)
