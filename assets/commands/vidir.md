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

**vidir** edits filenames in a text editor. It opens file list for editing.

Each line shows a number and filename. Modify filenames to rename.

Deleting lines removes files. Empty lines are ignored.

Changing numbers reorders (if supported). Some versions support this.

Save and quit applies changes. All renames happen at once.

Useful for batch renaming. Editor features like search/replace available.

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
