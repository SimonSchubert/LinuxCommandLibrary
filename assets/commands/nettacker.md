# TAGLINE

automated penetration testing framework

# TLDR

**Scan target for vulnerabilities**

```nettacker -i [target.com]```

**Scan with specific modules**

```nettacker -i [target] -m [ssh_brute,ftp_brute]```

**Scan targets from file**

```nettacker -l [targets.txt]```

**Scan with all modules**

```nettacker -i [target] -m all```

**Scan with specific ports**

```nettacker -i [target] -p [22,80,443]```

**Save results to file**

```nettacker -i [target] -o [report.html]```

**Set threads and timeout**

```nettacker -i [target] -t [10] --timeout [5]```

# SYNOPSIS

**nettacker** [_-i target_] [_-l file_] [_-m modules_] [_-p ports_] [_-o output_] [_options_]

# PARAMETERS

**-i** _TARGET_
> Target (IP, hostname, CIDR).

**-l** _FILE_
> Target list file.

**-m** _MODULES_
> Modules to run (comma-separated).

**-p** _PORTS_
> Ports to scan.

**-o** _FILE_
> Output file.

**-t** _N_
> Number of threads.

**--timeout** _SEC_
> Timeout in seconds.

**-u** _USER_
> Username for brute force.

**-U** _FILE_
> Username list file.

**-P** _FILE_
> Password list file.

**--method** _METHOD_
> Scan method.

**--graph** _TYPE_
> Generate graph (d3_tree, etc.).

**--api**
> Run API server.

# DESCRIPTION

**nettacker** is an automated penetration testing framework. It scans for vulnerabilities, performs brute force attacks, and identifies misconfigurations.

Modules target specific vulnerabilities or services: SSH brute force, FTP anonymous access, web vulnerabilities, subdomain enumeration, and more.

The framework supports network scanning, service detection, and exploitation in an automated workflow. Results are collected and reported.

Output formats include HTML reports with graphs, JSON for processing, and text. The D3 graph visualization shows attack paths and findings.

An API server enables integration with other tools and automation frameworks. The web interface provides point-and-click scanning.

This tool is designed for authorized security assessments and penetration testing.

# CAVEATS

Only use with proper authorization. May trigger IDS/IPS alerts. Brute force can cause account lockouts. Some modules are intrusive.

# HISTORY

**OWASP Nettacker** was developed as part of the **OWASP** (Open Web Application Security Project) as an open-source penetration testing framework. It provides automated security scanning capabilities for security professionals.

# SEE ALSO

[nmap](/man/nmap)(1), [metasploit](/man/metasploit)(1), [nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1)
