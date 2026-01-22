# TLDR

**Edit** a file using mailcap configuration

```edit [filename]```

Using **run-mailcap** directly

```run-mailcap --action=edit [filename]```

# SYNOPSIS

**edit** _filename_

# DESCRIPTION

**edit** is an alias for run-mailcap's edit action. It opens files in the appropriate editor based on MIME type configuration in mailcap files.

The actual editor used depends on the file type and system mailcap configuration.

# PARAMETERS

_filename_
> File to edit

# CAVEATS

Debian/Ubuntu specific. The editor used depends on mailcap configuration and MIME type detection.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [sensible-editor](/man/sensible-editor)(1), [view](/man/view)(1)
