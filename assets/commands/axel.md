# TLDR

**Download** file with multiple connections

```axel [https://example.com/file.zip]```

Download with **specific connections**

```axel -n [16] [https://example.com/file.zip]```

**Save** with different name

```axel -o [output.zip] [https://example.com/file.zip]```

**Quiet** mode

```axel -q [https://example.com/file.zip]```

Limit **speed**

```axel -s [1024000] [https://example.com/file.zip]```

# SYNOPSIS

**axel** [_options_] _url_

# DESCRIPTION

**axel** is a lightweight download accelerator that opens multiple HTTP/FTP connections to the same file. By downloading different parts of the file simultaneously, it can significantly speed up downloads compared to single-connection tools.

The tool is particularly effective for large files on servers that don't rate-limit individual connections.

# PARAMETERS

**-n** _num_
> Number of connections (default: 4)

**-o** _file_
> Output filename

**-s** _bytes_
> Maximum speed in bytes per second

**-a**
> Show more detailed progress

**-q**
> Quiet mode

**-H** _header_
> Add HTTP header

**-U** _agent_
> Set user agent

**--max-redirect=**_num_
> Maximum redirects to follow

**-N**
> No proxy

# FEATURES

- Multiple simultaneous connections
- Resume interrupted downloads
- Speed limiting
- FTP and HTTP support
- Progress indicators
- Proxy support

# CAVEATS

Some servers block multiple connections. May be considered aggressive by some sites. Not all servers support range requests. Can waste bandwidth if connection limit is too high. Less feature-rich than aria2.

# HISTORY

**axel** was created by Wilmer van der Gaast around **2001** as a lightweight alternative to download managers, focusing on speed through parallel connections.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2](/man/aria2)(1)
