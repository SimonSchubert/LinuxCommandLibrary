# TAGLINE

Select SteamOS update release channel

# TLDR

View **current** branch

```steamos-select-branch -c```

**List** available branches

```steamos-select-branch -l```

Switch to **beta** branch

```steamos-select-branch beta```

Switch to **stable** release

```steamos-select-branch stable```

Switch to **bleeding edge**

```steamos-select-branch main```

# SYNOPSIS

**steamos-select-branch** [_OPTIONS_] [_BRANCH_]

# PARAMETERS

**-c**
> View current branch

**-l**
> List all available branches

# BRANCHES

**stable**
> Stable release channel (default, recommended)

**beta**
> Beta testing channel with newer features

**main**
> Bleeding edge development channel

# DESCRIPTION

**steamos-select-branch** selects a SteamOS system release branch, controlling which update channel the system uses. The stable branch receives well-tested updates, beta provides preview releases, and main offers the latest development builds.

After switching branches, run `steamos-update` to update to the selected branch's latest version.

# CAVEATS

Beta and main branches may contain bugs and instability. Switching to older branches may require a factory reset. Updates on non-stable branches may occur more frequently.

# HISTORY

**steamos-select-branch** is part of the **SteamOS** utilities developed by **Valve**. The branch system allows users to opt into testing newer features before stable release.

# SEE ALSO

[steamos-update](/man/steamos-update)(1)
