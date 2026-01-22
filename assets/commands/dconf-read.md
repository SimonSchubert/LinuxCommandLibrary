# TLDR

**Read** a key value

```dconf read /[path/to/key]```

Read key **default** value

```dconf read -d /[path/to/key]```

# SYNOPSIS

**dconf read** [_options_] _key_

# DESCRIPTION

**dconf read** reads a value from the dconf database. It returns the value in GVariant text format.

This is the read-specific subcommand of dconf.

# PARAMETERS

**-d**
> Show default value instead of current value

_key_
> The full path to the key (e.g., /org/gnome/desktop/interface/font-name)

# CAVEATS

Returns nothing if the key doesn't exist. Values are in GVariant format. For schema information, use gsettings instead.

# SEE ALSO

[dconf](/man/dconf)(1), [dconf-write](/man/dconf-write)(1), [gsettings](/man/gsettings)(1)
