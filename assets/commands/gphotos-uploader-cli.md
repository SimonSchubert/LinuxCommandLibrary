# TAGLINE

Mass upload media folders to Google Photos

# TLDR

**Initialize** default configuration

```gphotos-uploader-cli init```

**Overwrite** existing configuration

```gphotos-uploader-cli init --force```

**Authenticate** with Google Photos (browser flow)

```gphotos-uploader-cli auth```

**Upload** configured folders

```gphotos-uploader-cli push```

**Dry-run** upload (no files sent)

```gphotos-uploader-cli push --dry-run```

**List albums**

```gphotos-uploader-cli list albums```

**Show version**

```gphotos-uploader-cli version```

# SYNOPSIS

**gphotos-uploader-cli** [*global-options*] *command* [*args*]

# DESCRIPTION

**gphotos-uploader-cli** is a Google Photos command-line client for Linux (and other platforms where Go binaries run). The official Google backup tools target macOS and Windows; this project fills the gap for bulk folder upload, album organization, and listing media already in the library.

Workflow: **init** creates config under **~/.gphotos-uploader-cli** (override with **--config**), you set Google API app credentials and upload jobs in **config.hjson**, **auth** completes OAuth in a browser, then **push** scans configured source folders and uploads new objects. A file tracker avoids re-uploading known media.

# PARAMETERS

**init**

> Create default configuration. **--force** overwrites an existing config.

**auth**

> Run the OAuth authentication flow against Google Photos.

**push**

> Upload local folders defined in the config jobs. **--dry-run** reports work without uploading.

**list albums** / **list** media-related subcommands

> List albums or media items already in Google Photos.

**version**

> Print the CLI version.

**reset**

> Reset local tracking state (see **gphotos-uploader-cli reset --help**).

Global flags include **--config** (config directory), **--debug**, and **--silent** (mutually exclusive with debug).

# CONFIGURATION

Default directory: **~/.gphotos-uploader-cli**, file **config.hjson**. You must supply Google Photos API app credentials (**APIAppCredentials**) and define **jobs** (source folders, include/exclude patterns, album policy). See the project documentation for the full schema.

# CAVEATS

Requires Google API credentials and interactive browser OAuth (headless setups need SSH port forwarding to the local callback port). The project has sought new maintainers; check GitHub for current status. Google Photos API quotas and policy limits apply. Not a full replacement for Google Takeout or the official backup clients.

# INSTALL

```brew: brew install gphotos-uploader-cli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rclone](/man/rclone)(1), [gdrive](/man/gdrive)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/gphotosuploader/gphotos-uploader-cli)```

```[Documentation](https://gphotosuploader.github.io/gphotos-uploader-cli)```

<!-- verified: 2026-07-19 -->
