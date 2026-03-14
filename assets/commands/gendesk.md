# TAGLINE

.desktop file generator for Linux applications

# TLDR

**Generate a desktop file from a PKGBUILD** in the current directory

```gendesk```

**Generate a desktop file with package name**

```gendesk -n --pkgname=[appname]```

**Generate with a custom display name**

```gendesk --name="[App Name]" --pkgname=[appname]```

**Specify the exec command and categories**

```gendesk --pkgname=[app] --exec="[/usr/bin/app %U]" --categories="[Development;IDE]"```

**Generate a terminal application entry**

```gendesk --pkgname=[app] --terminal```

# SYNOPSIS

**gendesk** [_options_]

# PARAMETERS

**--pkgname** _NAME_
> Package name (used for filename and defaults).

**--name** _NAME_
> Application display name.

**--exec** _CMD_
> Command to execute (supports field codes like %U, %F).

**--categories** _LIST_
> Semicolon-separated application categories (e.g., Development;IDE).

**--comment** _TEXT_
> Short description comment.

**--genericname** _NAME_
> Generic name for the application (e.g., "Text Editor").

**--mimetype** _LIST_
> Semicolon-separated MIME types the application can open.

**--terminal**
> Set Terminal=true in the desktop file.

**--path** _DIR_
> Working directory for the application.

**-n**
> Don't include Name field if same as pkgname.

**--help**
> Display help information.

# DESCRIPTION

**gendesk** generates .desktop files for Linux applications following the freedesktop.org Desktop Entry specification. It can read values from a PKGBUILD file in the current directory or accept them as command-line flags.

The tool simplifies creating desktop files during package building by generating entries with proper formatting, handling icon references, categories, MIME types, and exec paths. Supported PKGBUILD variables include _name, _genericname, _comment, _mimetype, _exec, and _categories.

gendesk is commonly used in Arch Linux package building (PKGBUILDs).

# CAVEATS

Primarily designed for Arch Linux packaging workflows. Desktop file standards may vary between environments. Manual tweaking may be needed for complex entries.

# HISTORY

gendesk was created by **Alexander F. Rodseth** for **Arch Linux** packaging to simplify .desktop file generation during package builds, reducing boilerplate in PKGBUILDs.

# SEE ALSO

[desktop-file-validate](/man/desktop-file-validate)(1), [xdg-desktop-menu](/man/xdg-desktop-menu)(1)
