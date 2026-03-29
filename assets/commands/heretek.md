# TAGLINE

GDB TUI dashboard for remote and embedded debugging

# TLDR

**Start heretek** with default GDB

```heretek```

**Connect to a remote target** via netcat

```heretek -r [host:port]```

**Use a custom GDB binary**

```heretek --gdb-path [path/to/gdb]```

**Run in 32-bit mode**

```heretek --ptr-size 32```

**Execute GDB commands from a file**

```heretek -c [path/to/commands.gdb]```

# SYNOPSIS

**heretek** [**--gdb-path** _path_] [**-r** _host:port_] [**--ptr-size** _size_] [**-c** _file_] [_options_]

# PARAMETERS

**--gdb-path** _PATH_
> Override gdb executable path

**-r**, **--remote** _HOST:PORT_
> Connect to a netcat session for remote debugging

**--ptr-size** _SIZE_
> Set pointer size mode (possible values: 32, 64, auto; default: auto)

**-c**, **--cmds** _FILE_
> Execute GDB commands line-by-line from a file (lines starting with # are ignored)

**--log-path** _PATH_
> Path to write log file (set RUST_LOG env variable to change log level)

**-h**, **--help**
> Print help

**-V**, **--version**
> Print version

# DESCRIPTION

**heretek** is a GDB TUI dashboard designed to seamlessly connect to remote targets even without a functioning gdbserver. It ships as a single statically-linked **musl** binary with no Python dependencies, making it ideal for embedded and minimal environments where vendors may ship GDB without Python support.

heretek operates on systems with only **gdb**, **nc** (netcat), and **mkfifo**, bypassing common issues with broken gdbserver binaries. The dashboard displays registers, disassembly, stack, and memory in an organized TUI layout.

# CAVEATS

Requires at minimum **gdb**, **nc**, and **mkfifo** on the target system. Some advanced GDB features that rely on Python extensions are not available. The TUI layout may require a sufficiently wide terminal.

# HISTORY

**heretek** was created by **wcampbell0x2a** and is written in **Rust**. It was built to address the pain points of debugging on embedded systems where traditional GDB frontends fail due to missing Python or broken gdbserver installations.

# SEE ALSO

[gdb](/man/gdb)(1), [nc](/man/nc)(1)
