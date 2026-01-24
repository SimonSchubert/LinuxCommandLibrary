# TLDR

**Compare two files** side by side

```vimdiff [file1] [file2]```

**Compare three files**

```vimdiff [file1] [file2] [file3]```

**Open files in read-only mode**

```vimdiff -R [file1] [file2]```

**Use horizontal split** instead of vertical

```vimdiff -o [file1] [file2]```

**Start with a clean environment** (no .vimrc)

```vimdiff --clean [file1] [file2]```

**Compare files with a specific command** executed at startup

```vimdiff -c "[command]" [file1] [file2]```

# SYNOPSIS

**vimdiff** [_options_] _file1_ _file2_ [_file3_ [_file4_]]

# PARAMETERS

**-O**
> Open windows vertically, side by side (default for two files).

**-o**
> Open windows horizontally, stacked.

**-R**
> Open all files in read-only mode.

**-c** _command_
> Execute command after loading the first file.

**--clean**
> Start without loading .vimrc or plugins.

**-d**
> Explicitly enable diff mode (automatic with vimdiff).

# DESCRIPTION

**vimdiff** starts Vim in diff mode with two to eight files, each in its own window. Differences between files are highlighted, making it easy to compare and merge changes.

This is equivalent to running **vim -d file1 file2**. In diff mode, Vim automatically sets options for synchronized scrolling (**scrollbind**), difference highlighting, and folding of unchanged lines.

Within vimdiff, use **]c** and **[c** to jump between differences. Use **do** (diff obtain) to pull changes from another window, and **dp** (diff put) to push changes to another window. Use **:diffupdate** to refresh highlighting after edits.

# CAVEATS

vimdiff works best with two files; comparing more than four files can become difficult to read. Large files with many differences may have performance issues. The folding of unchanged lines can be adjusted with **:set diffopt**.

# HISTORY

Diff mode was added to **Vim** by Bram Moolenaar. The vimdiff wrapper script has been part of Vim since version 6.0, released in **2001**. The feature was inspired by similar functionality in other diff tools but integrated directly into Vim's powerful editing environment. Support for up to eight files was added in later versions.

# SEE ALSO

[vim](/man/vim)(1), [diff](/man/diff)(1), [meld](/man/meld)(1), [kdiff3](/man/kdiff3)(1)
