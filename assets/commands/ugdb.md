# TAGLINE

Alternative TUI for GDB debugger

# TLDR

**Debug a program**

```ugdb [./myprogram]```

**Debug with arguments**

```ugdb -- [./myprogram] [arg1] [arg2]```

**Use a custom GDB executable**

```ugdb -e [gdb-remote] [./myprogram]```

# SYNOPSIS

**ugdb** [_flags_] [_options_] [--] [_program_]...

# DESCRIPTION

**ugdb** is a terminal user interface for GDB built on the unsegen library. It provides four interactive containers: a GDB console, source code pager, expression table for watching variables, and a virtual terminal for debugged program output. Supports vim-like keybindings and remote control via IPC.

# HISTORY

**ugdb** was created by **ftilde** and is written in **Rust**.

# SEE ALSO

[gdb](/man/gdb)(1), [lldb](/man/lldb)(1), [cgdb](/man/cgdb)(1)
