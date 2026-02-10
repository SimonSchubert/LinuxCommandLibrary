# TAGLINE

keyboard-oriented web browser

# TLDR

**Start browser**

```nyxt```

**Open URL**

```nyxt [https://example.com]```

**Start with config**

```nyxt --config [config.lisp]```

**Start in headless mode**

```nyxt --headless```

# SYNOPSIS

**nyxt** [_options_] [_url_]

# PARAMETERS

_URL_
> URL to open.

**--config** _FILE_
> Use configuration file.

**--headless**
> Run without GUI.

**--script** _FILE_
> Execute Lisp script.

**--help**
> Display help information.

**--version**
> Display version.

# DESCRIPTION

**nyxt** is a keyboard-oriented web browser. Extensible with Common Lisp.

The browser features programmable keybindings and commands. Inspired by Emacs and Vim.

# CAVEATS

Common Lisp configuration. Learning curve for customization. WebKitGTK backend.

# HISTORY

Nyxt was created as a **keyboard-driven browser** for power users, inspired by Emacs.

# SEE ALSO

[firefox](/man/firefox)(1), [qutebrowser](/man/qutebrowser)(1), [surf](/man/surf)(1)

