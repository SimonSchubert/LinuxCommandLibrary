# TLDR

**Generate** locales from /etc/locale.gen

```sudo locale-gen```

Generate **keeping existing** locales

```sudo locale-gen --keep-existing```

# SYNOPSIS

**locale-gen** [_options_]

# DESCRIPTION

**locale-gen** compiles locale definitions from `/etc/locale.gen` into binary locale data. Uncomment desired locales in that file before running this command.

# PARAMETERS

**--keep-existing**
> Do not delete existing locale data

**--purge**
> Remove existing locales before generating

# CAVEATS

Requires root privileges. Edit `/etc/locale.gen` to enable locales before generating. On Debian-based systems, use `dpkg-reconfigure locales` for interactive configuration.

# SEE ALSO

[locale](/man/locale)(1), [localedef](/man/localedef)(1), [localectl](/man/localectl)(1)
