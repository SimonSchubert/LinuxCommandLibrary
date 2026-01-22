# TLDR

**Compress** an executable file in-place

```gzexe [path/to/executable]```

**Decompress** a compressed executable back to binary

```gzexe -d [path/to/compressed_executable]```

# SYNOPSIS

**gzexe** [_-d_] _file_...

# PARAMETERS

**-d**
> Decompress the executable (convert shell script back to binary)

# DESCRIPTION

**gzexe** compresses executable files while keeping them executable. It creates a self-extracting shell script that decompresses the original binary to a temporary location, executes it, and cleans up afterward.

The original file is backed up with a **~** suffix appended to its name. The resulting "executable" is actually a shell script containing the compressed binary data.

This is useful for saving disk space on systems with limited storage, particularly for infrequently used large binaries. The tradeoff is increased startup time due to decompression.

# CAVEATS

Compressed executables have slower startup due to decompression. The shell script wrapper may not work correctly with all types of binaries (especially those that inspect their own path). setuid/setgid bits are not preserved. Not compatible with binary-specific features like process name display.

# HISTORY

gzexe is part of the gzip package and has been available since the early 1990s. It was created to save disk space on Unix systems when storage was expensive, providing a simple way to compress binaries without changing how they're invoked.

# SEE ALSO

[gzip](/man/gzip)(1), [upx](/man/upx)(1), [strip](/man/strip)(1)
