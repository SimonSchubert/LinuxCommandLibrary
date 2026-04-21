# TAGLINE

deallocate unused virtual terminal memory

# TLDR

**Deallocate all unused virtual terminals**

```sudo deallocvt```

**Deallocate a specific virtual terminal**

```sudo deallocvt [7]```

**Deallocate a range of virtual terminals**

```sudo deallocvt [7] [8] [9]```

**Target a specific console device**

```sudo deallocvt -C [/dev/tty1]```

**Show version information**

```deallocvt -V```

# SYNOPSIS

**deallocvt** [_options_] [_N_...]

# PARAMETERS

_N_
> Virtual terminal number(s) to deallocate. Without arguments, all unused terminals are freed.

**-C**, **--console=**_DEV_
> Operate on the specified console device (e.g. `/dev/tty1`).

**-V**, **--version**
> Print version information and exit.

**-h**, **--help**
> Print usage information and exit.

# DESCRIPTION

**deallocvt** deallocates kernel memory and data structures for unused virtual consoles. A virtual console is considered unused when it is not the active console and no process or text selection is referring to it.

When invoked without arguments, it deallocates all unused virtual terminals. When given specific terminal numbers (corresponding to `/dev/ttyN`), it deallocates only those. A terminal cannot be deallocated if it is the current terminal or if it has active processes.

# CAVEATS

Requires root privileges. Cannot deallocate the current VT or VTs with active processes. Deallocating a VT means it will be reallocated the next time it is used, with a small overhead. Mostly useful on memory-constrained systems.

# HISTORY

**deallocvt** is part of the **kbd** package for Linux console utilities and was originally authored by **Andries Brouwer**. It provides low-level management of Linux virtual terminal resources.

# SEE ALSO

[chvt](/man/chvt)(1), [fgconsole](/man/fgconsole)(1)
