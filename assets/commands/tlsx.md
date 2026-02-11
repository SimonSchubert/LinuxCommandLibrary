# TAGLINE

Fast TLS certificate and cipher probing

# TLDR

**Check TLS**

```tlsx -u [example.com]```

**Show certificate**

```tlsx -u [example.com] -san -cn```

**Multiple hosts**

```tlsx -l [hosts.txt]```

**JSON output**

```tlsx -u [example.com] -json```

**Check specific port**

```tlsx -u [example.com:8443]```

**Show cipher**

```tlsx -u [example.com] -cipher```

# SYNOPSIS

**tlsx** [_-u host_] [_-l file_] [_-json_] [_options_]

# PARAMETERS

**-u** _HOST_
> Target host.

**-l** _FILE_
> Host list file.

**-san**
> Show Subject Alt Names.

**-cn**
> Show Common Name.

**-cipher**
> Show cipher suites.

**-json**
> JSON output.

# DESCRIPTION

**tlsx** is a fast TLS probing tool that connects to hosts and inspects their TLS configurations, certificates, and supported cipher suites. It can extract certificate details including subject names, Subject Alternative Names (SANs), expiration dates, and issuer information.

The tool supports scanning multiple hosts in parallel from a file list, making it suitable for large-scale TLS reconnaissance. Output can be formatted as JSON for integration with other security tools. It is part of the ProjectDiscovery toolkit commonly used in security assessments.

# CAVEATS

Network access required. Some hosts may block. Go-based tool.

# HISTORY

**tlsx** was created by **ProjectDiscovery** for fast TLS probing and certificate analysis.

# SEE ALSO

[openssl](/man/openssl)(1), [testssl](/man/testssl)(1), [sslyze](/man/sslyze)(1)
