# TLDR

**Send patches via IMAP**

```git format-patch origin | git imap-send```

**Send from file**

```git imap-send < [patches.mbox]```

# SYNOPSIS

**git imap-send** [_options_]

# PARAMETERS

**--curl**
> Use libcurl for IMAP.

**-v**, **--verbose**
> Verbose output.

**-q**, **--quiet**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**git imap-send** uploads patches to an IMAP drafts folder. This enables composing patch emails in your email client, supporting email-based patch workflows.

The command reads mbox-formatted patches from stdin and uploads them to the configured IMAP server. Patches appear as drafts for review before sending.

git imap-send supports the email-driven patch submission workflow.

# CAVEATS

Requires IMAP server configuration. SSL configuration may be complex. Alternative to git send-email.

# HISTORY

git imap-send was created for projects using **email-based patch submission**, allowing integration with standard email clients.

# SEE ALSO

[git-send-email](/man/git-send-email)(1), [git-format-patch](/man/git-format-patch)(1)
