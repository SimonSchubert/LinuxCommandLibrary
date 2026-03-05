# TAGLINE

Set system timezone automatically via IP geolocation

# TLDR

**Automatically set system timezone**

```tzupdate```

**Print detected timezone without applying**

```tzupdate -p```

**Detect timezone for a specific IP**

```tzupdate -i [8.8.8.8]```

# SYNOPSIS

**tzupdate** [_options_]

# DESCRIPTION

**tzupdate** geolocates your IP address, determines the correct timezone, and updates the system's local timezone. It queries multiple geolocation services in parallel and protects against invalid results. Useful for automatically configuring timezone on servers or fresh installations.

# HISTORY

**tzupdate** was created by **cdown** and is written in **Rust** (formerly Python).

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [date](/man/date)(1), [tz](/man/tz)(1)
