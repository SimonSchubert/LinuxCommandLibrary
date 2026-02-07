# TAGLINE

GitHub release binary downloader

# TLDR

**Download latest release** binary

```eget [owner/repo]```

**Download specific** binary

```eget [owner/repo] --asset [linux-amd64]```

**Download to specific** directory

```eget [owner/repo] --to [/usr/local/bin]```

**Download specific version**

```eget [owner/repo] --tag [v1.2.3]```

**Extract specific file** from archive

```eget [owner/repo] --file [binary]```

**Verify with checksum**

```eget [owner/repo] --verify-sha256 [checksum]```

# SYNOPSIS

**eget** [_options_] _repository_

# PARAMETERS

_REPOSITORY_
> GitHub repository in owner/repo format.

**--asset** _PATTERN_
> Asset name pattern to download.

**--to** _DIR_
> Destination directory.

**--tag** _VERSION_
> Specific version tag.

**--file** _NAME_
> Extract specific file from archive.

**--verify-sha256** _HASH_
> Verify checksum.

**--system**
> Install system-wide (to /usr/local/bin).

**--help**
> Display help information.

# DESCRIPTION

**eget** downloads and extracts prebuilt binaries from GitHub releases. It automatically detects the correct asset for your platform (OS and architecture) and extracts executables from archives.

The tool simplifies installing Go, Rust, and other compiled tools that distribute binaries through GitHub releases. It handles tar, zip, and other archive formats automatically.

eget supports checksums verification and can be configured with a dotfile for managing multiple tools.

# CAVEATS

Requires GitHub API access. Rate limits may apply. Trust the source of binaries you download. Platform detection may not always match.

# HISTORY

eget was created to simplify the common task of downloading and installing tools from GitHub releases, providing a single command to replace manual download, extraction, and installation.

# SEE ALSO

[gh](/man/gh)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)
