# TAGLINE

read values from dconf configuration database

# TLDR

**Read** a key value

```dconf read /[path/to/key]```

Read key **default** value

```dconf read -d /[path/to/key]```

# SYNOPSIS

**dconf read** [_options_] _key_

# DESCRIPTION

**dconf read** reads a value from the dconf database and outputs it in GVariant text format. This subcommand is equivalent to using "dconf read" as the main command.

The tool returns the current stored value for a key, or nothing if the key doesn't exist. Using the -d flag shows the default value defined in the application's GSettings schema instead of the user's customized value. This is useful for determining what value an application will use if the user preference is reset.

Values are output in GVariant format, which means strings appear with quotes, arrays use brackets, and typed data includes type annotations for empty collections.

# PARAMETERS

**-d**
> Show default value instead of current value

_key_
> The full path to the key (e.g., /org/gnome/desktop/interface/font-name)

# CAVEATS

Returns nothing if the key doesn't exist. Values are in GVariant format. For schema information, use gsettings instead.

# SEE ALSO

[dconf](/man/dconf)(1), [dconf-write](/man/dconf-write)(1), [gsettings](/man/gsettings)(1)
