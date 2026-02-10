# TAGLINE

minimal terminal multiplexer

# TLDR

**Start mtm**

```mtm```

**Start with specific shell**

```mtm -s [/bin/zsh]```

**Start with custom terminal type**

```mtm -t [screen-256color]```

# SYNOPSIS

**mtm** [_-s shell_] [_-t term_] [_options_]

# PARAMETERS

**-s** _SHELL_
> Shell to run in terminals.

**-t** _TERM_
> Terminal type (TERM environment).

**-T** _TERM_
> Terminal type to emulate.

**-c** _CHAR_
> Command prefix character.

# KEY BINDINGS

**Ctrl-G c**
> Create new terminal (horizontal split).

**Ctrl-G C**
> Create new terminal (vertical split).

**Ctrl-G n**
> Focus next terminal.

**Ctrl-G p**
> Focus previous terminal.

**Ctrl-G h/j/k/l**
> Focus terminal in direction.

**Ctrl-G w**
> Delete current terminal.

**Ctrl-G Ctrl-G**
> Send Ctrl-G to terminal.

# DESCRIPTION

**mtm** (Micro Terminal Multiplexer) is a minimal terminal multiplexer. It splits a terminal into multiple virtual terminals, each running its own shell.

The tool uses a simple keyboard interface with Ctrl-G as the command prefix. Horizontal and vertical splits create flexible layouts. Focus moves between terminals with directional keys.

Unlike tmux or screen, mtm focuses on minimalism. It lacks sessions, window management, and extensive configuration. This simplicity makes it suitable for basic split-terminal needs.

Terminal emulation supports UTF-8 and basic VT100/VT220 sequences. Complex applications may not render correctly compared to full-featured multiplexers.

The small codebase makes mtm easy to understand and modify. It's useful when tmux or screen are unavailable or overkill.

# CAVEATS

Minimal feature set. No detach/reattach capability. Limited terminal emulation. No scripting or configuration file.

# HISTORY

**mtm** was written by **Rob King** as a minimalist alternative to larger terminal multiplexers. It demonstrates that useful terminal multiplexing can be achieved with very little code.

# SEE ALSO

[tmux](/man/tmux)(1), [screen](/man/screen)(1), [dvtm](/man/dvtm)(1), [abduco](/man/abduco)(1)
