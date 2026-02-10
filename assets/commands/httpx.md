# TAGLINE

fast HTTP toolkit for probing web servers

# TLDR

**Probe live hosts**

```cat [hosts.txt] | httpx```

**Check with title**

```httpx -l [hosts.txt] -title```

**Show status codes**

```httpx -l [hosts.txt] -status-code```

**Check specific ports**

```httpx -l [hosts.txt] -ports [80,443,8080]```

**Follow redirects**

```httpx -l [hosts.txt] -follow-redirects```

**Output JSON**

```httpx -l [hosts.txt] -json -o [output.json]```

# SYNOPSIS

**httpx** [_options_]

# PARAMETERS

**-l** _FILE_
> Input file with hosts.

**-title**
> Show page titles.

**-status-code**
> Show status codes.

**-ports** _PORTS_
> Ports to probe.

**-follow-redirects**
> Follow HTTP redirects.

**-json**
> JSON output.

**-o** _FILE_
> Output file.

**--help**
> Display help information.

# DESCRIPTION

**httpx** is a fast HTTP toolkit for probing web servers. It checks for live hosts and extracts information like titles, status codes, and technologies.

The tool is used in reconnaissance and security testing. It efficiently processes large lists of hosts with concurrent requests.

# CAVEATS

Security testing tool. Requires authorization. Go-based from ProjectDiscovery.

# HISTORY

httpx was created by **ProjectDiscovery** as part of their security reconnaissance toolkit.

# SEE ALSO

[nuclei](/man/nuclei)(1), [nmap](/man/nmap)(1), [httprobe](/man/httprobe)(1)
