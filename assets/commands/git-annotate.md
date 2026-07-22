# TAGLINE

annotate file lines with commit information

# TLDR

**Show** line-by-line authorship

```git annotate [path/to/file]```

**Annotate** the file as of a given revision

```git annotate [revision] -- [path/to/file]```

**Annotate** only a range of lines

```git annotate -L [10],[20] [path/to/file]```

**Ignore** whitespace-only changes

```git annotate -w [path/to/file]```

**Show** the line's original commit through moves and copies

```git annotate -C -C [path/to/file]```

**Show** the email address instead of the author name

```git annotate -e [path/to/file]```

# SYNOPSIS

**git annotate** [_options_] [_rev-opts_] [_rev_] [**--**] _file_

# PARAMETERS

**-L** _start_,_end_
> Annotate only the given line range. Also accepts **:**_funcname_ to select a function, and forms such as **-L 10,+5**.

**-w**
> Ignore whitespace when comparing versions, so re-indentation does not reassign blame.

**-M**[_num_]
> Detect lines moved or copied within the same file, and blame the original commit.

**-C**[_num_]
> Detect lines moved or copied from other files in the same commit. Repeat (**-C -C**) to widen the search to files the commit did not touch.

**-e**, **--show-email**
> Show the author's email address instead of their name.

**-l**
> Show the long, unabbreviated commit hash.

**-t**
> Show raw timestamps instead of human-readable dates.

**-f**, **--show-name**
> Show the filename of the originating commit.

**-n**, **--show-number**
> Show the line number in the originating commit.

**-s**
> Suppress the author name and timestamp.

**--porcelain**
> Machine-readable output for scripts.

**--line-porcelain**
> Like **--porcelain**, but repeat the full commit information for every line.

**--reverse** _start_.._end_
> Walk history forwards instead of backwards, showing the last revision in which each line still existed.

**--ignore-rev** _rev_
> Ignore a revision when assigning blame, e.g. a bulk reformatting commit.

**--ignore-revs-file** _file_
> Ignore all revisions listed in a file.

# DESCRIPTION

**git annotate** annotates each line of a file with information about the commit that last introduced it. Given a revision, it annotates the file as it existed at that point instead of in the working tree.

It is the same machinery as **git blame**, and the only real difference is the output format. **git annotate** exists for backward compatibility with existing scripts, and to offer a familiar command name to people arriving from CVS and Subversion, where **annotate** is the conventional spelling.

The value of either spelling is archaeology: finding the change that introduced a bug, understanding why a line looks the way it does, or working out who to ask. **-C** and **-M** matter for that, because without them a file that was renamed or a block that was moved shows the refactoring commit rather than the commit that wrote the code.

**--ignore-rev** and **--ignore-revs-file** address the common frustration of a repository-wide reformat burying real history behind one mechanical commit.

# CAVEATS

Blame attributes each line to the commit that last **touched** it, which is not the same as the commit that caused the behaviour you are chasing. A whitespace fix, a rename, or a code move will claim lines it did not really author unless you pass **-w**, **-M** or **-C**.

Because **git annotate** exists only for compatibility, new work should use **git blame**, which has the better-supported output format and is what the git documentation treats as canonical.

Annotating a large file across deep history is slow, since git reconstructs and diffs many revisions. Restrict the work with **-L** when you only care about a few lines.

The default output format is not stable enough to parse; use **--porcelain** or **--line-porcelain** in scripts.

# HISTORY

**git annotate** was added early in git's life, in **2005**, as a Perl script providing a CVS-style name and output format for what **git blame** already did. It was later reimplemented in C and is now a thin front-end over the same code as **git blame**.

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

[git-blame](/man/git-blame)(1), [git-log](/man/git-log)(1), [git-diff](/man/git-diff)(1), [git-bisect](/man/git-bisect)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-annotate)```

<!-- verified: 2026-07-16 -->
