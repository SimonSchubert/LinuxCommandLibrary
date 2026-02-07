# TAGLINE

open-source antivirus toolkit

# TLDR

**Scan a file** for viruses

```clamscan [path/to/file]```

**Scan a directory recursively**

```clamscan -r [path/to/directory]```

**Scan and remove** infected files

```clamscan -r --remove [path/to/directory]```

**Scan and move** infected files to quarantine

```clamscan -r --move=[path/to/quarantine] [path/to/directory]```

**Scan with verbose output** and display infected files only

```clamscan -r -i -v [path/to/directory]```

**Update virus definitions** (requires freshclam)

```sudo freshclam```

**Scan using the daemon** for faster multiple scans

```clamdscan [path/to/file]```

# SYNOPSIS

**clamscan** [_options_] [_file/directory_]

# PARAMETERS

**-r**, **--recursive**
> Scan directories and their subdirectories recursively.

**-i**, **--infected**
> Only print infected files in the output.

**--remove**
> Remove infected files. Use with caution.

**--move**=_DIR_
> Move infected files to the specified quarantine directory.

**--copy**=_DIR_
> Copy infected files to the specified directory.

**-v**, **--verbose**
> Be verbose during scanning.

**-l** _FILE_, **--log**=_FILE_
> Save scan report to the specified file.

**--bell**
> Sound bell on virus detection.

**--exclude**=_REGEX_
> Exclude files matching the regular expression.

**--include**=_REGEX_
> Only scan files matching the regular expression.

**--max-filesize**=_SIZE_
> Skip files larger than the specified size (default 100M).

**-h**, **--help**
> Display help information.

# DESCRIPTION

**ClamAV** is an open-source antivirus engine for detecting trojans, viruses, malware, and other malicious threats. The suite includes **clamscan** for on-demand scanning, **clamd** as a multi-threaded daemon, **clamdscan** for daemon-based scanning, and **freshclam** for automatic signature updates.

ClamAV is widely used in mail gateway scanning, particularly on Unix-based systems. It supports scanning of archives (ZIP, RAR, TAR, GZIP), documents (PDF, Office formats), executables, and many other file types. The signature database is maintained by Cisco Talos and updated multiple times daily.

For high-volume scanning, running the **clamd** daemon provides significantly better performance than repeated clamscan invocations, as it keeps the signature database loaded in memory.

# CONFIGURATION

**/etc/clamav/clamd.conf**
> Main daemon configuration including socket path, scan limits, and logging.

**/etc/clamav/freshclam.conf**
> Virus database update settings including mirror, proxy, and update frequency.

# CAVEATS

ClamAV is primarily designed for server-side scanning of incoming files rather than real-time desktop protection. Scan times can be slow on large directories. The **--remove** option permanently deletes files without confirmation. Always keep virus definitions updated with **freshclam** for effective detection.

# HISTORY

ClamAV was created by Tomasz Kojm in **2001** as a GPL-licensed antivirus toolkit for Unix. It gained widespread adoption for mail server scanning. Sourcefire acquired the project in **2007**, and after Cisco acquired Sourcefire in **2013**, the project continues under Cisco Talos security intelligence.

# SEE ALSO

[freshclam](/man/freshclam)(1), [clamd](/man/clamd)(8), [clamdscan](/man/clamdscan)(1), [sigtool](/man/sigtool)(1)
