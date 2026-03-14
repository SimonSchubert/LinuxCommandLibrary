# TAGLINE

Web technology fingerprinting and identification

# TLDR

**Scan a website**

```whatweb [https://example.com]```

**Verbose output**

```whatweb -v [url]```

**Aggressive scan** (makes additional requests per target)

```whatweb -a 3 [url]```

**Save results as JSON**

```whatweb --log-json=[output.json] [url]```

**Scan multiple URLs**

```whatweb [url1] [url2]```

**Scan with custom user agent and threads**

```whatweb --user-agent "[custom-agent]" -t [10] [url]```

**Follow redirects only within the same site**

```whatweb --follow-redirect=same-site [url]```

# SYNOPSIS

**whatweb** [_options_] _urls_

# PARAMETERS

**-v**
> Verbose output showing detailed plugin results.

**-a**, **--aggression** _LEVEL_
> Aggression level: **1** (stealthy, single request, default), **3** (aggressive, additional requests on match), **4** (heavy, many requests per target). Level 2 is unused.

**--log-verbose** _FILE_
> Log verbose output to a file.

**--log-json** _FILE_
> Log output in JSON format.

**--log-xml** _FILE_
> Log output in XML format.

**-q**, **--quiet**
> Quiet mode; suppress output to stdout.

**--user-agent** _UA_
> Set a custom User-Agent string.

**-t**, **--max-threads** _N_
> Number of simultaneous threads. Default: 25.

**--follow-redirect** _WHEN_
> When to follow redirects: never, http-only, meta-only, same-site, or always (default).

**--cookie** _COOKIE_
> Provide cookies (e.g., 'name=value; name2=value2').

**--proxy** _HOST:PORT_
> Use an HTTP proxy for requests.

# DESCRIPTION

**whatweb** is a web scanner that identifies technologies used by websites, including content management systems, web frameworks, server software, JavaScript libraries, and analytics platforms. It sends requests to target URLs and analyzes responses to fingerprint the specific products and versions in use.

The tool uses a plugin-based architecture with over 1,800 plugins for recognizing different technologies. Four aggression levels control scanning intensity, from passive analysis of a single page request to aggressive testing that makes additional requests to probe for specific technologies.

Output can be formatted as JSON, XML, verbose text, or SQL for database storage. Multiple URLs can be scanned in a single run, and the tool supports authentication, custom headers, and proxy configuration for testing behind login pages or through intermediary servers.

# CAVEATS

Only use on systems you are authorized to scan. Aggressive modes may be detected by intrusion detection systems. Requires Ruby.

# SEE ALSO

[wappalyzer](/man/wappalyzer)(1), [nmap](/man/nmap)(1), [nikto](/man/nikto)(1)
