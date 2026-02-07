# TAGLINE

configure CUPS server settings

# TLDR

**Show CUPS settings**

```cupsctl```

**Enable remote administration**

```cupsctl --remote-admin```

**Disable remote administration**

```cupsctl --no-remote-admin```

**Enable shared printers**

```cupsctl --share-printers```

**Enable debug logging**

```cupsctl --debug-logging```

# SYNOPSIS

**cupsctl** [_options_] [_setting=value_...]

# PARAMETERS

**--remote-admin**
> Enable remote administration.

**--no-remote-admin**
> Disable remote administration.

**--remote-any**
> Allow access from any address.

**--share-printers**
> Share local printers.

**--no-share-printers**
> Don't share local printers.

**--debug-logging**
> Enable debug logging.

**--no-debug-logging**
> Disable debug logging.

# DESCRIPTION

**cupsctl** configures the CUPS scheduler. It can enable/disable various features and modify server settings without directly editing cupsd.conf.

Requires administrator privileges.

# SEE ALSO

[cupsd](/man/cupsd)(8), [cups-config](/man/cups-config)(1)
