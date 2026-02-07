# TAGLINE

client for requesting debug information from debuginfod servers

# TLDR

Request debuginfo based on **build ID**

```debuginfod-find -vv debuginfo [build_id]```

# SYNOPSIS

**debuginfod-find** [_options_] _type_ _build-id_

# DESCRIPTION

**debuginfod-find** requests debug information from debuginfod servers. It can retrieve debuginfo, executable, or source files based on the build ID of an ELF binary.

Part of the elfutils package, it enables on-demand downloading of debug symbols for debugging tools like gdb.

# PARAMETERS

**debuginfo** _build-id_
> Fetch debug information file

**executable** _build-id_
> Fetch executable file

**source** _build-id_ _path_
> Fetch source file

**-v**
> Verbose output

# CONFIGURATION

**DEBUGINFOD_URLS** (environment variable)
> Space-separated list of debuginfod server URLs to query for debug information.

**DEBUGINFOD_CACHE_PATH** (environment variable)
> Directory for caching downloaded debug files (default: $HOME/.debuginfod_client_cache).

# CAVEATS

Requires network access and configured debuginfod servers. Build IDs can be found with `readelf -n` or `eu-readelf -n`.

# SEE ALSO

[debuginfod](/man/debuginfod)(8), [gdb](/man/gdb)(1), [readelf](/man/readelf)(1)
