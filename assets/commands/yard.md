# TAGLINE

Ruby documentation generator

# TLDR

**Generate docs**

```yard doc```

**Start server**

```yard server```

**Start server** and reparse code on each request

```yard server --reload```

**Serve docs** for installed gems

```yard server --gems```

**List undocumented**

```yard stats --list-undoc```

**Generate into a directory** using Markdown markup

```yard doc -o [docs] -m markdown```

**Generate for specific files**

```yard doc [lib/**/*.rb]```

**Generate for gems**

```yard gems```

**Show documentation for a class or method**

```yard ri [ClassName]```

# SYNOPSIS

**yard** _command_ [_options_]

# PARAMETERS

**doc**
> Generate documentation (default command; **yardoc** is a shortcut).

**server**
> Run a local documentation server.

**stats**
> Print documentation statistics on a set of files.

**gems**
> Document gems.

**ri**
> View documentation in the console, like ri.

**diff**
> Show the object diff of two gems or .yardoc files.

**config**
> View or edit the global configuration.

**display**
> Display a formatted object.

**graph**
> Graph a class diagram using Graphviz.

**help**
> Show help for a command.

**list**
> List objects.

**markups**
> List available markup types and libraries.

**i18n**
> Generate a .pot file from source code and extra documentation.

**--list-undoc**
> With **stats**: list undocumented objects.

**-o**, **--output-dir** _PATH_
> With **doc**: directory for the generated output.

**-m**, **--markup** _MARKUP_
> With **doc**: markup style for docstrings (such as markdown or rdoc).

**--exclude** _REGEXP_
> With **doc**: ignore files whose path matches.

**--fail-on-warning**
> With **doc**: exit with error status if a warning occurs.

**--no-private**
> With **doc**: hide objects with the @private tag.

**-r**, **--reload**
> With **server**: reparse the library code on each request.

**-g**, **--gems**
> With **server**: serve documentation for installed gems.

**-p**, **--port** _PORT_
> With **server**: port to serve documentation on.

# DESCRIPTION

**yard** (Yay! A Ruby Documentation Tool) generates API documentation from Ruby source code. It parses specially formatted comments above classes, modules, and methods to produce browsable HTML documentation with cross-references and search.

YARD uses its own tag syntax (such as **@param**, **@return**, **@example**) within comments to describe method signatures, return types, and usage examples. It also supports Markdown and other markup formats for free-form documentation within comments.

The **server** subcommand starts a local web server for live documentation browsing during development. The **stats** subcommand reports documentation coverage, and **--list-undoc** identifies undocumented code. Templates control the HTML output layout and can be customized or replaced entirely. A **.yardopts** file in the project directory lists options applied on every run.

# CAVEATS

Ruby-specific. YARD syntax in comments. Gem required.

# HISTORY

**YARD** (Yay! A Ruby Documentation Tool) was created by **Loren Segal** as a modern replacement for RDoc. Its copyright dates from **2007**.

# SEE ALSO

[rdoc](/man/rdoc)(1), [ri](/man/ri)(1), [ruby](/man/ruby)(1), [gem](/man/gem)(1), [bundle](/man/bundle)(1)

# RESOURCES

```[Source code](https://github.com/lsegal/yard)```

```[Homepage](https://yardoc.org)```

```[Documentation](https://rubydoc.info/gems/yard)```

<!-- verified: 2026-11-09 -->
