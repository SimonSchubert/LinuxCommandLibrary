# TAGLINE

API documentation generator for PHP

# TLDR

**Parse and render** documentation

```doctum update [doctum.php]```

**Parse only**, without rendering

```doctum parse [doctum.php]```

**Render** from already parsed data

```doctum render [doctum.php]```

**Rebuild** from scratch

```doctum update [doctum.php] --force```

**Build only one version**

```doctum update [doctum.php] --only-version=[main]```

**Keep CI green** despite parse errors

```doctum update [doctum.php] --ignore-parse-errors --no-progress```

**Show verbose output**

```doctum update -v [doctum.php]```

# SYNOPSIS

**doctum** _command_ [_options_] _config-file_

# PARAMETERS

_COMMAND_
> Operation: update, render, parse, version.

_CONFIG-FILE_
> PHP configuration file.

**update**
> Parse source and render documentation.

**render**
> Render from cached parse data.

**parse**
> Parse source without rendering.

**version**
> Show version data.

**--force**
> Rebuild from scratch.

**--only-version** _VERSION_
> Restrict build to the specified version only.

**--no-progress**
> Disable the progress bar.

**--ignore-parse-errors**
> Ignore parse errors and exit with code 0.

**--output-format** _FORMAT_
> Format used to display errors.

**--print-frozen-errors**
> Print errors for frozen versions.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**Doctum** is an API documentation generator for PHP projects. It parses PHP source code and generates browsable HTML documentation with class hierarchies, method signatures, and docblock comments.

The tool is a fork of Sami, providing continued maintenance and improvements. It supports modern PHP features including traits, namespaces, and type declarations. Configuration is done through PHP files allowing flexible customization.

Doctum creates searchable documentation with cross-references between classes and methods, making it valuable for documenting libraries and frameworks.

# CONFIGURATION

**doctum.php**
> Configuration file defining source directories, build paths, themes, and parsing options. It must return an instance of `Doctum\Doctum`.

# CAVEATS

Requires PHP 8.1+. Distributed as **doctum.phar**, so the command may need to be invoked under that name. Large codebases may have slow initial parse. Configuration requires PHP knowledge. Some PHP edge cases may not parse correctly.

# HISTORY

Doctum is a fork of **Sami**, originally created by **Fabien Potencier** (creator of Symfony). When Sami was deprecated, Doctum emerged as the community-maintained continuation, providing API documentation for PHP projects.

# SEE ALSO

[phpdoc](/man/phpdoc)(1), [doxygen](/man/doxygen)(1), [php](/man/php)(1)

# RESOURCES

```[Source code](https://github.com/code-lts/doctum)```

```[Homepage](https://doctum.long-term.support)```

<!-- verified: 2026-11-09 -->
