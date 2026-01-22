# TLDR

**Create** a new save file

```[path/to]/factorio --create [path/to/save_file.zip]```

**Start** a Factorio server

```[path/to]/factorio --start-server [path/to/save_file.zip]```

Create save with **specific settings**

```[path/to]/factorio --create [path/to/save.zip] --map-gen-settings [path/to/map_gen_settings.json] --map-settings [path/to/map_settings.json]```

**Shut** the server gracefully (interactive)

```/quit```

Display **help**

```[path/to]/factorio [-h|--help]```

# SYNOPSIS

**factorio** [_options_]

# DESCRIPTION

**factorio** runs the Factorio game in headless server mode for multiplayer. It creates and hosts game worlds without requiring a graphical interface.

Used for dedicated Factorio servers and automated testing.

# PARAMETERS

**--create** _file_
> Create new save file

**--start-server** _file_
> Start server with save file

**--map-gen-settings** _file_
> Map generation settings JSON

**--map-settings** _file_
> Map settings JSON

**-h, --help**
> Display help

**--port** _number_
> Server port number

# CAVEATS

Requires Factorio game installation. Server settings configured via JSON files. Headless mode requires no X server. Commercial game with separate license.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)
