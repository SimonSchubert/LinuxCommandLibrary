# TAGLINE

Scan a Linux system for rootkits and backdoors

# TLDR

Run a **quick** scan

```narayanastra```

Run a **deep** scan

```sudo narayanastra --full```

Repeat the scan and report only **new** findings

```sudo narayanastra --full --watch 60```

Scan a **mounted disk** while that system is not running

```sudo narayanastra --offline /mnt/target```

Scan a **container** filesystem

```sudo narayanastra --container [name]```

Scan a host **over SSH**, then remove the uploaded binary

```narayanastra --remote [user@host] --full```

# SYNOPSIS

**narayanastra** [_options_]

**narayanastra baseline** save|diff _file_ [_options_]

**narayanastra crossdiff** --live _file_ --offline _file_

# PARAMETERS

**--full**, **-f**
> Deep scan: walk the whole process id space, probe binds, and verify packaged files.

**--watch** _seconds_
> Scan again every N seconds. After the first report, print only new warnings and danger findings.

**--offline** _directory_
> Scan a mounted disk. The rootkit is not running, so the scan reads that tree as untrusted input.

**--container** _id_
> Run the offline checks against a running container's root filesystem.

**--remote** _user@host_
> Upload the binary over SSH, scan, download the report, and delete the remote copy.

**--format** _list_
> Extra report formats, comma-separated: **html**, **sarif**, **ndjson**. Text and JSON are always written.

**--modules** _list_
> Run only the named modules, comma-separated.

**--collect**
> Copy flagged binaries and scripts into an evidence directory, with a sha256 for each file.

**--hashdb** _file_
> Check files against a trusted path-to-hash database.

**--webhook** _url_
> Post danger findings to a Slack or Discord webhook.

**-o** _directory_
> Write the report directory here. The default is a new private directory in the current working directory.

**baseline save** _file_
> Write an integrity baseline. **--key-file** holds the key that signs it.

**baseline diff** _file_
> Compare the system with a signed baseline.

**crossdiff --live** _file_ **--offline** _file_
> Show what the running system hid, compared with a baseline taken from its disk.

# DESCRIPTION

**narayanastra** is a single-file scanner for Linux (and a smaller set of checks on Windows) that looks for rootkits, backdoors, and persistence after a suspected break-in. It compares independent views of the same fact: processes, sockets, kernel modules, and eBPF programs as the kernel reports them, versus what other kernel interfaces show. A disagreement is reported as something hiding.

Each finding is marked danger, warning, or info, with the evidence attached. Reports are written as text and JSON. HTML, SARIF, and newline-delimited JSON are optional. Packaged files are judged with the local package database (dpkg, rpm, pacman, or apk) rather than by filename alone.

The Linux build is a static binary. A quick scan runs without root; root is recommended, and **--full** needs it for the expensive checks. Exit status is 0 when the scan is clean, 1 when it found warnings, 2 when it found danger, and 3 when the scan could not finish.

# CAVEATS

A scanner on a live, compromised machine can be lied to. **--offline** from a trusted boot environment is the stronger check. The tool does not remove malware. Review findings before deleting files. **--remote** needs SSH access and uploads the scanner onto that host for the duration of the scan.

# SEE ALSO

[ss](/man/ss)(8), [ps](/man/ps)(1), [dpkg](/man/dpkg)(1)

# RESOURCES

```[Source code](https://github.com/Tekush1/narayanastra)```

```[Documentation](https://github.com/Tekush1/narayanastra#usage)```

<!-- verified: 2026-11-26 -->
