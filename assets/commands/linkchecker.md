# TLDR

**Check website links**

```linkchecker [https://example.com]```

**Check local HTML file**

```linkchecker [index.html]```

**Recursive check**

```linkchecker -r [https://example.com]```

**Output to file**

```linkchecker -o html -F html/[report.html] [url]```

**Check external links too**

```linkchecker --check-extern [url]```

**Limit depth**

```linkchecker -r --depth=[3] [url]```

# SYNOPSIS

**linkchecker** [_options_] _url_

# PARAMETERS

_URL_
> URL or file to check.

**-r**
> Recursive checking.

**--depth** _N_
> Maximum recursion depth.

**--check-extern**
> Check external links.

**-o** _TYPE_
> Output type (text, html, csv, xml).

**-F** _FILE_
> Output to file.

**--help**
> Display help information.

# DESCRIPTION

**linkchecker** validates links in websites and documents. It finds broken links, redirects, and errors.

The tool supports HTTP, HTTPS, FTP, and local files. It can check recursively and generate reports.

linkchecker finds broken links.

# CAVEATS

Can be slow on large sites. May trigger rate limiting. Respects robots.txt by default.

# HISTORY

LinkChecker was created by **Bastian Kleineidam** as a comprehensive link validation tool for web content.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [lychee](/man/lychee)(1)

