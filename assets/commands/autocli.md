# TAGLINE

Fetch structured data from websites and local tools via CLI

# TLDR

**Run** a site command (examples evolve with catalogs)

```autocli [site] [subcommand]```

**Install** via install script

```curl -fsSL https://raw.githubusercontent.com/nashsu/autocli/main/scripts/install.sh | sh```

**Help** / list commands

```autocli --help```

# SYNOPSIS

**autocli** *command* [*args*]

# DESCRIPTION

**autocli** is a Rust rewrite of OpenCLI-style “public commands” for fetching information from many websites (social, video, news, etc.) and integrating with local tools (**gh**, **docker**, **kubectl**) from one binary. Emphasizes low memory use and a static binary install.

Command catalogs grow over time—use **autocli --help** and upstream docs for the current surface.

# PARAMETERS

*command*

> Site or tool integration name.

Global flags cover JSON output, browser-backed commands, and auth where needed.

# CAVEATS

Scraping sites can break when HTML changes and may violate third-party ToS. Browser-driven modes are heavier. Review privacy when fetching personal data.

# SEE ALSO

[curl](/man/curl)(1), [gh](/man/gh)(1), [http](/man/http)(1)

# RESOURCES

```[Source code](https://github.com/nashsu/AutoCLI)```

<!-- verified: 2026-07-19 -->
