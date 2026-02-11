# TAGLINE

Valve gaming platform client

# TLDR

**Launch Steam**

```steam```

**Launch specific game**

```steam steam://rungameid/[app_id]```

**Open Big Picture mode**

```steam -bigpicture```

**Run in offline mode**

```steam -offline```

**Clear download cache**

```steam steam://flushconfig```

**Open game store page**

```steam steam://store/[app_id]```

**Verify game files**

```steam steam://validate/[app_id]```

# SYNOPSIS

**steam** [_options_] [_steam://url_]

# PARAMETERS

**-bigpicture**
> Big Picture mode.

**-offline**
> Offline mode.

**-silent**
> Start minimized.

**-login** _USER_ _PASS_
> Auto login.

**-console**
> Enable console.

**-dev**
> Developer mode.

**-noverifyfiles**
> Skip verification.

**-tcp**
> Force TCP.

# STEAM URLS

**steam://rungameid/ID** - Launch game
**steam://store/ID** - Store page
**steam://validate/ID** - Verify files
**steam://install/ID** - Install game
**steam://flushconfig** - Clear cache

# DESCRIPTION

**Steam** is Valve's gaming platform client for Linux, providing game library management, automatic updates, social features, and the Steam Workshop for community content. Games and applications are identified by app IDs, which can be used with steam:// URLs for direct launching, installation, and file verification.

Big Picture mode provides a controller-friendly, full-screen interface designed for TVs and the Steam Deck. On Linux, Steam includes **Proton**, a Wine-based compatibility layer that enables running many Windows games natively. Offline mode allows playing downloaded games without an internet connection.

# CAVEATS

Proprietary software. Some games don't support Linux. Large disk usage.

# HISTORY

**Steam** was created by **Valve Corporation** in **2003**. Linux support was added in **2013**, significantly expanding gaming on the platform.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [proton](/man/proton)(1), [wine](/man/wine)(1)
