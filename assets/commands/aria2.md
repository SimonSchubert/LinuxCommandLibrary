# TAGLINE

Multi-protocol multi-source download utility

# TLDR

**Download** a file

```aria2c [https://example.com/file.zip]```

Download with **multiple connections**

```aria2c -x 16 -s 16 [https://example.com/file.zip]```

Download from **multiple mirror sources**

```aria2c [http://mirror1.com/file] [http://mirror2.com/file]```

**Resume** an interrupted download

```aria2c -c [https://example.com/file.zip]```

Download a **torrent** file

```aria2c [file.torrent]```

Download from a **magnet link**

```aria2c "[magnet:?xt=urn:btih:...]"```

Download **URLs from a file** (one URL per line)

```aria2c -i [urls.txt]```

**Limit download speed**

```aria2c --max-download-limit=[500K] [https://example.com/file.zip]```

# SYNOPSIS

**aria2c** [_options_] _URL_|_TORRENT_|_METALINK_ ...

# DESCRIPTION

**aria2** is a lightweight multi-protocol download utility supporting HTTP/HTTPS, FTP, SFTP, BitTorrent, and Metalink. It can download files using multiple connections and sources simultaneously for faster speeds.

The actual command is **aria2c** (the "c" stands for command-line). The tool is highly optimized, using minimal memory (typically 4-9 MiB) while supporting advanced features like segmented downloading, BitTorrent, and JSON-RPC remote control.

# PARAMETERS

**-x** _n_, **--max-connection-per-server** _n_
> Maximum connections per server (default: 1, max: 16)

**-s** _n_, **--split** _n_
> Split download into n parts (default: 5)

**-c**, **--continue**
> Resume a partially downloaded file

**-d** _dir_, **--dir** _dir_
> Download directory

**-o** _file_, **--out** _file_
> Output filename

**-j** _n_, **--max-concurrent-downloads** _n_
> Maximum number of parallel downloads (default: 5)

**-i** _file_, **--input-file** _file_
> Download URLs listed in file

**--max-download-limit** _speed_
> Per-download speed limit (e.g., 500K, 2M)

**--max-overall-download-limit** _speed_
> Overall download speed limit

**--enable-rpc**
> Enable JSON-RPC/XML-RPC server for remote control

**--seed-time** _minutes_
> BitTorrent seeding time (0 to disable seeding)

**--select-file** _indices_
> Select specific files from a torrent (comma-separated indices)

**--file-allocation** _method_
> File allocation method: none, prealloc, trunc, or falloc

# CONFIGURATION

**~/.aria2/aria2.conf**
> Default configuration file for setting download options, connection limits, and protocol-specific settings. One option per line without the leading --.

# CAVEATS

Multiple connections may be limited or throttled by the server. BitTorrent requires proper port forwarding for best performance. The **-x** and **-s** flags should generally be used together for segmented downloads.

# HISTORY

**aria2** was developed by Tatsuhiro Tsujikawa, with initial release around **2006**. Written in C++, it has become a popular alternative to wget and curl for its multi-connection download capability.

# SEE ALSO

[aria2c](/man/aria2c)(1), [curl](/man/curl)(1), [wget](/man/wget)(1), [transmission-cli](/man/transmission-cli)(1)
