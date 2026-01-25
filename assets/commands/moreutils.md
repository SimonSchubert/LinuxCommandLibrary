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

**Parallel: run in parallel**

```parallel [cmd] -- [arg1] [arg2] [arg3]```

# SYNOPSIS

**moreutils** - collection of Unix tools

# DESCRIPTION

**moreutils** is a collection of useful Unix utilities that don't quite fit anywhere else. Each tool does one thing well and integrates with standard Unix pipelines.

Key tools include sponge, ts, chronic, vidir, parallel, ifdata, and more.

# KEY UTILITIES

```
sponge   - Soak up stdin, write to file
ts       - Add timestamps to lines
chronic  - Run quietly unless fails
vidir    - Edit directory in $EDITOR
parallel - Run commands in parallel
pee      - Tee to multiple commands
ifdata   - Get network interface info
combine  - Combine file sets
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
