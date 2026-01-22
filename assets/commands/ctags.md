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

**ctags** generates tag index files for source code. Enables editors to jump to function definitions, variables, and other symbols. Supports many programming languages.

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

Output file named 'tags' by default. Use with Vim :tag command or Ctrl-]. Universal Ctags recommended over Exuberant Ctags.

# SEE ALSO

[etags](/man/etags)(1), [vim](/man/vim)(1), [cscope](/man/cscope)(1)
