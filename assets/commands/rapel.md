# TAGLINE

Chunked, resumable HTTP downloader for unstable networks

# TLDR

**Download** a URL with default settings

```rapel download [https://example.com/file.bin]```

**Download** with parallel 50M chunks

```rapel download [https://example.com/file.bin] -c [50M] --jobs [4]```

**Download** through a SOCKS5 proxy

```rapel download [https://example.com/file.bin] -x [socks5h://127.0.0.1:9050]```

**Download** and auto-merge the parts when finished

```rapel download [https://example.com/file.bin] --merge```

**Run** a command after each chunk completes

```rapel download [https://example.com/file.bin] --post-part 'rclone move {part} remote:bucket/'```

**Merge** previously downloaded parts and delete them

```rapel merge --pattern '[file.*.part]' --delete```

# SYNOPSIS

**rapel** **download** _URL_ [_options_]

**rapel** **merge** [_options_]

# DESCRIPTION

**rapel** is an HTTP(S) downloader designed for unstable networks. It splits a file into chunks, downloads them with optional concurrency, retries individual ranges on failure, and persists download state so an interrupted transfer can be resumed without restarting from the beginning.

The tool is split into two subcommands. **download** fetches the file as chunked **.part** files, optionally invoking a hook command after each chunk (useful for streaming chunks to remote storage with **rclone** before they accumulate on disk). **merge** stitches existing chunk files back into a single output and can delete the chunks afterward.

A SOCKS5 proxy can be configured with **-x**, making **rapel** suitable for fetching over Tor or similar circuits.

# PARAMETERS

**download** subcommand:

**-c  _size_**
> Chunk size with **K**, **M**, or **G** suffix. Default: **100M**.

**-x  _url_**
> Proxy URL, e.g. **socks5h://127.0.0.1:9050**.

**-r  _n_**
> Retry attempts per request. Default: **10**.

**--no-head**
> Skip the initial HEAD request. Requires **--size**.

**--size  _bytes_**
> Total size in bytes. Required when **--no-head** is set.

**--jobs  _n_**
> Concurrent chunk downloads. Default: **1**.

**--force**
> Re-download even if existing state would resume.

**--merge**
> Automatically merge chunks once the download completes.

**--post-part  _cmd_**
> Command to run after each chunk. Placeholders: **{part}**, **{idx}**, **{base}**.

**merge** subcommand:

**-o  _file_**
> Output filename. Auto-detected if omitted.

**--pattern  _glob_**
> Glob matching chunk files. Default: **\*.part**.

**--delete**
> Delete chunk files after a successful merge.

# CAVEATS

The remote server must support HTTP **Range** requests for chunked, resumable transfers to work. When **--no-head** is used the caller is responsible for supplying an accurate **--size**; an incorrect value can produce a truncated or corrupted file.

# SEE ALSO

[aria2c](/man/aria2c)(1), [curl](/man/curl)(1), [wget](/man/wget)(1), [axel](/man/axel)(1)
