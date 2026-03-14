# TAGLINE

gettext infrastructure initialization tool

# TLDR

**Initialize gettext** infrastructure in current project

```gettextize```

**Copy files** instead of creating symlinks

```gettextize --copy```

**Force overwrite** of existing files

```gettextize -f```

**Dry run** to see what would be done without making changes

```gettextize -n```

**Specify a PO directory** with existing translations

```gettextize --po-dir=[po]```

# SYNOPSIS

**gettextize** [_options_] [_directory_]

# PARAMETERS

_DIRECTORY_
> Project directory (default: current).

**-f, --force**
> Force writing of new files even if old ones exist.

**--copy**
> Copy files instead of symlinking (default behavior).

**--symlink**
> Make symbolic links instead of copying files.

**-n, --dry-run**
> Print modifications but don't perform them.

**--no-changelog**
> Don't update or create ChangeLog files.

**--po-dir**=_DIR_
> Specify directory containing PO files. Can be given multiple times.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**gettextize** prepares a source package for internationalization. It adds necessary gettext infrastructure files, autoconf macros, and directory structure.

The tool creates po/ directory, adds m4 macros, and updates build system configuration. It sets up the framework for adding translations to a project.

gettextize is the first step in internationalizing an autotools-based project.

# CAVEATS

Modifies build system files. May require manual adjustments. Best for autotools projects.

# HISTORY

gettextize is part of **GNU gettext**, providing project initialization for the gettext internationalization framework.

# SEE ALSO

[gettext](/man/gettext)(1), [xgettext](/man/xgettext)(1), [msgfmt](/man/msgfmt)(1), [autoconf](/man/autoconf)(1)
