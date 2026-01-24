# TLDR

**Generate TAGS file**

```etags [*.c] [*.h]```

**Append to existing TAGS**

```etags -a [newfile.c]```

**Output to specific file**

```etags -o [MYTAGS] [*.c]```

**Include files from file list**

```etags - < [filelist.txt]```

**Process specific language**

```etags --language=[c++] [*.cpp]```

**Recursive directory processing**

```find . -name "*.py" | etags -```

# SYNOPSIS

**etags** [_options_] _files_...

# DESCRIPTION

**etags** generates tag files for Emacs. Tags enable jumping to function definitions, variable declarations, and other symbols across source files.

The tool parses source files and creates a TAGS file containing symbol locations. Emacs uses this for code navigation with M-. (find-tag) and related commands.

# PARAMETERS

**-a**, **--append**
> Append to existing TAGS file.

**-o** _file_
> Output to specified file.

**-l** _lang_, **--language=** _lang_
> Force language for following files.

**-I**, **--include=** _file_
> Include another tags file.

**-r** _regex_, **--regex=** _regex_
> Tag lines matching regex.

**-**
> Read file names from stdin.

**--help**
> Display help.

# SUPPORTED LANGUAGES

C, C++, Java, Python, Perl, Ruby, Lisp, Scheme, Fortran, Pascal, PHP, Lua, Erlang, and many more.

# CAVEATS

Different from ctags (Vim tags). TAGS file can grow large. Needs regeneration after code changes. Some languages have limited support.

# HISTORY

**etags** has been part of **GNU Emacs** since its early versions. It provides the Emacs counterpart to ctags. The tool has evolved to support many programming languages while maintaining compatibility with Emacs tag navigation.

# SEE ALSO

[ctags](/man/ctags)(1), [emacs](/man/emacs)(1), [cscope](/man/cscope)(1), [global](/man/global)(1)
