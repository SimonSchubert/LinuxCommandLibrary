# TAGLINE

Download OS images for Quickemu VMs

# TLDR

**List** all supported operating systems

```quickget --list```

List in **CSV/JSON** format

```quickget --list-csv```

**Download** and create VM config

```quickget [os] [release] [edition]```

Download **Windows 11**

```quickget windows 11```

Download **macOS**

```quickget macos [sonoma]```

Show **ISO URL**

```quickget --url [os] [release]```

**Check** if ISO available

```quickget --check [os] [release]```

**Download only** without config

```quickget --download [os] [release]```

# SYNOPSIS

**quickget** [**--list**|**--url**|**--check**|**--download**] [_os_] [_release_] [_edition_]

# PARAMETERS

**--list, --list-csv, --list-json**
> List supported operating systems

**--url _os_ _release_**
> Show ISO download URL

**--check _os_ _release_**
> Check if ISO is available

**--download _os_ _release_**
> Download without creating config

**--create-config _os_ _iso_**
> Create config from existing ISO

**os**
> Operating system name

**release**
> Version/release number

**edition**
> Edition variant (optional)

# DESCRIPTION

**quickget** downloads operating system images and creates Quickemu configuration files. It supports hundreds of operating systems including Linux distributions, Windows, macOS, and BSD variants.

The tool automatically selects appropriate download mirrors and creates optimized VM configurations based on the OS requirements.

# CAVEATS

Large downloads may take significant time. Some OS editions require specific release versions. macOS downloads are recovery images. Windows needs virtio drivers.

# HISTORY

**quickget** is the companion tool to **quickemu**, developed by **Martin Wimpress**. It simplifies the process of obtaining and preparing VM images for various operating systems.

# SEE ALSO

[quickemu](/man/quickemu)(1), [wget](/man/wget)(1), [aria2c](/man/aria2c)(1)
