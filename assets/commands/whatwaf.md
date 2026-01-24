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

**whatwaf** detects WAFs. It identifies firewall type.

WAF fingerprinting. Identify protection.

Bypass suggestions. Evasion techniques.

Multiple payloads. Detection accuracy.

Security research. Penetration testing.

# CAVEATS

Authorized testing only. May trigger alerts. Python required.

# HISTORY

**WhatWaf** was created for identifying Web Application Firewalls and suggesting bypass techniques.

# SEE ALSO

[wafw00f](/man/wafw00f)(1), [nmap](/man/nmap)(1), [sqlmap](/man/sqlmap)(1)
