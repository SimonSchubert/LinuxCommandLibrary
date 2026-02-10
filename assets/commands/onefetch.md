# TAGLINE

command-line Git information tool that displays repository summary with ASCII

# TLDR

**Show repository info**

```onefetch```

**Show info for specific repository**

```onefetch [/path/to/repo]```

**Show info in ASCII art**

```onefetch --ascii-language [python]```

**Disable ASCII art**

```onefetch --no-art```

**Show specific info only**

```onefetch --show-info [project,head,version,size]```

**Hide specific info**

```onefetch --hide-info [authors,commits]```

**Output as JSON**

```onefetch --output json```

**Use custom image**

```onefetch --image [/path/to/image.png]```

# SYNOPSIS

**onefetch** [_path_] [_--ascii-language lang_] [_--image file_] [_--output format_] [_options_]

# PARAMETERS

**-a**, **--ascii-language** _LANG_
> Force ASCII art for specified language.

**-i**, **--image** _FILE_
> Use custom image instead of ASCII.

**--image-protocol** _PROTOCOL_
> Image protocol: sixel, kitty, iterm.

**--no-art**
> Disable ASCII/image art.

**-o**, **--output** _FORMAT_
> Output format: yaml, json.

**--show-info** _FIELDS_
> Show only specified info fields.

**--hide-info** _FIELDS_
> Hide specified info fields.

**--no-bold**
> Disable bold text.

**--no-color-palette**
> Hide color palette.

**--number-of-authors** _NUM_
> Number of authors to display.

**--number-of-languages** _NUM_
> Number of languages to display.

**-e**, **--exclude** _PATTERNS_
> Ignore files matching patterns.

**--no-bots**
> Exclude bot commits from statistics.

**-T**, **--true-color** _WHEN_
> True color: auto, always, never.

**-d**, **--disabled-fields** _FIELDS_
> Deprecated alias for --hide-info.

# DESCRIPTION

**onefetch** is a command-line Git information tool that displays repository summary with ASCII art representing the dominant programming language. It's designed for quick repository overview, similar to neofetch for system info.

The display includes: project name, description, HEAD reference, version tags, creation date, languages breakdown, authors, last change, repository size, lines of code, license, and dependencies.

ASCII art is automatically selected based on the dominant language. Over 100 language logos are included. Custom images can be displayed in supported terminals (kitty, iTerm2, terminals with Sixel support).

Author statistics show commit counts and line contributions. Bot accounts can be filtered out. Language detection respects .gitignore and can exclude additional patterns.

Output formats (JSON, YAML) enable integration with other tools. Field selection allows customizing what information appears, useful for different use cases or terminal sizes.

# CAVEATS

Requires a Git repository. ASCII art needs sufficient terminal width. Image display requires compatible terminal. Large repositories may take time to analyze. Some statistics require full repository history. Language detection may misidentify some file types.

# HISTORY

**onefetch** was created by **Ossama Hjaji** (o2sh) starting around **2019**, inspired by neofetch and screenfetch. Written in Rust, it gained popularity for providing a visually appealing way to showcase repository information. The project has grown to support many languages and terminals.

# SEE ALSO

[neofetch](/man/neofetch)(1), [tokei](/man/tokei)(1), [git](/man/git)(1), [cloc](/man/cloc)(1)
