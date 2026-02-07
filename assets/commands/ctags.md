# TAGLINE

Source code tag index generator

# TLDR

**Generate tags for current directory**

```ctags *```

**Generate tags recursively**

```ctags -R```

**Generate tags for specific files**

```ctags [file1.c] [file2.c]```

**Output to specific file**

```ctags -f [tags] -R [src/]```

**Append to existing tags file**

```ctags -a [newfile.c]```

**List supported languages**

```ctags --list-languages```

**List tag kinds for language**

```ctags --list-kinds=[c]```

# SYNOPSIS

**ctags** [_options_] [_file_...]

# DESCRIPTION

**ctags** generates index files (tags) that map identifiers in source code to their definitions. This enables text editors and IDEs to quickly navigate to function definitions, class declarations, variables, and other programming constructs across large codebases.

The tool parses source code in dozens of programming languages, extracting symbols like function names, classes, methods, variables, macros, and type definitions. It creates a tags file (default name: **tags**) containing the symbol name, file location, and search pattern to find it.

Modern editors like Vim, Emacs, and many IDEs use ctags files for features like "go to definition," symbol completion, and code navigation. Universal Ctags is the actively maintained fork and supports more languages and features than the original Exuberant Ctags.

# PARAMETERS

**-R**, **--recurse**
> Recurse into directories

**-f** _file_, **-o** _file_
> Output tags to file

**-a**, **--append**
> Append to existing tags file

**-L** _file_, **--file-list** _file_
> Read file names from file

**--languages** _list_
> Restrict to languages

**--language-force** _lang_
> Force specific language

**--exclude** _pattern_
> Exclude files matching pattern

**--extras** _flags_
> Extra tag entries

**--fields** _flags_
> Fields to include

**--kinds-\<lang\>** _kinds_
> Tag kinds to include

**--list-languages**
> List supported languages

**--list-kinds**[=_lang_]
> List tag kinds

**--list-maps**
> List file extension mappings

# CONFIGURATION

**~/.ctags**
> User configuration file for tag generation options and language definitions.

**~/.ctags.d/**
> Directory containing modular configuration files for different languages and settings.

**.ctags.d/**
> Project-level configuration directory for repository-specific tag settings.

# TAG KINDS

**c**: classes

**f**: functions

**m**: class members

**v**: variables

**t**: typedefs

**d**: macro definitions

# IMPLEMENTATIONS

**Universal Ctags**: Actively maintained fork

**Exuberant Ctags**: Original implementation (unmaintained)

# CAVEATS

Output file named 'tags' by default. Use with Vim :tag command or Ctrl-]. Universal Ctags recommended over Exuberant Ctags. Large codebases may produce large tag files. Requires regeneration after code changes.

# HISTORY

**ctags** was originally developed as part of the BSD Unix project in the late 1970s. **Exuberant Ctags** by Darren Hiebert became the dominant implementation in 1996, adding support for many languages. **Universal Ctags** forked in 2014 and is now the actively maintained version with modern language support.

# SEE ALSO

[etags](/man/etags)(1), [vim](/man/vim)(1), [cscope](/man/cscope)(1)
