# TAGLINE

Apply patches from email messages in mbox format

# TLDR

**Apply patches from mailbox**

```git am [patches.mbox]```

**Apply patch files**

```git am [*.patch]```

**Apply with 3-way merge**

```git am --3way [patch]```

**Apply and add Signed-off-by line**

```git am --signoff [patch]```

**Continue after resolving conflicts**

```git am --continue```

**Skip current patch**

```git am --skip```

**Show the patch where am stopped**

```git am --show-current-patch```

**Abort patch application**

```git am --abort```

# SYNOPSIS

**git am** [_options_] [_mbox_|_maildir_]

# PARAMETERS

_MBOX_
> Mailbox file with patches.

**--3way**, **-3**
> Fall back to 3-way merge if the patch does not apply cleanly.

**--signoff**, **-s**
> Add a Signed-off-by trailer to the commit message.

**--keep**, **-k**
> Pass -k to git mailinfo; preserve the subject prefix.

**--quiet**, **-q**
> Only print error messages.

**--whitespace** _action_
> Handle whitespace errors: nowarn, warn, fix, error, error-all.

**--reject**
> Leave rejected hunks in .rej files instead of failing.

**--patch-format** _format_
> Specify the patch format: mbox, mboxrd, stgit, stgit-series, hg.

**--skip**
> Skip the current patch.

**--continue**, **--resolved**, **-r**
> Continue after manually resolving a conflict.

**--abort**
> Abort and restore the original branch state.

**--quit**
> Abort but leave HEAD and index unchanged.

**--show-current-patch** [**=diff**|**=raw**]
> Show the patch where am stopped; default is raw.

**--gpg-sign** [_keyid_], **-S** [_keyid_]
> GPG-sign the resulting commits.

**-i**, **--interactive**
> Run interactively.

**--help**
> Display help information.

# DESCRIPTION

**git am** (apply mailbox) applies patches from email messages. It reads patches in mbox format, commonly used for email-based patch submission workflows in open source projects.

The command extracts patch content and commit message from email format, creating commits with the original author information preserved. It handles patch series and manages conflicts through --skip, --abort, and --continue operations.

This workflow remains fundamental to the Linux kernel development process and other projects that rely on email-based code review and patch submission.

# CAVEATS

Patch format must be correct mbox/maildir format. Conflicts require manual resolution followed by `--continue`. Original author information and dates are preserved from the email headers.

# HISTORY

git am was designed for the **Linux kernel** development workflow where patches are submitted and reviewed via email on mailing lists.

# SEE ALSO

[git-apply](/man/git-apply)(1), [git-format-patch](/man/git-format-patch)(1), [git-send-email](/man/git-send-email)(1)
