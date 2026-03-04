# TAGLINE

Text-mode web browser and terminal pager

# TLDR

**Open** a website in the terminal browser

```cha [example.org]```

**View** a Markdown file

```cha [README.md]```

**Dump** a webpage to stdout in headless mode

```cha -d [https://example.org]```

**Open** in visual mode with the home page

```cha -V```

**Pipe** HTML content and specify its content type

```cat [file.html] | cha -T text/html```

**Override** a config option temporarily

```cha -o display.color-mode=eight-bit [example.org]```

# SYNOPSIS

**cha** [_options_] [_URL(s) or file(s)..._]

# PARAMETERS

**-c**, **--css** _stylesheet_
> Temporarily append a CSS stylesheet to the user stylesheet.

**-d**, **--dump**
> Headless mode; sequentially prints opened files to stdout. Implicitly enabled when stdout is not a tty.

**-o**, **--opt** _config_
> Pass temporary TOML configuration options.

**-r**, **--run** _script_
> Execute a JavaScript string or file; .mjs files run as ES modules.

**-v**, **--version**
> Display version and exit.

**-C**, **--config** _file_
> Override the default configuration file search path.

**-I**, **--input-charset** _charset_
> Override input character set for all files.

**-M**, **--monochrome**
> Force monochrome output.

**-O**, **--output-charset** _charset_
> Override output character set.

**-T**, **--type** _content-type_
> Override content type of all input files.

**-V**, **--visual**
> Start in visual mode, opening the configured home page.

**-h**, **--help**
> Print help and exit.

# DESCRIPTION

**Chawan** (Japanese for "tea bowl") is a text-mode web browser and terminal pager with its own browser engine built from scratch in Nim. Despite being a terminal browser, it can display many websites with layout fidelity comparable to graphical browsers.

Features include HTML5 support with multiple encodings, a CSS layout engine supporting flow layout, tables, and flexbox, inline images via Sixel or Kitty graphics protocol (disabled by default), optional JavaScript via QuickJS (disabled by default), and multi-protocol support for HTTP(S), FTP, Gopher, Gemini, Finger, and Spartan. It uses vi(m)-like keybindings, supports mouse input, has a multi-process architecture with incremental document loading, and provides syscall sandboxing on FreeBSD, OpenBSD, and Linux.

# CONFIGURATION

TOML-based configuration searched in order: **-C** flag path, **$CHA_DIR/config.toml**, **${XDG_CONFIG_HOME:-~/.config}/chawan/config.toml**, or **~/.chawan/config.toml**.

# CAVEATS

JavaScript and inline images are disabled by default and must be explicitly enabled. Requires a Unix-like OS (Linux, FreeBSD, OpenBSD, macOS, Haiku); Windows users must use WSL. Building from source requires the Nim compiler 2.0.0+, OpenSSL/LibreSSL, and libssh2.

# HISTORY

**Chawan** was developed by **bptato** and is written in Nim. Inspired by **w3m**, it shares no code with it but has a similar UI and feature set. The current version is v0.3.3, licensed under the public domain (UNLICENSE). Available in Alpine Linux, Arch Linux (AUR), FreeBSD, Homebrew, NixOS, and Void Linux.

# SEE ALSO

[w3m](/man/w3m)(1), [lynx](/man/lynx)(1), [links](/man/links)(1), [elinks](/man/elinks)(1)
