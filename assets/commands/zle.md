# TAGLINE

Zsh line editor builtin

# TLDR

**Define** a new widget from a shell function

```zle -N [widget_name] [function_name]```

**List** all user-defined widgets

```zle -l```

**List** all widgets including builtins

```zle -la```

**Delete** a user-defined widget

```zle -D [widget_name]```

**Create** a widget alias

```zle -A [old_widget] [new_widget]```

**Redisplay** the command line

```zle -R```

**Display** a message below the command line

```zle -M "[message]"```

# SYNOPSIS

**zle** [_-lLaD_] [_widget ..._]
**zle** **-N** _widget_ [_function_]
**zle** **-C** _widget_ _completion-widget_ _function_
**zle** **-R** [**-c**] [_display-string_] [_string ..._]
**zle** **-M** _string_
**zle** **-U** _string_
**zle** **-K** _keymap_
**zle** **-F** [**-Lw**] [_fd_ [_handler_]]
**zle** _widget_ [**-n** _num_] [**-f** _flag_] [**-Nw**] [**-K** _keymap_] [**--** _args ..._]

# PARAMETERS

**-N** _widget_ [_function_]
> Define a new user-defined widget backed by a shell function. If function is omitted, defaults to the widget name

**-C** _widget_ _completion-widget_ _function_
> Create a user-defined completion widget inheriting behavior from an existing builtin completion widget

**-l** [**-L** | **-a**]
> List user-defined widgets. **-L**: format as zle commands. **-a**: include builtins

**-D** _widget ..._
> Delete named user-defined widgets

**-A** _old-widget_ _new-widget_
> Create an alias; both names refer to the same widget

**-R** [**-c**] [_display-string_] [_string ..._]
> Redisplay the command line. Optional display-string appears in status line. **-c** clears completion lists

**-M** _string_
> Display a message string below the command line that persists after the widget returns

**-U** _string_
> Push characters onto ZLE's input stack for processing after the current widget finishes

**-K** _keymap_
> Select the named keymap for subsequent keystrokes

**-F** [**-Lw**] [_fd_ [_handler_]]
> Install or remove a handler for a file descriptor. **-w**: handler is a widget. **-L**: list handlers

**-I**
> Invalidate the current display before external output

**-f** _flag ..._
> Set flags on the current widget: **yank**, **yankbefore**, **kill**, **vichange**, **nolast**

# DESCRIPTION

**zle** is a builtin command of **zsh** that controls the Zsh Line Editor, the interactive command-line editing subsystem. It manages widgets (named editing actions), keymaps, display control, and the edit buffer. When called with no arguments, it returns zero if ZLE is currently active.

ZLE activates automatically in interactive zsh sessions. It operates in **multiline mode** (default) or **single-line mode** (when the **SINGLE_LINE_ZLE** option is set). Special parameters like **BUFFER**, **CURSOR**, **LBUFFER**, and **RBUFFER** allow widget functions to manipulate the edit buffer directly.

# KEYMAPS

ZLE provides eight built-in keymaps:

**emacs** -- Emacs-style editing
**viins** -- Vi insert mode
**vicmd** -- Vi command mode
**viopp** -- Vi operator-pending mode
**visual** -- Vi visual selection mode
**isearch** -- Incremental search mode
**command** -- Command name reading mode
**.safe** -- Immutable fallback keymap

The **main** keymap links to either **emacs** or **viins** depending on the **EDITOR** environment variable, or can be set with **bindkey -e** (emacs) or **bindkey -v** (vi).

# CONFIGURATION

ZLE is configured primarily through **.zshrc** using **bindkey** commands and **zle -N** widget definitions. The **KEYTIMEOUT** parameter (default 40, in hundredths of a second) controls how long ZLE waits for multi-character key sequences. Hook widgets like **zle-line-init**, **zle-line-finish**, and **zle-keymap-select** run automatically at specific events.

Example custom widget that prepends sudo:

```
prepend-sudo() {
  BUFFER="sudo $BUFFER"
  CURSOR+=5
}
zle -N prepend-sudo
bindkey '^s' prepend-sudo
```

# CAVEATS

**zle** is only available inside **zsh** and is not a POSIX command or available in bash. Widgets can only be invoked when ZLE is active in interactive mode. Widget shell functions run with stdin redirected to **/dev/null**. Built-in widgets have a dot-prefixed variant (e.g., **.end-of-line**) that remains accessible even when the widget is overridden.

# HISTORY

ZLE is a fundamental component of zsh, the Z Shell, originally written by **Paul Falstad** in **1990** at Princeton University. It provides zsh with sophisticated line editing modeled after both Emacs and vi editing modes but is zsh's own independent implementation with a widget-based architecture, distinct from GNU Readline used by bash.

# SEE ALSO

[zsh](/man/zsh)(1), [bindkey](/man/bindkey)(1), [vared](/man/vared)(1)
