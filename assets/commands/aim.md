# TAGLINE

Command-line download/upload tool with resume

# TLDR

**Download a file** to the current directory

```aim [https://domain.com/file.tar.gz] .```

**Upload a local file**

```aim [local.file] [https://domain.com/destination.file]```

**Download and auto-decompress** an archive

```aim [https://domain.com/file.tar.gz] +```

**Browse a remote directory interactively**

```aim [http://192.168.1.5:8080] -i```

**Serve the current directory** over HTTP

```aim .```

**Download with SHA256 checksum** validation

```aim [https://domain.com/file] . [sha256hash]```

# SYNOPSIS

**aim** [_options_] _source_ [_destination_] [_checksum_]

# PARAMETERS

**-i**, **--interactive**
> Navigate remote directories with fuzzy search before downloading

**--update**
> Self-update the binary in place

**--no-follow-redirects**
> Disable automatic HTTP redirect following

# DESCRIPTION

**aim** is a command-line download and upload tool with resume capabilities, positioned as an alternative to aria2 for users who do not need torrent support. It supports HTTP(S), FTP, SFTP, SSH, and S3 protocols, with resume support for HTTP(S), FTP, and SFTP transfers. The action (download or upload) is determined by the order of parameters.

Written in Rust, aim features interactive fuzzy-search navigation of remote directories, automatic archive decompression, SHA256 checksum verification, folder sharing over HTTP, pipe-compatible output, and support for .netrc and AWS credentials for authentication.

# CAVEATS

Resume is not supported for SSH and S3 protocols. Interactive mode is only available for HTTP(S). SSH key types are auto-detected (id_ed25519, id_rsa). Default output is stdout when no destination is specified.

# HISTORY

**aim** was created by **Mihai Galos** as an open-source Rust project under the MIT license. It is available on crates.io and as pre-built binaries from GitHub releases.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [aria2c](/man/aria2c)(1), [scp](/man/scp)(1)
