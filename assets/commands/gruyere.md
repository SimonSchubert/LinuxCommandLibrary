# TAGLINE

View and kill processes listening on ports

# TLDR

**Show all processes** listening on ports

```gruyere```

**Show full command details** instead of app names

```gruyere --details```

**Filter by a specific port**

```gruyere --port [8000]```

**Filter by current user**

```gruyere --user```

# SYNOPSIS

**gruyere** [**--details**] [**--port** _PORT_] [**--user**]

# DESCRIPTION

**gruyere** is a tiny and visually appealing TUI program for viewing and killing processes that are listening on network ports. It provides a cleaner alternative to manually using **lsof** or **ss** to find which process occupies a port, presenting the information in a readable terminal interface with the ability to terminate processes directly.

The tool displays process names, PIDs, and port numbers in a formatted view, making it easy to identify and manage port conflicts during development.

# CAVEATS

Requires appropriate permissions to view and kill processes. Killing system processes may require root privileges. Only shows processes with active listening sockets.

# HISTORY

**gruyere** was created by **Savannah Ostrowski** as a lightweight utility for developers who frequently need to identify and free up occupied ports. It is written in **Rust** and named after the Swiss cheese known for its holes, a playful reference to network ports.

# SEE ALSO

[lsof](/man/lsof)(1), [ss](/man/ss)(8), [fuser](/man/fuser)(1), [netstat](/man/netstat)(8)
