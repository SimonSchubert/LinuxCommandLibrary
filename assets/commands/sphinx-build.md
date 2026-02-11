# TAGLINE

Generate documentation from reStructuredText

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

**sphinx-build** is the build command for Sphinx, the standard documentation generator for Python projects. It reads reStructuredText or MyST Markdown source files and produces output in various formats including HTML websites, LaTeX/PDF documents, ePub ebooks, and Unix man pages.

The build process is controlled by a **conf.py** configuration file in the source directory, which defines the project name, theme, enabled extensions, and output settings. Sphinx supports automatic cross-referencing between documents, index generation, and code syntax highlighting. The **autodoc** extension can extract documentation directly from Python docstrings.

Multiple builders are available, selected with the **-b** flag. Incremental builds only process changed files by default; the **-E** flag forces a complete rebuild. Parallel building with **-j** speeds up large documentation projects.

# CONFIGURATION

**conf.py**
> Sphinx configuration file in the source directory defining project metadata, theme, extensions, template paths, and build options.

**SPHINXOPTS**
> Environment variable for passing additional options to sphinx-build when invoked through Makefiles.

# CAVEATS

Requires Python. reStructuredText learning curve. Large projects slow to build.

# HISTORY

**Sphinx** was created by **Georg Brandl** for Python documentation. Released in 2008, it became the standard for Python project documentation.

# SEE ALSO

[make](/man/make)(1), [rst2html](/man/rst2html)(1), [doxygen](/man/doxygen)(1)
