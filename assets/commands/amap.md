# TAGLINE

Identify application protocols on network ports

# TLDR

**Identify** service on a port

```amap -b [192.168.1.1] [80]```

Scan **port range**

```amap [192.168.1.1] [1-1000]```

Scan with **banner grabbing**

```amap -B [192.168.1.1] [80]```

Use **UDP** scan

```amap -u [192.168.1.1] [53]```

Scan **quietly** (minimal output)

```amap -q [192.168.1.1] [80]```

# SYNOPSIS

**amap** [_options_] _target_ _port_[_-port_]

# DESCRIPTION

**amap** (Application Mapper) is a next-generation scanning tool that identifies applications and services running on network ports by sending trigger packets and analyzing responses. Unlike simple port scanners, it can identify services running on non-standard ports.

The tool compares responses against a signature database to fingerprint applications, making it useful for security assessments and network auditing.

# PARAMETERS

**-b**
> Banner grabbing mode (just grab banners)

**-B**
> Banner and identification mode

**-u**
> UDP mode (default is TCP)

**-q**
> Quiet mode (less output)

**-v**
> Verbose output

**-1**
> Stop after first match

**-6**
> IPv6 mode

**-A**
> Aggressive mode (more triggers)

**-p** _proto_
> Only scan for specific protocol

**-i** _file_
> Read targets from file

**-o** _file_
> Write results to file

# CONFIGURATION

**/etc/amap/appdefs.trig**
> Trigger definitions file containing packets sent to identify services.

**/etc/amap/appdefs.resp**
> Response signatures file used to match and identify application protocols.

# CAVEATS

For authorized security testing only. May trigger intrusion detection systems. Some services may not respond to trigger packets. Signature database may not include newer applications.

# HISTORY

**amap** was developed by THC (The Hacker's Choice) and released in the early **2000s** as a complement to port scanners, focusing on application-layer identification.

# SEE ALSO

[nmap](/man/nmap)(1), [netcat](/man/netcat)(1), [masscan](/man/masscan)(1)
