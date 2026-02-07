# TAGLINE

deallocate unused virtual terminal memory

# TLDR

**Deallocate unused** virtual terminals

```deallocvt```

**Deallocate specific** virtual terminal

```deallocvt [7]```

**Deallocate range** of terminals

```deallocvt [7] [8] [9]```

# SYNOPSIS

**deallocvt** [_N_...]

# PARAMETERS

_N_
> Virtual terminal number(s) to deallocate. Without arguments, deallocates all unused terminals.

# DESCRIPTION

**deallocvt** releases the memory allocated to unused virtual terminal (VT) entries. Virtual terminals that are not in use but have been opened consume kernel memory; this command frees that memory.

When called without arguments, it deallocates all unused virtual terminals. When given specific terminal numbers, it deallocates only those terminals. A terminal cannot be deallocated if it is the current terminal or has active processes.

This utility is mainly useful on systems with limited memory where the kernel memory used by unused VTs is significant.

# CAVEATS

Requires root privileges. Cannot deallocate the current VT or VTs with active processes. Deallocating a VT means it must be reallocated when next used, which has a small overhead.

# HISTORY

deallocvt is part of the **kbd** (keyboard) package for Linux console utilities. It provides low-level management of Linux virtual terminal resources, used since the early days of the Linux console system.

# SEE ALSO

[chvt](/man/chvt)(1), [openvt](/man/openvt)(1), [fgconsole](/man/fgconsole)(1)
