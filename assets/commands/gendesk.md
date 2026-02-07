# TAGLINE

.desktop file generator for Linux applications

# TLDR

**Generate desktop file**

```gendesk -n --pkgname=[appname]```

**With custom name**

```gendesk --name="[App Name]" --pkgname=[appname]```

**Specify exec**

```gendesk --pkgname=[app] --exec="[/usr/bin/app %U]"```

**Add categories**

```gendesk --pkgname=[app] --categories="[Development;IDE]"```

# SYNOPSIS

**gendesk** [_options_]

# PARAMETERS

**--pkgname** _NAME_
> Package name.

**--name** _NAME_
> Display name.

**--exec** _CMD_
> Command to execute.

**--categories** _LIST_
> Application categories.

**--comment** _TEXT_
> Description comment.

**-n**
> Don't include Name if same as pkgname.

**--help**
> Display help information.

# DESCRIPTION

**gendesk** generates .desktop files for Linux applications. It creates the freedesktop.org standard desktop entries used by launchers and menus.

The tool simplifies creating desktop files for packaging by generating entries with proper formatting. It handles icon references, categories, and exec paths.

gendesk is commonly used in Arch Linux package building.

# CAVEATS

Primarily for Arch Linux packaging. Desktop file standards may vary. Manual tweaking may be needed.

# HISTORY

gendesk was created for **Arch Linux** packaging to simplify .desktop file generation during package builds, reducing boilerplate in PKGBUILDs.

# SEE ALSO

[desktop-file-validate](/man/desktop-file-validate)(1), [xdg-desktop-menu](/man/xdg-desktop-menu)(1)
