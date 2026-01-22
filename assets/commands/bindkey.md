# TLDR

**List all current key bindings**

```bindkey```

**List bindings in a format suitable for .zshrc**

```bindkey -L```

**Use Emacs key bindings**

```bindkey -e```

**Use Vi key bindings**

```bindkey -v```

**Bind a key sequence to a ZLE widget**

```bindkey '^[[H' beginning-of-line```

**Bind a key sequence to a string**

```bindkey -s '^T' 'uptime\n'```

**Remove a key binding**

```bindkey -r '^l'```

# SYNOPSIS

**bindkey** [_options_] [**-m** _keymap_] [_key_ [_widget_]]

# DESCRIPTION

**bindkey** is a builtin command in Zsh and tcsh shells for managing key bindings. In Zsh, it controls the Zsh Line Editor (ZLE), allowing users to map key sequences to editor widgets or macros. In tcsh, it provides similar functionality for customizing keyboard behavior.

Key bindings determine how the shell responds to keyboard input during command-line editing. By default, shells typically use Emacs-style bindings, but Vi-style bindings are also available.

To discover a key's escape sequence, press **Ctrl+v** followed by the key at the command line.

# PARAMETERS

**-e**
> Select Emacs key bindings (default keymap)

**-v**
> Select Vi key bindings, starting in insert mode

**-L**
> List bindings as bindkey commands suitable for .zshrc

**-l**
> List available keymap names

**-M** _keymap_
> Specify keymap for binding operations (emacs, viins, vicmd)

**-s**
> Bind key to a string instead of a widget

**-r** _key_
> Remove binding for the specified key

**-p**
> List bindings for prefix keys

# CAVEATS

Key sequences vary between terminal emulators. Test bindings in your specific terminal environment. Function keys and special keys like Home/End may have different escape sequences depending on the terminal.

In Zsh, **bindkey** operates on keymaps. The active keymap depends on the current editing mode (Emacs vs Vi). Changes to one keymap do not affect others.

# HISTORY

The bindkey command originated in **tcsh** (TENEX C Shell) and was later adopted by **Zsh** with enhanced functionality through the Zsh Line Editor. Zsh's implementation provides more extensive customization options including multiple keymaps and user-defined widgets.

# SEE ALSO

[zsh](/man/zsh)(1), [tcsh](/man/tcsh)(1), [bash](/man/bash)(1)
