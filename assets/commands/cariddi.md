# TAGLINE

crawl URLs for endpoints, secrets, and sensitive data

# TLDR

**Crawl domains from list**

```cat [domains.txt] | cariddi```

**Hunt for secrets**

```cat [domains.txt] | cariddi -s```

**Hunt for endpoints**

```cat [domains.txt] | cariddi -e```

**Intensive subdomain crawling**

```cat [urls.txt] | cariddi -intensive```

**Hunt for file extensions**

```cat [domains.txt] | cariddi -ext [3]```

**Use proxy**

```cat [domains.txt] | cariddi -proxy [http://127.0.0.1:8080]```

**Random user agent**

```cat [domains.txt] | cariddi -rua```

# SYNOPSIS

**cariddi** [_options_]

# DESCRIPTION

**cariddi** is a reconnaissance tool that crawls URLs and scans for endpoints, secrets, API keys, file extensions, and tokens. It accepts domain lists via standard input, making it easy to chain with subdomain discovery tools in automated security assessment pipelines.

The tool performs passive analysis of crawled pages, extracting sensitive data such as hardcoded credentials, authentication tokens, and API keys using pattern matching. It supports configurable crawl depth, concurrency, and proxy settings for thorough yet controlled scanning.

Designed for bug bounty hunting and authorized penetration testing, cariddi outputs results in plain text or JSON format for integration with other security tools.

# PARAMETERS

**-s**
> Hunt for secrets

**-e**
> Hunt for endpoints

**-info**
> Hunt for useful information

**-ext** _level_
> Hunt for file extensions (1=juicy to 7=less juicy)

**-intensive**
> Crawl subdomains (*.target.com)

**-proxy** _url_
> HTTP or SOCKS5 proxy

**-rua**
> Random browser user agent per request

**-d** _depth_
> Crawl depth limit

**-c** _n_
> Concurrent requests

**-t** _seconds_
> Request timeout

**-o** _file_
> Output file

**-json**
> JSON output format

**-plain**
> Plain text output

# DETECTION TARGETS

- API keys and secrets
- Authentication tokens
- Sensitive file extensions
- Hidden endpoints
- Information disclosure

# CAVEATS

For authorized security testing only. Integrates well with subdomain discovery tools. GPL-3.0 licensed.

# SEE ALSO

[subfinder](/man/subfinder)(1), [httpx](/man/httpx)(1), [nuclei](/man/nuclei)(1)
