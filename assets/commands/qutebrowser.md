# TAGLINE

Keyboard-driven web browser with vim keybindings

# TLDR

**Start browser**

```qutebrowser```

**Open URL**

```qutebrowser [https://example.com]```

**Open in new window**

```qutebrowser --target window [https://example.com]```

**Start with temp basedir**

```qutebrowser --temp-basedir```

**Set config option**

```qutebrowser --set [content.javascript.enabled] [false]```

# SYNOPSIS

**qutebrowser** [_options_] [_urls_...]

# DESCRIPTION

**qutebrowser** is a keyboard-driven web browser with vim-style keybindings. It uses QtWebEngine and focuses on minimalism and keyboard efficiency.

The browser is highly configurable through a Python config file and commands, appealing to users who prefer keyboard-centric workflows.

# PARAMETERS

**-t**, **--target** _type_
> How to open URL (tab, tab-bg, window).

**-T**, **--temp-basedir**
> Use temporary directory.

**-s** _opt_ _value_, **--set** _opt_ _value_
> Set configuration option.

**-r** _session_, **--restore** _session_
> Restore session.

**-B** _dir_, **--basedir** _dir_
> Base directory.

**--debug**
> Debug mode.

# KEY BINDINGS

**o**: Open URL
**O**: Open in new tab
**d**: Close tab
**j/k**: Scroll
**h/l**: History
**f**: Follow hints
**yy**: Copy URL
**/**: Search
**:**: Command mode

# CAVEATS

Some sites may not work (WebEngine limitations). Extension support limited. Learning curve for keybindings. Qt dependency large.

# HISTORY

**qutebrowser** was created by **Florian Bruhin** starting in **2013**. It fills the niche for keyboard-driven browsers like uzbl and vimperator, but with modern web engine support.

# SEE ALSO

[firefox](/man/firefox)(1), [chromium](/man/chromium)(1), [surf](/man/surf)(1), [w3m](/man/w3m)(1)
