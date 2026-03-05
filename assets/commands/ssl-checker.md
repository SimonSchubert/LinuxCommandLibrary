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

**-s** _SOCKS_
> Use a SOCKS proxy for connections.

# DESCRIPTION

**ssl-checker** is a script that collects SSL/TLS information from hosts. It can check certificate expiration dates, analyze security vulnerabilities, and export results in JSON, CSV, or HTML formats. It also supports SOCKS proxy connections.

# HISTORY

**ssl-checker** was created by **narbehaj** and is written in **Python**.

# SEE ALSO

[openssl](/man/openssl)(1), [testssl.sh](/man/testssl.sh)(1), [certigo](/man/certigo)(1)
