# TAGLINE

fast port scanner written in Go

# TLDR

**Scan target for open ports**

```naabu -host [example.com]```

**Scan specific ports**

```naabu -host [example.com] -p [80,443,8080]```

**Scan port range**

```naabu -host [example.com] -p [1-1000]```

**Scan top ports**

```naabu -host [example.com] -top-ports [100]```

**Scan from file**

```naabu -list [targets.txt]```

**Output to file**

```naabu -host [example.com] -o [results.txt]```

**Scan with rate limit**

```naabu -host [example.com] -rate [1000]```

**JSON output**

```naabu -host [example.com] -json```

# SYNOPSIS

**naabu** [_-host target_] [_-p ports_] [_-top-ports n_] [_-o file_] [_options_]

# PARAMETERS

**-host** _TARGET_
> Target to scan.

**-list** _FILE_
> File with targets.

**-p** _PORTS_
> Ports to scan.

**-top-ports** _N_
> Scan top N ports.

**-exclude-ports** _PORTS_
> Ports to exclude.

**-o** _FILE_
> Output file.

**-json**
> JSON output.

**-rate** _N_
> Packets per second.

**-c** _N_
> Concurrent hosts.

**-timeout** _MS_
> Timeout in milliseconds.

**-retries** _N_
> Retry count.

**-verify**
> Verify open ports.

**-nmap**
> Run nmap on discovered ports.

**-silent**
> Silent mode.

**-v**
> Verbose output.

# DESCRIPTION

**naabu** is a fast port scanner written in Go. It uses SYN scanning for speed while maintaining accuracy through verification.

The scanner optimizes for speed with configurable rate limiting. It can scan thousands of hosts quickly while respecting network constraints.

Top ports mode scans the most commonly open ports, focusing resources on likely targets. Custom port lists target specific services.

Nmap integration hands off discovered ports for service detection. This combines naabu's speed with nmap's detailed fingerprinting.

Output formats include plain text, JSON, and nmap-compatible results. Integration with other security tools is straightforward.

The tool is designed for security professionals performing authorized assessments.

# CAVEATS

SYN scanning requires root/admin privileges. Aggressive scanning may trigger IDS/IPS. Only use on authorized targets. Rate limiting important on production networks.

# HISTORY

**naabu** was developed by **ProjectDiscovery** as part of their security tooling suite. It complements their other tools like nuclei, httpx, and subfinder for comprehensive security testing workflows.

# SEE ALSO

[nmap](/man/nmap)(1), [masscan](/man/masscan)(1), [rustscan](/man/rustscan)(1), [zmap](/man/zmap)(1)
