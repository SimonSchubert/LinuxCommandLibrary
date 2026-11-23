# TAGLINE

TUI client for Raindrop.io bookmarks

# TLDR

**Launch** the Raindrop.io TUI

```braindrop```

Launch with the **API token** taken from the environment

```BRAINDROP_API_TOKEN=[token] braindrop```

**Use a custom theme**

```braindrop --theme [textual-dark]```

**List available themes**

```braindrop --theme ?```

**List commands** whose key bindings can be changed

```braindrop --bindings```

# SYNOPSIS

**braindrop** [_options_]

# DESCRIPTION

**braindrop** is a terminal user interface client for **Raindrop.io**, a cloud bookmark manager, built with the Textual framework. It allows users to browse, search, and manage their Raindrop.io bookmark collections directly from the terminal.

Rather than acting as a thin API client, braindrop downloads your bookmark data when the server copy looks newer, works on it locally, and sends changes back to the server. Press **F1** inside the application for the help screen.

# PARAMETERS

**-t**, **--theme** _THEME_
> Set the application theme. Use **?** to list the available themes.

**-b**, **--bindings**
> List the commands that can have their key bindings changed, with their defaults.

**--license**, **--licence**
> Show license information.

**-v**, **--version**
> Show version information.

**-h**, **--help**
> Show help and exit.

# CONFIGURATION

Requires a **Raindrop.io API token**, created under Settings, Integrations, "For Developers" (create an app, then a test token). Braindrop asks for it on first launch.

**BRAINDROP_API_TOKEN**
> Environment variable that supplies the API token instead of the stored copy.

**~/.config/braindrop/configuration.json**
> Configuration file.

**~/.local/share/braindrop/.token**
> Stored API token.

**~/.local/share/braindrop/raindrops.json**
> Locally held copy of the Raindrop data.

# CAVEATS

Requires an active **Raindrop.io** account. Because the whole collection is cached locally, very large collections may not be a good fit. Install with **pipx install braindrop** or **uv tool install braindrop**.

# SEE ALSO

[buku](/man/buku)(1), [bmm](/man/bmm)(1)

# RESOURCES

```[Source code](https://github.com/davep/braindrop)```

<!-- verified: 2026-11-23 -->
