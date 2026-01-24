# TLDR

**Build HTML documentation**

```sphinx-build -b html [source/] [build/html]```

**Build PDF documentation**

```sphinx-build -b latex [source/] [build/latex]```

**Clean and rebuild**

```sphinx-build -E -b html [source/] [build/html]```

**Verbose output**

```sphinx-build -v -b html [source/] [build/html]```

**Build with warnings as errors**

```sphinx-build -W -b html [source/] [build/html]```

**Check links**

```sphinx-build -b linkcheck [source/] [build/linkcheck]```

**Set configuration option**

```sphinx-build -D [key=value] -b html [source/] [build/]```

# SYNOPSIS

**sphinx-build** [_-b builder_] [_options_] _sourcedir_ _outputdir_

# PARAMETERS

**-b** _BUILDER_
> Output format builder.

**-E**
> Rebuild all files.

**-a**
> Rebuild changed files.

**-W**
> Warnings as errors.

**-v**
> Verbose output.

**-D** _KEY=VALUE_
> Override config.

**-c** _PATH_
> Config directory.

**-j** _N_
> Parallel jobs.

# BUILDERS

**html** - HTML pages
**latex** - LaTeX/PDF
**epub** - EPUB ebook
**man** - Man pages
**linkcheck** - Check links

# DESCRIPTION

**sphinx-build** generates documentation from reStructuredText sources. It's the standard Python documentation tool.

Builders produce different output formats. HTML, PDF, and ePub common.

Configuration in conf.py controls behavior. Themes, extensions, and settings.

Cross-referencing links documents together. Indexes generated automatically.

Extensions add features. Autodoc extracts from docstrings.

# CAVEATS

Requires Python. reStructuredText learning curve. Large projects slow to build.

# HISTORY

**Sphinx** was created by **Georg Brandl** for Python documentation. Released in 2008, it became the standard for Python project documentation.

# SEE ALSO

[make](/man/make)(1), [rst2html](/man/rst2html)(1), [doxygen](/man/doxygen)(1)
