# TLDR

**Start server** with default paths

```debuginfod```

**Serve specific directories**

```debuginfod [/usr/lib/debug] [/var/cache/debuginfod]```

**Start on specific port**

```debuginfod -p [8002]```

**Index RPM files**

```debuginfod -R [/path/to/rpms]```

**Index DEB files**

```debuginfod -U [/path/to/debs]```

**Set concurrent connections**

```debuginfod -c [10]```

# SYNOPSIS

**debuginfod** [_options_] [_paths_...]

# DESCRIPTION

**debuginfod** is a server for distributing ELF debugging information over HTTP. It indexes executables, shared libraries, and debug info, serving them to clients like gdb and systemtap on demand.

The service enables automatic debugging symbol resolution without manually installing debug packages. Clients query by build-id to fetch matching debug information.

# PARAMETERS

**-p** _port_
> HTTP server port (default 8002).

**-c** _num_
> Concurrent connections limit.

**-R**
> Scan for RPM archives.

**-U**
> Scan for DEB archives.

**-d** _file_
> Database file location.

**-t** _seconds_
> Scan interval.

**-F**
> Run in foreground.

**-v**
> Increase verbosity.

# CLIENT USAGE

Set DEBUGINFOD_URLS to enable automatic fetching:
```
export DEBUGINFOD_URLS="https://debuginfod.example.com"
```

# CAVEATS

Initial indexing can be slow. Database grows with content. Network access needed by clients. May expose binary details. Requires matching build-ids.

# HISTORY

**debuginfod** was developed as part of the **elfutils** project by **Red Hat** engineers around **2019**. It addresses the challenge of distributing debug symbols for Linux distributions, enabling on-demand fetching rather than installing large debug packages.

# SEE ALSO

[gdb](/man/gdb)(1), [elfutils](/man/elfutils)(1), [systemtap](/man/systemtap)(1), [objdump](/man/objdump)(1)
