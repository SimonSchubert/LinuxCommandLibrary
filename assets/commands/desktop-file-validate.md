# TAGLINE

validate desktop entry files against specification

# TLDR

**Validate a desktop entry file**

```desktop-file-validate [path/to/file.desktop]```

**Validate multiple files**

```desktop-file-validate [file1.desktop] [file2.desktop]```

**Validate without deprecation warnings**

```desktop-file-validate --no-warn-deprecated [path/to/file.desktop]```

**Validate and warn about KDE-specific extensions**

```desktop-file-validate --warn-kde [path/to/file.desktop]```

**Validate all desktop files** in a directory

```desktop-file-validate /usr/share/applications/*.desktop```

# SYNOPSIS

**desktop-file-validate** [**--no-warn-deprecated**] [**--warn-kde**] _FILE_...

# PARAMETERS

**--no-warn-deprecated**
> Do not warn about usage of deprecated items from previous specification versions.

**--warn-kde**
> Warn about KDE-specific extensions including KDE Desktop Entry group, ServiceTypes, DocPath, Keywords, InitialPreference keys, and Service/ServiceType/FSDevice types.

# DESCRIPTION

**desktop-file-validate** validates desktop entry files (.desktop files) according to the freedesktop.org Desktop Entry Specification. Desktop entry files provide information such as application name, icon, description, and categories for application launchers and menus.

The validation checks for mandatory keys, correct value types, proper escaping, valid categories, and common errors that could cause improper display or misbehavior. The tool is commonly used in packaging workflows and build systems to ensure desktop entries meet specification requirements.

The command returns exit status 0 if all files are valid with no errors or strict warnings. A non-zero exit status (typically 1) indicates validation failures.

# CAVEATS

The tool validates against the freedesktop.org specification, which may differ from desktop environment-specific requirements. Some desktop environments accept non-standard extensions that this tool will flag as warnings. The --warn-kde option helps identify KDE-specific extensions when targeting cross-desktop compatibility.

# HISTORY

desktop-file-validate is part of the **desktop-file-utils** package maintained by freedesktop.org. The Desktop Entry Specification was created to provide a standard format for application metadata across Linux desktop environments. The specification has evolved through multiple versions, with desktop-file-validate tracking these changes and providing deprecation warnings for outdated keys.

# SEE ALSO

[desktop-file-install](/man/desktop-file-install)(1), [update-desktop-database](/man/update-desktop-database)(1), [xdg-desktop-menu](/man/xdg-desktop-menu)(1)
