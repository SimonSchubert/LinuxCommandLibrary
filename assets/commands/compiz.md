# TAGLINE

compositing window manager with 3D effects

# TLDR

**Start Compiz window manager**

```compiz```

**Start with specific plugins**

```compiz --replace [cube] [rotate] [wobbly]```

**Replace current window manager**

```compiz --replace```

**Start with OpenGL fallback**

```compiz --indirect-rendering```

**Run Compiz configuration manager**

```ccsm```

# SYNOPSIS

**compiz** [**--replace**] [_options_] [_plugins_]

# PARAMETERS

**--replace**
> Replace currently running window manager.

**--indirect-rendering**
> Use indirect OpenGL rendering (for compatibility).

**--loose-binding**
> Use loose texture binding.

**--sm-disable**
> Disable session management.

**--no-fbo**
> Disable framebuffer objects.

**--display** _display_
> X display to use.

**--debug**
> Enable debug output.

# CONFIGURATION

**~/.config/compiz-1/compizconfig/Default.ini**
> User-specific Compiz settings and enabled plugins.

**/etc/compizconfig/config**
> System-wide Compiz configuration.

# POPULAR PLUGINS

**cube**: Desktop cube effect
**rotate**: Rotate desktop cube
**expo**: Expose-like workspace view
**wobbly**: Wobbly windows effect
**scale**: Window picker/scale
**shift**: Window switcher effect
**animation**: Window open/close animations
**wall**: Desktop wall navigation
**ring**: Ring window switcher

# DESCRIPTION

**Compiz** is a compositing window manager for X11 that uses OpenGL for rendering, enabling advanced visual effects like transparency, shadows, animations, and the famous desktop cube. It provides a plugin architecture allowing extensive customization.

Compiz replaces the standard window manager (like Metacity or Mutter) and handles window decoration, positioning, and effects. The **ccsm** (CompizConfig Settings Manager) provides a GUI for configuring plugins and effects.

The window manager integrates with desktop environments, particularly GNOME and KDE, providing enhanced visual feedback while maintaining standard window management functionality.

# CAVEATS

Requires OpenGL-capable graphics driver. Some effects are resource-intensive and may impact performance on older hardware. Compatibility issues may occur with certain applications, especially those using custom rendering. Has been largely superseded by compositors built into modern desktop environments.

# HISTORY

Compiz was created by **David Reveman** at Novell and first released in **2006**. It brought advanced 3D desktop effects to Linux, previously only seen on macOS. The desktop cube and wobbly windows became iconic Linux desktop features. Development fragmented between Compiz and Compiz Fusion before reuniting. Interest waned as GNOME Shell and KWin incorporated native compositing, though Compiz remains available.

# SEE ALSO

[ccsm](/man/ccsm)(1), [metacity](/man/metacity)(1), [mutter](/man/mutter)(1), [kwin](/man/kwin)(1)
