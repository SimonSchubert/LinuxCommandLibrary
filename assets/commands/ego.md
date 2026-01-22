# TLDR

**Synchronize** the Portage tree

```ego sync```

**Update** bootloader configuration

```ego boot update```

**Read** a Funtoo wiki page

```ego doc [wiki_page]```

**Print** current profile

```ego profile show```

**Enable/Disable** mix-ins

```ego profile mix-in +[gnome] -[kde-plasma-5]```

**Query** Funtoo bugs for a package

```ego query bug [package]```

# SYNOPSIS

**ego** _command_ [_arguments_]

# DESCRIPTION

**ego** is Funtoo's official system personality management tool. It provides a unified interface for synchronizing repositories, managing profiles, updating bootloader configuration, and accessing Funtoo documentation.

Replaces several separate tools with a single coherent interface.

# PARAMETERS

**sync**
> Synchronize Portage tree

**boot update**
> Update bootloader configuration

**doc** _page_
> Read wiki documentation

**profile show**
> Display current profile

**profile mix-in** _changes_
> Enable/disable mix-ins with +/-

**query bug** _package_
> Query bugs for package

# CAVEATS

Funtoo Linux specific. Not available on Gentoo or other distributions. Requires proper /etc/ego.conf configuration.

# SEE ALSO

[emerge](/man/emerge)(1), [eselect](/man/eselect)(1)
