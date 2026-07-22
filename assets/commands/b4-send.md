# TAGLINE

Send a prepared patch series to its recipients

# TLDR

**Send the current** prepared series

```b4 send```

**Preview without sending** what would go out

```b4 send -d```

**Send a test copy** only to yourself

```b4 send --reflect```

**Write the messages** to a directory instead of sending

```b4 send -o [path/to/dir]```

**Edit the cover letter** before sending

```b4 send --edit-cover```

**Resend** a previously sent revision

```b4 send --resend```

# SYNOPSIS

**b4** **send** [_options_]

# DESCRIPTION

**b4 send** delivers a series prepared with **b4 prep**. It turns the tracked branch into a numbered patch set, attaches the stored cover letter, fills in the To and Cc lists, and dispatches the messages over your configured SMTP server (or a project web endpoint where supported).

By default b4 adds a cryptographic attestation so reviewers can verify the patches were not altered in transit. Use the dry-run and reflect options to rehearse a submission before it reaches a public list.

# PARAMETERS

**-d**, **--dry-run**
> Print what would be sent without actually sending anything.

**-o** _DIR_, **--output-dir** _DIR_
> Write the messages as files into _DIR_ instead of sending them.

**--reflect**
> Send the series only to yourself for testing.

**--resend** _[VER]_
> Resend a previously sent revision unchanged.

**--no-sign**
> Do not add cryptographic attestation to the messages.

**-e**, **--edit-cover**
> Edit the cover letter before sending.

**--preview-to** _ADDR_
> Send a preview copy to the given address(es).

# CAVEATS

Sending requires a working SMTP or **git send-email** configuration. Always rehearse with **-d** or **--reflect** before posting to a public mailing list, since patches cannot be unsent.

# INSTALL

```dnf: sudo dnf install b4```

```pacman: sudo pacman -S b4```

```apk: sudo apk add b4```

```zypper: sudo zypper install b4```

```brew: brew install b4```

```nix: nix profile install nixpkgs#b4```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[b4](/man/b4)(1), [b4-prep](/man/b4-prep)(1), [git-send-email](/man/git-send-email)(1)

# RESOURCES

```[Documentation](https://b4.docs.kernel.org/)```

<!-- verified: 2026-06-10 -->
