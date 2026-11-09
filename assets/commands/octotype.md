# TAGLINE

Terminal typing trainer inspired by Monkeytype

# TLDR

**Start the typing trainer**

```octotype```

**Start with a mode**, at source selection

```octotype --mode [mode]```

**Start a session directly** with a mode and source

```octotype --mode [mode] --source [source]```

**Override a session parameter**

```octotype -m [mode] -s [source] -P [name:value]```

**Use a different config location**

```octotype --config [path]```

**Print the loaded settings**

```octotype --print-settings```

# SYNOPSIS

**octotype** [_options_]

# PARAMETERS

**-m**, **--mode** _NAME_
> Mode to run, starting at source selection.

**-s**, **--source** _NAME_
> Source to run, starting the session directly. Requires **--mode**.

**-P**, **--param** _NAME:VALUE_
> Override a session parameter. Requires **--source**. Can be repeated.

**-c**, **--config** _PATH_
> Override the default config location.

**-p**, **--print-settings**
> Print the loaded settings.

**--print-config**
> Print the loaded config: settings, modes and sources.

**-h**, **--help**
> Show help.

**-V**, **--version**
> Show the version.

# DESCRIPTION

**octotype** is a TUI typing trainer inspired by the popular Monkeytype web application. Built with Ratatui and powered by Gladius, it provides a customizable typing practice experience directly in the terminal, with custom modes, word sources, themes and result graphs.

It measures typing speed and accuracy, allowing you to practice and improve your typing skills without leaving the command line.

# CAVEATS

Terminal must support Unicode for proper character rendering. Still a work in progress: breaking changes to modes, sources and the configuration may occur.

# HISTORY

**octotype** was created by **Mads Ahlquist Jensen** (mahlquistj) and is written in **Rust** using the Ratatui framework.

# SEE ALSO

[ttyper](/man/ttyper)(1)

# RESOURCES

```[Source code](https://github.com/mahlquistj/octotype)```

```[Documentation](https://mahlquistj.github.io/octotype/)```

<!-- verified: 2026-11-09 -->
