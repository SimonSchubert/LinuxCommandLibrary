# TLDR

**Split mbox into messages**

```git mailsplit -o [output-dir] [mbox]```

**Split from stdin**

```git mailsplit -o [output-dir]```

# SYNOPSIS

**git mailsplit** [_options_] [_mbox_]

# PARAMETERS

_MBOX_
> Mailbox file to split.

**-o** _DIR_
> Output directory.

**-b**
> Include mbox "From " line.

**-d** _DIGITS_
> Number padding width.

**-f** _NUM_
> Start numbering from N.

**--keep-cr**
> Keep carriage returns.

**--help**
> Display help information.

# DESCRIPTION

**git mailsplit** splits an mbox file into individual email messages. Each email becomes a numbered file in the output directory, preparing patches for processing.

The command is a plumbing tool used by git am to process mailbox files containing multiple patches. It handles mbox format detection and message separation.

git mailsplit enables batch patch processing from mbox files.

# CAVEATS

Plumbing command. Usually called by git am. Output is individual email files.

# HISTORY

git mailsplit is part of **Git's** email patch workflow, breaking mailboxes into individual messages for processing.

# SEE ALSO

[git-am](/man/git-am)(1), [git-mailinfo](/man/git-mailinfo)(1)
