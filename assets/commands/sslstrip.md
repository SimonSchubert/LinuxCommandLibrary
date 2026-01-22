# TLDR

Start **SSL stripping** on default port

```sslstrip```

Listen on **specific port**

```sslstrip --listen=8080```

Log **all SSL** traffic

```sslstrip --ssl --listen=8080```

Log **all HTTP and SSL** traffic

```sslstrip --listen=8080 --all```

Write logs to **file**

```sslstrip --listen=8080 --write=output.log```

Display **help**

```sslstrip --help```

# SYNOPSIS

**sslstrip** [_options_]

# DESCRIPTION

**sslstrip** is a security testing tool that performs SSL stripping attacks by acting as a proxy between the victim and the server. It converts HTTPS links to HTTP, allowing interception of traffic that would otherwise be encrypted. This tool is used for authorized penetration testing and security research.

# PARAMETERS

**-l, --listen PORT**
> Port to listen on (default: 10000)

**-a, --all**
> Log all SSL and HTTP traffic

**-s, --ssl**
> Log all SSL traffic to and from server

**-w, --write FILE**
> Specify log file path

**-p, --post**
> Log only HTTP POST requests (default)

**-f, --favicon**
> Substitute a lock favicon on secure requests

**-k, --killsessions**
> Kill sessions in progress

**-h, --help**
> Display help information

# CAVEATS

This tool is intended for authorized security testing only. Unauthorized use against systems you do not own or have permission to test is illegal. Requires ARP spoofing or similar MITM setup to intercept traffic. Modern browsers with HSTS preloading may prevent this attack.

# HISTORY

**sslstrip** was created by Moxie Marlinspike and demonstrated at Black Hat DC 2009 to illustrate vulnerabilities in SSL/TLS implementation in web applications.

# SEE ALSO

[arpspoof](/man/arpspoof)(8), [ettercap](/man/ettercap)(8), [mitmproxy](/man/mitmproxy)(1)
