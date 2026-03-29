# TAGLINE

Generate PHP API documentation from source code

# TLDR

**Generate documentation using the default config**

```phpdox```

**Use a specific configuration file**

```phpdox -f [phpdox.xml]```

**Run only the collector phase** (parse source code)

```phpdox -c```

**Run only the generator phase** (produce documentation)

```phpdox -g```

**Generate a skeleton configuration file**

```phpdox --skel > [phpdox.xml]```

**Generate a skeleton config without comments**

```phpdox --skel --strip > [phpdox.xml]```

**List available output engines**

```phpdox --engines```

# SYNOPSIS

**phpdox** [_options_]

# PARAMETERS

**-f**, **--file** _FILE_
> Use specified XML configuration file (defaults to ./phpdox.xml or ./phpdox.xml.dist).

**-c**, **--collector**
> Run only the collector process (source parsing).

**-g**, **--generator**
> Run only the generator process (documentation output).

**--backends**
> Show a list of available backends and exit.

**--engines**
> Show a list of available output engines and exit.

**--enrichers**
> Show a list of available output enrichers and exit.

**--skel**
> Show an annotated skeleton configuration XML file and exit.

**--strip**
> Strip comments from skeleton config XML when using **--skel**.

**-v**, **--version**
> Display application version.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**phpDox** generates PHP API documentation from source code using standard technologies (SRC, DOCBLOCK, XML and XSLT). It parses PHP source files, extracts PHPDoc comment blocks, and produces HTML documentation. Configuration is defined in an XML file (typically **phpdox.xml**).

The documentation process has two phases: the **collector** parses source code into an XML representation, and the **generator** transforms it into output using configurable engines and enrichers.

# CONFIGURATION

**phpdox.xml**
> XML configuration file specifying source directories, output paths, template settings, and build targets. Required for operation. Generate a template with **--skel**.

# CAVEATS

Requires an XML configuration file. PHPDoc comment blocks in source code are recommended for useful output. The project is no longer actively maintained.

# SEE ALSO

[phpdoc](/man/phpdoc)(1), [doxygen](/man/doxygen)(1), [php](/man/php)(1)

