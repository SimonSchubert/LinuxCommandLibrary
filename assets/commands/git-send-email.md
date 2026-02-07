# TAGLINE

Send patches as emails via SMTP

# TLDR

**Send patches via email**

```git send-email [*.patch]```

**Send to specific address**

```git send-email --to=[maintainer@project.org] [patch]```

**Send with cover letter**

```git send-email --cover-letter [*.patch]```

**Dry run**

```git send-email --dry-run [patch]```

# SYNOPSIS

**git send-email** [_options_] _patches_

# PARAMETERS

_PATCHES_
> Patch files to send.

**--to** _ADDRESS_
> Recipient email.

**--cc** _ADDRESS_
> CC recipient.

**--cover-letter**
> Include cover letter.

**--dry-run**
> Show what would be sent.

**--annotate**
> Edit patches before sending.

**--smtp-server** _HOST_
> SMTP server.

**--help**
> Display help information.

# DESCRIPTION

**git send-email** sends patches as properly formatted emails. It is the standard way to submit patches to projects using email-based workflows, such as the Linux kernel.

The command handles SMTP configuration, threading, and patch formatting. It integrates with `git format-patch` output and supports cover letters for patch series.

# CONFIGURATION

**sendemail.smtpServer**
> SMTP server hostname or path to sendmail binary, configured via `git config`.

**sendemail.smtpUser**
> SMTP username for authentication.

**sendemail.to**
> Default recipient address.

# CAVEATS

Requires SMTP configuration. Some firewalls block SMTP. Cover letters need manual editing.

# HISTORY

git send-email supports the **email-based patch workflow** used by the Linux kernel and other projects, sending properly formatted patch emails.

# SEE ALSO

[git-format-patch](/man/git-format-patch)(1), [git-am](/man/git-am)(1), [git-imap-send](/man/git-imap-send)(1)
