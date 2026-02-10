# TAGLINE

web server vulnerability scanner

# TLDR

**Scan web server**

```nikto -h [http://example.com]```

**Scan specific port**

```nikto -h [example.com] -p [8080]```

**Scan with SSL**

```nikto -h [https://example.com]```

**Output to file**

```nikto -h [example.com] -o [report.html] -Format htm```

**Scan multiple hosts**

```nikto -h [hosts.txt]```

**Update database**

```nikto -update```

**Tune scan type**

```nikto -h [example.com] -Tuning [x]```

# SYNOPSIS

**nikto** [_options_]

# PARAMETERS

**-h** _HOST_
> Target host/URL.

**-p** _PORT_
> Target port(s).

**-o** _FILE_
> Output file.

**-Format** _TYPE_
> Output format (htm, txt, csv, xml).

**-Tuning** _TYPE_
> Scan tuning options.

**-update**
> Update scan database.

**--help**
> Display help information.

# DESCRIPTION

**nikto** is a web server vulnerability scanner. It checks for dangerous files and misconfigurations.

The tool tests for thousands of issues. Identifies outdated software and known vulnerabilities.

# CAVEATS

Authorized testing only. Noisy scanner. Perl-based tool.

# HISTORY

Nikto was created by **Chris Sullo** as an open source web server scanner for security testing.

# SEE ALSO

[nmap](/man/nmap)(1), [dirb](/man/dirb)(1), [gobuster](/man/gobuster)(1)

