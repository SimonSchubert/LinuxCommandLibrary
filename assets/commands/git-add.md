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

**--intent-to-add**
> Record only that the path will be added later (stage empty content).

**--refresh**
> Refresh the index without adding files.

# DESCRIPTION

**git add** stages changes in the working directory for the next commit. It adds content to the staging area (index), creating a snapshot of files that will be included when **git commit** is run.

Changes can be staged at the file level or selectively at the hunk level using **-p** (patch mode). In patch mode, you can review each change and choose whether to stage it, allowing fine-grained control over commits.

The staging area allows you to prepare commits incrementally, choosing exactly which changes to include. Files can be unstaged using **git restore --staged** or **git reset**.

# CAVEATS

Staging a file captures its state at that moment. If you modify a staged file further, you must run git add again to stage the new changes. The command does not stage ignored files unless **-f** is used. Using **git add .** only stages changes in the current directory and below, while **git add -A** stages changes throughout the entire repository.

# HISTORY

git add has been part of Git since its initial release by Linus Torvalds in **2005**. The staging area concept (also called the index) is a distinctive feature of Git, allowing more flexible commit preparation compared to version control systems that commit working directory changes directly.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-status](/man/git-status)(1), [git-reset](/man/git-reset)(1), [git-diff](/man/git-diff)(1)
