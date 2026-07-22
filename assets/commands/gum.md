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

**Filter a list with fuzzy search**

```cat [flavors.txt] | gum filter```

**Render a markdown string**

```gum format -- "# Heading" "- item one" "- item two"```

# SYNOPSIS

**gum** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to run.

**input**
> Prompt for a single line of input.

**write**
> Prompt for long-form, multi-line text.

**choose**
> Choose one or more options from a list.

**confirm**
> Ask a user to confirm an action (exit code 0 or 1).

**filter**
> Fuzzy-filter items from a list.

**file**
> Pick a file from a folder.

**pager**
> Scroll through a file or text.

**table**
> Render or select a row from tabular data.

**style**
> Apply coloring, borders, and spacing to text.

**join**
> Combine styled text blocks vertically or horizontally.

**format**
> Render markdown, template strings, or named emoji.

**log**
> Log leveled, structured messages to the terminal.

**spin**
> Show a spinner while running a command.

**--help**
> Display help information.

# DESCRIPTION

**gum** is a tool for creating glamorous shell scripts. It provides interactive prompts, styled output, and TUI components for building beautiful CLI applications without writing any Go code, built on Charm's Bubble Tea, Bubbles, and Lip Gloss libraries.

Each subcommand is independently configurable via command-line flags or `GUM_<COMMAND>_<OPTION>` environment variables, so scripts can compose the components as needed.

# CAVEATS

Requires a terminal with color support (true color recommended for full styling). Part of Charm's suite of TUI tools.

# HISTORY

**gum** was created by **Charm** and first released in **2022** as part of their TUI toolkit for building delightful command-line tools. It is written in Go and released under the MIT license.

# INSTALL

```apt: sudo apt install gum```

```dnf: sudo dnf install gum```

```pacman: sudo pacman -S gum```

```apk: sudo apk add gum```

```zypper: sudo zypper install gum```

```brew: brew install gum```

```nix: nix profile install nixpkgs#gum```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fzf](/man/fzf)(1), [dialog](/man/dialog)(1), [whiptail](/man/whiptail)(1)

# RESOURCES

```[Homepage](https://charm.land/gum/)```

```[Source code](https://github.com/charmbracelet/gum)```

<!-- verified: 2026-07-17 -->
