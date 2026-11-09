# TAGLINE

Minimal and customizable weather CLI

# TLDR

**Create the configuration file**

```starlit --setup```

**Open the configuration file for editing**

```starlit --edit```

**Display weather for the default city**

```starlit```

**Display weather for a specific city**

```starlit [seattle]```

**Start interactive weather mode**

```starlit --interactive```

**Show the current configuration**

```starlit --config```

# SYNOPSIS

**starlit** [_city_] [_options_]

# PARAMETERS

**-s**, **--setup**
> Create the configuration file at **~/.config/starlit/.env**.

**-e**, **--edit**
> Open the configuration file in the default editor.

**-i**, **--interactive**
> Start interactive mode.

**-c**, **--config**
> Show the configuration.

**--show-full**
> With **--config**, show the contents of the **.env** file.

**-v**, **--version**
> Show the version.

**-h**, **--help**
> Show help.

# DESCRIPTION

**starlit** is a minimal and customizable weather CLI powered by the OpenWeatherMap API and styled with the Rich library and terminal text effects. It supports interactive mode and customizable gradient and label colors.

# CONFIGURATION

Settings live in **~/.config/starlit/.env**. **API_KEY** holds the OpenWeatherMap key, **DEFAULT_CITY** is shown when no city is passed, and **UNITS** is metric or imperial. **DISABLE_ANIMATION**, **SHOW_DT**, **SHOW_ASCII**, **SHOW_MSG**, **SHOW_EMOJI** and **EMOJI_TYPE** control the display. **COLOR_1**, **COLOR_2** and **LABEL_COLOR** take six-digit hex codes without the leading **#**.

# CAVEATS

Requires an OpenWeatherMap API key and Python 3.13 or newer. Needs a UTF-8 terminal with 256 colors and a Nerd Font. The package is published on PyPI as **starlit-cli**, while the command is **starlit**.

# HISTORY

**starlit** was created by **Ashley Lee** (ashuhlee) and is written in **Python**.

# SEE ALSO

[stormy](/man/stormy)(1), [rustormy](/man/rustormy)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/ashuhlee/starlit)```

<!-- verified: 2026-11-09 -->
