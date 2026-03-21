# TAGLINE

Ruby documentation generator

# TLDR

**Generate docs**

```yard doc```

**Start server**

```yard server```

**List undocumented**

```yard stats --list-undoc```

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
> Generate docs.

**server**
> Start server.

**stats**
> Show statistics.

**gems**
> Document gems.

**ri**
> Show documentation.

**diff**
> Show changes in documentation.

**--list-undoc**
> List undocumented objects.

# DESCRIPTION

**yard** (Yay! A Ruby Documentation Tool) generates API documentation from Ruby source code. It parses specially formatted comments above classes, modules, and methods to produce browsable HTML documentation with cross-references and search.

YARD uses its own tag syntax (such as **@param**, **@return**, **@example**) within comments to describe method signatures, return types, and usage examples. It also supports Markdown and other markup formats for free-form documentation within comments.

The **server** subcommand starts a local web server for live documentation browsing during development. The **stats** subcommand reports documentation coverage, and **--list-undoc** identifies undocumented code. Templates control the HTML output layout and can be customized or replaced entirely.

# CAVEATS

Ruby-specific. YARD syntax in comments. Gem required.

# HISTORY

**YARD** (Yay! A Ruby Documentation Tool) was created as a modern replacement for RDoc.

# SEE ALSO

[rdoc](/man/rdoc)(1), [ri](/man/ri)(1), [ruby](/man/ruby)(1), [gem](/man/gem)(1), [bundle](/man/bundle)(1)
