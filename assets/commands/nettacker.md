# TAGLINE

automated penetration testing framework

# TLDR

**Port scan a target**

```nettacker -i [target.com] -m port_scan```

**Scan specific ports** across a subnet

```nettacker -i [192.168.0.0/24] -m port_scan -g [22,80,443]```

**Scan targets from a file**

```nettacker -l [targets.txt] -m [port_scan]```

**Run all modules** except some

```nettacker -i [target] -m all -x [ssh_brute,ftp_brute]```

**Scan subdomains too**, skipping service discovery

```nettacker -i [example.com] -d -s -m http_status_scan```

**Brute force SSH** with username and password lists

```nettacker -i [target] -m ssh_brute -U [users.txt] -P [passwords.txt]```

**Save an HTML report** with a graph

```nettacker -i [target] -m port_scan -o [report.html] --graph d3_tree_v2_graph```

**Set threads per host** and timeout

```nettacker -i [target] -m port_scan -t [100] -T [3]```

**List available modules**

```nettacker --show-all-modules```

**Start the API and web UI**

```nettacker --start-api```

# SYNOPSIS

**nettacker** [_-i targets_ | _-l file_] [_-m modules_ | _--profile name_] [_options_]

# PARAMETERS

**-i**, **--targets** _TARGETS_
> Comma-separated targets (IP, range, CIDR, hostname, URL).

**-l**, **--targets-list** _FILE_
> Read targets from a file.

**-m**, **--modules** _MODULES_
> Modules to run (comma-separated, or all).

**--profile** _PROFILES_
> Run all modules of the given profiles (e.g. scan, brute, vuln).

**-x**, **--exclude-modules** _MODULES_
> Modules to exclude.

**--show-all-modules**, **--show-all-profiles**
> List available modules or profiles.

**-g**, **--ports** _PORTS_
> Ports to scan (e.g. 22,80,1-1000).

**-X**, **--exclude-ports** _PORTS_
> Ports to exclude.

**-o**, **--output** _FILE_
> Report file; format follows the extension (.html, .json, .csv, otherwise text).

**--graph** _NAME_
> Graph for HTML reports (d3_tree_v1_graph, d3_tree_v2_graph).

**-t**, **--thread-per-host** _N_
> Number of concurrent connections per host.

**-M**, **--parallel-module-scan** _N_
> Number of modules to run in parallel.

**-T**, **--timeout** _SEC_
> Request timeout in seconds.

**-w**, **--time-sleep-between-requests** _SEC_
> Delay between requests.

**-u**, **--usernames** _USERS_ / **-U**, **--users-list** _FILE_
> Usernames for brute force modules.

**-p**, **--passwords** _PASSWORDS_ / **-P**, **--passwords-list** _FILE_
> Passwords for brute force modules.

**-W**, **--wordlist** _FILE_
> Wordlist for modules that read one (e.g. directory scanning).

**-r**, **--range**
> Scan the entire IP range of the target.

**-s**, **--sub-domains**
> Find and scan subdomains.

**-d**, **--skip-service-discovery**
> Skip service discovery and run modules directly.

**-H**, **--add-http-header** _HEADER_
> Add a custom HTTP header to requests.

**-R**, **--socks-proxy** _URL_
> Route traffic through a SOCKS proxy.

**--ping-before-scan**
> Ping hosts first and skip unresponsive ones.

**-K**, **--scan-compare** _ID_
> Compare current results with a previous scan.

**--start-api**
> Start the REST API and web UI (**--api-host**, **--api-port**, **--api-access-key** to configure).

**-L**, **--language** _LANG_
> Interface language.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**nettacker** (OWASP Nettacker) is an automated penetration testing and information gathering framework. It performs port scanning, service detection, subdomain enumeration, vulnerability checks and credential brute forcing.

Modules are YAML-defined and grouped by category, with names like port_scan, ssh_brute, http_status_scan or wordpress_version_scan. Profiles bundle related modules.

Results are stored in a database, so past scans can be searched and compared to detect new hosts, ports or vulnerabilities (useful in CI pipelines). Reports can be HTML with D3 graphs, JSON, CSV or text.

The --start-api option runs a REST API with a web interface for launching scans and browsing results.

This tool is designed for authorized security assessments and penetration testing.

# CAVEATS

Only use with proper authorization. May trigger IDS/IPS alerts. Brute force can cause account lockouts. Some modules are intrusive. Commonly run via the owasp/nettacker Docker image, e.g. docker run owasp/nettacker -i target -m port_scan.

# HISTORY

**OWASP Nettacker** was started by Ali Razmjoo in **2017** as an **OWASP** project. Version 0.4.0 restructured it into an installable Python package with a nettacker command, replacing the earlier python nettacker.py invocation.

# SEE ALSO

[nmap](/man/nmap)(1), [metasploit](/man/metasploit)(1), [nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1), [subfinder](/man/subfinder)(1)

# RESOURCES

```[Source code](https://github.com/OWASP/Nettacker)```

```[Homepage](https://owasp.org/nettacker)```

```[Documentation](https://nettacker.readthedocs.io)```

<!-- verified: 2026-09-29 -->
