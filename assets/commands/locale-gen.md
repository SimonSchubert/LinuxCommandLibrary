# TAGLINE

compiles locale definitions listed in /etc/locale.gen

# TLDR

**Generate** the locales enabled in /etc/locale.gen

```sudo locale-gen```

**Enable** locales by uncommenting them in the list, then run locale-gen

```sudoedit /etc/locale.gen```

Generate **only new** locales, keeping the existing locale archive (Debian, Ubuntu)

```sudo locale-gen --keep-existing```

Generate and enable a **specific locale** (Ubuntu)

```sudo locale-gen [de_DE.UTF-8]```

Generate all locales for a **language** (Ubuntu)

```sudo locale-gen --lang [de]```

# SYNOPSIS

**locale-gen** [**--keep-existing**]

Ubuntu: **locale-gen** [_options_] [_locale_...]

# PARAMETERS

**--keep-existing**
> Do not remove /usr/lib/locale/locale-archive; only compile locales that are not already available (Debian, Ubuntu).

**--purge**
> Remove existing compiled locales before generating; the default without locale arguments (Ubuntu).

**--no-purge**
> Same as --keep-existing (Ubuntu).

**--lang**
> Treat arguments as generic language codes (Ubuntu).

**--archive**, **--no-archive**
> Store compiled data in the single locale-archive file, or in separate directories (Ubuntu).

**--aliases=**_FILE_
> Read locale aliases from _FILE_ (Ubuntu).

**-h**, **--help**
> Display help (Ubuntu).

# DESCRIPTION

**locale-gen** reads **/etc/locale.gen** and runs **localedef** for every uncommented line (for example **en_US.UTF-8 UTF-8**), compiling the locale source files from /usr/share/i18n/locales into binary data in **/usr/lib/locale/locale-archive**. Custom locale sources in /usr/local/share/i18n/locales take precedence.

It is a distribution-provided script rather than part of upstream glibc, so its options differ: Arch Linux's version accepts no options, Debian's accepts only **--keep-existing**, and Ubuntu's also accepts locale names as arguments, adding them to /etc/locale.gen before compiling. Gentoo ships a separate implementation with its own option set.

After generating, set the default locale with **localectl set-locale**, **update-locale** (Debian) or /etc/locale.conf.

# CAVEATS

Requires root privileges. Without --keep-existing the whole locale archive is rebuilt, which can take a while with many locales. On Debian-based systems, **dpkg-reconfigure locales** edits /etc/locale.gen interactively and runs locale-gen. Generated locales are only visible to newly started programs.

# SEE ALSO

[locale](/man/locale)(1), [localedef](/man/localedef)(1), [localectl](/man/localectl)(1), [dpkg-reconfigure](/man/dpkg-reconfigure)(8)

# RESOURCES

```[Source code](https://salsa.debian.org/glibc-team/glibc)```

```[Documentation](https://wiki.archlinux.org/title/Locale)```

<!-- verified: 2026-09-29 -->
