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

# ENVIRONMENT

**DEBUGINFOD_URLS**
> Space-separated list of debuginfod server URLs

# CAVEATS

Requires network access and configured debuginfod servers. Build IDs can be found with `readelf -n` or `eu-readelf -n`.

# SEE ALSO

[debuginfod](/man/debuginfod)(8), [gdb](/man/gdb)(1), [readelf](/man/readelf)(1)
