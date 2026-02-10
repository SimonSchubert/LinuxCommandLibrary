# TAGLINE

saves changes to the repository as a new changeset

# TLDR

**Commit all changes**

```hg commit -m "[message]"```

**Commit specific files**

```hg commit [file1] [file2] -m "[message]"```

**Commit with editor for message**

```hg commit```

**Amend the last commit**

```hg commit --amend```

**Close a branch**

```hg commit --close-branch -m "[message]"```

# SYNOPSIS

**hg** **commit** [_options_] [_file_...]

# PARAMETERS

**-m**, **--message** _text_
> Commit message.

**-A**, **--addremove**
> Add/remove files before committing.

**--amend**
> Amend the parent changeset.

**-u**, **--user** _user_
> Record user as committer.

**-d**, **--date** _date_
> Record date as commit date.

**--close-branch**
> Mark branch as closed.

# DESCRIPTION

**hg commit** saves changes to the repository as a new changeset. With no files specified, all modified files are committed. Use **-m** for inline message or omit it to open an editor. The **--amend** flag modifies the parent commit instead of creating a new one.

# SEE ALSO

[hg](/man/hg)(1), [hg-add](/man/hg-add)(1), [hg-status](/man/hg-status)(1)

