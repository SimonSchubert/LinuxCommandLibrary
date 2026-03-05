# TAGLINE

Tracer for execve syscalls and pre-exec behavior

# TLDR

**Trace all exec calls made by bash**

```tracexec log -- bash```

**Launch TUI mode to trace a build system**

```tracexec tui -- make```

**TUI mode with pseudo terminal**

```tracexec tui -t -- bash```

# SYNOPSIS

**tracexec** [_options_] _command_

# DESCRIPTION

**tracexec** helps you figure out what and how programs get executed when you run a command. It is useful for debugging build systems, understanding shell scripts, and tracing what programs proprietary software runs. In TUI mode with a pseudo terminal, you can view exec event details and interact with processes.

# HISTORY

**tracexec** was created by **Levi Zim** (kxxt) and is written in **Rust**.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [execsnoop](/man/execsnoop)(1)
