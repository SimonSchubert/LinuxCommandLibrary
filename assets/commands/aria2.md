# TLDR

**Download** a file

```aria2c [https://example.com/file.zip]```

Download with **multiple connections**

```aria2c -x [16] [https://example.com/file.zip]```

Download from **multiple sources**

```aria2c [http://mirror1.com/file] [http://mirror2.com/file]```

**Resume** interrupted download

```aria2c -c [https://example.com/file.zip]```

Download **torrent**

```aria2c [file.torrent]```

# SYNOPSIS

**aria2c** [_-x connections_] [_-c_] [_options_] _urls_|_torrent_|_metalink_

# DESCRIPTION

**aria2** is a lightweight multi-protocol download utility supporting HTTP/HTTPS, FTP, SFTP, BitTorrent, and Metalink. It can download files using multiple connections and sources simultaneously for faster speeds.

The tool is highly optimized, using minimal memory while supporting advanced features like segmented downloading and BitTorrent.

# PARAMETERS

**-x** _n_, **--max-connection-per-server** _n_
> Maximum connections per server

**-s** _n_, **--split** _n_
> Split download into n parts

**-c**, **--continue**
> Resume download

**-d** _dir_, **--dir** _dir_
> Download directory

**-o** _file_, **--out** _file_
> Output filename

**-j** _n_, **--max-concurrent-downloads** _n_
> Parallel downloads

**-i** _file_, **--input-file** _file_
> Download URLs from file

**--enable-rpc**
> Enable JSON-RPC/XML-RPC

**--seed-time** _minutes_
> BitTorrent seeding time

**--select-file** _indices_
> Select files from torrent

# CAVEATS

Multiple connections may be limited by server. BitTorrent requires proper port forwarding for best performance. Some features require specific options enabled.

# HISTORY

**aria2** was developed by Tatsuhiro Tsujikawa, with initial release around **2006**. It has become a popular alternative to wget and curl for its multi-connection download capability.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [transmission-cli](/man/transmission-cli)(1)
