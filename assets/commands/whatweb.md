# TAGLINE

Web technology fingerprinting and identification

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

**whatweb** is a web scanner that identifies technologies used by websites, including content management systems, web frameworks, server software, JavaScript libraries, and analytics platforms. It sends requests to target URLs and analyzes responses to fingerprint the specific products and versions in use.

The tool uses a plugin-based architecture with over 1,800 plugins for recognizing different technologies. Four aggression levels control scanning intensity, from passive analysis of a single page request to aggressive testing that makes additional requests to probe for specific technologies.

Output can be formatted as JSON, XML, verbose text, or SQL for database storage. Multiple URLs can be scanned in a single run, and the tool supports authentication, custom headers, and proxy configuration for testing behind login pages or through intermediary servers.

# CAVEATS

Authorized use only. May be detected. Ruby required.

# HISTORY

**WhatWeb** was created for web reconnaissance, identifying technologies and features on websites.

# SEE ALSO

[wappalyzer](/man/wappalyzer)(1), [nmap](/man/nmap)(1), [nikto](/man/nikto)(1)
