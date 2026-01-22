# TLDR

**Blame a file**

```git blame [file.txt]```

**Blame specific lines**

```git blame -L [10,20] [file.txt]```

**Show email addresses**

```git blame -e [file.txt]```

**Ignore whitespace**

```git blame -w [file.txt]```

**Detect moved lines**

```git blame -M [file.txt]```

# SYNOPSIS

**git blame** [_options_] [_rev_] [_--_] _file_

# PARAMETERS

_FILE_
> File to annotate.

**-L** _START_,_END_
> Annotate specific line range.

**-e**, **--show-email**
> Show author email.

**-w**
> Ignore whitespace changes.

**-M**
> Detect moved lines within file.

**-C**
> Detect lines copied from other files.

**--since** _DATE_
> Show only commits since date.

**--help**
> Display help information.

# DESCRIPTION

**git blame** shows what revision and author last modified each line of a file. It annotates each line with commit information, helping identify when and why changes were made.

The command is essential for code archaeology, understanding code history, and finding who to ask about specific code. Options detect moved and copied code to show original authorship.

git blame provides line-level history for accountability and understanding.

# CAVEATS

Large files can be slow. Blame follows renames by default. History rewriting changes blame output.

# HISTORY

git blame is a core **Git** command inspired by similar functionality in CVS and SVN, essential for understanding code evolution.

# SEE ALSO

[git-log](/man/git-log)(1), [git-bisect](/man/git-bisect)(1), [git-show](/man/git-show)(1)
