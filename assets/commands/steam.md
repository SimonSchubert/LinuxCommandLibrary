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

**Steam** is Valve's gaming platform client. It manages game libraries, updates, and social features.

Game launching uses app IDs. Find IDs in store URLs or library.

Big Picture mode provides controller-friendly interface. Designed for TV and Steam Deck.

Offline mode plays games without internet. Some games require online.

Proton enables Windows games on Linux. Compatibility layer built into Steam.

# CAVEATS

Proprietary software. Some games don't support Linux. Large disk usage.

# HISTORY

**Steam** was created by **Valve Corporation** in **2003**. Linux support was added in **2013**, significantly expanding gaming on the platform.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [proton](/man/proton)(1), [wine](/man/wine)(1)
