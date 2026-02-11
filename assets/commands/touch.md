# TAGLINE

Create files and update timestamps

# TLDR

**Create a new empty file**

```touch [file]```

**Create multiple files**

```touch [file1] [file2] [file3]```

**Update access and modification time** to current time

```touch [existing_file]```

**Set specific modification time**

```touch -t [[CC]YY]MMDDhhmm[.ss] [file]```

**Set time from another file**

```touch -r [reference_file] [file]```

**Change only access time**

```touch -a [file]```

**Change only modification time**

```touch -m [file]```

**Do not create file** if it doesn't exist

```touch -c [file]```

# SYNOPSIS

**touch** [_options_] _file_...

# PARAMETERS

**-a**
> Change only access time

**-m**
> Change only modification time

**-c**, **--no-create**
> Do not create file if it doesn't exist

**-d** _string_, **--date**=_string_
> Parse string and use instead of current time

**-r** _file_, **--reference**=_file_
> Use times from reference file

**-t** _stamp_
> Use timestamp [[CC]YY]MMDDhhmm[.ss] instead of current time

**-h**, **--no-dereference**
> Affect symbolic link instead of referenced file

# DESCRIPTION

**touch** updates file access and modification timestamps. If the file doesn't exist, touch creates an empty file (unless **-c** is specified).

Common uses include creating empty files, updating timestamps to trigger make rebuilds, and setting specific times for testing or archival purposes.

Time can be specified in several formats: **-t** for precise timestamps, **-d** for human-readable strings ("yesterday", "2 hours ago"), or **-r** to copy times from another file.

Without **-a** or **-m**, both access time (atime) and modification time (mtime) are updated. Change time (ctime) is always updated by the kernel when timestamps change.

# DATE STRING EXAMPLES

```touch -d "2024-01-15 10:30:00" file```
```touch -d "yesterday" file```
```touch -d "2 weeks ago" file```
```touch -d "next monday" file```

# CAVEATS

Creating files requires write permission in the directory. Updating timestamps requires write permission on the file or ownership.

Some filesystems mount with **noatime** or **relatime**, which affects how access times are recorded. This doesn't affect touch but may affect programs relying on atime.

Touch cannot change ctime (inode change time); it's always set to current time by the kernel when metadata changes.

# SEE ALSO

[stat](/man/stat)(1), [date](/man/date)(1), [ls](/man/ls)(1), [mkdir](/man/mkdir)(1)
