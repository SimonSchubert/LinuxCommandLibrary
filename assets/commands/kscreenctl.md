# TAGLINE

manage KDE Plasma display outputs from the command line

# TLDR

**List** connected outputs

```kscreenctl list-outputs```

Show an on-screen **label** on each monitor

```kscreenctl identify```

Show details for one **output** (or `active-output` / `primary-output`)

```kscreenctl DP-1```

Set **resolution and refresh rate**

```kscreenctl DP-1 set-mode 1920x1080@60```

Set **scale** to 200%

```kscreenctl DP-1 set-scale 200%```

Place one output **to the right** of another

```kscreenctl HDMI-A-1 right-of DP-1```

**Disable** an output

```kscreenctl HDMI-A-1 set-enabled false```

Turn all outputs **off** via DPMS

```kscreenctl off```

# SYNOPSIS

**kscreenctl** [_command_ | _output_ [_action_ ...]]

# COMMANDS

**list-outputs**
> List connected outputs and connector names.

**identify**
> Draw a label on each monitor so you can match connector names to hardware.

_OUTPUT_
> Print information about that output. Special names **active-output** and **primary-output** are accepted.

_OUTPUT_ **set-mode** _WxH@Hz_
> Set mode (resolution and refresh rate).

_OUTPUT_ **set-scale** _percent_
> Set scale (for example `200%`).

_OUTPUT_ **set-enabled** _true|false_
> Enable or disable the output.

_OUTPUT_ **right-of**|_left-of_|_above_|_below_ _OTHER_
> Position relative to another output.

**off**
> Turn all outputs off through Display Power Management Signaling.

# DESCRIPTION

**kscreenctl** is the KDE Plasma CLI for KScreen, the display configuration service. It lists outputs, identifies monitors on screen, and changes mode, scale, arrangement, and power state. Connector names match those shown by **kscreen-doctor --outputs** (for example **DP-1**, **HDMI-A-1**).

Use it for scripting layout changes, docking, or turning screens off without opening System Settings.

# CAVEATS

Requires a running Plasma/KScreen session. Invalid connector names fail; run **identify** or **list-outputs** first. DPMS **off** blanks outputs until activity or an explicit on command from the compositor.

# HISTORY

Shipped with KDE **kscreen** as a friendlier companion to **kscreen-doctor**'s dotted `output.ID.property.value` syntax.

# SEE ALSO

[kscreen-doctor](/man/kscreen-doctor)(1), [kscreen-console](/man/kscreen-console)(1)

# RESOURCES

```[Source code](https://invent.kde.org/plasma/kscreen)```

<!-- verified: 2026-08-26 -->
