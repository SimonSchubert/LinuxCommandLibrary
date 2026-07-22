# TAGLINE

lists open files

# TLDR

**List all open files**

```lsof```

**Files opened by user**

```lsof -u [username]```

**Files opened by process**

```lsof -p [pid]```

**Files using port**

```lsof -i :[port]```

**Network connections**

```lsof -i```

**Files in directory**

```lsof +D [/path/to/dir]```

**Process using file**

```lsof [/path/to/file]```

**Find unlinked-but-open files** (useful when disk is full)

```sudo lsof +L1```

**Get only PIDs** for piping to kill

```lsof -t -i :[port]```

**Watch a connection** every 5 seconds

```lsof -i :[port] -r [5]```

# SYNOPSIS

**lsof** [_options_] [_files_]

# PARAMETERS

_FILES_
> Specific files to check.

**-u** _USER_
> Files opened by user.

**-p** _PID_
> Files opened by process.

**-i** [_ADDR_]
> Network connections.

**+D** _DIR_
> Files in directory.

**-c** _COMMAND_
> Files opened by processes whose command name starts with _COMMAND_.

**-n**
> Inhibit conversion of network numbers to host names (faster).

**-P**
> Inhibit conversion of port numbers to service names.

**-t**
> Terse output: list PIDs only (useful for piping to **kill**).

**-F** _FIELDS_
> Field-formatted output for machine parsing (e.g., **-Fpcu** for PID, command, user).

**-r** [_seconds_]
> Repeat mode: re-list every _seconds_ (default 15) until interrupted.

**+L1**
> Show only files with link count less than 1 (i.e. unlinked but still open — useful for finding "deleted but open" files filling a disk).

**--help**
> Display help information.

# DESCRIPTION

**lsof** (List Open Files) is a diagnostic tool that reports all files currently opened by running processes. In Unix-like systems, the concept of a "file" extends well beyond regular files on disk -- it includes network sockets, Unix domain sockets, pipes, device files, and directories. Each open file is represented internally by a file descriptor, and lsof maps these descriptors back to the processes that hold them.

This makes lsof an essential troubleshooting tool for a wide range of scenarios. It can identify which process is listening on a specific TCP/UDP port (`-i :port`), find processes preventing a filesystem from being unmounted (`+D /mount`), or reveal network connections established by a particular program. The output includes the process name, PID, user, file descriptor number, file type, and the file path or network address, providing a comprehensive view of how processes interact with system resources.

# CAVEATS

Without root, **lsof** only sees files opened by your own processes. Output can be very long; combine with **-c**, **-u**, or **-i** to filter. **+D** descends recursively and may be slow on large trees — prefer **+d** for non-recursive listing.

# HISTORY

lsof was created by **Vic Abell** in 1988 and has become a standard Unix diagnostic tool.

# INSTALL

```apt: sudo apt install lsof```

```dnf: sudo dnf install lsof```

```pacman: sudo pacman -S lsof```

```apk: sudo apk add lsof```

```zypper: sudo zypper install lsof```

```brew: brew install lsof```

```nix: nix profile install nixpkgs#lsof```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fuser](/man/fuser)(1), [netstat](/man/netstat)(8), [ss](/man/ss)(8), [ps](/man/ps)(1)

