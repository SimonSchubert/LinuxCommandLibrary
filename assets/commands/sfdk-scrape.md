# TAGLINE

Save Git submodule changes as patch files

# TLDR

**Scrape new submodule commits into patches**

```sfdk scrape```

**Preview the commits that would be scraped**

```sfdk scrape --dry-run```

**Keep the commits in the submodules**

```sfdk scrape --keep```

**Preserve the original patch file names**

```sfdk scrape --stable```

**Store patches in a custom directory**

```sfdk scrape --output-dir [path/to/directory]```

# SYNOPSIS

**sfdk scrape** [**-n**|**--dry-run**] [**--keep**] [**-o**|**--output-dir** _dir_] [**--stable**]

# PARAMETERS

**-n**, **--dry-run**
> Preview the list of commits considered for scraping.

**--keep**
> Do not remove commits from submodules after patches are created.

**-o**, **--output-dir** _dir_
> Store patches here instead of the **rpm** directory holding the SPEC file.

**--stable**
> Preserve the original file names of patches previously applied with **sfdk prepare**.

# DESCRIPTION

**sfdk scrape** supports packages whose sources are in Git and embed another, not write-accessible repository as a Git submodule. It collects patches for new commits in submodules recursively, updates existing patch files in a safe manner, and then removes the corresponding commits from the submodules. Part of the Sailfish SDK command-line tool.

It is the counterpart of **sfdk prepare**, which applies patches as commits. Commits are taken from **git submodule summary**. Those with an **Sfdk-scrape: discard** trailer are scraped without creating a patch.

# CAVEATS

There are no safety limits on the number of commits processed, so preview with **--dry-run**. Patch formatting and file numbering are enforced, so results may not match the original patch files.

# SEE ALSO

[sfdk](/man/sfdk)(1), [sfdk-prepare](/man/sfdk-prepare)(1), [git-submodule](/man/git-submodule)(1)

# RESOURCES

```[Source code](https://github.com/sailfishos/sailfish-qtcreator)```

```[Documentation](https://docs.sailfishos.org/Tools/Sailfish_SDK/)```

<!-- verified: 2026-11-08 -->
