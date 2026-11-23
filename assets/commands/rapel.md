# TAGLINE

Chunked, resumable HTTP downloader with concurrent downloads and post-part hooks

# TLDR

**Download** a file with default 100 MiB chunks (rerun the same command to resume)

```rapel download [https://example.com/large.iso]```

**Download** with 4 concurrent jobs and 50 MiB chunks

```rapel download -c [50M] --jobs [4] [https://example.com/file.bin]```

**Download** and merge the chunks automatically when done

```rapel download --merge [https://example.com/file.bin]```

**Download** through a SOCKS5 proxy and upload each chunk as it finishes

```rapel download -x [socks5h://127.0.0.1:9050] --post-part '[rclone move {part} remote:bucket/]' [url]```

**Start over**, ignoring existing state and chunk files

```rapel download --force [url]```

**Merge** previously downloaded parts manually and delete them

```rapel merge -o [final.iso] --delete```

# SYNOPSIS

**rapel** download [_options_] _URL_

**rapel** merge [_options_]

# DESCRIPTION

**rapel** is a modern, cross-platform downloader that splits large files into chunks, downloads them concurrently, and supports reliable resume after interruption. It records the URL, total size and chunk size in a **.{prefix}-args.json** sidecar file so a resumed download can verify it is continuing the right file; progress is reconstructed from the on-disk **.tmp** (in progress) and **.part** (complete) chunk files, so Ctrl+C is safe.

After a successful download (or on demand), parts can be merged into the final file. A `--post-part` hook lets you upload, verify, or process each chunk as soon as it lands, useful for streaming uploads to object storage or triggering downstream pipelines.

The tool is written in Go and works on Linux (amd64, arm64, armv6/armv7 including Raspberry Pi), macOS, Windows, and FreeBSD.

# PARAMETERS (download)

Flags must be given before the URL.

**-c** _SIZE_
> Chunk size with K/M/G suffix (default 100M).

**--jobs** _N_
> Number of concurrent chunk downloads (default 1).

**-x** _URL_
> Proxy URL (e.g. socks5h://127.0.0.1:9050).

**-r** _N_
> Retries per request (default 10).

**--no-head**
> Skip the HEAD request (requires **--size**).

**--size** _BYTES_
> Total size in bytes (required with **--no-head**).

**--merge**
> Merge chunks after the download completes (output name auto-detected).

**--post-part** _CMD_
> Shell command to run after each chunk completes; placeholders **{part}**, **{idx}**, **{base}**.

**--post-part-jobs** _N_
> Maximum concurrent post-part commands (default 0, unlimited).

**--force**
> Ignore any existing args file or chunk files and start fresh.

# PARAMETERS (merge)

**-o** _FILE_
> Output filename (auto-detected from the pattern if omitted).

**--pattern** _GLOB_
> Pattern for chunk files (default ***.part**). Multiple groups are merged into separate files.

**--delete**
> Delete chunk files and the args file after merging.

# CAVEATS

Post-part hooks are at-least-once: on resume they may run again for chunks already completed, so hooks should be idempotent. Resuming with a different URL or size requires **--force**. Runtime flags such as **--jobs**, **--post-part**, proxy and retries are not persisted and can change between runs. The server must support HTTP Range requests.

# SEE ALSO

[curl](/man/curl)(1), [wget](/man/wget)(1), [aria2c](/man/aria2c)(1)

# RESOURCES

```[Source code](https://github.com/redraw/rapel)```

<!-- verified: 2026-11-23 -->
