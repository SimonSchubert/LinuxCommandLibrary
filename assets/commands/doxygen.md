# TAGLINE

documentation generator for source code

# TLDR

**Generate default config** file

```doxygen -g [Doxyfile]```

**Generate documentation**

```doxygen [Doxyfile]```

**Generate with updates** to config

```doxygen -u [Doxyfile]```

**Generate for wizard** GUI

```doxywizard```

# SYNOPSIS

**doxygen** [_options_] [_configfile_]

# PARAMETERS

_CONFIGFILE_
> Configuration file (default: Doxyfile).

**-g** [_FILE_]
> Generate default configuration file.

**-u** [_FILE_]
> Update config file to current version.

**-s**
> Omit comments in generated config.

**-l**
> Generate layout file.

**-w**
> Generate style sheets.

**-v**, **--version**
> Show version.

**--help**
> Display help information.

# CONFIGURATION

**Doxyfile**
> Main configuration file for project documentation settings, output formats, and parsing options.

# DESCRIPTION

**Doxygen** is the standard documentation generator for C++, C, Java, Python, and other languages. It extracts documentation from specially-formatted comments in source code and generates output in HTML, LaTeX, RTF, and other formats.

The tool parses source code, builds a cross-referenced documentation structure, and renders it with class diagrams, call graphs, and inheritance trees. Special comment markers (///, /**, etc.) identify documentation blocks.

Doxygen supports Markdown in comments and can generate documentation from plain header files without inline comments.

# CAVEATS

Complex projects need extensive configuration. Large codebases may take time to process. Graphviz required for diagrams. Output quality depends on comment quality.

# HISTORY

Doxygen was created by **Dimitri van Heesch** and first released in **1997**. It became the de facto standard for C/C++ documentation, supporting additional languages and output formats over time.

# SEE ALSO

[cppcheck](/man/cppcheck)(1), [javadoc](/man/javadoc)(1), [sphinx-build](/man/sphinx-build)(1)
