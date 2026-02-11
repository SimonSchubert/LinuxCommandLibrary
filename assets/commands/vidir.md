# TAGLINE

Edit filenames in a text editor

# TLDR

**Edit filenames in editor**

```vidir```

**Edit specific files**

```vidir [*.txt]```

**Edit directory contents**

```vidir [path/to/directory/]```

**Use specific editor**

```EDITOR=[vim] vidir```

**Verbose mode**

```vidir -v```

# SYNOPSIS

**vidir** [_-v_] [_files_|_directory_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

_files_
> Files to edit.

_directory_
> Directory to edit.

# ENVIRONMENT

**EDITOR** - Editor to use
**VISUAL** - Visual editor

# DESCRIPTION

**vidir** opens a list of filenames in a text editor, where each line contains a number and a filename. Editing the filenames renames the corresponding files, and deleting lines removes them. All changes are applied when you save and quit the editor.

This approach leverages familiar editor features like search-and-replace, macros, and multi-cursor editing for powerful batch renaming operations that would be tedious with individual **mv** commands.

# EXAMPLE

Editor shows:
```
1	file1.txt
2	file2.txt
3	old_name.doc
```

Edit to:
```
1	document1.txt
2	document2.txt
3	new_name.doc
```

# CAVEATS

Part of moreutils package. Careful with deletions. Test on copies first.

# HISTORY

**vidir** is part of **moreutils** by **Joey Hess**. It provides intuitive file renaming using familiar editor interfaces.

# SEE ALSO

[qmv](/man/qmv)(1), [rename](/man/rename)(1), [mmv](/man/mmv)(1)
