# TAGLINE

filesystem extent deduplication tool

# TLDR

Search for **duplicate extents**

```duperemove -r [path/to/directory]```

**Deduplicate** on Btrfs or XFS

```duperemove -r -d [path/to/directory]```

Use **hash file** for persistence

```duperemove -r -d --hashfile=[path/to/hashfile] [path/to/directory]```

Limit **threads**

```duperemove -r -d --hashfile=[path/to/hashfile] --io-threads=[n] --cpu-threads=[n] [path/to/directory]```

# SYNOPSIS

**duperemove** [_options_] _paths_...

# DESCRIPTION

**duperemove** finds duplicate filesystem extents and optionally schedules them for deduplication. On filesystems like Btrfs and XFS, identical data blocks can be shared between files, saving disk space.

An extent is a contiguous area of storage allocated for a file.

# PARAMETERS

**-r**
> Recursively process directories

**-d**
> Deduplicate (schedule duplicates for dedup)

**--hashfile** _file_
> Store hashes in file for reuse

**--io-threads** _n_
> I/O thread count

**--cpu-threads** _n_
> CPU thread count for hash comparison

**-h**
> Print human-readable sizes

**-v**
> Verbose output

**--dedupe-options=**_OPTIONS_
> Comma-separated dedupe options (e.g., partial, same)

**-b** _SIZE_
> Block size for hashing (default: 128K)

# CAVEATS

Only works on filesystems supporting extent-level deduplication (Btrfs, XFS). Deduplication is handled by the kernel via the `FIDEDUPERANGE` ioctl. Using a hashfile is strongly recommended for large datasets as it reduces memory usage and enables incremental scans across runs. Without `-d`, the tool only reports duplicates without deduplicating. Read-only files can still be deduplicated since dedup operates at the filesystem level.

# SEE ALSO

[btrfs](/man/btrfs)(8), [fdupes](/man/fdupes)(1), [rmlint](/man/rmlint)(1)
