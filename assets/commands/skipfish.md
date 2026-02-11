# TAGLINE

Web application security scanner

# TLDR

**Scan a website** with default settings

```skipfish -o [output_dir] [https://example.com]```

**Scan with authentication**

```skipfish -o [output_dir] -A [user]:[password] [https://example.com]```

**Scan with custom wordlist**

```skipfish -o [output_dir] -W [wordlist.txt] [https://example.com]```

**Limit scan depth**

```skipfish -o [output_dir] -d [5] [https://example.com]```

**Exclude URLs matching pattern**

```skipfish -o [output_dir] -X [/logout] [https://example.com]```

**Limit requests per second**

```skipfish -o [output_dir] -l [10] [https://example.com]```

**Scan with cookies**

```skipfish -o [output_dir] -C "[session=abc123]" [https://example.com]```

# SYNOPSIS

**skipfish** [_options_] -W _wordlist_ -o _output_dir_ _url_ [_url_...]

# PARAMETERS

**-o** _DIR_
> Output directory for report (required, must not exist)

**-W** _FILE_
> Wordlist file for dictionary-based probing

**-S** _FILE_
> Load additional scope rules

**-A** _USER:PASS_
> HTTP authentication credentials

**-C** _NAME=VAL_
> Add custom cookie to all requests

**-H** _NAME=VAL_
> Add custom HTTP header

**-b** _i|f|p_
> Browser headers (MSIE, Firefox, iPhone)

**-d** _DEPTH_
> Maximum crawl depth (default: 16)

**-c** _NUM_
> Maximum children per node (default: 512)

**-r** _NUM_
> Maximum total requests

**-l** _NUM_
> Maximum requests per second

**-I** _STRING_
> Only crawl URLs containing string

**-X** _STRING_
> Exclude URLs containing string

**-D** _DOMAIN_
> Add domain to scan scope

**-K** _PARAM_
> Skip fuzzing specified parameter

**-N**
> Do not accept new cookies

**-M**
> Log mixed content (HTTP in HTTPS)

**-E**
> Log cache mismatches

**-U**
> Log external URLs found

**-Q**
> Suppress duplicate nodes in report

**-u**
> Quiet mode; suppress console output

**-v**
> Verbose mode

# DESCRIPTION

**skipfish** is a high-performance web application security scanner that creates an interactive sitemap through recursive crawling and dictionary-based probing. It performs active security checks and generates an HTML report highlighting potential vulnerabilities.

The scanner detects issues including XSS, SQL injection, shell injection, directory traversal, and various server misconfigurations. It uses adaptive techniques to minimize false positives and handles modern web applications with AJAX and complex state management.

Output is an interactive HTML report with a sitemap showing discovered paths, parameters, and identified security issues. Each finding includes severity rating, description, and evidence. The report serves as a foundation for manual security assessment.

# CAVEATS

Skipfish is resource-intensive on both the scanner and target server. Always obtain explicit authorization before scanning. The aggressive crawling can trigger DoS protections or generate large amounts of log data. Some dynamic applications may not be fully covered. Excluded patterns (**-X**) should include logout URLs to prevent session termination.

# HISTORY

Skipfish was developed by **Michal Zalewski** (lcamtuf) at **Google** and released in **2010**. Zalewski is renowned for security research including the AFL fuzzer. Skipfish was designed for speed and accuracy, using optimized HTTP handling and intelligent crawling algorithms. While development has slowed, it remains a useful tool for web application reconnaissance and automated security testing.

# SEE ALSO

[nikto](/man/nikto)(1), [wpscan](/man/wpscan)(1), [sqlmap](/man/sqlmap)(1), [burpsuite](/man/burpsuite)(1)
