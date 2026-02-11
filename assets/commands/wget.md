# TAGLINE

Non-interactive network file downloader

# TLDR

**Download a file**

```wget [https://example.com/file]```

**Download with custom output name**

```wget -O [filename] [url]```

**Download to specific directory**

```wget -P [directory] [url]```

**Continue a partial download**

```wget -c [url]```

**Download in background**

```wget -b [url]```

**Download recursively** (mirror a website)

```wget -r [url]```

**Download with authentication**

```wget --user=[username] --password=[password] [url]```

**Limit download speed**

```wget --limit-rate=[200k] [url]```

**Download from a list of URLs**

```wget -i [urls.txt]```

# SYNOPSIS

**wget** [_options_] [_url_...]

# PARAMETERS

**-O** _file_
> Write to specified file

**-P** _prefix_
> Save to specified directory

**-c**, **--continue**
> Resume partial download

**-b**, **--background**
> Go to background after starting

**-q**, **--quiet**
> Quiet mode (no output)

**-r**, **--recursive**
> Recursive download

**-l** _depth_, **--level**=_depth_
> Maximum recursion depth (0 = infinite)

**-k**, **--convert-links**
> Convert links for local viewing

**-p**, **--page-requisites**
> Download all page requirements (images, CSS, etc.)

**-m**, **--mirror**
> Mirror mode (-r -N -l inf --no-remove-listing)

**-i** _file_, **--input-file**=_file_
> Read URLs from file

**--limit-rate**=_rate_
> Limit download speed

**--user**=_user_, **--password**=_pass_
> HTTP/FTP authentication

**-U** _agent_, **--user-agent**=_agent_
> Set User-Agent header

**--no-check-certificate**
> Don't validate SSL certificates

**--header**=_string_
> Send additional HTTP header

# DESCRIPTION

**wget** is a non-interactive network downloader supporting HTTP, HTTPS, and FTP. It can download files, follow links, and mirror entire websites while handling interruptions and retrying failed transfers.

For simple downloads, wget automatically names the output file from the URL. Use **-O** to specify a different name or **-O -** to output to stdout.

Recursive downloading with **-r** follows links and downloads connected pages. Combine with **-l** to limit depth, **-k** to convert links for offline browsing, and **-p** to get page resources.

Wget handles redirects, cookies, and authentication automatically. It's scriptable and works well for automated downloads and cron jobs.

# CAVEATS

Recursive downloading can consume significant bandwidth and storage. Always use **-l** to limit depth when mirroring, and respect robots.txt (wget does by default).

**--no-check-certificate** bypasses SSL verification—use only when necessary and understand the security implications.

Some sites block wget by User-Agent. Use **-U** to set a browser-like User-Agent string if needed.

For complex downloads with multiple retries and bandwidth control, consider creating a **.wgetrc** configuration file.

# SEE ALSO

[curl](/man/curl)(1), [aria2c](/man/aria2c)(1), [httrack](/man/httrack)(1), [lftp](/man/lftp)(1)
