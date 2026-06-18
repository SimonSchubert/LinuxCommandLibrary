# TAGLINE

Lightweight multi-connection download accelerator

# TLDR

**Download** a file with multiple connections

```axel [https://example.com/file.zip]```

Download with a **specific number of connections**

```axel -n [16] [https://example.com/file.zip]```

**Save** with a different filename

```axel -o [output.zip] [https://example.com/file.zip]```

**Limit speed** to a given number of bytes per second

```axel -s [1024000] [https://example.com/file.zip]```

Set a custom **user agent**

```axel -U "[Mozilla/5.0]" [https://example.com/file.zip]```

**Skip** the download if the file already exists

```axel -c [https://example.com/file.zip]```

# SYNOPSIS

**axel** [_options_] _url_

# DESCRIPTION

**axel** is a lightweight download accelerator that opens multiple HTTP/FTP connections to the same file. By downloading different parts of the file simultaneously, it can significantly speed up downloads compared to single-connection tools.

The tool is particularly effective for large files on servers that don't rate-limit individual connections.

# PARAMETERS

**--num-connections=**_num_, **-n** _num_
> Number of connections to open.

**--output=**_file_, **-o** _file_
> Local filename to save to.

**--max-speed=**_bytes_, **-s** _bytes_
> Try to keep the average speed around this many bytes per second.

**--alternate**, **-a**
> Show an alternate progress bar with per-thread status.

**--quiet**, **-q**
> No output to stdout.

**--verbose**, **-v**
> Show more status messages. Repeat for more detail.

**--header=**_header_, **-H** _header_
> Add an HTTP header in the form 'Header: Value'.

**--user-agent=**_agent_, **-U** _agent_
> Set the HTTP user agent.

**--no-proxy**, **-N**
> Do not use any proxy server.

**--no-clobber**, **-c**
> Skip the download if a file with the same name already exists.

**--insecure**, **-k**
> Do not verify the SSL certificate.

**--timeout=**_secs_, **-T** _secs_
> Set the I/O and connection timeout.

**--max-redirect=**_num_
> Maximum redirects to follow (default: 20).

# FEATURES

- Multiple simultaneous connections
- Resume interrupted downloads
- Speed limiting
- FTP and HTTP support
- Progress indicators
- Proxy support

# CONFIGURATION

**/etc/axelrc**
> System-wide configuration file.

**~/.axelrc**
> Per-user configuration file for default settings like number of connections and speed limits.

# CAVEATS

Some servers block multiple connections. May be considered aggressive by some sites. Not all servers support range requests. Can waste bandwidth if connection limit is too high. Less feature-rich than aria2.

# HISTORY

**axel** was created by Wilmer van der Gaast around **2001** as a lightweight alternative to download managers, focusing on speed through parallel connections.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2](/man/aria2)(1)

# RESOURCES

```[Source code](https://github.com/axel-download-accelerator/axel)```

<!-- verified: 2026-06-18 -->
