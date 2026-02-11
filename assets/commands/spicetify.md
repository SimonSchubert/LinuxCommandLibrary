# TAGLINE

Customize Spotify desktop client

# TLDR

**Apply customizations**

```spicetify apply```

**Backup Spotify**

```spicetify backup```

**Restore Spotify**

```spicetify restore```

**Install extension**

```spicetify config extensions [extension.js]```

**Change theme**

```spicetify config current_theme [theme_name]```

**List config**

```spicetify config```

**Update spicetify**

```spicetify upgrade```

**Watch for changes**

```spicetify watch```

# SYNOPSIS

**spicetify** _command_ [_options_]

# PARAMETERS

**apply**
> Apply customizations.

**backup**
> Backup Spotify.

**restore**
> Restore original.

**config** _KEY_ _VALUE_
> Set configuration.

**upgrade**
> Update spicetify.

**watch**
> Live reload.

**update**
> Update Spotify backup.

# CONFIG OPTIONS

**current_theme** - Active theme
**color_scheme** - Color variant
**extensions** - Enabled extensions
**custom_apps** - Custom applications
**inject_css** - Enable CSS injection

# DESCRIPTION

**spicetify** is a command-line tool for customizing the Spotify desktop client by injecting custom CSS themes, JavaScript extensions, and custom apps. It modifies the Spotify client files to apply visual and functional changes.

Before first use, a backup of the original Spotify installation must be created with **spicetify backup**. Themes control the visual appearance and color scheme, while extensions add functionality such as lyrics display, keyboard shortcuts, and playlist management features. A community marketplace provides a curated collection of themes and extensions.

The **watch** command enables a development mode that applies changes in real time as theme or extension files are modified. Configuration is stored in a TOML file and managed through the **spicetify config** command.

# CONFIGURATION

**~/.config/spicetify/config-xpui.ini**
> Main configuration file storing the active theme, color scheme, enabled extensions, custom apps, and Spotify installation path.

**~/.config/spicetify/Themes/**
> Directory containing theme folders, each with a color.ini and user.css file defining the visual customization.

**~/.config/spicetify/Extensions/**
> Directory for JavaScript extension files that add functionality to the Spotify client.

# CAVEATS

May break with Spotify updates. Requires Spotify desktop. Backup before updating.

# HISTORY

**spicetify** was created for Spotify customization. It provides a framework for theming and extending the desktop client.

# SEE ALSO

[spotify](/man/spotify)(1)
