# TAGLINE

MIME-type aware file editor launcher

# TLDR

**Edit a file** using the appropriate editor for its MIME type

```edit [filename]```

**Edit with explicit MIME type**

```edit [text/html]:[filename]```

**Show the editor command without running it**

```edit --norun [filename]```

**Using run-mailcap directly with the edit action**

```run-mailcap --action=edit [filename]```

# SYNOPSIS

**edit** _filename_

# DESCRIPTION

**edit** is an alias for run-mailcap's edit action. It opens files in the appropriate editor based on MIME type configuration in mailcap files.

The actual editor used depends on the file type and system mailcap configuration.

# PARAMETERS

_filename_
> File to edit. Can be prefixed with a MIME type and optional encoding as `MIME-TYPE:[ENCODING:]FILE`.

**--debug**
> Print extra diagnostic information about what is happening.

**--nopager**
> Ignore any `copiousoutput` directive and send output directly to stdout.

**--norun**
> Display the command that would be run without executing it.

# CONFIGURATION

**/etc/mailcap**
> System-wide MIME type to application mappings.

**~/.mailcap**
> User-specific MIME type overrides.

# CAVEATS

Debian/Ubuntu specific. The editor used depends on mailcap configuration and MIME type detection.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [sensible-editor](/man/sensible-editor)(1), [view](/man/view)(1), [compose](/man/compose)(1), [file](/man/file)(1)
