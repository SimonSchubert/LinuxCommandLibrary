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

# FEATURES

- Community-contributed cheatsheets
- Syntax highlighting
- Multiple cheatsheet sources
- Personal cheatsheet creation
- Tag-based organization
- Search functionality

# WORKFLOW

```bash
# View cheatsheet
cheat tar

# Search for commands
cheat -s compress

# List all available
cheat -l

# Edit or create cheatsheet
cheat -e mycommand

# Find cheatsheet location
cheat -p tar
```

# CONFIGURATION

Config file: `~/.config/cheat/conf.yml`

Custom cheatsheets in: `~/.config/cheat/cheatsheets/personal/`

# CAVEATS

Requires initial setup. Community cheatsheets need downloading. Not as comprehensive as man pages. Custom cheatsheets need manual creation. Not installed by default.

# HISTORY

**cheat** was created by Chris Lane around **2013** to provide quick-access command examples, inspired by projects like tldr.

# SEE ALSO

[tldr](/man/tldr)(1), [man](/man/man)(1), [info](/man/info)(1)
