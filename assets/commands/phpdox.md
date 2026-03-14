# TAGLINE

Generate PHP API documentation from source code

# TLDR

**Generate documentation** using default config

```phpdox```

**Use specific config** file

```phpdox -f [phpdox.xml]```

**Show version**

```phpdox --version```

# SYNOPSIS

**phpdox** [_options_]

# PARAMETERS

**-f** _FILE_
> Use specified XML configuration file.

**--version**
> Display application version.

**--help**
> Display help information.

# DESCRIPTION

**phpDox** generates PHP API documentation from source code using standard technologies (SRC, DOCBLOCK, XML and XSLT). It parses PHP source files, extracts PHPDoc comment blocks, and produces HTML documentation. Configuration is defined in an XML file (typically **phpdox.xml**).

# CONFIGURATION

**phpdox.xml**
> XML configuration file specifying source directories, output paths, template settings, and build targets. Required for operation.

# CAVEATS

Requires an XML configuration file. PHPDoc comment blocks in source code are recommended for useful output. The project is no longer actively maintained.

# SEE ALSO

[phpdoc](/man/phpdoc)(1), [doxygen](/man/doxygen)(1)

