# TLDR

Scan **target** host

```sudo autorecon 192.168.1.1```

Scan from **file**

```sudo autorecon -t targets.txt```

Specify **output** directory

```sudo autorecon -o /path/to/results 192.168.1.1```

Scan specific **ports**

```sudo autorecon -p T:21-25,80,443,U:53 192.168.1.1```

# SYNOPSIS

**autorecon** [_OPTIONS_] _targets_

# DESCRIPTION

**autorecon** is a multi-threaded network reconnaissance tool that performs automated enumeration of services. It runs various scanning tools in parallel and organizes results by host and service type.

# PARAMETERS

**-t, --target-file** _file_
> Read targets from file

**-o, --output** _dir_
> Output results to specified directory

**-p, --ports** _ports_
> Limit scanning to specific ports (T: TCP, U: UDP, B: both)

**--single-target**
> Only scan a single target at a time

**-v, --verbose**
> Enable verbose output

**--heartbeat**
> Show periodic status updates

# CAVEATS

Requires root privileges for certain scan types. Results are saved to a results directory organized by target. This tool should only be used on systems you have authorization to scan.

# HISTORY

**autorecon** was created for penetration testing and CTF competitions to automate initial reconnaissance.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1)
