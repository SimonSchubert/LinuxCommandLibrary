# TAGLINE

Fast configurable port scanner with reasonable defaults

# TLDR

**Scan default ports** on a host

```havn [host]```

**Scan a specific port range**

```havn -p [1-1024] [host]```

**Scan specific ports**

```havn -p [80,443,8080] [host]```

**Scan with increased retry count**

```havn -r [3] [host]```

**Scan with custom timeout** (in milliseconds)

```havn -t [2000] [host]```

**Scan all ports**

```havn -p [1-65535] [host]```

# SYNOPSIS

**havn** [**-p** _ports_] [**-r** _retries_] [**-t** _timeout_] _host_

# PARAMETERS

**-p** _PORTS_
> Port or port range to scan (e.g. 80, 1-1024, 80,443,8080)

**-r** _RETRIES_
> Number of retries for each port

**-t** _TIMEOUT_
> Timeout in milliseconds per port

**-h**, **--help**
> Print help

**-V**, **--version**
> Print version

# DESCRIPTION

**havn** is a lightweight, self-contained port scanning application written in **Rust**. It uses asynchronous **Tokio** multithreading to deliver fast and reliable results with a binary size under 1MB. It supports both **IPv4** and **IPv6** scanning and runs on Linux (including ARM), macOS, and Windows.

havn comes with sensible defaults for quick scanning while allowing customization of port ranges, timeouts, and retry counts for more thorough scans.

# CAVEATS

Scanning ports on systems you do not own or have authorization to test may be illegal. Firewalls and intrusion detection systems may block or rate-limit scan attempts. Very large port ranges with short timeouts may produce false negatives.

# HISTORY

**havn** was created by **Jack Wills** (mrjackwills) and is written in **Rust**. The name is Danish for "port" (as in harbor). It was designed as a minimal, fast alternative to more complex scanning tools.

# SEE ALSO

[nmap](/man/nmap)(1), [ss](/man/ss)(8), [netcat](/man/netcat)(1), [rustscan](/man/rustscan)(1), [masscan](/man/masscan)(1)
