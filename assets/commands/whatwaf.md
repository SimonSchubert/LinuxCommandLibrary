# TAGLINE

Web Application Firewall detection and bypass

# TLDR

**Detect WAF**

```whatwaf -u [https://example.com]```

**From file**

```whatwaf -l [urls.txt]```

**Use Tor**

```whatwaf -u [url] --tor```

**Specific payloads**

```whatwaf -u [url] --payload "[<script>]"```

**JSON output**

```whatwaf -u [url] --json```

# SYNOPSIS

**whatwaf** [_-u url_] [_-l file_] [_--tor_] [_options_]

# PARAMETERS

**-u** _URL_
> Target URL.

**-l** _FILE_
> URL list file.

**--tor**
> Use Tor network.

**--payload** _PAY_
> Custom payload.

**--json**
> JSON output.

**--tamper** _SCRIPT_
> Tamper script.

# DESCRIPTION

**whatwaf** is a security tool that detects Web Application Firewalls (WAFs) protecting websites and suggests potential bypass techniques. It sends various payloads to the target and analyzes responses to fingerprint the specific WAF product in use.

Beyond detection, whatwaf provides tamper scripts and evasion suggestions tailored to the identified WAF, helping penetration testers understand what protections they need to work around during authorized assessments. Custom payloads can be specified for targeted testing.

The tool supports batch scanning from URL files, Tor network routing for anonymous testing, and JSON output for integration with other security tools. It is intended exclusively for authorized security testing and research.

# CAVEATS

Authorized testing only. May trigger alerts. Python required.

# HISTORY

**WhatWaf** was created for identifying Web Application Firewalls and suggesting bypass techniques.

# SEE ALSO

[wafw00f](/man/wafw00f)(1), [nmap](/man/nmap)(1), [sqlmap](/man/sqlmap)(1)
