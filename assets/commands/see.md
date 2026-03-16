# TAGLINE

View files using mailcap MIME handlers

# TLDR

**View** a file using its MIME type handler

```see [filename]```

**View** a file with an explicit MIME type

```see [mime/type]:[filename]```

**Display** the command that would be used without executing it

```see --norun [filename]```

# SYNOPSIS

**see** [**--norun**] [**--nopager**] [**--debug**] [_mime-type_**:**[_encoding_**:**]_filename_]

# PARAMETERS

**--debug**
> Turn on extra information to find out what is happening

**--nopager**
> Ignore any "copiousoutput" directive and send output to STDOUT

**--norun**
> Display the found command without actually executing it

# DESCRIPTION

**see** is an alias for **run-mailcap --action=view**. It opens files using the appropriate viewer based on MIME type as configured in the mailcap database (~/.mailcap and /etc/mailcap).

Each file can be specified as its mime-type, its encoding (e.g. compression), and filename together, separated by colons. If the mime-type is not specified, it is determined from the filename extension using the mime.types database.

# CAVEATS

Behavior depends on mailcap configuration. Some MIME types may not have configured viewers. Part of the **mailcap** (or **mime-support**) package.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [edit](/man/edit)(1), [compose](/man/compose)(1), [print](/man/print)(1), [xdg-open](/man/xdg-open)(1)
