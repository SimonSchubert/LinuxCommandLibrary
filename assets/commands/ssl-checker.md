# TAGLINE

Collect and analyze SSL/TLS certificate information

# TLDR

**Check SSL certificate for a host**

```ssl_checker -H [github.com:443]```

**Output certificate info as JSON**

```ssl_checker -H [example.com] -j```

**Analyze host for security vulnerabilities**

```ssl_checker -H [example.com] -a```

# SYNOPSIS

**ssl_checker** [**-H** _host_ [_host_...]] [**-f** _file_] [_options_]

# PARAMETERS

**-H** _HOST_
> Host(s) to check, in host:port format.

**-f** _FILE_
> File containing hostnames to check.

**-j**
> Output results in JSON format.

**-a**
> Analyze host for security vulnerabilities.

**-c**
> Output results in CSV format.

**-S**
> Output summary only.

**-x**
> Export results as HTML file.

**-J**
> Export JSON individually per host.

**-v**
> Enable verbose output for troubleshooting.

**-t** _TIMEOUT_
> Connection timeout in seconds.

**-s** _HOST:PORT_
> Use a SOCKS proxy for connections.

# DESCRIPTION

**ssl-checker** is a Python script that collects SSL/TLS information from hosts. It can check certificate expiration dates, issuer details, and cipher suites. It supports security vulnerability analysis, SOCKS proxy connections, and exports results in JSON, CSV, or HTML formats.

# HISTORY

**ssl-checker** was created by **narbehaj** and is written in **Python**.

# SEE ALSO

[openssl](/man/openssl)(1), [testssl](/man/testssl)(1)
