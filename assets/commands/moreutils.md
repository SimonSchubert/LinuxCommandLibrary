# TAGLINE

collection of useful Unix utilities that don't quite fit anywhere else

# TLDR

**Sponge: absorb stdin then write**

```cat [file] | grep [pattern] | sponge [file]```

**Ts: add timestamps**

```[command] | ts '[%Y-%m-%d %H:%M:%S]'```

**Chronic: quiet unless error**

```chronic [command]```

**Pee: tee to commands**

```echo "[data]" | pee 'wc -l' 'wc -c'```

**Vidir: edit directory with editor**

```vidir [directory]```

**Parallel: run a command for each argument concurrently**

```parallel -j [4] [cmd] -- [arg1] [arg2] [arg3]```

**Ifne: run command only if stdin is non-empty**

```[command] | ifne [other_command]```

**Errno: look up errno values**

```errno [ENOENT]```

# SYNOPSIS

**moreutils** - collection of Unix tools

# DESCRIPTION

**moreutils** is a collection of useful Unix utilities that don't quite fit anywhere else. Each tool does one thing well and integrates with standard Unix pipelines.

Key tools include sponge, ts, chronic, vidir, parallel, ifdata, and more.

# KEY UTILITIES

```
sponge   - Soak up stdin, then write to file
ts       - Prepend timestamps to lines
chronic  - Run a command quietly unless it fails
vidir    - Edit a directory listing in $EDITOR
parallel - Run multiple jobs concurrently
pee      - Tee stdin to multiple command pipelines
ifdata   - Query network interface info
combine  - Combine sets of lines from two files (and, or, not, xor)
ifne     - Run a command only if stdin is non-empty
errno    - Look up errno names and descriptions
mispipe  - Pipe two commands, returning the exit status of the first
isutf8   - Check if files are valid UTF-8
lckdo    - Run a command with a lock held
zrun     - Decompress arguments before running a command
```

# SPONGE EXAMPLE

```bash
# Edit file in place (normally fails)
sort file | sponge file
```

# CAVEATS

Tool availability varies by package version. Some tools conflict with other packages (parallel vs GNU parallel).

# HISTORY

moreutils was created by **Joey Hess** starting in **2006** as a collection of small, useful tools missing from standard Unix.

# SEE ALSO

[coreutils](/man/coreutils)(1), [parallel](/man/parallel)(1), [ts](/man/ts)(1), [sponge](/man/sponge)(1)
