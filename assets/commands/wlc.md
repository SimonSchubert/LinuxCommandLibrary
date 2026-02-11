# TAGLINE

Weblate command-line client

# TLDR

**List projects**

```wlc ls```

**Show component**

```wlc show [project/component]```

**Download translations**

```wlc download [project/component]```

**Upload translations**

```wlc upload [project/component]```

**Commit changes**

```wlc commit [project/component]```

# SYNOPSIS

**wlc** _command_ [_options_] [_args_]

# PARAMETERS

**ls**
> List projects.

**show**
> Show details.

**download**
> Get translations.

**upload**
> Send translations.

**commit**
> Commit changes.

**--config** _FILE_
> Config file.

# DESCRIPTION

**wlc** is the command-line client for Weblate, an open-source web-based translation management system. It provides access to Weblate's API for managing translation projects, downloading and uploading translation files, and committing changes from the terminal.

The tool supports listing projects and components, viewing translation status, and performing bulk operations across multiple translation files. It requires a Weblate server URL and API key for authentication, which can be stored in a configuration file for convenience.

# CAVEATS

Weblate server needed. API key required. Python-based.

# HISTORY

**wlc** is the command-line client for **Weblate**, an open-source translation management system.

# SEE ALSO

[weblate](/man/weblate)(1), [poedit](/man/poedit)(1)
