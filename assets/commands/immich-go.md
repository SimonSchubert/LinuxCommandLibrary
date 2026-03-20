# TAGLINE

go-based alternative CLI for Immich

# TLDR

**Upload photos**

```immich-go upload [/path/to/photos]```

**Upload Google Photos Takeout archive**

```immich-go upload --google-photos [takeout.zip]```

**Create album per folder**

```immich-go upload --create-album-folder [/path/to/photos]```

**Dry run to preview upload**

```immich-go upload --dry-run [/path/to/photos]```

**Set server and API key**

```immich-go upload --server [url] --api-key [api-key] [/path/to/photos]```

**Upload with date range filter**

```immich-go upload --date-range [2023-01-01,2023-12-31] [/path/to/photos]```

# SYNOPSIS

**immich-go** _command_ [_options_] _path_

# PARAMETERS

**upload**
> Upload files to the Immich server.

**archive**
> Export assets from an Immich server to local storage.

**stack**
> Organize related photos into stacks (RAW+JPEG pairs, bursts, etc.).

**--server** _URL_
> Immich server URL.

**--api-key** _KEY_
> API key for authentication.

**--google-photos**
> Parse Google Photos Takeout archive.

**--icloud**
> Parse iCloud photo export.

**--create-album-folder**
> Create albums from folder names.

**--dry-run**
> Simulate upload without making changes.

**--date-range** _RANGE_
> Upload only photos within a date range.

**--help**
> Display help information.

# DESCRIPTION

**immich-go** is a Go-based alternative CLI for the Immich self-hosted photo management server. It provides efficient bulk uploads with support for Google Photos Takeout, iCloud exports, and Picasa archives.

The tool handles date parsing from various metadata sources including EXIF, JSON sidecars, and file names. It is distributed as a single binary with no runtime dependencies, making it faster and easier to deploy than the official Node.js-based CLI for large uploads.

# CAVEATS

Unofficial community tool, not maintained by the Immich project. Requires a running Immich server and a valid API key. Flag syntax uses double dashes (e.g. --server, --api-key).

# HISTORY

immich-go was created by **simulot** as a faster, dependency-free alternative CLI for **Immich** with Google Takeout import support. It is written in **Go**.

# SEE ALSO

[immich-cli](/man/immich-cli)(1), [rclone](/man/rclone)(1)
