# TAGLINE

GDB TUI dashboard for remote and embedded debugging

# TLDR

**Start heretek** with default GDB

```heretek```

**Connect to a remote target** via netcat

```heretek --nc [host:port]```

**Use a custom GDB binary**

```heretek --gdb [path/to/gdb]```

**Run in 32-bit mode**

```heretek --32```

**Execute GDB commands from a file**

```heretek -x [path/to/commands.gdb]```

# SYNOPSIS

**heretek** [**--gdb** _path_] [**--nc** _host:port_] [**--32**] [**-x** _file_] [_options_]

# DESCRIPTION

**heretek** is a GDB TUI dashboard inspired by **GEF**, designed to seamlessly connect to remote targets even without a functioning gdbserver. It ships as a single statically-linked **musl** binary with no Python dependencies, making it ideal for embedded and minimal environments where vendors may ship GDB without Python support.

heretek operates on systems with only **gdb**, **nc** (netcat), and **mkfifo**, bypassing common issues with broken gdbserver binaries. The dashboard displays registers, disassembly, stack, and memory in an organized TUI layout.

# CAVEATS

Requires at minimum **gdb**, **nc**, and **mkfifo** on the target system. Some advanced GDB features that rely on Python extensions are not available. The TUI layout may require a sufficiently wide terminal.

# HISTORY

**heretek** was created by **wcampbell0x2a** and is written in **Rust**. It was built to address the pain points of debugging on embedded systems where traditional GDB frontends fail due to missing Python or broken gdbserver installations.

# SEE ALSO

[gdb](/man/gdb)(1), [gef](/man/gef)(1)
