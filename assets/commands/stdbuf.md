# TLDR

**Line buffered stdout**

```stdbuf -oL [command]```

**Unbuffered stdout**

```stdbuf -o0 [command]```

**Unbuffered stderr**

```stdbuf -e0 [command]```

**Fully buffered stdin**

```stdbuf -i[1M] [command]```

**Line buffered all streams**

```stdbuf -oL -eL [command]```

**Combine with grep**

```stdbuf -oL [command] | grep [pattern]```

# SYNOPSIS

**stdbuf** [_-i mode_] [_-o mode_] [_-e mode_] _command_ [_args_]

# PARAMETERS

**-i** _MODE_
> stdin buffering.

**-o** _MODE_
> stdout buffering.

**-e** _MODE_
> stderr buffering.

# MODES

**L** - Line buffered
**0** - Unbuffered
**SIZE** - Buffer size (e.g., 1K, 1M)

# DESCRIPTION

**stdbuf** adjusts stream buffering of commands. It controls when output is flushed.

Line buffering flushes after each newline. Useful for real-time log viewing.

Unbuffered output flushes immediately. No delay but higher overhead.

Piping often enables full buffering. stdbuf overrides this behavior.

Useful with grep, awk, and other filters. See output without waiting for buffer fill.

# CAVEATS

Doesn't work with all programs. Statically linked programs unaffected. Some use internal buffering.

# HISTORY

**stdbuf** is part of GNU coreutils. It uses LD_PRELOAD to intercept buffering calls.

# SEE ALSO

[unbuffer](/man/unbuffer)(1), [script](/man/script)(1), [tee](/man/tee)(1)
