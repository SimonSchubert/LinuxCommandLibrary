# TAGLINE

displays repository commit history

# TLDR

**Show commit history**

```hg log```

**Show the last n commits**

```hg log -l [5]```

**Show the history of a file, following renames**

```hg log -f [file]```

**Show changesets with their patches**

```hg log -p```

**Show the revision graph**

```hg log -G```

**Show a specific revision or revset**

```hg log -r "[revision]"```

**Show commits by a specific user**

```hg log -u [username]```

**Search for a keyword**

```hg log -k [keyword]```

**Show the last 10 commits on the current branch**

```hg log -l 10 -b .```

**Print only hash and first line of each description**

```hg log -T "{node|short} {desc|firstline}\n"```

# SYNOPSIS

**hg log** [_options_] [_file_]

# PARAMETERS

_FILE_
> Limit to changesets touching this file or directory.

**-f**, **--follow**
> Follow changeset history, or file history across copies and renames.

**-d**, **--date** _DATE_
> Show revisions matching a date spec.

**-C**, **--copies**
> Show copied files.

**-k**, **--keyword** _TEXT_
> Case-insensitive search in descriptions, user names and changed file names. Repeatable.

**-r**, **--rev** _REV_
> Revisions to select or follow from. Repeatable.

**-L**, **--line-range** _FILE,RANGE_
> Follow a line range of a file. Requires **--follow**. Experimental.

**--removed**
> Include revisions where files were removed.

**-u**, **--user** _USER_
> Revisions committed by user. Repeatable.

**-b**, **--branch** _BRANCH_
> Show changesets within the named branch. Repeatable.

**-B**, **--bookmark** _BOOKMARK_
> Show changesets within the given bookmark. Repeatable.

**-P**, **--prune** _REV_
> Do not display the revision or any of its ancestors. Repeatable.

**-p**, **--patch**
> Show the patch of each changeset.

**-g**, **--git**
> Use the git extended diff format.

**-l**, **--limit** _NUM_
> Limit the number of changes displayed.

**-M**, **--no-merges**
> Do not show merges.

**--stat**
> Output a diffstat-style summary of changes.

**-G**, **--graph**
> Show the revision DAG.

**-T**, **--template** _TEMPLATE_
> Display with a template. Use **-T list** to see the available templates.

**-I**, **--include** _PATTERN_
> Include names matching the given patterns. Repeatable.

**-X**, **--exclude** _PATTERN_
> Exclude names matching the given patterns. Repeatable.

**-v**, **--verbose**
> Show full descriptions and file lists.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**hg log** displays the revision history of the repository or of specific files or directories. It shows changesets with author, date, summary, and other metadata.

The command supports filtering by file, branch, user, date or revset. Graph mode visualizes branch and merge structure, and templates allow custom output for scripting.

# CAVEATS

**hg log FILE** may omit duplicate changes made on branches and does not show removals or mode changes; add **--removed** to see them. **hg log --patch** only compares a merge against its first parent. Use **-l** to limit output on large repositories.

# HISTORY

**Mercurial** was started by **Matt Mackall** in **2005**. Graph output first shipped as the graphlog extension before **-G** became part of core **hg log**.

# SEE ALSO

[hg](/man/hg)(1), [hg-status](/man/hg-status)(1), [hg-commit](/man/hg-commit)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Homepage](https://www.mercurial-scm.org/)```

```[Source code](https://repo.mercurial-scm.org/hg)```

```[Documentation](https://repo.mercurial-scm.org/hg/help/log)```

<!-- verified: 2026-11-09 -->
