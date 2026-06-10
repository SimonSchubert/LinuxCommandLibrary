# TAGLINE

Identify application protocols on network ports

# TLDR

**Identify** the service on a port (application mapping is the default mode)

```amap [192.168.1.1] [80]```

Scan a **port range**

```amap [192.168.1.1] [1-1000]```

Just **grab banners** without sending triggers

```amap -B [192.168.1.1] [80]```

Identify a service over **UDP**

```amap -u [192.168.1.1] [53]```

Scan **quietly**, reporting only identified ports

```amap -q [192.168.1.1] [80]```

# SYNOPSIS

**amap** [_mode_] [_options_] _target_ _port_[_-port_] [_port_ ...]

# DESCRIPTION

**amap** (Application Mapper) is a next-generation scanning tool that identifies applications and services running on network ports by sending trigger packets and analyzing responses. Unlike simple port scanners, it can identify services running on non-standard ports.

The tool compares responses against a signature database to fingerprint applications, making it useful for security assessments and network auditing.

# PARAMETERS

**-A**
> Map applications: send triggers and analyse responses (this is the default mode)

**-B**
> Just grab banners, do not send triggers

**-P**
> No banner or application identification: act as a full-connect port scanner

**-b**
> Print ASCII banners when one is received

**-u**
> Ports given on the command line are UDP (default is TCP)

**-6**
> Use IPv6 instead of IPv4

**-1**
> Only send triggers to a port until the first identification

**-q**
> Quiet: do not report closed or timed-out ports as unidentified

**-v**
> Verbose output

**-H**
> Skip potentially harmful triggers

**-R**
> Do not identify the RPC service

**-p** _proto_
> Send only the single named protocol trigger

**-i** _file_
> Read hosts and ports from an nmap-generated machine-readable file

**-o** _file_
> Log the output of amap to a file

**-m**
> Make the log file output machine readable (colon separated)

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

# RESOURCES

```[Source code](https://github.com/vanhauser-thc/THC-Archive)```

```[Homepage](https://www.thc.org/)```

<!-- verified: 2026-06-11 -->
