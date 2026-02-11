# TAGLINE

Repeatedly output a string

# TLDR

**Output 'y' repeatedly** (for auto-confirming prompts)

```yes | [command]```

**Output a custom string repeatedly**

```yes "[custom text]"```

**Auto-answer 'no' to all prompts**

```yes n | [command]```

**Output for a limited number of lines**

```yes | head -n [10]```

# SYNOPSIS

**yes** [_string_]

# PARAMETERS

_string_
> String to output repeatedly (default: "y")

**--help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**yes** outputs a string repeatedly until killed or the pipe closes. By default, it outputs "y" followed by a newline, endlessly.

The primary use is piping to commands that ask for confirmation, automatically answering "y" (or any specified response) to all prompts. This is useful for scripting commands that don't have native batch/quiet modes.

When the receiving command closes its stdin (by exiting), yes terminates automatically due to the broken pipe.

Without piping, yes runs indefinitely and must be interrupted with Ctrl+C.

# EXAMPLES

```bash
# Auto-confirm all prompts
yes | apt upgrade

# Auto-answer 'no'
yes n | rm -i *.txt

# Generate test data
yes "test line" | head -1000 > test.txt

# Stress test (generates output as fast as possible)
yes > /dev/null
```

# CAVEATS

Using yes bypasses safety prompts. Ensure you understand what you're auto-confirming before piping yes to destructive commands.

Some commands detect non-interactive input and refuse to run or behave differently. Use command-specific flags (like **-y** or **--yes**) when available.

Yes runs at maximum speed, which can generate significant CPU load when not piped to anything useful.

# SEE ALSO

[true](/man/true)(1), [false](/man/false)(1), [seq](/man/seq)(1), [timeout](/man/timeout)(1)
