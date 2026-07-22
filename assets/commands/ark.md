# TAGLINE

Create, view, and extract archives graphically.

# TLDR

**Extract** a specific archive into the current directory

```ark -b [path/to/archive]```

Extract an archive into a **specific directory**

```ark -b -o [path/to/directory] [path/to/archive]```

**Create** an archive and add specific files to it

```ark -t [path/to/archive] [path/to/file1] [path/to/file2]```

# SYNOPSIS

**ark** [_options_] [_archive_] [_files_]

# DESCRIPTION

**ark** is KDE's graphical archiving tool that supports creating, viewing, extracting, and modifying archives. It handles numerous formats including tar, gzip, bzip2, zip, rar, 7z, and many others through plugins.

When run with command-line options, ark can operate in batch mode without displaying its GUI, making it useful for scripting and automation.

# PARAMETERS

**-b, --batch**
> Use batch mode (no GUI) to extract archives

**-o, --destination** _directory_
> Extract to the specified directory

**-t, --add-to** _archive_
> Add files to an archive, creating it if necessary

**-c, --add**
> Add files to an existing archive

**-e, --extract**
> Open the extraction dialog

**-d, --dialog**
> Show a dialog to choose extraction options instead of extracting silently

**-f, --changetofirstpath**
> Use the first archive entry's path as the destination (with **-b**)

# CAVEATS

Some archive formats require additional plugins or external programs. RAR creation requires **rar** (proprietary), while extraction works with the free **unrar**. Format support depends on installed KDE archive plugins.

# INSTALL

```apt: sudo apt install ark```

```dnf: sudo dnf install ark```

```pacman: sudo pacman -S ark```

```apk: sudo apk add ark```

```zypper: sudo zypper install ark```

```brew: brew install ark```

```nix: nix profile install nixpkgs#ark```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[tar](/man/tar)(1), [unzip](/man/unzip)(1), [7z](/man/7z)(1)

# RESOURCES

```[Source code](https://invent.kde.org/utilities/ark)```

```[Homepage](https://apps.kde.org/ark/)```

<!-- verified: 2026-06-15 -->
