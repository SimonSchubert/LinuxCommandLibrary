# TAGLINE

Download a patch series as a ready-to-apply mbox

# TLDR

**Fetch a series** by message-id

```b4 am [message-id]```

**Fetch a series** from an archive URL

```b4 am [https://lore.kernel.org/.../message-id]```

**Apply review trailers** collected from cover-letter replies

```b4 am -t [message-id]```

**Add a Link trailer** pointing back to the message archive

```b4 am -l [message-id]```

**Write the mbox** to a specific directory

```b4 am -o [path/to/dir] [message-id]```

**Fetch a specific revision** of the series

```b4 am -v [3] [message-id]```

# SYNOPSIS

**b4** **am** [_options_] _msgid_

# DESCRIPTION

**b4 am** retrieves a complete patch thread from a public-inbox archive, selects the newest revision of the series, and produces a clean mbox file that can be fed straight into **git am**. Along the way it gathers review trailers (Reviewed-by, Acked-by, Tested-by) that reviewers left in replies and applies them to the matching patches.

The resulting mbox is named after the series and saved in the current directory by default. Unlike **b4 shazam**, this subcommand stops at writing the mbox and does not touch the working tree, leaving the actual application to the maintainer.

# PARAMETERS

**-o** _DIR_, **--outdir** _DIR_
> Write the resulting mbox into _DIR_ instead of the current directory.

**-v** _VER_, **--use-version** _VER_
> Retrieve a specific revision of the series rather than the latest.

**-t**, **--apply-cover-trailers**
> Apply trailers found on the cover letter to every patch in the series.

**-T**, **--no-add-trailers**
> Do not add or reorder any trailers.

**-s**, **--add-my-sob**
> Add your own Signed-off-by trailer to each patch.

**-l**, **--add-link**
> Add a Link trailer with the archive URL of each message.

**-P** _RANGE_, **--cherry-pick** _RANGE_
> Apply only a subset of patches from the series.

**-c**, **--check-newer-revisions**
> Warn if a newer revision of the series exists on the list.

**-m** _MBOX_, **--use-local-mbox** _MBOX_
> Read the thread from a local mbox file instead of fetching it.

**-3**, **--prep-3way**
> Prepare fall-back blobs so that **git am -3** can resolve conflicts.

# INSTALL

```dnf: sudo dnf install b4```

```pacman: sudo pacman -S b4```

```apk: sudo apk add b4```

```zypper: sudo zypper install b4```

```brew: brew install b4```

```nix: nix profile install nixpkgs#b4```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[b4](/man/b4)(1), [b4-shazam](/man/b4-shazam)(1), [git-am](/man/git-am)(1)

# RESOURCES

```[Documentation](https://b4.docs.kernel.org/)```

<!-- verified: 2026-06-10 -->
