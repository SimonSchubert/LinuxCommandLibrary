# TAGLINE

daemon-based virus scanner client

# TLDR

**Scan file or directory**

```clamdscan [/path/to/scan]```

**Scan with verbose output**

```clamdscan -v [/path/to/scan]```

**Move infected files to quarantine**

```clamdscan --move=[/quarantine] [/path/to/scan]```

**Remove infected files**

```clamdscan --remove [/path/to/scan]```

**Scan in parallel (multiscan)**

```clamdscan -m [/path/to/scan]```

**Log results to file**

```clamdscan -l [scan.log] [/path/to/scan]```

**Reload virus database**

```clamdscan --reload```

# SYNOPSIS

**clamdscan** [_options_] [_file_|_directory_]...

# DESCRIPTION

**clamdscan** is a client for the ClamAV daemon (clamd). Instead of loading the virus signature database itself, it sends file paths or data streams to the clamd daemon for scanning, making it significantly faster than clamscan for repeated or batch scanning operations.

Because clamd keeps the virus database loaded in memory, clamdscan avoids the startup overhead of loading signatures on each invocation. The **--multiscan** option enables parallel scanning using multiple daemon threads, further improving throughput on multi-core systems.

clamdscan requires a running clamd daemon and inherits most scan settings from the daemon's configuration. It communicates with clamd via Unix socket or TCP connection and supports the same quarantine actions (move, copy, remove) as clamscan.

# PARAMETERS

**-v**, **--verbose**
> Be verbose

**-l** _file_, **--log** _file_
> Save scan report to file

**-f** _file_, **--file-list** _file_
> Scan files listed in file

**--remove**
> Remove infected files

**--move** _dir_
> Move infected files to directory

**--copy** _dir_
> Copy infected files to directory

**-m**, **--multiscan**
> Parallel scanning using multiple threads

**-i**, **--infected**
> Only print infected files

**--no-summary**
> Disable summary at end

**--fdpass**
> Pass file descriptor to clamd

**--stream**
> Force streaming to clamd

**--reload**
> Request database reload

**--ping** _attempts_
> Ping clamd until responsive

**--wait**
> Wait up to 30 seconds for clamd

**--config-file** _file_
> Use specific clamd config

# CAVEATS

Requires running clamd daemon. Most clamscan options are ignored as settings come from clamd.conf. Use --fdpass if clamd runs as different user.

# SEE ALSO

[clamscan](/man/clamscan)(1), [clamd](/man/clamd)(8), [freshclam](/man/freshclam)(1)
