# TLDR

**Check mailcap syntax**

```mcheck [mailcap]```

**Check default mailcap**

```mcheck ~/.mailcap```

**Verbose output**

```mcheck -v [mailcap]```

**Check specific MIME type**

```mcheck -t [image/png] [mailcap]```

# SYNOPSIS

**mcheck** [_options_] [_mailcap_]

# PARAMETERS

_MAILCAP_
> Mailcap file to check.

**-v**
> Verbose output.

**-t** _TYPE_
> Check specific MIME type.

**--help**
> Display help information.

# DESCRIPTION

**mcheck** validates mailcap file syntax. Mailcap defines how MIME types are handled.

The tool identifies errors in mailcap configuration. Useful for debugging email attachment handling.

mcheck validates mailcap files.

# CAVEATS

Mailcap format specific. May be part of metamail. Validates syntax only.

# HISTORY

mcheck is part of **metamail** or mailcap utilities for validating MIME handler configuration.

# SEE ALSO

[run-mailcap](/man/run-mailcap)(1), [see](/man/see)(1), [metamail](/man/metamail)(1)

