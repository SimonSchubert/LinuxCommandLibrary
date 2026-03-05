# TAGLINE

TUI for browsing and applying patches from kernel mailing lists

# TLDR

**Launch the patch browser**

```patch-hub```

# SYNOPSIS

**patch-hub** [_options_]

# DESCRIPTION

**patch-hub** is a terminal user interface that simplifies working with software patches sent through mailing lists in Linux-related development. It connects to lore.kernel.org to browse mailing lists, view patchsets with metadata such as author, title, version, and review trailers, apply patches to local kernel trees, bookmark patchsets, and reply with Reviewed-by tags.

# CAVEATS

Requires **b4** and **git-email** to be installed. Enhanced patch rendering is available with optional tools like bat, delta, or diff-so-fancy.

# HISTORY

**patch-hub** was created by the **kworkflow** organization and is written in **Rust**.

# SEE ALSO

[git](/man/git)(1), [b4](/man/b4)(1), [mutt](/man/mutt)(1)
