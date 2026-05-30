# TAGLINE

Chunked, resumable HTTP downloader with concurrent downloads and post-part hooks

# TLDR

Download a file with default 100 MiB chunks

```rapel download https://example.com/large.iso```

Download with 4 concurrent jobs and 50 MiB chunks

```rapel download -c 50M --jobs 4 https://example.com/file.bin```

Resume an interrupted download (automatic)

```rapel download https://example.com/file.bin```

Download through a SOCKS5 proxy and run a command after each chunk

```rapel download -x socks5h://127.0.0.1:9050 --post-part 'rclone move {part} remote:bucket/' URL```

Manually merge previously downloaded parts

```rapel merge -o final.iso --delete```

# SYNOPSIS

**rapel** download [_options_] _URL_

**rapel** merge [_options_]

# DESCRIPTION

**rapel** is a modern, cross-platform downloader that splits large files into chunks, downloads them concurrently, and supports reliable resume after interruption. It records download parameters in a sidecar file so resuming is safe even across different sessions or machines.

After a successful download (or on demand), parts can be merged into the final file. A `--post-part` hook lets you upload, verify, or process each chunk as soon as it lands — useful for streaming uploads to object storage or triggering downstream pipelines.

The tool is written in Go, has zero runtime dependencies besides the binary, and works on Linux, macOS, Windows, FreeBSD, and Raspberry Pi (armv6/armv7).

# PARAMETERS (download)

**-c**, **--chunk-size** _SIZE_  
> Chunk size with K/M/G suffix (default 100M)

**--jobs** _N_  
> Number of concurrent chunk downloads (default 1)

**-x**, **--proxy** _URL_  
> Proxy (supports socks5h://, http://, etc.)

**-r**, **--retries** _N_  
> Retries per chunk request (default 10)

**--merge**  
> Automatically merge chunks after download completes

**--post-part** _CMD_  
> Shell command to run after each chunk (supports {part}, {idx}, {base})

**--force**  
> Ignore any existing state and start fresh

# SEE ALSO

[curl](curl)(1), [wget](wget)(1), [aria2c](aria2c)(1)