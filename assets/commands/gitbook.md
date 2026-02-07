# TAGLINE

Build books and documentation from Markdown

# TLDR

**Initialize new book**

```gitbook init```

**Serve book locally**

```gitbook serve```

**Build static site**

```gitbook build```

**Build to specific output**

```gitbook build [.] [_book]```

**Install plugins**

```gitbook install```

**Update GitBook**

```gitbook update```

**List available versions**

```gitbook ls-remote```

# SYNOPSIS

**gitbook** _command_ [_options_]

# PARAMETERS

**init**
> Initialize book structure.

**serve**
> Serve book on localhost.

**build**
> Build static website.

**install**
> Install plugins from book.json.

**pdf**
> Generate PDF (requires Calibre).

**epub**
> Generate ePub.

**mobi**
> Generate Mobi.

**update**
> Update GitBook.

**--port** _port_
> Server port for serve.

**--log** _level_
> Log level.

# DESCRIPTION

**gitbook** is a command-line tool for building books and documentation from Markdown files. It generates static HTML sites or other formats like PDF and ePub.

The tool uses a `book.json` configuration file and organizes content through `SUMMARY.md` for structure. Plugins extend functionality with custom features.

# CONFIGURATION

**book.json**
> Project configuration file defining title, description, plugins, and build settings.

# CAVEATS

Legacy CLI deprecated. Requires older Node.js versions. Plugins may be unmaintained. PDF generation needs Calibre.

# HISTORY

**GitBook** was created by **Samy Pesse** and **Aaron O'Mullan** around **2014**. It became popular for technical documentation and books. The company pivoted to a commercial platform, leaving the CLI as a legacy tool. Community forks continue development.

# SEE ALSO

[mdbook](/man/mdbook)(1), [mkdocs](/man/mkdocs)(1), [sphinx](/man/sphinx)(1), [docusaurus](/man/docusaurus)(1)
