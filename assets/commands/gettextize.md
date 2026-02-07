# TAGLINE

gettext infrastructure initialization tool

# TLDR

**Initialize gettext in** project

```gettextize```

**Copy files instead** of symlink

```gettextize --copy```

**Force overwrite**

```gettextize --force```

**Non-interactive mode**

```gettextize --no-changelog```

# SYNOPSIS

**gettextize** [_options_] [_directory_]

# PARAMETERS

_DIRECTORY_
> Project directory (default: current).

**--copy**
> Copy files instead of symlinking.

**--force**
> Overwrite existing files.

**--no-changelog**
> Don't update ChangeLog.

**--intl**
> Include libintl sources.

**--help**
> Display help information.

# DESCRIPTION

**gettextize** prepares a source package for internationalization. It adds necessary gettext infrastructure files, autoconf macros, and directory structure.

The tool creates po/ directory, adds m4 macros, and updates build system configuration. It sets up the framework for adding translations to a project.

gettextize is the first step in internationalizing an autotools-based project.

# CAVEATS

Modifies build system files. May require manual adjustments. Best for autotools projects.

# HISTORY

gettextize is part of **GNU gettext**, providing project initialization for the gettext internationalization framework.

# SEE ALSO

[gettext](/man/gettext)(1), [xgettext](/man/xgettext)(1), [autoconf](/man/autoconf)(1)
