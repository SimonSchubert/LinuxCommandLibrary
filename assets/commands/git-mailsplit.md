# TAGLINE

Split mbox into individual messages

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

**git mailsplit** splits an mbox file into individual email messages. Each email becomes a numbered file in the output directory, preparing patches for processing by `git am`.

The command is a plumbing tool used internally by `git am` to handle mailbox files containing multiple patches. It detects mbox format boundaries and separates each message into its own file.

# CAVEATS

Plumbing command. Usually called by git am. Output is individual email files.

# HISTORY

git mailsplit is part of **Git's** email patch workflow, breaking mailboxes into individual messages for processing.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-am](/man/git-am)(1), [git-mailinfo](/man/git-mailinfo)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-mailsplit)```

<!-- verified: 2026-07-17 -->
