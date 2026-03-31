# TAGLINE

web server vulnerability scanner

# TLDR

**Scan a web server**

```nikto -h [http://example.com]```

**Scan a specific port**

```nikto -h [example.com] -p [8080]```

**Scan with SSL**

```nikto -h [https://example.com]```

**Output results to a file**

```nikto -h [example.com] -o [report.html] -Format htm```

**Scan multiple hosts from a file**

```nikto -h [hosts.txt]```

**Use a specific tuning type** (e.g., 1=interesting files, 2=misconfiguration, 3=information disclosure)

```nikto -h [example.com] -Tuning [123]```

**Scan through an HTTP proxy**

```nikto -h [example.com] -useproxy [http://proxy:8080]```

**Update the plugins and databases**

```nikto -update```

# SYNOPSIS

**nikto** [_options_]

# PARAMETERS

**-h** _HOST_
> Target host, IP address, or URL. Can also be a file containing a list of hosts.

**-p** _PORT_
> Target port(s). Multiple ports can be specified as a comma-separated list (e.g., 80,443,8080).

**-ssl**
> Force SSL mode on the connection.

**-o** _FILE_
> Output file for the scan report.

**-Format** _TYPE_
> Output format: htm, txt, csv, xml, json, nbe, or sql.

**-Tuning** _TYPE_
> Scan tuning to control test types. Values: 0=File Upload, 1=Interesting File, 2=Misconfiguration, 3=Information Disclosure, 4=Injection (XSS/Script/HTML), 5=Remote File Retrieval (inside web root), 6=Denial of Service, 7=Remote File Retrieval (server-wide), 8=Command Execution, 9=SQL Injection, a=Authentication Bypass, b=Software Identification, c=Remote Source Inclusion, x=Reverse Tuning (exclude types).

**-useproxy** _PROXY_
> Use the specified HTTP proxy for connections.

**-id** _AUTH_
> Host authentication credentials in the format id:password or id:password:realm.

**-evasion** _TECHNIQUE_
> IDS evasion technique (1-8). Multiple can be combined.

**-timeout** _SECONDS_
> Timeout for requests (default: 10 seconds).

**-Plugins** _PLUGINS_
> Select which plugins to run (default: ALL). Use -list-plugins to see available plugins.

**-list-plugins**
> List all available plugins and their descriptions.

**-maxtime** _SECONDS_
> Maximum testing time per host.

**-nointeractive**
> Disable interactive features (useful for scripted runs).

**-update**
> Update scan plugins and databases from cirt.net.

**-Version**
> Display nikto version, plugin, and database versions.

**--help**
> Display help information.

# DESCRIPTION

**nikto** is an open source web server vulnerability scanner. It performs comprehensive tests against web servers, checking for over 6700 potentially dangerous files/CGIs, outdated server software versions, and version-specific problems on over 270 servers.

The tool checks for server configuration issues such as the presence of multiple index files and HTTP server options. It also attempts to identify installed web servers and software. Plugins are frequently updated and can be automatically retrieved.

# CAVEATS

Authorized testing only -- scanning servers without permission may be illegal. Nikto is intentionally not designed to be stealthy; it generates a large number of requests that will be logged by the target server. It is a Perl-based tool requiring LibWhisker.

# HISTORY

Nikto was created by **Chris Sullo** and **David Lodge** as an open source web server scanner for security testing. It is maintained under the CIRT.net project.

# SEE ALSO

[nmap](/man/nmap)(1), [dirb](/man/dirb)(1), [gobuster](/man/gobuster)(1), [curl](/man/curl)(1)

