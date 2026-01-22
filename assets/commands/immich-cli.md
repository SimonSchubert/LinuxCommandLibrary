# TLDR

**Upload photos**

```immich upload [/path/to/photos]```

**Upload with album**

```immich upload --album [AlbumName] [/path/to/photos]```

**Login to server**

```immich login [https://server] [api-key]```

**Check server info**

```immich server-info```

**Dry run upload**

```immich upload --dry-run [/path/to/photos]```

# SYNOPSIS

**immich** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**upload**
> Upload files.

**login**
> Authenticate with server.

**server-info**
> Show server information.

**--album** _NAME_
> Target album.

**--dry-run**
> Simulate upload.

**--help**
> Display help information.

# DESCRIPTION

**immich-cli** is the command-line interface for Immich photo server. It enables bulk uploads and server management.

The tool authenticates with API keys and uploads photos/videos. It supports album assignment and duplicate detection.

immich-cli manages Immich from terminal.

# CAVEATS

Requires Immich server. API key authentication. Node.js based.

# HISTORY

immich-cli is the official CLI for **Immich** photo management server.

# SEE ALSO

[immich](/man/immich)(1), [immich-go](/man/immich-go)(1), [rclone](/man/rclone)(1)
