# TAGLINE

Lightweight standalone system tray panel

# TLDR

**Run** trayer

```trayer```

Position to **edge**

```trayer --edge [left|right|top|bottom]```

Set **dimensions**

```trayer --width [10] --height [32]```

Set width **type** and size

```trayer --widthtype [pixel|percent] --width [72]```

**Align** panel

```trayer --align [left|center|right]```

Set icon **spacing**

```trayer --iconspacing [10]```

# SYNOPSIS

**trayer** [_OPTIONS_]

# PARAMETERS

**--edge** _POSITION_
> Position panel at _left_, _right_, _top_, _bottom_, or _none_ (default: _bottom_)

**--align** _DIRECTION_
> Align icons: _left_, _center_, _right_, or _none_ (default: _center_)

**--widthtype** _TYPE_
> Width interpretation: _request_, _pixel_, _percent_, or _none_ (default: _percent_)

**--width** _N_
> Panel width as a number, interpreted per **--widthtype** (default: _100_)

**--heighttype** _TYPE_
> Height interpretation: _request_, _pixel_, _percent_, or _none_ (default: _pixel_)

**--height** _N_
> Panel height value (default: _26_)

**--margin** _N_
> Margin from the screen edge in pixels (default: _0_)

**--distance** _N_
> Distance between trayer's window and screen edge in pixels (default: _0_)

**--distancefrom** _EDGE_
> Edge to measure **--distance** from: _top_, _bottom_, _left_, _right_ (default: _top_)

**--padding** _N_
> Extra pixel spacing between frame and icons (default: _0_)

**--iconspacing** _N_
> Spacing between icons in pixels

**--monitor** _N_
> Target monitor by index (0..N) or _primary_ (default: _0_)

**--transparent** _BOOL_
> Enable transparency: _true_ or _false_ (default: _false_)

**--alpha** _N_
> Transparency level (0 = opaque, 255 = fully transparent; default: _127_)

**--tint** _COLOR_
> Background tint as a hex value, e.g. _0xFFFFFFFF_

**--expand** _BOOL_
> Allow trayer to expand to use extra space (default: _true_)

**--SetDockType** _BOOL_
> Identify panel window as a dock type window (default: _true_)

**--SetPartialStrut** _BOOL_
> Reserve panel space so other windows do not overlap it (default: _false_)

# DESCRIPTION

**trayer** is a lightweight GTK-2 based system tray panel. It provides a standalone systray that can be used with minimalist window managers that don't include their own system tray implementation.

The panel displays system tray icons from applications and can be positioned and sized according to user preferences.

# CAVEATS

Requires GTK-2. May not support all modern tray icon features. Transparency requires compositor support. Some window managers may conflict with positioning.

# HISTORY

**trayer** was developed as a standalone system tray for use with tiling and minimal window managers that lack built-in system tray support.

# INSTALL

```apt: sudo apt install trayer```

```nix: nix profile install nixpkgs#trayer```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[stalonetray](/man/stalonetray)(1)
