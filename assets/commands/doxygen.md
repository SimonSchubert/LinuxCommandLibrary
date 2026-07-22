# TAGLINE

documentation generator for source code

# TLDR

**Generate default config** file

```doxygen -g [Doxyfile]```

**Generate documentation**

```doxygen [Doxyfile]```

**Generate with updates** to config

```doxygen -u [Doxyfile]```

**Generate a minimal config** without the explanatory comments

```doxygen -g -s [Doxyfile]```

**Read the config from stdin** and generate

```cat [Doxyfile] | doxygen -```

**Launch the GUI** front end

```doxywizard```

# SYNOPSIS

**doxygen** [_configfile_]

**doxygen** [**-g**|**-u**|**-s**|**-l**|**-w**|**-x**] [_file_]

# PARAMETERS

_CONFIGFILE_
> The configuration file to use. Defaults to `Doxyfile` in the current directory. A single **-** reads the configuration from standard input.

**-g** [_FILE_]
> Generate a template configuration file, fully commented. Writes `Doxyfile` if no name is given.

**-u** [_FILE_]
> Update an existing configuration file to the current Doxygen version, preserving your settings and adding any new options with their defaults.

**-s**
> Omit the explanatory comments. Combines with **-g** and **-u** to produce a short config that is far easier to keep in version control.

**-x** [_FILE_]
> Print the differences between the given configuration and the defaults. The quickest way to see what a project has actually customised.

**-l** [_FILE_]
> Generate a layout file (`DoxygenLayout.xml`) that controls the ordering and presence of sections in the output.

**-w** _FORMAT_ ...
> Generate style sheet or template files. _FORMAT_ is `html`, `latex`, or `rtf`.

**-d** _MODE_
> Enable a debug mode, such as `Preprocessor` or `FilterOutput`.

**-b**
> Run with unbuffered output, so progress appears immediately when piped.

**-v**, **--version**
> Show the version and exit.

**--help**
> Display help information.

# CONFIGURATION

**Doxyfile**
> Main configuration file for project documentation settings, output formats, and parsing options.

# DESCRIPTION

**Doxygen** is the standard documentation generator for C++, C, Java, Python, and other languages. It extracts documentation from specially-formatted comments in source code and generates output in HTML, LaTeX, RTF, and other formats.

The tool parses source code, builds a cross-referenced documentation structure, and renders it with class diagrams, call graphs, and inheritance trees. Special comment markers (///, /**, etc.) identify documentation blocks.

Doxygen understands Markdown inside comments, and it will happily document a codebase that has no documentation comments at all, producing a browsable, cross-referenced index of every class, function, and file from the declarations alone. That is often reason enough to run it on an unfamiliar project.

Beyond C++ and C it handles Java, Python, C#, PHP, Objective-C, Fortran, and IDL, and it will read Javadoc- and Qt-style comment blocks as well as its own.

# CAVEATS

The generated `Doxyfile` is enormous, several hundred settings with page after page of comments. Generating it with **-g -s** and keeping only what you change makes it reviewable; **-x** shows what an inherited config actually alters.

Diagrams are the usual disappointment. Class hierarchies, collaboration diagrams, call graphs, and include graphs all require **Graphviz**, so `HAVE_DOT` must be set to `YES` and `dot` must be on the PATH, otherwise Doxygen silently falls back to crude built-in images. Call graphs on a large codebase also generate an enormous number of images and can make a build take hours.

Doxygen only documents what it can parse. Heavy preprocessor use, template metaprogramming, and macros that expand into declarations routinely confuse it, which is what `ENABLE_PREPROCESSING`, `MACRO_EXPANSION`, and `PREDEFINED` exist to work around. And the output is only as good as the comments: run with `WARN_IF_UNDOCUMENTED` and `WARN_AS_ERROR` in CI if the documentation is meant to stay complete.

# HISTORY

Doxygen was written by **Dimitri van Heesch** and first released in **1997**, originally as a tool for generating Qt-style documentation for his own C++ code. It filled an obvious gap, since Java had Javadoc but C++ had nothing comparable, and it became the de facto standard for C and C++ documentation almost by default. It is still maintained by van Heesch, now on GitHub, close to three decades on.

# INSTALL

```apt: sudo apt install doxygen```

```dnf: sudo dnf install doxygen```

```pacman: sudo pacman -S doxygen```

```apk: sudo apk add doxygen```

```zypper: sudo zypper install doxygen```

```brew: brew install doxygen```

```nix: nix profile install nixpkgs#doxygen```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dot](/man/dot)(1), [cppcheck](/man/cppcheck)(1), [javadoc](/man/javadoc)(1), [sphinx-build](/man/sphinx-build)(1)

# RESOURCES

```[Source code](https://github.com/doxygen/doxygen)```

```[Homepage](https://www.doxygen.nl)```

```[Documentation](https://www.doxygen.nl/manual/index.html)```

<!-- verified: 2026-07-14 -->

