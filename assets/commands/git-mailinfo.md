# TAGLINE

Extract patch from email message

# TLDR

**Extract patch info**

```git mailinfo [msg.txt] [patch.txt] < [email.txt]```

**Keep subject prefix**

```git mailinfo -k [msg.txt] [patch.txt] < [email.txt]```

# SYNOPSIS

**git mailinfo** [_options_] _msg_ _patch_

# PARAMETERS

_MSG_
> Output file for commit message.

_PATCH_
> Output file for patch.

**-k**
> Keep subject line intact.

**-b**
> Strip bracketed strings from subject.

**-u**
> Encode as UTF-8.

**--scissors**
> Remove text before scissors line.

**--help**
> Display help information.

# DESCRIPTION

**git mailinfo** extracts patch and commit information from email messages. It parses email headers and body, separating the commit message from the patch content, and handles encoding and author extraction.

The command is a plumbing tool used internally by `git am`. It processes the email format used in patch-based development workflows, such as those used by the Linux kernel project.

# CAVEATS

Plumbing command. Usually called by git am. Input must be proper email format.

# HISTORY

git mailinfo is part of **Git's** email patch workflow, supporting the patch-by-email development model used by the Linux kernel.

# SEE ALSO

[git-am](/man/git-am)(1), [git-mailsplit](/man/git-mailsplit)(1)
