# TLDR

**Start xplr**

```xplr```

**Start in directory**

```xplr [/path/to/dir]```

**Pipe selection to command**

```xplr | xargs [command]```

**Start with config**

```xplr --config [config.lua]```

**Read paths from stdin**

```find . -name "*.txt" | xplr```

**Print and quit** (on selection)

```xplr --print-pwd-as-result```

# SYNOPSIS

**xplr** [_--config file_] [_--print-pwd-as-result_] [_options_] [_paths_]

# PARAMETERS

**--config** _FILE_
> Configuration file.

**--print-pwd-as-result**
> Print current dir on exit.

**-C** _NAME=VALUE_
> Override config.

**--read-only**
> Read-only mode.

**--version**, **-V**
> Show version.

**--help**, **-h**
> Show help.

# KEY BINDINGS

**j/k** or **down/up**
> Navigate.

**Enter**
> Open/select.

**q**
> Quit.

**/**
> Search.

**space**
> Toggle selection.

**h**
> Go to parent.

**g**
> Go to path.

**.**
> Toggle hidden.

**ctrl-c**
> Cancel.

# DESCRIPTION

**xplr** is a hackable, minimal terminal file explorer. Written in Rust, it's fast and highly configurable.

Lua configuration enables complete customization. Modes, keybindings, and UI can be redefined entirely.

Selection handling pipes to stdout. This enables integration with other commands and scripts.

Modes define behavior sets. Normal mode, selection mode, and custom modes provide context-aware keybindings.

Plugins extend functionality. Community plugins add features like preview, bulk rename, and integration.

The focus is on composition with Unix tools rather than built-in features for everything.

# CAVEATS

Steep learning curve for configuration. Fewer built-in features than ranger. Lua knowledge helpful for customization.

# HISTORY

**xplr** was created by **Arijit Basu** around **2021** as an extensible file explorer. It emphasizes hackability and composition over built-in features.

# SEE ALSO

[ranger](/man/ranger)(1), [vifm](/man/vifm)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1)
