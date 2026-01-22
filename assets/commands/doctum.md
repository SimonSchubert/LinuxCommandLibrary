# TLDR

**Generate documentation**

```doctum update [doctum.php]```

**Parse and render** documentation

```doctum render [doctum.php]```

**Update and render** in one step

```doctum update [doctum.php] --force```

**Show verbose output**

```doctum update -v [doctum.php]```

# SYNOPSIS

**doctum** _command_ [_options_] _config-file_

# PARAMETERS

_COMMAND_
> Operation: update, render, parse.

_CONFIG-FILE_
> PHP configuration file.

**update**
> Parse source and render documentation.

**render**
> Render from cached parse data.

**parse**
> Parse source without rendering.

**--force**
> Force complete regeneration.

**-v**, **--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**Doctum** is an API documentation generator for PHP projects. It parses PHP source code and generates browsable HTML documentation with class hierarchies, method signatures, and docblock comments.

The tool is a fork of Sami, providing continued maintenance and improvements. It supports modern PHP features including traits, namespaces, and type declarations. Configuration is done through PHP files allowing flexible customization.

Doctum creates searchable documentation with cross-references between classes and methods, making it valuable for documenting libraries and frameworks.

# CAVEATS

Requires PHP 7.2+. Large codebases may have slow initial parse. Configuration requires PHP knowledge. Some PHP edge cases may not parse correctly.

# HISTORY

Doctum is a fork of **Sami**, originally created by **Fabien Potencier** (creator of Symfony). When Sami was deprecated, Doctum emerged as the community-maintained continuation, providing API documentation for PHP projects.

# SEE ALSO

[phpdoc](/man/phpdoc)(1), [doxygen](/man/doxygen)(1), [php](/man/php)(1)
