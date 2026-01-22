# TLDR

**Write stdin to file and stdout**

```echo "text" | tee [file]```

**Append to file** instead of overwriting

```echo "text" | tee -a [file]```

**Write to multiple files**

```echo "text" | tee [file1] [file2]```

**Write command output to file** while viewing it

```[command] | tee [output.log]```

**Use with sudo** to write to protected files

```echo "text" | sudo tee [/etc/file]```

**Write to file and pipe** to another command

```[command] | tee [file] | [another_command]```

**Suppress stdout** (write to file only)

```[command] | tee [file] > /dev/null```

# SYNOPSIS

**tee** [_options_] [_file_...]

# PARAMETERS

**-a**, **--append**
> Append to files instead of overwriting

**-i**, **--ignore-interrupts**
> Ignore SIGINT (interrupt signal)

**-p**
> Diagnose errors writing to non-pipes

**--output-error**[=_mode_]
> Set behavior on write error (warn, warn-nopipe, exit, exit-nopipe)

**--help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**tee** reads from standard input and writes to both standard output and one or more files simultaneously. Named after the T-shaped pipe fitting in plumbing, it "splits" the data stream.

Common uses include logging command output while still viewing it, saving intermediate pipeline results for debugging, and writing to files requiring elevated privileges via sudo.

Without **-a**, tee overwrites existing files. With multiple files, the same content is written to all of them.

Tee continues the pipeline—output goes to both files and stdout, allowing further processing with additional pipe stages.

# CAVEATS

For writing to protected files with sudo, use **sudo tee** rather than **sudo echo >** because redirection happens in the current shell before sudo.

In pipelines with **set -o pipefail**, tee failures can go unnoticed. Use **--output-error=exit** for strict error handling.

When combined with commands that buffer output, you may not see immediate results. Use **stdbuf** or command-specific unbuffering options if needed.

# SEE ALSO

[cat](/man/cat)(1), [script](/man/script)(1), [pv](/man/pv)(1), [sponge](/man/sponge)(1)
