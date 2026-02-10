# TAGLINE

fastest Internet port scanner, capable of scanning the entire Internet

# TLDR

**Scan single port**

```sudo masscan [192.168.1.0/24] -p [80]```

**Scan port range**

```sudo masscan [192.168.1.0/24] -p [1-65535]```

**Scan common ports**

```sudo masscan [192.168.1.0/24] --ports [0-1023]```

**Scan at specific rate**

```sudo masscan [192.168.1.0/24] -p [80] --rate [10000]```

**Output to file**

```sudo masscan [192.168.1.0/24] -p [80] -oL [results.txt]```

**Exclude targets**

```sudo masscan [10.0.0.0/8] -p [80] --excludefile [exclude.txt]```

# SYNOPSIS

**masscan** [_options_] _targets_

# DESCRIPTION

**masscan** is the fastest Internet port scanner, capable of scanning the entire Internet in under 6 minutes. It uses asynchronous transmission, sending packets without waiting for responses.

The tool is designed for large-scale network reconnaissance during authorized security assessments. It produces output similar to nmap for compatibility.

# PARAMETERS

**-p** _ports_
> Ports to scan.

**--rate** _pps_
> Packets per second.

**--banners**
> Grab banners.

**-oL** _file_
> List output.

**-oJ** _file_
> JSON output.

**-oG** _file_
> Grepable output.

**-oX** _file_
> XML output.

**--excludefile** _file_
> Exclude addresses.

**--adapter** _name_
> Network interface.

**-c** _file_
> Configuration file.

**--wait** _seconds_
> Wait after sending.

# CAVEATS

Requires root/raw sockets. High rates may overwhelm networks. Only for authorized testing. May trigger IDS alerts. Stateless scanning may miss filtered ports.

# HISTORY

**masscan** was created by **Robert David Graham** and released in **2013**. It was designed to demonstrate that Internet-wide scanning was feasible and to provide a tool for legitimate security research at scale.

# SEE ALSO

[nmap](/man/nmap)(1), [zmap](/man/zmap)(1), [rustscan](/man/rustscan)(1), [unicornscan](/man/unicornscan)(1)
