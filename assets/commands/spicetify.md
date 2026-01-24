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

**spicetify** customizes the Spotify desktop client. It injects themes and extensions.

Backup creates restore point. Required before first customization.

Themes change visual appearance. Community themes available.

Extensions add features. Lyrics, keyboard shortcuts, and more.

Watch mode enables development. Changes apply immediately.

# CAVEATS

May break with Spotify updates. Requires Spotify desktop. Backup before updating.

# HISTORY

**spicetify** was created for Spotify customization. It provides a framework for theming and extending the desktop client.

# SEE ALSO

[spotify](/man/spotify)(1)
