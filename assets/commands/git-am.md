# TLDR

**Apply patches from mailbox**

```git am [patches.mbox]```

**Apply patch files**

```git am [*.patch]```

**Apply with 3-way merge**

```git am --3way [patch]```

**Skip current patch**

```git am --skip```

**Abort patch application**

```git am --abort```

# SYNOPSIS

**git am** [_options_] [_mbox_|_maildir_]

# PARAMETERS

_MBOX_
> Mailbox file with patches.

**--3way**, **-3**
> Fall back to 3-way merge.

**--skip**
> Skip the current patch.

**--abort**
> Abort and restore original branch.

**--continue**
> Continue after resolving conflicts.

**--signoff**
> Add Signed-off-by line.

**-i**, **--interactive**
> Run interactively.

**--help**
> Display help information.

# DESCRIPTION

**git am** (apply mailbox) applies patches from email messages. It reads patches in mbox format, commonly used for email-based patch submission workflows in open source projects.

The command extracts patch content and commit message from email format, creating commits with the original author information preserved. It handles patch series and manages conflicts.

git am enables traditional patch-based collaboration workflows.

# CAVEATS

Patch format must be correct. Conflicts require manual resolution. Original commit dates preserved.

# HISTORY

git am was designed for the **Linux kernel** development workflow where patches are submitted and reviewed via email on mailing lists.

# SEE ALSO

[git-apply](/man/git-apply)(1), [git-format-patch](/man/git-format-patch)(1), [git-send-email](/man/git-send-email)(1)
