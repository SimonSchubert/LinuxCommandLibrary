# TLDR

**Start KDE Plasma** on X11 from console

```startplasma-x11```

**Start via xinit**

```xinit /usr/bin/startplasma-x11```

**Start with startx** (add to ~/.xinitrc)

```echo "exec startplasma-x11" > ~/.xinitrc && startx```

# SYNOPSIS

**startplasma-x11**

# DESCRIPTION

**startplasma-x11** starts the KDE Plasma desktop environment using the X11 display server. It initializes the KWin X11 window manager, Plasma shell, and associated desktop services.

This command is typically invoked automatically by display managers (SDDM, GDM, LightDM) when selecting the "Plasma (X11)" session. It can also be started manually via **startx** or **xinit** for minimal setups without a display manager.

X11 provides broad application compatibility and mature driver support. Use this session type when Wayland has issues with your hardware or when running applications that require X11-specific features.

# CAVEATS

Requires an X server to be running or started via xinit/startx. X11 has inherent security limitations compared to Wayland (any application can capture input/screen). Some modern features like per-monitor scaling work better on Wayland. Starting from Plasma 6, Wayland is the recommended default session.

# HISTORY

**startplasma-x11** replaced the older **startkde** script as part of KDE Plasma 5's modernization. The X11 session remains available for compatibility with older hardware, proprietary drivers, and applications requiring X11-specific features. With Plasma 6 in **2024**, Wayland became the default, but X11 remains supported.

# SEE ALSO

[startplasma-wayland](/man/startplasma-wayland)(1), [kwin_x11](/man/kwin_x11)(1), [plasmashell](/man/plasmashell)(1), [startx](/man/startx)(1), [xinit](/man/xinit)(1)
