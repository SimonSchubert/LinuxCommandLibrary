# TAGLINE

HTTP server for distributing ELF debugging information

# TLDR

**Scan directories for ELF/DWARF files**

```debuginfod -F [/usr/lib/debug]```

**Start on a specific port**

```debuginfod -p [8002] -F [/usr/lib/debug]```

**Index RPM archives in a directory**

```debuginfod -R [/path/to/rpms]```

**Index DEB archives in a directory**

```debuginfod -U [/path/to/debs]```

**Run in verbose mode with custom database path**

```debuginfod -v -d [/var/cache/debuginfod.sqlite] -F [/usr/lib/debug]```

**Set scan interval and concurrent threads**

```debuginfod -t [600] -c [10] -F [/path/to/debug]```

# SYNOPSIS

**debuginfod** [_options_] [_paths_...]

# DESCRIPTION

**debuginfod** is a server for distributing ELF debugging information over HTTP. It indexes executables, shared libraries, and debug info, serving them to clients like gdb and systemtap on demand.

The service enables automatic debugging symbol resolution without manually installing debug packages. Clients query by build-id to fetch matching debug information.

# PARAMETERS

**-p** _port_
> HTTP server port (default 8002).

**-F**
> Activate ELF/DWARF file scanning of specified paths.

**-R**
> Scan for RPM archives.

**-U**
> Scan for DEB/DDEB archives.

**-Z** _ext_
> Activate additional archive pattern scanning for the given extension.

**-d** _file_
> SQLite database file location (default ~/.debuginfod.sqlite).

**-c** _num_
> Scanner queue thread limit.

**-C** _num_
> Webapi thread pool size.

**-t** _seconds_
> Directory rescan interval (default 300).

**-g** _seconds_
> Grooming pass interval (default 86400).

**-I** _regex_
> Include files matching POSIX extended regex.

**-X** _regex_
> Exclude files matching POSIX extended regex.

**-L**
> Traverse symbolic links during scanning.

**--passive**
> Read-only mode; no scanning, only serve existing index.

**--cors**
> Add CORS response headers for third-party webapp access.

**-v**
> Increase verbosity (may be repeated).

# CLIENT USAGE

Set DEBUGINFOD_URLS to enable automatic fetching:
```
export DEBUGINFOD_URLS="https://debuginfod.example.com"
```

# CAVEATS

Initial indexing can be slow for large repositories. The SQLite database grows with content. Network access is needed by clients. The service may expose details about installed binaries. Clients require matching build-ids to fetch debug information.

# HISTORY

**debuginfod** was developed as part of the **elfutils** project by **Red Hat** engineers around **2019**. It addresses the challenge of distributing debug symbols for Linux distributions, enabling on-demand fetching rather than installing large debug packages.

# SEE ALSO

[debuginfod-find](/man/debuginfod-find)(1), [gdb](/man/gdb)(1), [objdump](/man/objdump)(1), [readelf](/man/readelf)(1)
