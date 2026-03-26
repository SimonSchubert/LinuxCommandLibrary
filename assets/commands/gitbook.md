# TAGLINE

Build books and documentation from Markdown

# TLDR

**Initialize new book**

```gitbook init```

**Serve book locally**

```gitbook serve```

**Build static site**

```gitbook build```

**Build to specific output directory**

```gitbook build [.] [output_dir]```

**Serve with a specific version**

```gitbook build --gitbook=[2.0.1]```

**Install plugins**

```gitbook install```

**List locally installed versions**

```gitbook ls```

**List remote versions available** on NPM

```gitbook ls-remote```

**Install a specific version**

```gitbook fetch [version]```

# SYNOPSIS

**gitbook** _command_ [_options_]

# PARAMETERS

**init**
> Initialize book structure with README.md and SUMMARY.md.

**serve**
> Build and serve book on localhost:4000.

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

**ls**
> List locally installed GitBook versions.

**ls-remote**
> List remote versions available on NPM.

**fetch** _version_
> Download and install a specific version.

**update**
> Update to the latest GitBook version.

**uninstall** _version_
> Remove a specific installed version.

**--gitbook** _version_
> Force a specific GitBook version for the command.

**-d**, **--debug**
> Enable verbose error output with stack traces.

**--log** _level_
> Log level: debug, info, warn, error, disabled.

# DESCRIPTION

**gitbook** is a command-line tool for building books and documentation from Markdown files. It generates static HTML sites or other formats like PDF and ePub.

The tool uses a `book.json` configuration file and organizes content through `SUMMARY.md` for structure. Plugins extend functionality with custom features.

# CONFIGURATION

**book.json**
> Project configuration file defining title, description, plugins, and build settings.

**GITBOOK_DIR**
> Environment variable to specify custom directory for storing GitBook versions (default: ~/.gitbook).

# CAVEATS

Legacy CLI is no longer under active development. Requires older Node.js versions (may not work with Node 12+). Only supports gitbook versions >=2.0.0. Plugins may be unmaintained. PDF/ePub/Mobi generation requires Calibre.

# HISTORY

**GitBook** was created by **Samy Pesse** and **Aaron O'Mullan** around **2014**. It became popular for technical documentation and books. The company pivoted to a commercial platform, leaving the CLI as a legacy tool. Community forks continue development.

# SEE ALSO

[mdbook](/man/mdbook)(1), [mkdocs](/man/mkdocs)(1), [hugo](/man/hugo)(1), [pandoc](/man/pandoc)(1)
