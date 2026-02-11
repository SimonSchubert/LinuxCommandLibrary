# TAGLINE

Manage XDG default application settings

# TLDR

**Print** the default web browser

```xdg-settings get default-web-browser```

**Set** the default web browser to Firefox

```xdg-settings set default-web-browser firefox.desktop```

**Set** the default mail handler to Evolution

```xdg-settings set default-url-scheme-handler mailto evolution.desktop```

# SYNOPSIS

**xdg-settings** {**get**|**check**|**set**} _property_ [_subproperty_] [_value_]

# PARAMETERS

**get _property_**
> Get the current value of a property

**set _property_ _value_**
> Set the value of a property

**check _property_ _value_**
> Check if a property has a specific value

**default-web-browser**
> Default web browser property

**default-url-scheme-handler _scheme_**
> Default handler for URL schemes (mailto, ftp, etc.)

# DESCRIPTION

**xdg-settings** manages settings for XDG-compatible desktop environments. It primarily handles default application settings like web browsers and URL scheme handlers.

The tool provides a standardized way to configure these settings across different desktop environments (GNOME, KDE, XFCE, etc.).

# CAVEATS

Application values are .desktop file names without the path. Some desktop environments may have additional configuration tools. Part of the xdg-utils package.

# SEE ALSO

[xdg-mime](/man/xdg-mime)(1), [xdg-open](/man/xdg-open)(1)
