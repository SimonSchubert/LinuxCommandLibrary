# TAGLINE

Next-generation wget with HTTP/2 support

# TLDR

**Download file**

```wget2 [https://example.com/file.zip]```

**Download to specific file**

```wget2 -O [output.zip] [url]```

**Continue partial download**

```wget2 -c [url]```

**Download recursively**

```wget2 -r [https://example.com]```

**Mirror website**

```wget2 -m [https://example.com]```

**Parallel downloads**

```wget2 --parallel [url1] [url2]```

**Limit rate**

```wget2 --limit-rate=[1M] [url]```

**HTTP/2 support**

```wget2 --http2 [url]```

# SYNOPSIS

**wget2** [_-O file_] [_-c_] [_-r_] [_options_] _urls_

# PARAMETERS

**-O** _FILE_
> Output filename.

**-c**, **--continue**
> Resume download.

**-r**, **--recursive**
> Recursive download.

**-m**, **--mirror**
> Mirror site.

**--parallel**
> Parallel connections.

**--limit-rate** _RATE_
> Bandwidth limit.

**--http2**
> Force HTTP/2.

**-q**, **--quiet**
> Quiet mode.

**-P** _DIR_
> Save to directory.

# DESCRIPTION

**wget2** is the next-generation version of GNU Wget, rebuilt to support modern protocols and parallel downloading. It adds native HTTP/2 support with multiplexed streams, enabling more efficient communication with servers that support the protocol.

Parallel downloading fetches multiple files simultaneously over reused connections, significantly speeding up batch downloads compared to the sequential approach of the original wget. Recursive downloading and website mirroring are supported with the same familiar -r and -m flags.

The tool maintains command-line compatibility with wget for basic operations like downloading files, resuming interrupted transfers, and recursive mirroring, while improving performance through its modernized network stack.

# CAVEATS

Not all wget options supported. Still in development. May have bugs.

# HISTORY

**wget2** was developed as a modern rewrite of GNU Wget. It adds contemporary protocols while maintaining compatibility.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2c](/man/aria2c)(1)
