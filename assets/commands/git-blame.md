# TAGLINE

Show what revision and author last modified each line

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

**-C**, **-C -C**
> Detect lines copied from other files. Repeat to widen the search beyond the files the commit touched.

**--since** _DATE_
> Show only commits since date.

**--ignore-rev** _REV_
> Ignore a revision when assigning blame, e.g. a bulk reformatting commit.

**--ignore-revs-file** _FILE_
> Ignore every revision listed in a file. Often set repository-wide via **blame.ignoreRevsFile**.

**--reverse** _START_.._END_
> Walk history forwards, showing the last revision in which each line still existed.

**--porcelain**, **--line-porcelain**
> Stable, machine-readable output for scripts.

**-l**
> Show the full, unabbreviated commit hash.

**-s**
> Suppress the author name and timestamp.

**-f**, **--show-name**
> Show the filename of the originating commit.

**-n**, **--show-number**
> Show the line number in the originating commit.

**--help**
> Display help information.

# DESCRIPTION

**git blame** shows what revision and author last modified each line of a file. It annotates each line with commit information, helping identify when and why changes were made.

The command is essential for code archaeology, understanding code history, and finding who to ask about specific code. Options like **-M** and **-C** detect moved and copied code across files to show original authorship rather than the person who relocated it.

Line ranges can be specified with **-L** to focus on specific sections, and **-w** ignores whitespace changes to find meaningful modifications. The output is invaluable for debugging, code review, and understanding the evolution of specific code sections.

# CAVEATS

Blame reports the commit that last **touched** a line, which is not necessarily the commit that introduced the behaviour you are investigating. Whitespace fixes, renames and code moves all claim lines they did not really author unless you pass **-w**, **-M** or **-C**.

A repository-wide reformat buries real history behind one mechanical commit. Record such commits in a file and point **blame.ignoreRevsFile** at it, so **git blame** skips past them by default.

Annotating a large file over deep history is slow, because git reconstructs and diffs many revisions. Narrow the work with **-L** when only a few lines matter.

The default output format is meant for humans and is not stable across versions; parse **--porcelain** or **--line-porcelain** instead.

Blame follows renames of the file by default. Rewriting history with **rebase** or **filter-branch** changes the commits blame points at, so links to blame output can go stale.

# HISTORY

**git blame** was added in **2006**, adopting the name used by CVS and Subversion for the same idea. **git annotate** exists alongside it as a compatibility spelling with a different output format. The **--ignore-rev** and **--ignore-revs-file** options arrived in git **2.23** (**2019**), in response to the problem of repository-wide reformatting commits.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-annotate](/man/git-annotate)(1), [git-log](/man/git-log)(1), [git-bisect](/man/git-bisect)(1), [git-show](/man/git-show)(1), [git-diff](/man/git-diff)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-blame)```

<!-- verified: 2026-07-16 -->

