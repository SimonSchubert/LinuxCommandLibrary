# TLDR

**Scan website**

```whatweb [https://example.com]```

**Verbose output**

```whatweb -v [url]```

**Aggressive scan**

```whatweb -a [3] [url]```

**Output to file**

```whatweb --log-verbose=[output.txt] [url]```

**Multiple URLs**

```whatweb [url1] [url2]```

**JSON output**

```whatweb --log-json=[output.json] [url]```

# SYNOPSIS

**whatweb** [_-v_] [_-a level_] [_--log-verbose file_] _urls_

# PARAMETERS

**-v**
> Verbose output.

**-a** _LEVEL_
> Aggression (1-4).

**--log-verbose** _FILE_
> Verbose log.

**--log-json** _FILE_
> JSON output.

**-q**
> Quiet mode.

**--user-agent** _UA_
> Custom UA.

# DESCRIPTION

**whatweb** identifies websites. It fingerprints technologies.

Technology detection. CMS, frameworks.

Plugin-based. Extensible.

Multiple aggression levels. Passive to aggressive.

Various outputs. JSON, XML, SQL.

# CAVEATS

Authorized use only. May be detected. Ruby required.

# HISTORY

**WhatWeb** was created for web reconnaissance, identifying technologies and features on websites.

# SEE ALSO

[wappalyzer](/man/wappalyzer)(1), [nmap](/man/nmap)(1), [nikto](/man/nikto)(1)
