# TAGLINE

open files using mailcap-configured editors

# TLDR

**Compose** a file using the default mailcap editor

```compose [filename]```

Using **run-mailcap** directly

```run-mailcap --action=compose [filename]```

# SYNOPSIS

**compose** _filename_

# DESCRIPTION

**compose** is a convenience wrapper around run-mailcap's compose action, part of the mailcap system that provides MIME-type-aware file handling on Unix systems. When invoked, it examines the file's MIME type and launches the appropriate editor or composition tool as configured in the system's mailcap files.

The mailcap mechanism originated as a way to handle email attachments but has evolved into a general-purpose file handler system. It maps MIME types (like text/plain, image/png, or application/pdf) to specific commands that can view, edit, compose, or print those files. The compose action specifically refers to creating or editing files, distinguishing it from view (read-only) or print actions.

This tool is particularly useful in mail user agents (MUAs) and other applications that need to launch external editors based on content type rather than hardcoding specific applications. Different MIME types can be handled by different specialized tools automatically.

# PARAMETERS

_filename_
> The file to compose/edit

# CONFIGURATION

**~/.mailcap**
> User-specific MIME type to application mappings.

**/etc/mailcap**
> System-wide MIME type mappings.

# CAVEATS

Depends on mailcap configuration. The actual editor used depends on the file's MIME type and system configuration. Debian/Ubuntu specific.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [edit](/man/edit)(1), [view](/man/view)(1)
