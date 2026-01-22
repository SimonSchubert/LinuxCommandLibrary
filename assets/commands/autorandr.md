# TLDR

**Save** current layout

```autorandr -s profile_name```

**List** saved profiles

```autorandr```

**Auto-detect** and apply profile

```autorandr -c```

**Load** specific profile

```autorandr -l profile_name```

Set **default** profile

```autorandr -d profile_name```

# SYNOPSIS

**autorandr** [_OPTIONS_] [_PROFILE_]

# DESCRIPTION

**autorandr** automatically detects connected displays and applies the appropriate screen layout based on saved profiles. It integrates with xrandr and can automatically switch profiles when monitors are connected or disconnected.

# PARAMETERS

**-s, --save** _name_
> Save current screen layout as a profile

**-l, --load** _name_
> Load a specific profile

**-c, --change**
> Automatically detect and load the appropriate profile

**-d, --default** _name_
> Set the default profile (used when no match is found)

**--fingerprint**
> Display the current setup's fingerprint

**--remove** _name_
> Remove a saved profile

**--batch**
> Run in batch mode (no confirmation)

**--skip-options** _options_
> Skip certain xrandr options when comparing

# CAVEATS

Requires xrandr to be installed. Profile matching is based on connected display EDIDs. Virtual displays or displays without valid EDID may not be matched correctly.

# HISTORY

**autorandr** simplifies multi-monitor setup by automatically detecting and applying saved configurations, commonly used with laptop docking stations and external displays.

# SEE ALSO

[xrandr](/man/xrandr)(1), [arandr](/man/arandr)(1)
