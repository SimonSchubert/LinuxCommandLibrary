# TAGLINE

Fetch a patch series and apply it to the current branch

# TLDR

**Fetch and apply** a series to the current branch

```b4 shazam [message-id]```

**Apply** from an archive URL

```b4 shazam [https://lore.kernel.org/.../message-id]```

**Merge the series** instead of applying it linearly

```b4 shazam -M [message-id]```

**Create a FETCH_HEAD** so you can merge or cherry-pick manually

```b4 shazam -H [message-id]```

**Apply review trailers** from the cover-letter replies

```b4 shazam -t [message-id]```

# SYNOPSIS

**b4** **shazam** [_options_] _msgid_

# DESCRIPTION

**b4 shazam** does everything **b4 am** does (retrieve the thread, pick the latest revision, gather review trailers) and then applies the resulting series directly to the current git branch with **git am**. It is the one-step path from a message-id to applied commits in your working tree.

With **-M** the series is brought in as a merge, and with **-H** b4 prepares a FETCH_HEAD so you can decide how to integrate it yourself. The name is a nod to retrieving and "playing" a patch series in a single command.

# PARAMETERS

**-H**, **--make-fetch-head**
> Apply the series to a throwaway ref and point FETCH_HEAD at it, so you can merge or cherry-pick manually.

**-M**, **--merge**
> Integrate the series as a merge commit instead of a linear **git am**.

**-v** _VER_, **--use-version** _VER_
> Apply a specific revision of the series.

**-t**, **--apply-cover-trailers**
> Apply trailers found on the cover letter to every patch.

**-l**, **--add-link**
> Add a Link trailer with the archive URL of each message.

**-s**, **--add-my-sob**
> Add your own Signed-off-by trailer to each patch.

**-P** _RANGE_, **--cherry-pick** _RANGE_
> Apply only a subset of patches from the series.

**-m** _MBOX_, **--use-local-mbox** _MBOX_
> Read the thread from a local mbox file instead of fetching it.

# CAVEATS

The series is applied to whatever branch is currently checked out, so make sure you are on the intended base commit before running it. b4 tries to find the right base, but a mismatched tree can still cause **git am** conflicts.

# INSTALL

```dnf: sudo dnf install b4```

```pacman: sudo pacman -S b4```

```apk: sudo apk add b4```

```zypper: sudo zypper install b4```

```brew: brew install b4```

```nix: nix profile install nixpkgs#b4```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[b4](/man/b4)(1), [b4-am](/man/b4-am)(1), [git-am](/man/git-am)(1)

# RESOURCES

```[Documentation](https://b4.docs.kernel.org/)```

<!-- verified: 2026-06-10 -->
