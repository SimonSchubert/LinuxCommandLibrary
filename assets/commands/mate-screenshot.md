# TAGLINE

captures screenshots in the MATE desktop environment

# TLDR

Capture the **whole screen**

```mate-screenshot```

Capture only the **focused window**

```mate-screenshot --window```

**Drag out a region** to capture

```mate-screenshot --area```

Open the **dialog** and choose the options there

```mate-screenshot --interactive```

**Wait a few seconds** first, so a menu can be opened

```mate-screenshot --delay=[5]```

Delay **and** capture just the window

```mate-screenshot --window --delay=[3]```

**Keep** the window border

```mate-screenshot --window --include-border```

**Strip** the window border

```mate-screenshot --window --remove-border```

Add a **drop shadow** around the window

```mate-screenshot --window --border-effect=[shadow]```

Put the image on the **clipboard** rather than saving it

```mate-screenshot --clipboard```

Capture a region **straight to the clipboard**

```mate-screenshot --area --clipboard```

# SYNOPSIS

**mate-screenshot** [_options_]

# PARAMETERS

**--window, -w**
> Capture only the active window

**--area, -a**
> Select a region to capture

**--interactive, -i**
> Open a dialog for capture options before taking screenshot

**--delay _seconds_, -d**
> Wait specified seconds before capturing

**--remove-border, -B**
> Remove window border from window captures

**--border-effect _type_, -e**
> Add an effect to the window border: shadow, border, or none

**--include-border, -b**
> Include window border in capture (default)

**--clipboard, -c**
> Copy screenshot to clipboard instead of saving

# DESCRIPTION

**mate-screenshot** captures screenshots in the MATE desktop environment. It can capture the entire screen, a single window, or a user-selected region.

By default, screenshots are saved to the Pictures directory with a timestamped filename. The interactive mode presents a dialog for choosing capture type, delay, and effects before taking the screenshot.

Effects like drop shadows can be applied to window captures for a more polished appearance.

# CAVEATS

Area selection requires mouse interaction to draw the capture region. The delay option is useful for capturing menus or tooltips that appear on hover. Window captures may not work correctly with some compositors or window managers.

# INSTALL

```apt: sudo apt install mate-utils```

```dnf: sudo dnf install mate-utils```

```pacman: sudo pacman -S mate-utils```

```apk: sudo apk add mate-utils```

```zypper: sudo zypper install mate-screenshot```

```nix: nix profile install nixpkgs#mate-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gnome-screenshot](/man/gnome-screenshot)(1), [scrot](/man/scrot)(1), [flameshot](/man/flameshot)(1), [maim](/man/maim)(1)
