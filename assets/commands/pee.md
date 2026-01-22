# TLDR

**Pipe to multiple commands**

```echo "data" | pee [cmd1] [cmd2]```

**Tee to processes**

```cat [file] | pee "wc -l" "wc -w"```

**Process and save**

```cat [log] | pee "grep error" "cat > copy.log"```

# SYNOPSIS

**pee** [_command_...]

# PARAMETERS

_COMMAND_
> Commands to receive input.

Each command receives a copy of stdin.

# DESCRIPTION

**pee** tees stdin to multiple commands. Like tee but to processes.

The tool duplicates input to commands. Part of moreutils.

pee pipes to multiple commands.

# CAVEATS

Part of moreutils. Each command gets full input. Parallel execution.

# HISTORY

pee is part of **moreutils** for piping to multiple processes.

# SEE ALSO

[tee](/man/tee)(1), [moreutils](/man/moreutils)(7)

