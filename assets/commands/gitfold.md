# TAGLINE

Mount git revisions as directories without a full checkout

# TLDR

**Mount** a repository

```gitfold mount [repository] [mountpoint]```

Open a read-only **snapshot** of an older commit

```cd [mountpoint]/@HEAD~5```

**Create** a branch and work in it

```gitfold branch [branch] --from main```

Show what a workspace **changed**

```gitfold changes [branch]```

**Remove** a workspace and **unmount**

```gitfold remove [branch]```

```gitfold unmount [mountpoint]```

# SYNOPSIS

**gitfold** _command_ [_options_]

# PARAMETERS

**mount** _repository_ _mountpoint_
> Mount the repository in the background until **unmount**. Needs FUSE 3 and access to **/dev/fuse**. No root is required on a normal desktop.

**unmount** _mountpoint_
> Stop the mount. Run it from outside the mount.

**version** [_mountpoint_]
> Print version information.

**branch** _name_
> Create a branch that can be opened as a workspace. **--from** names the starting revision and may be repeated to merge several revisions. **--parent** builds the branch on another branch. **--no-follow** stops it from taking that parent's new commits. **-w** keeps a workspace's uncommitted changes.

**parent** [_branch_]
> Show or change the branch another branch is built on. **--set**, **--none**, **--follow**, **--no-follow**, and **--update** adjust that link.

**list**
> List workspaces. **--stat** adds a summary of changes.

**changes** [_branch_]
> List paths a workspace changed. **--** limits the listing to the paths that follow.

**overlaps** [_branch_]
> Report paths this workspace read or wrote that changed elsewhere. **--reads** and **--writes** select which. **--against** names other revisions.

**send** _branch_ _text_...
> Leave a message in that task's inbox. **-s** sets a subject.

**inbox** [_branch_]
> Take messages. **--peek** leaves them. **--wait** blocks until one arrives.

**watch** _directory_
> Wait until a task directory changes.

**remove** _branch_
> Delete a workspace. Commits that were made on the branch stay. **--check** only reports whether removal is safe.

**prune**
> Remove snapshot registrations that are no longer needed.

**prewarm** _branch_ _mode_
> Set how much of a workspace is read ahead.

**track-reads** _branch_ on|off
> Record which paths a workspace reads, for **overlaps**.

# DESCRIPTION

**gitfold** is a FUSE filesystem for a local git clone. A snapshot directory, named with an **@** and a revision, is that revision's tree, read from the object database and not written to disk. A workspace directory, named with a branch, is editable: unchanged files come from the object database, and changes are stored under the repository's git directory. Both are registered as linked git worktrees, so git commands inside them behave as in a normal checkout.

It is aimed at large repositories and at coding agents that would otherwise create a full worktree per task. Unmounting does not delete commits. Removing a workspace discards only the uncommitted files that workspace held.

Linux with FUSE 3 (kernel 5.1 or newer) and git are required. Release binaries target x86-64 and aarch64 with glibc. Other systems build it with Cargo. It does not run on macOS or Windows.

# CAVEATS

**ls** on the mount point does not list a revision until that directory has been opened by name. Run **unmount** and **remove** from outside the mount. A container needs the FUSE device and permission to mount. Partial clones work only when git can fetch missing objects without an interactive prompt. Git LFS and very heavy build trees can be cheaper as a normal checkout.

# CONFIGURATION

Settings are stored in the repository's git config, under the gitfold section, and as branch keys. Workspace file changes live under the git directory, not in the working tree of the original clone.

# SEE ALSO

[git](/man/git)(1), [git-worktree](/man/git-worktree)(1), [fusermount](/man/fusermount)(1)

# RESOURCES

```[Source code](https://github.com/pkukielka/gitfold)```

```[Documentation](https://github.com/pkukielka/gitfold/blob/main/docs/reference.md)```

<!-- verified: 2026-11-26 -->
