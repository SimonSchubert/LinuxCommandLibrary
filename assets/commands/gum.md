# TAGLINE

tool for creating glamorous shell scripts

# TLDR

**Prompt for input**

```gum input --placeholder "Enter name"```

**Choose from options**

```gum choose "Option 1" "Option 2" "Option 3"```

**Confirm action**

```gum confirm "Delete file?" && rm file```

**Style text**

```gum style --foreground 212 "Styled text"```

**Spin while running**

```gum spin --title "Loading" -- sleep 5```

**Write multiline text**

```gum write --placeholder "Description"```

# SYNOPSIS

**gum** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**input**
> Single line text input.

**choose**
> Select from list.

**confirm**
> Yes/no confirmation.

**style**
> Apply text styling.

**spin**
> Show spinner during command.

**write**
> Multi-line text editor.

**filter**
> Fuzzy filter list.

**--help**
> Display help information.

# DESCRIPTION

**gum** is a tool for creating glamorous shell scripts. It provides interactive prompts, styled output, and TUI components for building beautiful CLI applications.

The tool offers pre-built components for input, selection, confirmation, and more. It's designed for easy integration in shell scripts.

# CAVEATS

Requires terminal with color support. Some features need true color. Part of Charm tools.

# HISTORY

gum was created by **Charm** as part of their TUI toolkit for building delightful command-line tools.

# SEE ALSO

[fzf](/man/fzf)(1), [dialog](/man/dialog)(1), [whiptail](/man/whiptail)(1)
