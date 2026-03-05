# TAGLINE

Web application pentesting suite

# TLDR

**Fuzz URLs** for hidden paths

```kanha fuzz -u [https://example.com/FUZZ] -w [path/to/wordlist.txt]```

**Check HTTP response codes**

```kanha httpx -l [path/to/urls.txt]```

**Perform reverse DNS lookup**

```kanha rdns -l [path/to/ips.txt]```

**Detect subdomain takeover**

```kanha takeover -l [path/to/subdomains.txt]```

# SYNOPSIS

**kanha** _command_ [_options_]

# DESCRIPTION

**kanha** is a CLI suite for web application penetration testing that combines multiple security testing functions including **URL fuzzing**, **reverse DNS lookup**, **HTTP response code checking**, and **subdomain takeover detection** into a single tool.

Each subcommand targets a specific aspect of web application security testing, making it a convenient all-in-one toolkit for security researchers and penetration testers.

# CAVEATS

Only use against systems you have explicit authorization to test. Fuzzing may generate significant network traffic. Results should be manually verified for false positives.

# HISTORY

**kanha** is written in **Rust** and was designed as a fast, multi-function web application security testing toolkit for terminal-based workflows.

# SEE ALSO

[nmap](/man/nmap)(1), [curl](/man/curl)(1), [nikto](/man/nikto)(1)
