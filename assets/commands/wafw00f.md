# TAGLINE

Web Application Firewall detection tool

# TLDR

**Detect WAF** protecting a site

```wafw00f [https://example.com]```

**Scan multiple URLs** in one run

```wafw00f [https://site1.com] [https://site2.com]```

**Read targets** from an input file

```wafw00f -i [urls.txt]```

**List all known WAFs** that can be detected

```wafw00f -l```

**Find all** matching WAFs (don't stop at first match)

```wafw00f -a [https://example.com]```

**Verbose output** for debugging (repeatable)

```wafw00f -vv [https://example.com]```

**Route through a proxy** (e.g. Burp Suite)

```wafw00f -p [http://127.0.0.1:8080] [https://example.com]```

**Save output** as CSV, JSON, or text (format inferred from extension)

```wafw00f -o [result.json] [https://example.com]```

# SYNOPSIS

**wafw00f** [_options_] _url_ [_url_ ...]

# PARAMETERS

**-h**, **--help**
> Show help message and exit.

**-V**, **--version**
> Print the current version and exit.

**-v**, **--verbose**
> Enable verbosity. Can be repeated (e.g. **-vv**) for more detail.

**-a**, **--findall**
> Find all WAFs matching the signatures; do not stop after the first match.

**-r**, **--noredirect**
> Do not follow 3xx redirections.

**-t** _TEST_, **--test**=_TEST_
> Test for one specific WAF (name from **-l** output).

**-l**, **--list**
> List all WAFs that wafw00f is able to detect.

**-p** _PROXY_, **--proxy**=_PROXY_
> Use an HTTP/SOCKS5 proxy, e.g. _http://host:8080_, _socks5://host:1080_, _http://user:pass@host:8080_.

**-H** _FILE_, **--headers**=_FILE_
> Pass custom headers from a text file, overwriting the default header set.

**-i** _FILE_, **--input-file**=_FILE_
> Read targets from a text, CSV, or JSON file.

**-o** _FILE_, **--output**=_FILE_
> Write results to a file. Format is chosen from the extension (csv, json, text).

**-f** _FORMAT_, **--format**=_FORMAT_
> Force output format regardless of filename extension.

# DESCRIPTION

**wafw00f** is a security tool that identifies Web Application Firewalls (WAFs) protecting websites. It works by sending specially crafted HTTP requests and analyzing the responses for signatures and behaviors characteristic of specific WAF products.

The tool can detect a wide range of commercial and open-source WAFs including Cloudflare, AWS WAF, Akamai, F5 BIG-IP, ModSecurity, Imperva, Sucuri, and many others. In its default mode it stops after identifying the first WAF, while the all-detection mode tests against every known WAF fingerprint for thorough analysis.

Multiple URLs can be tested in batch from an input file, and proxy support allows routing traffic through interception tools like Burp Suite. The tool is designed for authorized penetration testing and security assessments to help identify protection measures before deeper testing.

# DETECTED WAFS

Cloudflare, AWS WAF, Akamai, F5 BIG-IP, ModSecurity, Imperva, Sucuri, Fortinet, and many more.

# CAVEATS

For authorized testing only. Some WAFs may block detection. False positives possible.

# HISTORY

**wafw00f** was originally written by **Sandro Gauci** and released by **EnableSecurity** around **2009**. It has since become a standard recon tool, bundled with Kali Linux and actively maintained on GitHub. The name is a pun on "WAF" combined with a dog's bark.

# SEE ALSO

[nmap](/man/nmap)(1), [nikto](/man/nikto)(1), [wfuzz](/man/wfuzz)(1), [burpsuite](/man/burpsuite)(1)
