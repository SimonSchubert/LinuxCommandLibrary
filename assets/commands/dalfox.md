# TAGLINE

open-source XSS vulnerability scanner and parameter analyzer

# TLDR

**Scan a URL** for XSS vulnerabilities

```dalfox url [https://example.com?q=test]```

**Scan with custom payloads** file

```dalfox url [https://example.com?q=test] --custom-payload [payloads.txt]```

**Scan multiple URLs** from file

```dalfox file [urls.txt]```

**Pipe URLs** from another tool

```cat [urls.txt] | dalfox pipe```

**Use blind XSS** callback

```dalfox url [https://example.com?q=test] --blind [https://your.xss.ht]```

**Output results** to JSON file

```dalfox url [https://example.com?q=test] -o [results.json] --format json```

# SYNOPSIS

**dalfox** _mode_ [_target_] [_options_]

# PARAMETERS

_MODE_
> Operation mode: url, file, pipe, sxss.

_TARGET_
> URL or file containing URLs to scan.

**--custom-payload** _FILE_
> Use custom payload file.

**--blind** _URL_
> Blind XSS callback URL.

**-o**, **--output** _FILE_
> Output file path.

**--format** _FORMAT_
> Output format: plain, json, xml.

**--cookie** _STRING_
> Set cookies for requests.

**-H**, **--header** _STRING_
> Add custom header.

**--proxy** _URL_
> HTTP proxy to use.

**-w**, **--worker** _N_
> Number of concurrent workers.

**--silence**
> Suppress all output except results.

**--help**
> Display help information.

# DESCRIPTION

**dalfox** is a powerful open-source XSS (Cross-Site Scripting) vulnerability scanner and parameter analyzer. It specializes in finding reflected XSS, stored XSS, and DOM-based XSS vulnerabilities through automated testing.

The tool performs parameter analysis to identify injection points, then tests with a comprehensive payload database. It supports blind XSS detection using external callback servers and can integrate with other security tools through piped input.

dalfox includes features like DOM rendering analysis, WAF detection and evasion, and intelligent payload mutation. It's designed for penetration testers and security researchers conducting authorized security assessments.

# CAVEATS

Only use on systems you have explicit authorization to test. False positives may occur; verify findings manually. High request rates may trigger rate limiting or bans. Some XSS types require browser-based verification.

# HISTORY

dalfox was created by **hahwul** and released in **2020**. The name stands for "Finder Of XSS" with "dal" meaning moon in Korean. It was designed as a fast, flexible alternative to existing XSS scanners, with emphasis on automation and accuracy.

# SEE ALSO

[nikto](/man/nikto)(1), [sqlmap](/man/sqlmap)(1), [nuclei](/man/nuclei)(1), [httpx](/man/httpx)(1)
