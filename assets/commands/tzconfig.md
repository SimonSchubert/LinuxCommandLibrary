# TAGLINE

Obsolete Debian timezone tool, use dpkg-reconfigure tzdata

# TLDR

**Configure timezone** on Debian and derivatives

```sudo dpkg-reconfigure tzdata```

**Set timezone** on systemd systems

```sudo timedatectl set-timezone [Region/City]```

**Legacy invocation** (no longer available)

```tzconfig```

# SYNOPSIS

**tzconfig**

# DESCRIPTION

**tzconfig** was an interactive Debian utility for configuring the system timezone. It presented a menu-based interface that guided users through selecting a geographic region and city, then updated **/etc/localtime**.

It no longer exists on current Debian systems. Use **dpkg-reconfigure tzdata** on Debian and derivatives, or **timedatectl set-timezone** on systemd systems.

# HISTORY

**tzconfig** shipped with Debian's libc6 package until glibc 2.5-2 (April **2007**) removed it, its job having moved to the maintainer scripts of tzdata. A compatibility script returned in tzdata 2008e-3 and was finally dropped as obsolete in tzdata 2022g-2 (January **2023**).

# SEE ALSO

[dpkg-reconfigure](/man/dpkg-reconfigure)(1), [timedatectl](/man/timedatectl)(1), [tzselect](/man/tzselect)(1)

# RESOURCES

```[Source code](https://salsa.debian.org/glibc-team/tzdata)```

<!-- verified: 2026-11-09 -->
