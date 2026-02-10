# TAGLINE

go-based alternative CLI for Immich

# TLDR

**Upload photos**

```immich-go upload [/path/to/photos]```

**Upload Google Takeout**

```immich-go upload -google-photos [takeout.zip]```

**Create album per folder**

```immich-go upload -create-album-folder [/path]```

**Dry run**

```immich-go upload -dry-run [/path]```

**Set server**

```immich-go upload -server=[url] -key=[api-key] [/path]```

# SYNOPSIS

**immich-go** _command_ [_options_] _path_

# PARAMETERS

_PATH_
> Path to upload.

**upload**
> Upload files.

**-server** _URL_
> Immich server URL.

**-key** _KEY_
> API key.

**-google-photos**
> Parse Google Takeout.

**-create-album-folder**
> Create albums from folders.

**-dry-run**
> Simulate upload.

**--help**
> Display help information.

# DESCRIPTION

**immich-go** is a Go-based alternative CLI for Immich. It provides efficient bulk uploads with Google Photos Takeout support.

The tool handles date parsing from various metadata sources. It's faster than the official CLI for large uploads.

# CAVEATS

Unofficial tool. Single binary. Google Takeout compatible.

# HISTORY

immich-go was created as a faster alternative CLI for **Immich** with Google Takeout import support.

# SEE ALSO

[immich](/man/immich)(1), [immich-cli](/man/immich-cli)(1), [rclone](/man/rclone)(1)
