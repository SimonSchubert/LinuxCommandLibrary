# TAGLINE

Next-generation recursive metalink/file/website downloader

# TLDR

**Download a file**

```wget2 [https://example.com/file.zip]```

**Download to a specific filename**

```wget2 -O [output.zip] [url]```

**Continue a partial download**

```wget2 -c [url]```

**Download recursively**

```wget2 -r [https://example.com]```

**Mirror a website**

```wget2 -m [https://example.com]```

**Download with chunked parallel transfer**

```wget2 --chunk-size=[1M] [url]```

**Limit download rate**

```wget2 --limit-rate=[1M] [url]```

**Download with specific compression support**

```wget2 --compression=[gzip,br,zstd] [url]```

# SYNOPSIS

**wget2** [_options_] [_urls_]

# PARAMETERS

**-O** _FILE_
> Save to specified output filename.

**-c**, **--continue**
> Resume a partially downloaded file.

**-r**, **--recursive**
> Recursive download.

**-m**, **--mirror**
> Mirror a website (shortcut for -r -N -l inf --no-remove-listing).

**--chunk-size** _SIZE_
> Download large files in multithreaded chunks of the given size.

**--limit-rate** _RATE_
> Limit bandwidth to the specified rate (e.g., 1M).

**--http2**
> Force HTTP/2 protocol.

**--http2-request-window** _NUM_
> Set max number of parallel streams per HTTP/2 connection (default: 30).

**--compression** _TYPE_
> Set accepted compression types (identity, gzip, deflate, br, zstd, lzip, etc.).

**-q**, **--quiet**
> Quiet mode, suppress output.

**-P** _DIR_
> Save files to specified directory prefix.

**--no-clobber**
> Do not overwrite existing files or truncate partial files.

**-d**, **--debug**
> Print debug output.

# DESCRIPTION

**wget2** is the next-generation version of GNU Wget, rebuilt to support modern protocols and parallel downloading. It adds native HTTP/2 support with multiplexed streams, enabling more efficient communication with servers that support the protocol.

Parallel downloading fetches multiple files simultaneously over reused connections, significantly speeding up batch downloads compared to the sequential approach of the original wget. The **--chunk-size** option splits large single-file downloads into parallel chunks. Recursive downloading and website mirroring are supported with the same familiar -r and -m flags.

wget2 also supports Metalink files for mirror-aware downloads with automatic integrity checking, compression negotiation, and modern TLS. The tool maintains command-line compatibility with wget for basic operations while improving performance through its modernized network stack.

# CAVEATS

Not all original wget options are supported. Some behavioral differences exist compared to wget. The --chunk-size feature works best with servers that support HTTP range requests.

# HISTORY

**wget2** was developed by Tim Ruehsen as a modern rewrite of GNU Wget. Development began around 2012, with version 2.0.0 released in 2021. It adds HTTP/2, parallel downloading, and Metalink support while maintaining backward compatibility.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [aria2c](/man/aria2c)(1)
