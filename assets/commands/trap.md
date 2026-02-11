# TAGLINE

Handle shell signals and cleanup

# TLDR

**List** available signal names

```trap -l```

List current **trap commands** and their signals

```trap```

**Execute** a command when a signal is received

```trap 'echo "Caught signal SIGHUP"' SIGHUP```

**Remove** trap commands for signals

```trap - SIGHUP SIGINT```

**Ignore** a signal

```trap '' SIGINT```

# SYNOPSIS

**trap** [_command_] [_signal_...]

**trap** **-l**

**trap** **-p** [_signal_...]

# PARAMETERS

**-l**
> List signal names and numbers

**-p** [_signal_]
> Print trap commands for specified signals

_command_
> Command to execute when signal is received

**-** _signal_
> Reset signal to default behavior

**''** _signal_
> Ignore the signal

# DESCRIPTION

**trap** is a shell builtin that executes commands when the shell receives signals. It's commonly used in scripts for cleanup operations (removing temp files), handling interrupts gracefully, and ignoring signals that would otherwise terminate the script.

Common signals include SIGINT (Ctrl+C), SIGTERM (termination request), SIGHUP (hangup), EXIT (script exit), and ERR (command error). The EXIT pseudo-signal executes on normal script exit.

# CAVEATS

Trap is a shell builtin, not an external command. Behavior varies slightly between shells (bash, dash, zsh). Some signals (SIGKILL, SIGSTOP) cannot be trapped. Traps are inherited by subshells but not by external commands.

# HISTORY

Originated in the **Bourne shell** in Unix V7 (1979). The concept of trapping signals comes from the Unix signal handling mechanism. Bash and other modern shells have extended the original functionality with pseudo-signals like ERR and DEBUG.

# SEE ALSO

[kill](/man/kill)(1), [signal](/man/signal)(7), [bash](/man/bash)(1)
