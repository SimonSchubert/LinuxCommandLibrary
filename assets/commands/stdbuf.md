# TAGLINE

Adjust stream buffering of commands

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

**stdbuf** runs a command with modified standard stream buffering. When programs detect their output is going to a pipe rather than a terminal, they typically switch from line-buffered to fully-buffered output, which delays output. stdbuf overrides this behavior using LD_PRELOAD to intercept buffering calls.

The three modes are: line-buffered (**L**) which flushes after each newline, unbuffered (**0**) which flushes immediately, and a specific buffer size. This is particularly useful when piping output through filters like **grep** or **awk** where real-time output is needed rather than waiting for the buffer to fill.

# CAVEATS

Doesn't work with all programs. Statically linked programs unaffected. Some use internal buffering.

# HISTORY

**stdbuf** is part of GNU coreutils. It uses LD_PRELOAD to intercept buffering calls.

# SEE ALSO

[unbuffer](/man/unbuffer)(1), [script](/man/script)(1), [tee](/man/tee)(1)
