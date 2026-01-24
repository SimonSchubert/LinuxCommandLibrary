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

**wget2** is the next generation of wget. It adds HTTP/2 and parallel downloads.

Parallel downloading speeds up multiple files. Connections reused.

HTTP/2 support improves efficiency. Multiplexed streams.

Recursive downloading mirrors sites. Depth and scope controllable.

Resume continues interrupted downloads. Range requests used.

Compatibility with wget maintained. Same basic interface.

# CAVEATS

Not all wget options supported. Still in development. May have bugs.

# HISTORY

**wget2** was developed as a modern rewrite of GNU Wget. It adds contemporary protocols while maintaining compatibility.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2c](/man/aria2c)(1)
