# TAGLINE

command-line virus scanner

# TLDR

**Scan single file**

```clamscan [file]```

**Scan directory recursively**

```clamscan -r [/path/to/dir]```

**Show only infected files**

```clamscan -ri [/path/to/dir]```

**Move infected files**

```clamscan -r --move=[/quarantine] [/path/to/scan]```

**Remove infected files**

```clamscan -r --remove [/path/to/scan]```

**Scan and log results**

```clamscan -r -l [scan.log] [/path/to/dir]```

**Exclude directory**

```clamscan -r --exclude-dir=[backup] [/home]```

# SYNOPSIS

**clamscan** [_options_] [_file_|_directory_...]

# DESCRIPTION

**clamscan** is a standalone command-line virus scanner from the ClamAV antivirus suite. It scans files and directories for viruses, trojans, malware, and other threats using the ClamAV signature database.

Each invocation loads the full virus database into memory, which makes it suitable for one-off scans but slower for repeated use. For high-volume or frequent scanning, the daemon-based **clamdscan** is preferred as it avoids the database reload overhead.

clamscan supports recursive directory scanning, pattern-based file inclusion and exclusion, configurable size limits, and various actions for infected files including removal, quarantine (move), and copying. Scan results can be logged to a file for audit purposes.

# PARAMETERS

**-r**, **--recursive**
> Scan directories recursively

**-i**, **--infected**
> Only print infected files

**--remove**
> Remove infected files (dangerous)

**--move**=_dir_
> Move infected files to directory

**--copy**=_dir_
> Copy infected files to directory

**-l** _file_, **--log**=_file_
> Write scan report to file

**--exclude**=_pattern_
> Exclude files matching pattern

**--exclude-dir**=_pattern_
> Exclude directories

**--max-filesize**=_size_
> Skip files larger than size

**--max-scansize**=_size_
> Maximum data scanned per file

**-v**, **--verbose**
> Verbose output

# DATABASE UPDATE

Update signatures before scanning:

```sudo freshclam```

# CAVEATS

--remove is dangerous due to false positives. Use --move or --copy instead. Single-threaded by default. For multi-threaded scanning, use clamdscan with clamd daemon.

# SEE ALSO

[freshclam](/man/freshclam)(1), [clamdscan](/man/clamdscan)(1), [clamd](/man/clamd)(8)
