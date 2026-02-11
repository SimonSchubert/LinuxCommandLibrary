# TAGLINE

Line editing and input history library

# TLDR

**View readline keybindings**

```bind -P```

**Edit inputrc**

```vi ~/.inputrc```

**Set vi mode**

```set -o vi```

**Set emacs mode**

```set -o emacs```

# SYNOPSIS

GNU Readline library and configuration

# DESCRIPTION

**Readline** is a library providing command-line editing, history, and tab completion. It's used by bash, gdb, python, and many other programs. Configuration is via ~/.inputrc.

# INPUTRC CONFIGURATION

```bash
# ~/.inputrc

# Case insensitive completion
set completion-ignore-case on

# Show all completions on first tab
set show-all-if-ambiguous on

# Vi mode
set editing-mode vi

# Key bindings
"\e[A": history-search-backward
"\e[B": history-search-forward
"\C-p": history-search-backward
```

# COMMON KEYBINDINGS (Emacs mode)

```
Ctrl+a    - Beginning of line
Ctrl+e    - End of line
Ctrl+k    - Kill to end of line
Ctrl+u    - Kill to beginning
Ctrl+w    - Kill word backward
Ctrl+y    - Yank (paste)
Ctrl+r    - Reverse search history
Ctrl+l    - Clear screen
Alt+f     - Forward word
Alt+b     - Backward word
```

# EXAMPLES

```bash
# List current bindings
bind -P | grep search

# Bind key in session
bind '"\e[A": history-search-backward'

# Check editing mode
echo $SHELLOPTS | tr ':' '\n' | grep -E 'vi|emacs'
```

# CAVEATS

Configuration varies by application. Some programs use libedit instead. Reload: source ~/.inputrc or Ctrl+x Ctrl+r.

# HISTORY

GNU Readline was written by **Brian Fox** for the GNU Project, becoming the standard line editing library.

# SEE ALSO

[bash](/man/bash)(1), [inputrc](/man/inputrc)(5), [bind](/man/bind)(1)
