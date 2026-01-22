# TLDR

**Open** Atom editor

```atom```

Open **specific file**

```atom [file.txt]```

Open **directory**

```atom [project/]```

Open with **specific package**

```atom --package [package-name]```

**Wait** for window to close

```atom --wait [file.txt]```

# SYNOPSIS

**atom** [_options_] [_paths_]

# DESCRIPTION

**Atom** was a hackable text editor developed by GitHub, built on Electron. It featured extensive customization through packages, themes, and a built-in package manager.

The editor emphasized community packages and Git integration.

# PARAMETERS

**-n**, **--new-window**
> Open in new window

**-a**, **--add**
> Add to current window

**-w**, **--wait**
> Wait for window to close

**--dev**
> Run in development mode

**--safe**
> Disable all packages

**--package** _name_
> Run with package loaded

**--clear-window-state**
> Reset window state

# CAVEATS

**Atom was sunset by GitHub in December 2022.** The project is archived and no longer maintained. Users have migrated to alternatives like VS Code, Sublime Text, or community forks.

# HISTORY

**Atom** was released by GitHub in **2014** as an open-source, hackable editor. It was officially sunset on December 15, **2022**, with development ceasing.

# SEE ALSO

[code](/man/code)(1), [vim](/man/vim)(1), [emacs](/man/emacs)(1)
