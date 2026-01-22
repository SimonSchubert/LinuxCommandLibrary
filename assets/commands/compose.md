# TLDR

**Compose** a file using the default mailcap editor

```compose [filename]```

Using **run-mailcap** directly

```run-mailcap --action=compose [filename]```

# SYNOPSIS

**compose** _filename_

# DESCRIPTION

**compose** is an alias for run-mailcap's compose action. It opens files in the appropriate editor based on MIME type configuration in mailcap files.

The mailcap system maps MIME types to applications for viewing, editing, composing, and printing.

# PARAMETERS

_filename_
> The file to compose/edit

# CAVEATS

Depends on mailcap configuration. The actual editor used depends on the file's MIME type and system configuration. Debian/Ubuntu specific.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [edit](/man/edit)(1), [view](/man/view)(1)
