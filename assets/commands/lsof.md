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
> Files opened by command.

**--help**
> Display help information.

# DESCRIPTION

**lsof** (List Open Files) is a diagnostic tool that reports all files currently opened by running processes. In Unix-like systems, the concept of a "file" extends well beyond regular files on disk -- it includes network sockets, Unix domain sockets, pipes, device files, and directories. Each open file is represented internally by a file descriptor, and lsof maps these descriptors back to the processes that hold them.

This makes lsof an essential troubleshooting tool for a wide range of scenarios. It can identify which process is listening on a specific TCP/UDP port (`-i :port`), find processes preventing a filesystem from being unmounted (`+D /mount`), or reveal network connections established by a particular program. The output includes the process name, PID, user, file descriptor number, file type, and the file path or network address, providing a comprehensive view of how processes interact with system resources.

# CAVEATS

Requires root for all files. Output can be verbose. Performance impact on large systems.

# HISTORY

lsof was created by **Vic Abell** in 1988 and has become a standard Unix diagnostic tool.

# SEE ALSO

[fuser](/man/fuser)(1), [netstat](/man/netstat)(8), [ss](/man/ss)(8), [ps](/man/ps)(1)

