# TAGLINE

Stage changes in the working directory for next commit

# TLDR

**Stage a specific file**

```git add [path/to/file]```

**Stage all changes** in current directory

```git add .```

**Stage all changes** in entire repository

```git add -A```

**Stage only modified and deleted** files (not new files)

```git add -u```

**Interactively select hunks** to stage

```git add -p [path/to/file]```

**Stage files matching a pattern**

```git add "*.js"```

**Force add ignored files**

```git add -f [path/to/ignored/file]```

**Interactive mode** for staging

```git add -i```

# SYNOPSIS

**git add** [_OPTIONS_] [**--**] _PATHSPEC_...

# PARAMETERS

**-A**, **--all**
> Stage all changes (new, modified, deleted) in entire working tree.

**-u**, **--update**
> Stage modifications and deletions of tracked files only, not new files.

**-p**, **--patch**
> Interactively choose hunks to stage from each file.

**-i**, **--interactive**
> Enter interactive mode for selecting files to stage.

**-f**, **--force**
> Allow adding ignored files.

**-n**, **--dry-run**
> Show what would be staged without actually staging.

**-v**, **--verbose**
> Show files as they are added.

**-N**, **--intent-to-add**
> Record only that the path will be added later, staging empty content. Makes new files visible to **git diff**.

**-e**, **--edit**
> Open the diff in your editor and stage the result.

**--refresh**
> Refresh the index without adding files.

**--ignore-removal**, **--no-all**
> Stage new and modified files, but not deletions.

**--ignore-errors**
> Continue past files that cannot be added, rather than aborting.

**--renormalize**
> Re-apply the line-ending and clean filters to all tracked files. Useful after changing **.gitattributes**.

**--chmod**=(**+**|**-**)**x**
> Override the executable bit recorded in the index.

**--sparse**
> Allow updating entries outside the sparse-checkout cone.

**--pathspec-from-file**=_file_
> Read pathspecs from a file, one per line, or from **-** for standard input.

# DESCRIPTION

**git add** stages changes in the working directory for the next commit. It adds content to the staging area (index), creating a snapshot of files that will be included when **git commit** is run.

Changes can be staged at the file level or selectively at the hunk level using **-p** (patch mode). In patch mode, you can review each change and choose whether to stage it, allowing fine-grained control over commits.

The staging area allows you to prepare commits incrementally, choosing exactly which changes to include. Files can be unstaged using **git restore --staged** or **git reset**.

# CAVEATS

Staging a file captures its state at that moment. If you modify a staged file further, you must run git add again to stage the new changes. The command does not stage ignored files unless **-f** is used. Using **git add .** only stages changes in the current directory and below, while **git add -A** stages changes throughout the entire repository.

# HISTORY

git add has been part of Git since its initial release by Linus Torvalds in **2005**. The staging area concept (also called the index) is a distinctive feature of Git, allowing more flexible commit preparation compared to version control systems that commit working directory changes directly.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-status](/man/git-status)(1), [git-restore](/man/git-restore)(1), [git-reset](/man/git-reset)(1), [git-diff](/man/git-diff)(1), [git-rm](/man/git-rm)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-add)```

<!-- verified: 2026-07-16 -->


