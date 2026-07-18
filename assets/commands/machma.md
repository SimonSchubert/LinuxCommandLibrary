# TAGLINE

Run commands in parallel with live feedback

# TLDR

**Run a command** for each input line

```find . -name '*.png' | machma convert {} {.}.jpg```

**Parallel jobs** with replacement tokens

```cat [hosts.txt] | machma ssh {} uptime```

**Show help**

```machma -h```

# SYNOPSIS

**machma** [*options*] *command* [*args*...]

# DESCRIPTION

**machma** executes a command template once per stdin line (or argument set), in parallel, with a live terminal UI showing progress and results. Placeholders such as **{}** expand to the current item (similar in spirit to **xargs** / **GNU parallel** but with interactive feedback). Written by fd0.

# PARAMETERS

*command* [*args*...]

> Command template; **{}** is replaced by each input value.

stdin lines supply the items to process. Concurrency and failure handling flags are available via **machma -h**.

# CAVEATS

Unbounded parallelism can overwhelm remote hosts or disks—limit jobs when needed. Quote carefully when templates include shell metacharacters.

# SEE ALSO

[xargs](/man/xargs)(1), [parallel](/man/parallel)(1), [rush](/man/rush)(1)

# RESOURCES

```[Source code](https://github.com/fd0/machma)```

<!-- verified: 2026-07-19 -->
