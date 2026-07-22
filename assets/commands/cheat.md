# TAGLINE

interactive command-line cheatsheets

# TLDR

**View** cheatsheet

```cheat [tar]```

**List** available cheatsheets

```cheat -l```

**Search** cheatsheets

```cheat -s [keyword]```

**Edit** cheatsheet

```cheat -e [command]```

**Create** new cheatsheet

```cheat -e [newcommand]```

# SYNOPSIS

**cheat** [_options_] [_command_]

# DESCRIPTION

**cheat** allows you to create and view interactive cheatsheets on the command line. It provides quick access to common command examples and usage patterns, making it easier to remember complex command syntax.

The tool is designed to be a more practical alternative to man pages for everyday use.

# PARAMETERS

**-l**, **--list**
> List available cheatsheets

**-s**, **--search** _keyword_
> Search cheatsheets

**-e**, **--edit** _sheet_
> Edit cheatsheet

**-p**, **--path**
> Show cheatsheet path

**-d**, **--directories**
> List cheatsheet directories

**-v**, **--version**
> Show version

# CONFIGURATION

**~/.config/cheat/conf.yml**
> Main configuration file for editor, cheatsheet directories, and syntax highlighting.

**~/.config/cheat/cheatsheets/personal/**
> Directory for user-created custom cheatsheets.

# CAVEATS

Requires initial setup. Community cheatsheets need downloading. Not as comprehensive as man pages. Custom cheatsheets need manual creation. Not installed by default.

# HISTORY

**cheat** was created by Chris Lane around **2013** to provide quick-access command examples, inspired by projects like tldr.

# INSTALL

```dnf: sudo dnf install cheat```

```zypper: sudo zypper install cheat```

```brew: brew install cheat```

```nix: nix profile install nixpkgs#cheat```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[tldr](/man/tldr)(1), [man](/man/man)(1), [info](/man/info)(1)

# RESOURCES

```[Source code](https://github.com/cheat/cheat)```

<!-- verified: 2026-06-22 -->
