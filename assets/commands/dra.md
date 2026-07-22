# TAGLINE

Download GitHub release assets from the command line

# TLDR

**Download** assets from the latest release

```dra download [owner/repo]```

**Select asset interactively**

```dra download -s [owner/repo]```

**Download a specific tag**

```dra download -t [v1.2.3] [owner/repo]```

**Install** a binary asset into a directory

```dra download -i [~/.local/bin] [owner/repo]```

# SYNOPSIS

**dra** *command* [*options*] [*repo*]

# DESCRIPTION

**dra** (Download Release Assets) fetches files attached to GitHub Releases. It can list or download the latest or a tagged release, filter assets by name/pattern, and optionally install executables into a destination directory—handy for bootstrapping tools not yet packaged by your distro.

# PARAMETERS

**download** [*owner/repo*]

> Download release asset(s). Repo can also be a GitHub URL.

**-t**, **--tag** *tag*

> Release tag (default: latest).

**-s**, **--select**

> Interactive asset selection.

**-a**, **--asset** *pattern*

> Asset name/pattern filter.

**-i**, **--install** *dir*

> Install downloaded binary to *dir*.

**--source** / authentication flags

> Use GitHub API with token when rate-limited (**GITHUB_TOKEN** / flags per **--help**).

# CAVEATS

Subject to GitHub API rate limits; set a token for private repos or heavy use. Always verify checksums of downloaded binaries when available.

# INSTALL

```pacman: sudo pacman -S dra```

```brew: brew install dra```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gh](/man/gh)(1), [curl](/man/curl)(1), [wget](/man/wget)(1)

# RESOURCES

```[Source code](https://github.com/devmatteini/dra)```

<!-- verified: 2026-07-19 -->
