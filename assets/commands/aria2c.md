# TAGLINE

Multi-protocol multi-source download utility

# TLDR

**Download** single file

```aria2c [URL]```

Download with **16 connections**

```aria2c -x 16 -s 16 [URL]```

Download to **specific directory**

```aria2c -d [/path/to/dir] [URL]```

**Continue** interrupted download

```aria2c -c [URL]```

Download from **magnet link**

```aria2c "[magnet:?xt=urn:btih:...]"```

Download with **RPC enabled**

```aria2c --enable-rpc --rpc-listen-all```

# SYNOPSIS

**aria2c** [_options_] [_URL_|_TORRENT_|_METALINK_]

# DESCRIPTION

**aria2c** is the command-line interface for aria2, the multi-protocol download utility. It supports parallel downloads, segmented downloading, and multiple source URLs for maximizing download speed.

The tool handles HTTP/HTTPS, FTP, SFTP, BitTorrent, and Metalink, with extensive configuration options.

# PARAMETERS

**-x** _n_
> Max connections per server (default: 1)

**-s** _n_
> Split file into n segments

**-c**
> Continue/resume download

**-d** _dir_
> Download directory

**-o** _file_
> Output filename

**--file-allocation** _method_
> none, prealloc, trunc, falloc

**--max-overall-download-limit** _speed_
> Overall speed limit

**--enable-rpc**
> Enable RPC interface

**--bt-enable-lpd**
> Enable Local Peer Discovery

**--dht-listen-port** _port_
> DHT port for BitTorrent

**-q**, **--quiet**
> Quiet mode

# CONFIGURATION

**~/.aria2/aria2.conf**
> Default configuration file for setting download options, connection limits, and protocol-specific settings.

# CAVEATS

aria2c is the same as aria2; the c stands for command-line. Server may limit connections despite client settings. BitTorrent features need proper network configuration.

# HISTORY

aria2c has been the primary interface for aria2 since the project's start around **2006**.

# SEE ALSO

[aria2](/man/aria2)(1), [wget](/man/wget)(1), [curl](/man/curl)(1)
