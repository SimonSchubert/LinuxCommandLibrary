# TAGLINE

list all contributors to a repository

# TLDR

**Print** the author list to standard output

```git authors --list```

**Print** the author list without email addresses

```git authors --list --no-email```

**Append** authors to the repository's AUTHORS file and open it in your editor

```git authors```

**Append** authors to a specific file

```git authors [CONTRIBUTORS]```

**Save** the list to a file yourself

```git authors --list > [AUTHORS]```

# SYNOPSIS

**git authors** [**--list**] [**--no-email**] [_file_]

# PARAMETERS

**-l**, **--list**
> Print the author list to standard output instead of writing it to a file.

**--no-email**
> Omit email addresses, leaving only names.

_file_
> File to append to. Ignored with **--list**. Defaults to an existing file matching **\*authors\*** or **\*contributors\*** in the repository root, or **AUTHORS** if none is found.

# DESCRIPTION

**git authors** collects the unique contributors to a repository from its commit history, sorted by number of commits in descending order. It is part of **git-extras**, a collection of git utilities not shipped with core git.

The default behaviour is not to print. Run bare, **git authors** **appends** the list to an AUTHORS file and then opens that file in your git editor, which is the workflow the tool was built for: maintaining a credits file in a project. **--list** is the option you want when you just need the names on standard output or in a pipeline.

Underneath it is a wrapper around **git shortlog -sne**, with awk passes that strip the commit counts and de-duplicate authors by name and by email.

# CAVEATS

Bare **git authors** **appends** rather than overwrites, so running it twice duplicates every entry in the AUTHORS file. It also opens an editor, which makes it unsuitable for scripts and CI; use **--list** there.

It picks its target file by globbing the repository root for anything matching **\*authors\*** or **\*contributors\***, case-insensitively, so it can append to an unexpected file in a repository with several such names.

Authors come from each commit's author field, so contributors who used different names or addresses on different machines appear multiple times. De-duplication is by exact name and exact email; use a **.mailmap** file with **git shortlog** for real canonicalization.

**--no-email** de-duplicates on email first and then drops the addresses, so two distinct people sharing a display name can collapse into one entry.

# HISTORY

**git authors** is part of **git-extras**, created by **TJ Holowaychuk** in **2010** to bundle common git helper scripts. The project is now community-maintained.

# SEE ALSO

[git-shortlog](/man/git-shortlog)(1), [git-log](/man/git-log)(1), [git-extras](/man/git-extras)(1), [git-blame](/man/git-blame)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-authors)```

<!-- verified: 2026-07-16 -->
