# TAGLINE

Alternative TUI for GDB debugger

# TLDR

**Debug a program**

```ugdb [./myprogram]```

**Debug with arguments**

```ugdb [./myprogram] -- [arg1] [arg2]```

**Attach to a running process by PID**

```ugdb -p [pid]```

**Use a custom GDB executable**

```ugdb --gdb [/path/to/gdb] [./myprogram]```

**Read symbols from a separate file**

```ugdb -s [symbols.elf] [./myprogram]```

**Start as an interface for rr replay**

```ugdb --rr [./myprogram]```

**Skip all .gdbinit initialization files**

```ugdb -n [./myprogram]```

# SYNOPSIS

**ugdb** [_options_] [_program_] [-- _args_...]

# PARAMETERS

**--gdb** _path_
> Path to an alternative gdb binary (default: gdb).

**-p**, **--pid** _pid_
> Attach to a running process with the given PID.

**-s**, **--symbols** _file_
> Read debug symbols from the given file.

**-d**, **--directory** _dir_
> Add a directory to the source file search path.

**-c**, **--core** _file_
> Use a core dump file for examination.

**-x**, **--command** _file_
> Execute GDB commands from a file on startup.

**-e**, **--initial-expression** _expr_
> Pre-populate the expression table with an entry.

**--layout** _string_
> Define the initial pane layout (default: (1s-1c)|(1e-1t)). Pane letters: s=source, c=console, e=expressions, t=terminal.

**-n**, **--nx**
> Do not execute commands from any .gdbinit file.

**--nh**
> Do not execute commands from ~/.gdbinit.

**-q**, **--quiet**
> Suppress the introductory and copyright messages.

**--rr**
> Start ugdb as an interface for rr; trailing arguments are passed to rr replay.

**--rr-path** _path_
> Path to an alternative rr binary.

**--log_dir** _dir_
> Directory for the log file (default: /tmp).

# DESCRIPTION

**ugdb** is a terminal user interface for GDB built on the unsegen library. It provides four interactive panes: a GDB console, a source code pager, an expression table for watching variables, and a virtual terminal for the debugged program's output. Pane layout is configurable via **--layout**.

Supports vim-like keybindings and remote control via IPC. The **--rr** flag enables use with the Mozilla rr record-and-replay debugger as a drop-in interface.

# HISTORY

**ugdb** was created by **ftilde** and is written in **Rust**.

# SEE ALSO

[gdb](/man/gdb)(1), [lldb](/man/lldb)(1)
