# TLDR

Show current **locale and keymap** settings

```localectl```

List available **locales**

```localectl list-locales```

Set a **system locale** variable

```localectl set-locale LANG=en_US.UTF-8```

List available **keymaps**

```localectl list-keymaps```

Set system **keyboard mapping**

```localectl set-keymap us```

Set **X11 keyboard layout**

```localectl set-x11-keymap us pc105```

# SYNOPSIS

**localectl** [_OPTIONS_] [_COMMAND_]

# DESCRIPTION

**localectl** queries and changes the system locale and keyboard layout settings. It controls both console and X11 keyboard mappings through systemd-localed.

# COMMANDS

**status**
> Show current locale and keymap settings

**set-locale LOCALE...**
> Set system locale variables (LANG, LC_*, etc.)

**list-locales**
> List available locales

**set-keymap MAP [TOGGLEMAP]**
> Set console keyboard mapping

**list-keymaps**
> List available console keymaps

**set-x11-keymap LAYOUT [MODEL [VARIANT [OPTIONS]]]**
> Set X11 keyboard mapping

**list-x11-keymap-models**
> List X11 keyboard models

**list-x11-keymap-layouts**
> List X11 keyboard layouts

**list-x11-keymap-variants [LAYOUT]**
> List X11 keyboard variants

**list-x11-keymap-options**
> List X11 keyboard options

# PARAMETERS

**--no-ask-password**
> Do not prompt for password

**--no-convert**
> Do not convert console keymap to X11 or vice versa

**-H, --host**
> Execute operation on remote host

**-M, --machine**
> Execute operation on container

# COMMON LOCALE VARIABLES

**LANG**: Default locale for all categories
**LC_COLLATE**: String collation order
**LC_CTYPE**: Character classification
**LC_MESSAGES**: Message language
**LC_NUMERIC**: Number formatting
**LC_TIME**: Date and time formatting

# CAVEATS

Setting the console keymap with set-keymap automatically updates the X11 keymap unless **--no-convert** is used. Changes take effect immediately for new sessions.

# HISTORY

**localectl** is part of **systemd**, providing unified locale and keymap management through systemd-localed.

# SEE ALSO

[systemd-localed](/man/systemd-localed)(8), [locale](/man/locale)(1), [loadkeys](/man/loadkeys)(1), [locale.conf](/man/locale.conf)(5)
