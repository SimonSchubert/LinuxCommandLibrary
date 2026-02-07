# TAGLINE

terminal-based spaced repetition flashcards

# TLDR

Open a **menu of available flashcard decks** for selection

```flash```

Display **information** about the flashcard system

```flash -i```

Change the **previewer** from default bat to cat

```flash -p [cat]```

Display **help**

```flash -h```

Display **version**

```flash -v```

# SYNOPSIS

**flash** [_-i_] [_-p previewer_] [_-h_] [_-v_]

# PARAMETERS

**-i**
> Display information about the flashcard system and deck location

**-p** _previewer_
> Change the card previewer (default: bat, fallback: cat)

**-h**
> Display help message

**-v**
> Display version information

# DESCRIPTION

**Flash** (fla.sh) is a terminal-based flashcard application implementing spaced repetition and active recall learning principles. It uses plain text CSV files as flashcard decks and presents cards in randomized study sessions.

Cards are stored in colon-separated CSV format: **category:question:answer:score**. The score field manages card difficulty—lower scores cause cards to appear more frequently, while cards rated "Easy" receive higher scores and appear less often.

The tool uses **fzf** for fuzzy selection of decks and optionally **bat** for syntax-highlighted card display. Decks are stored in **~/.local/share/flash/** and support nested directory organization.

# CAVEATS

Requires **fzf** as a mandatory dependency for deck selection. On macOS, GNU coreutils must be installed via Homebrew for the **shuf** command used in randomization. The tool creates its data directory on first run if it does not exist.

# HISTORY

Flash was created by **Bryan Jenks** (tallguyjenks) as a lightweight terminal alternative to graphical flashcard applications. Written entirely in **Bash**, it draws inspiration from spaced repetition systems like Anki while maintaining Unix philosophy simplicity.

# SEE ALSO

[fzf](/man/fzf)(1), [bat](/man/bat)(1), [cat](/man/cat)(1)
