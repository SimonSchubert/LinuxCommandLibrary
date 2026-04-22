# TAGLINE

adds interactive filtering to any text stream

# TLDR

**Interactive filter over stdin**

```[command] | percol```

**Pick a line from shell history**

```history | percol```

**Search files interactively**

```find . | percol```

**Seed the query** at startup

```percol --query [pattern] [file]```

**Show the prompt at the bottom**

```percol --prompt-bottom --result-bottom-up```

**Checkout a git branch interactively**

```git checkout $(git branch | percol)```

**Kill a process picked from ps**

```ps aux | percol | awk '{print $2}' | xargs kill```

# SYNOPSIS

**percol** [_options_] [_file_]

# PARAMETERS

**--tty** _TTY_
> Terminal device file to use (default `/dev/tty`).

**--rcfile** _FILE_
> Path to the percol init/config file (default `~/.percol.d/rc.py`).

**--output-encoding** _ENC_, **--input-encoding** _ENC_
> Force character encoding of output/input.

**--query** _STRING_
> Initial query string.

**--eager**
> Show all candidates immediately (no incremental search).

**--reverse**
> Reverse the order of input lines.

**--auto-match**
> Automatically select when there is a single match.

**--auto-fail**
> Exit non-zero if no lines match the query.

**--match-method** _METHOD_
> Matching method: `string` (default), `regex`, or `migemo` (Japanese romaji).

**--case-sensitive** / **--caseless-match-regex-if-lowercase**
> Control case sensitivity of the query.

**--prompt** _STRING_
> Custom prompt format (supports Python-style formatting).

**--prompt-top** / **--prompt-bottom**
> Show the prompt at the top (default) or bottom of the display.

**--result-top-down** / **--result-bottom-up**
> Control result list ordering on screen.

**--query-multiline**
> Allow the query input to span multiple lines.

**-h**, **--help**
> Show help.

# KEYBINDINGS

- `Ctrl-n` / `Ctrl-p` — move down / up the candidate list
- `Ctrl-i` (Tab) — toggle selection (multi-select)
- `Ctrl-m` (Return) — finish and print selected line(s)
- `Ctrl-g` — abort without printing
- `Ctrl-a` / `Ctrl-e` — beginning / end of query line
- `Ctrl-h` / `Ctrl-?` — delete character backward / forward
- `Ctrl-u` / `Ctrl-k` — kill to line start / end
- `Ctrl-y` — yank killed text

# DESCRIPTION

**percol** is an interactive grep-and-select tool inspired by Emacs' `anything`/`helm`. It reads candidate lines from stdin or a file, shows them in a curses UI, and narrows the list as you type. Pressing Return prints the selected line(s) to stdout, making it a drop-in component for shell pipelines.

Configuration (prompt, colors, keymap, match method) lives in `~/.percol.d/rc.py` as Python — percol itself is written in Python, so the rc file has full access to the percol API.

# CAVEATS

Written in Python and noticeably slower than `fzf` or `peco` on very large inputs (hundreds of thousands of lines). Upstream development has been intermittent; several forks exist on GitHub.

# HISTORY

**percol** was created by **mooz** and written in **Python**. Its interface is inspired by `anything.el` for Emacs. It predates `fzf` and `peco` and popularized the "interactive filter pipe" pattern.

# SEE ALSO

[fzf](/man/fzf)(1), [peco](/man/peco)(1), [sk](/man/sk)(1), [grep](/man/grep)(1), [rofi](/man/rofi)(1)
