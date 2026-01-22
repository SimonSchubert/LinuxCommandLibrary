# TLDR

**Open** the home directory

```nemo```

Open specific directories in **separate windows**

```nemo [path/to/directory1] [path/to/directory2]```

Open directories in **tabs**

```nemo --tabs [path/to/directory1] [path/to/directory2]```

Open with specific **window size**

```nemo --geometry=[600]x[400] [path/to/directory]```

**Close all** windows

```nemo --quit```

# SYNOPSIS

**nemo** [**--tabs**] [**--geometry** _WxH_] [**--quit**] [_URI_...]

# PARAMETERS

**--tabs**
> Open directories in tabs instead of windows

**--geometry _WxH_**
> Set initial window size (width x height)

**--new-window**
> Always open a new window

**--quit, -q**
> Close all Nemo windows

**--no-desktop**
> Don't manage the desktop

**--no-default-window**
> Only create windows for explicitly specified URIs

**--version**
> Display version information

**--help**
> Display help information

# DESCRIPTION

**Nemo** is the default file manager for the Cinnamon desktop environment. It is a fork of Nautilus (GNOME Files) with additional features and a more traditional interface.

Features include dual-pane view, configurable toolbar, tree view in sidebar, and extensive plugin support. Nemo can manage the desktop icons and integrates with Cinnamon's system services.

# CAVEATS

Desktop management may conflict with other file managers. Some features require Cinnamon desktop integration. Extensions are installed separately from the main package.

# HISTORY

**Nemo** was forked from **Nautilus 3.4** by the **Linux Mint** team in 2012 after Nautilus removed features in version 3.6. It is named after Captain Nemo from Jules Verne's novels, continuing the nautical naming theme.

# SEE ALSO

[nautilus](/man/nautilus)(1), [thunar](/man/thunar)(1), [dolphin](/man/dolphin)(1), [caja](/man/caja)(1)
